package GNHRM.src;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModBlockModLog extends ModBlocks
{
    public static final String[] woodType = new String[] {"cherry"};

    protected ModBlockModLog(int texture)
    {
        super(texture, Material.wood);
        this.blockIndexInTexture = texture;
		this.setHardness(2.0F);
		this.setStepSound(soundWoodFootstep);
		this.setRequiresSelfNotify();
    }

    public int getRenderType()
    {
        return 31;
    }

    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Block.wood.blockID;
    }

    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        byte var7 = 4;
        int var8 = var7 + 1;

        if (par1World.checkChunksExist(par2 - var8, par3 - var8, par4 - var8, par2 + var8, par3 + var8, par4 + var8))
        {
            for (int var9 = -var7; var9 <= var7; ++var9)
            {
                for (int var10 = -var7; var10 <= var7; ++var10)
                {
                    for (int var11 = -var7; var11 <= var7; ++var11)
                    {
                        int var12 = par1World.getBlockId(par2 + var9, par3 + var10, par4 + var11);

                        if (Block.blocksList[var12] != null)
                        {
                            Block.blocksList[var12].beginLeavesDecay(par1World, par2 + var9, par3 + var10, par4 + var11);
                        }
                    }
                }
            }
        }
    }

    public int func_85104_a(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
    {
        int var10 = par9 & 3;
        byte var11 = 0;

        switch (par5)
        {
            case 0:
            case 1:
                var11 = 0;
                break;
            case 2:
            case 3:
                var11 = 8;
                break;
            case 4:
            case 5:
                var11 = 4;
        }

        return var10 | var11;
    }

    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
	    int var3 = par2 & 12;
        switch(var3)
		{
		    case 0:
			    switch(par1)
				{
				    case 0:
					    return this.blockIndexInTexture + 1;
					case 1:
					    return this.blockIndexInTexture + 1;
					default:
					    return this.blockIndexInTexture;
				}
		    case 4:
			    switch(par1)
				{
				    case 4:
					    return this.blockIndexInTexture + 1;
					case 5:
					    return this.blockIndexInTexture + 1;
					default:
					    return this.blockIndexInTexture;
				}
		    case 8:
			    switch(par1)
				{
				    case 2:
					    return this.blockIndexInTexture + 1;
					case 3:
					    return this.blockIndexInTexture + 1;
					default:
					    return this.blockIndexInTexture;
				}
			default: 
			    return 0;
		}
    } // 64, 65

    public int damageDropped(int par1)
    {
        return par1 & 1;
    }

    public static int limitToValidMetadata(int par0)
    {
        return par0 & 1;
    }

    @SideOnly(Side.CLIENT)

    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }

    protected ItemStack createStackedBlock(int par1)
    {
        return new ItemStack(this.blockID, 1, limitToValidMetadata(par1));
    }

    @Override
    public boolean canSustainLeaves(World world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public boolean isWood(World world, int x, int y, int z)
    {
        return true;
    }
}
