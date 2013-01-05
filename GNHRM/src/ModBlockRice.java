package GNHRM.src;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import java.util.ArrayList;
import java.util.Random;

public class ModBlockRice extends ModBlockPlant
{
	public ModBlockRice(int texture)
	{
		super(texture);
		float f = 0.5F;
	}
	
	protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Block.tilledField.blockID;
    }
	
	public void fertilize(World par1World, int par2, int par3, int par4)
    {
        par1World.setBlockMetadataWithNotify(par2, par3, par4, 5);
    }
	
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.updateTick(par1World, par2, par3, par4, par5Random);

		if(par1World.isRaining())
		{
			par1World.setBlock(par2, par3, par4, 0);
			this.dropBlockAsItem(par1World, par2, par3, par4, 0, 0);
		}
		
        if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
        {
            int i = par1World.getBlockMetadata(par2, par3, par4);

            if (i < 5)
            {
                float f = getGrowthRate(par1World, par2, par3, par4);

                if (par5Random.nextInt((int)(8F / f) + 1) == 0)
                {
					if(this.getAdjacentWaterValue(par1World, par2, par3, par4) >= 2)
					{
						i++;
						par1World.setBlockMetadataWithNotify(par2, par3, par4, i);
					}
                }
            }
        }
    }
	
	private int getAdjacentWaterValue(World par1World, int x, int y, int z)
    {
		int num = 0;
		if (par1World.getBlockMaterial(x - 1, y - 1, z) == Material.water)
		{
			num++;
		}
		if (par1World.getBlockMaterial(x + 1, y - 1, z) == Material.water)
		{
			num++;
		}
		if (par1World.getBlockMaterial(x, y - 1, z + 1) == Material.water)
		{
			num++;
		}
		if (par1World.getBlockMaterial(x, y - 1, z - 1) == Material.water)
		{
			num++;
		}
        return num;
	}
	
	private float getGrowthRate(World par1World, int par2, int par3, int par4)
    {
        float f = 1.0F;
        int i = par1World.getBlockId(par2, par3, par4 - 1);
        int j = par1World.getBlockId(par2, par3, par4 + 1);
        int k = par1World.getBlockId(par2 - 1, par3, par4);
        int l = par1World.getBlockId(par2 + 1, par3, par4);
        int i1 = par1World.getBlockId(par2 - 1, par3, par4 - 1);
        int j1 = par1World.getBlockId(par2 + 1, par3, par4 - 1);
        int k1 = par1World.getBlockId(par2 + 1, par3, par4 + 1);
        int l1 = par1World.getBlockId(par2 - 1, par3, par4 + 1);
        boolean flag = k == blockID || l == blockID;
        boolean flag1 = i == blockID || j == blockID;
        boolean flag2 = i1 == blockID || j1 == blockID || k1 == blockID || l1 == blockID;

        for (int i2 = par2 - 1; i2 <= par2 + 1; i2++)
        {
            for (int j2 = par4 - 1; j2 <= par4 + 1; j2++)
            {
                int k2 = par1World.getBlockId(i2, par3 - 1, j2);
                float f1 = 0.0F;

                if (k2 == Block.tilledField.blockID)
                {
                    f1 = 1.0F;

                    if (par1World.getBlockMetadata(i2, par3 - 1, j2) > 0)
                    {
                        f1 = 3F;
                    }
                }

                if (i2 != par2 || j2 != par4)
                {
                    f1 /= 4F;
                }

                f += f1;
            }
        }

        if (flag2 || flag && flag1)
        {
            f /= 2.0F;
        }

        return f;
    }
	
	public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        if (par2 < 0)
        {
            par2 = 5;
        }

        return this.blockIndexInTexture + par2;
    }
	
	public int getRenderType()
    {
        return 6;
    }
	
	protected int getSeedItem()
    {
        return ModItems.rice.shiftedIndex;
    }

	protected int getCropItem()
    {
        return ModItems.rice.shiftedIndex;
    }
	
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);
    }
	
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = super.getBlockDropped(world, x, y, z, metadata, fortune);

        if (metadata >= 5)
        {
            for (int n = 0; n < 3 + fortune; n++)
            {
                if (world.rand.nextInt(15) <= metadata)
                {
                    ret.add(new ItemStack(this.getSeedItem(), 1, 0));
                }
            }
        }

        return ret;
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return par1 == 5 ? this.getCropItem() : this.getSeedItem();
    }

    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    @SideOnly(Side.CLIENT)
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.getSeedItem();
    }
	
	public String getTextureFile()
	{
	    return "/GNHRM/graphics/plants.png";
	}
}