package GNHRM.src;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import static net.minecraftforge.common.EnumPlantType.*;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import java.util.Random;

public class ModBlockBranch extends ModBlocks implements IPlantable
{
    private int branches = 0;
    private Item harvestItem;
    private boolean isMaster = false;
    public ModBlockBranch(int texture, Item harvestedItem)
    {
        super(texture, Material.leaves);
        harvestItem = harvestedItem;
        this.setHardness(0.2F);
        this.setLightOpacity(1);
        this.setStepSound(soundGrassFootstep);
        this.setTickRandomly(true);
        this.disableStats();
        this.setRequiresSelfNotify();
    }
    
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        Random rand = new Random();
        Item heldItem = par5EntityPlayer.getHeldItem().getItem();
        if(par1World.getBlockMetadata(par2, par3, par4) >= 1 && heldItem == Item.shears)
        {
            if (!par1World.isRemote && par1World.getGameRules().getGameRuleBooleanValue("doTileDrops"))
            {
                float var10 = 0.7F;
                double var11 = (double)(par1World.rand.nextFloat() * var10) + (double)(1.0F - var10) * 0.5D;
                double var12 = (double)(par1World.rand.nextFloat() * var10) + (double)(1.0F - var10) * 0.5D;
                double var13 = (double)(par1World.rand.nextFloat() * var10) + (double)(1.0F - var10) * 0.5D;
                EntityItem var14 = new EntityItem(par1World, (double)par2 + var11, (double)par3 + var12, (double)par4 + var13, new ItemStack(harvestItem, rand.nextInt(8)));
                var14.delayBeforeCanPickup = 10;
                par1World.spawnEntityInWorld(var14);
                par1World.setBlockMetadataWithNotify(par2, par3, par4, 0);
                return true;
            }
        }
        return false;
    }
    
    public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        Block dropBlock = ModBlocks.currantBush;
        Item heldItem = par5EntityPlayer.getHeldItem().getItem();
        
        if(harvestItem == ModItems.blackberry) { dropBlock = ModBlocks.blackberryBush; }
        else if(harvestItem == ModItems.blackberry) { dropBlock = ModBlocks.raspberryBush;     }
        
        if(heldItem instanceof ItemSpade)
        {
            if (!par1World.isRemote && par1World.getGameRules().getGameRuleBooleanValue("doTileDrops"))
            {
                float var10 = 0.7F;
                double var11 = (double)(par1World.rand.nextFloat() * var10) + (double)(1.0F - var10) * 0.5D;
                double var12 = (double)(par1World.rand.nextFloat() * var10) + (double)(1.0F - var10) * 0.5D;
                double var13 = (double)(par1World.rand.nextFloat() * var10) + (double)(1.0F - var10) * 0.5D;
                EntityItem var14 = new EntityItem(par1World, (double)par2 + var11, (double)par3 + var12, (double)par4 + var13, new ItemStack(dropBlock, 1));
                var14.delayBeforeCanPickup = 10;
                par1World.spawnEntityInWorld(var14);
            }
            par1World.setBlock(par2, par3, par4, 0);
        }
    }
    
    @Override
    public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
    {
        super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
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
    
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.updateTick(par1World, par2, par3, par4, par5Random);
        int branchX = par2 - 1 + par5Random.nextInt(2);
        int branchY = par3 + par5Random.nextInt(3);
        int branchZ = par4 - 1 + par5Random.nextInt(2);
        int i = par1World.getBlockMetadata(par2, par3, par4);
        if(i >= 2)
        {
            this.isMaster = true;
            branches = 0;
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 0);
        }
        if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 4)
        {
            if(i == 0)
            {
                float f = getGrowthRate(par1World, par2, par3, par4);

                if (par5Random.nextInt((int)(50F / f) + 1) == 0)
                {
                    i++;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, i);
                }
            }
        }
        if(isMaster)
        {
            if(branches < 7 && this.isAirBlock(par1World, branchX, branchY, branchZ))
            {
                if(!par1World.isAirBlock(branchX, branchY - 1, branchZ))
                {
                    par1World.setBlock(branchX, branchY, branchZ, this.blockID);
                    branches++;
                }
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
        if (par2 < 0 || par2 > 1)
        {
            par2 = 1;
        }

        return this.blockIndexInTexture + par2;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
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
