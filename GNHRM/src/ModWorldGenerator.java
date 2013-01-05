package GNHRM.src;

import java.util.Random;

import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;
import cpw.mods.fml.common.IWorldGenerator;

public class ModWorldGenerator implements IWorldGenerator 
{
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case -1: generateNether(world, random, chunkX*16, chunkZ*16);
            case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
            case 1: generateEnd(world, random, chunkX*16, chunkZ*16);
        }
    }
    
    private void generateSurface(World world, Random random, int blockX, int blockZ) 
    {
        ModWorldOreGenerator.generateSurfaceOre(world, random, blockX, blockZ);
        ModMiningDecoGenerator.generateSurfaceDecoration(world, random, blockX, blockZ);
    }
 
    private void generateNether(World world, Random random, int blockX, int blockZ) 
    {
        ModMiningDecoGenerator.generateNetherDecoration(world, random, blockX, blockZ);
    }
    
    private void generateEnd(World world, Random random, int blockX, int blockZ)
    {
    }
}
