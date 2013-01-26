package GNHRM.src;

//import net.minecraftforge.liquids.IBlockLiquid;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import java.util.Random;
import GNHRM.GNHRM;

public class ModBlockOilFlowing extends BlockFlowing// implements IBlockLiquid
{
    private Random rand = new Random();
    protected ModBlockOilFlowing()
    {
        super(ModBlocks.baseId + ModBlocks.blockCount, Material.water);
        ModBlocks.blockCount++;
        this.blockHardness = 100F;
        this.setLightOpacity(1);
        this.setCreativeTab(GNHRM.tabGNHRM);
        this.disableStats();
        this.setRequiresSelfNotify();
    }
    
    @Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.updateTick(par1World, par2, par3, par4, par5Random);
		if(this.isIgniterNear(par1World, par2, par3, par4))
        {
            par1World.setBlockWithNotify(par2, par3, par4, 0);
            par1World.createExplosion((Entity)null, par2, par3, par4, 2, true);
            for(int i = 0; i < 256; i++)
            {
                int randX = par2 - 8 + this.rand.nextInt(16);
                int randY = par3 - 8 + this.rand.nextInt(16);
                int randZ = par4 - 8 + this.rand.nextInt(16);
                if(par1World.isAirBlock(randX, randY, randZ))
                {
                    if(!par1World.isAirBlock(randX, randY-1, randZ))
                    {
                        par1World.setBlockWithNotify(randX, randY, randZ, 51);
                    }
                }
            }
        }
    }

    public boolean isIgniterNear(World world, int x, int y, int z)
    {
        for (int var5 = x - 2; var5 <= x + 2; ++var5)
        {
            for (int var6 = y - 1; var6 <= y + 1; ++var6)
            {
                for (int var7 = z - 2; var7 <= z + 2; ++var7)
                {
                    if (world.getBlockMaterial(var5, var6, var7) == Material.lava
					    || world.getBlockId(var5, var6, var7) == Block.fire.blockID)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public String getTextureFile()
    {
        return "/GNHRM/graphics/oil.png";
    }
}
