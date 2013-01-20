package GNHRM.src;

import net.minecraft.block.material.Material;
import java.util.Random;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ModBlockModOre extends ModBlocks
{
    public ModBlockModOre(int texture)
    {
        super(texture, Material.rock);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundStoneFootstep);
    }
    
    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        if(this.blockID == ModBlocks.oreUranium.blockID)
        {
               return ModItems.uranium.shiftedIndex;
        }
        else if(this.blockID == ModBlocks.oreRuby.blockID)
        {
            return ModItems.ruby.shiftedIndex;
        }
        else if(this.blockID == ModBlocks.oreSapphire.blockID)
        {
            return ModItems.sapphire.shiftedIndex;
        }
        else if(this.blockID == ModBlocks.oreAmethyst.blockID)
        {
            return ModItems.amethyst.shiftedIndex;
        }
        else if(this.blockID == ModBlocks.oreTopaz.blockID)
        {
            return ModItems.topaz.shiftedIndex;
        }
        else if(this.blockID == ModBlocks.oreSulphur.blockID)
        {
            return ModItems.sulphur.shiftedIndex;
        }
        else
        {
            return this.blockID;
        }
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
        return this.blockID == ModBlocks.oreSulphur.blockID ? 4 + par1Random.nextInt(5) : 1;
    }
    
    @Override
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

        if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
        {
            int var8 = 0;
            if(this.blockID == ModBlocks.oreUranium.blockID)
                var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 1, 3);
            else if(this.blockID == ModBlocks.oreRuby.blockID)
                var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            else if(this.blockID == ModBlocks.oreSapphire.blockID)
                var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            else if(this.blockID == ModBlocks.oreAmethyst.blockID)
                var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            else if(this.blockID == ModBlocks.oreTopaz.blockID)
                var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            else if(this.blockID == ModBlocks.oreSulphur.blockID)
                var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 1, 3);
            this.dropXpOnBlockBreak(par1World, par2, par3, par4, var8);
        }
    }
}
