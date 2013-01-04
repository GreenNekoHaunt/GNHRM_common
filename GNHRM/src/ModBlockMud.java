package GNHRM.src;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import java.util.Random;

public class ModBlockMud extends ModBlocks
{
	public ModBlockMud(int texture)
	{
		super(texture, Material.ground);
		this.setHardness(1.5F);
		this.setStepSound(soundGravelFootstep);
		this.setTickRandomly(true);
	}
	
	@Override
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
			for (int var6 = 0; var6 < 4; ++var6)
			{
				int var7 = par2 + par5Random.nextInt(3) - 1;
				int var8 = par3 + par5Random.nextInt(5) - 3;
				int var9 = par4 + par5Random.nextInt(3) - 1;
				int var10 = par1World.getBlockId(var7, var8 + 1, var9);

				if (par1World.getBlockId(var7, var8, var9) == ModBlocks.mud.blockID)
				{
					if(this.isWaterNearby(par1World, par2, par3, par4) && par5Random.nextInt(9) < 2)
					{
						par1World.setBlockWithNotify(var7, var8, var9, ModBlocks.moss.blockID);
					}
				}
			}
        }
    }
	
	private boolean isWaterNearby(World par1World, int par2, int par3, int par4)
    {
        for (int var5 = par2 - 4; var5 <= par2 + 4; ++var5)
        {
            for (int var6 = par3; var6 <= par3 + 1; ++var6)
            {
                for (int var7 = par4 - 4; var7 <= par4 + 4; ++var7)
                {
                    if (par1World.getBlockMaterial(var5, var6, var7) == Material.water)
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}