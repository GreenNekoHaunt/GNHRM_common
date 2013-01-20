package GNHRM.src;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.IPlantable;
import static net.minecraftforge.common.EnumPlantType.*;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.EnumPlantType;
import java.util.Random;

public class ModBlockBush extends ModBlocks implements IPlantable
{
    private Block branchBlock;
    private Item harvestItem;
    private int metadata;
    public ModBlockBush(int texture, Block branchBlockId, Item harvestedItem)
    {
        super(texture, Material.plants);
        branchBlock = branchBlockId;
        harvestItem = harvestedItem;
        this.setHardness(0.2F);
        this.setLightOpacity(1);
        this.setStepSound(this.soundGrassFootstep);
        this.setTickRandomly(true);
        this.disableStats();
        this.setRequiresSelfNotify();
    }
    
    @Override
    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {
        return Plains;
    }
    
    @Override
    public int getPlantID(World world, int x, int y, int z)
    {
        return blockID;
    }

    @Override
    public int getPlantMetadata(World world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z);
    }
    
    @Override
    public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
    {
        super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
    }
    
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Block.grass.blockID;
    }
    
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return canBlockStay(par1World, par2, par3, par4);
    }
    
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        Block soil = blocksList[par1World.getBlockId(par2, par3 - 1, par4)];
        return (par1World.getFullBlockLightValue(par2, par3, par4) >= 4) && 
                (soil != null && soil.canSustainPlant(par1World, par2, par3 - 1, par4, ForgeDirection.UP, this));
    }
    
    protected final void checkFlowerChange(World par1World, int par2, int par3, int par4)
    {
        if (!this.canBlockStay(par1World, par2, par3, par4))
        {
            this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
            par1World.setBlockWithNotify(par2, par3, par4, 0);
        }
    }
    
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.updateTick(par1World, par2, par3, par4, par5Random);
        
        int i = par1World.getBlockMetadata(par2, par3, par4);
        this.checkFlowerChange(par1World, par2, par3, par4);

        if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 4)
        {
            if (i < 3)
            {
                float f = getGrowthRate(par1World, par2, par3, par4);

                if (par5Random.nextInt((int)(30F / f) + 1) == 0)
                {
                    i++;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, i);
                }
            }
            if(i >= 3)
            {
                par1World.setBlockAndMetadata(par2, par3, par4, branchBlock.blockID, 2);
                par1World.scheduleBlockUpdate(par2, par3, par4, branchBlock.blockID, 2);
            }
        }
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
                
                BiomeGenBase chunkBiome = par1World.getBiomeGenForCoords(par2, par4);
                
                if(chunkBiome.biomeID == BiomeGenBase.forest.biomeID 
                    || chunkBiome.biomeID == BiomeGenBase.jungle.biomeID
                    || chunkBiome.biomeID == BiomeGenBase.taiga.biomeID)
                {
                    f1 = 3F;
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
            par2 = 3;
        }

        return this.blockIndexInTexture + par2;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    
    public int getRenderType()
    {
        return 1;
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return 0;
    }
    
    public String getTextureFile()
    {
        return "/GNHRM/graphics/plants.png";
    }
}
