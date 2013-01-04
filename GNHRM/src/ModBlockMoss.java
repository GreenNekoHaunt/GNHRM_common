package GNHRM.src;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import java.util.Random;

public class ModBlockMoss extends ModBlocks
{
	public ModBlockMoss(int texture)
	{
		super(texture, Material.grass);
		this.setHardness(1.5F);
		this.setStepSound(soundGrassFootstep);
		this.setTickRandomly(true);
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        return par1 == 1 ? this.blockIndexInTexture : (par1 == 0 ? this.blockIndexInTexture - 1 : this.blockIndexInTexture + 1);
    }
	
	@Override
	public void updateTick(World par1World, int x, int y, int z, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            for (int var6 = 0; var6 < 4; ++var6)
			{
				int var7 = x + par5Random.nextInt(3) - 1;
				int var8 = y + par5Random.nextInt(5) - 3;
				int var9 = z + par5Random.nextInt(3) - 1;
				int var10 = par1World.getBlockId(var7, var8 + 1, var9);
				
				if(this.isWaterNearby(par1World, var7, var8, var9))
				{
					if(par5Random.nextInt(20) <= 1 && par1World.isAirBlock(x, y + 1, z))
					{
						par1World.setBlockWithNotify(x, y + 1, z, ModBlocks.tallMoss.blockID);
					}
					if(this.isAirAdjacent(par1World, var7, var8, var9))
					{
						if (par1World.getBlockId(var7, var8, var9) == ModBlocks.mud.blockID && (par1World.getBlockId(var7, var8 + 1, var9) != ModBlocks.mud.blockID 
							&& par1World.getBlockId(var7, var8 + 1, var9) != ModBlocks.moss.blockID))
						{
							par1World.setBlockWithNotify(var7, var8, var9, ModBlocks.moss.blockID);
						}
						else if(par1World.getBlockId(var7, var8, var9) == Block.cobblestone.blockID)
						{
							par1World.setBlockWithNotify(var7, var8, var9, Block.cobblestoneMossy.blockID);
						}
						else if(par1World.getBlockId(var7, var8, var9) == Block.stoneBrick.blockID)
						{
							par1World.setBlockAndMetadata(var7, var8, var9, Block.stoneBrick.blockID, 1);
						}
					}
				}
			}
        }
    }
	
	private boolean isAirAdjacent(World par1World, int x, int y, int z)
    {
        if (par1World.isAirBlock(x, y - 1, z) || par1World.getBlockMaterial(x, y - 1, z) == Material.water)
		{
			return true;
		}
		else if (par1World.isAirBlock(x, y + 1, z) || par1World.getBlockMaterial(x, y + 1, z) == Material.water)
		{
			return true;
		}
		else if (par1World.isAirBlock(x - 1, y, z) || par1World.getBlockMaterial(x - 1, y, z) == Material.water)
		{
			return true;
		}
		else if (par1World.isAirBlock(x + 1, y, z) || par1World.getBlockMaterial(x + 1, y, z) == Material.water)
		{
			return true;
		}
		else if (par1World.isAirBlock(x, y, z + 1) || par1World.getBlockMaterial(x, y, z + 1) == Material.water)
		{
			return true;
		}
		else if (par1World.isAirBlock(x, y, z - 1) || par1World.getBlockMaterial(x, y, z - 1) == Material.water)
		{
			return true;
		}
        return false;
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
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return ModBlocks.mud.idDropped(0, par2Random, par3);
    }
}