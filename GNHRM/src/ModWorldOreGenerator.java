package GNHRM.src;

import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import java.util.Random;
import java.util.*;

public class ModWorldOreGenerator
{
	private static void genOre(int blockID, int veinSize, int amount, World world, Random random, int Xcoord, int Ycoord, int Zcoord)
	{
		for (int var5 = 0; var5 < amount; ++var5)
        {
			(new WorldGenMinable(blockID, veinSize)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}

	public static void generateSurfaceOre(World world, Random random, int blockX, int blockZ) 
	{	
		BiomeGenBase chunkBiome = world.getBiomeGenForCoords(blockX, blockZ);
		genOre(ModBlocks.oreCopper.blockID, 10, 20, world, random, blockX + random.nextInt(16), random.nextInt(64), blockZ + random.nextInt(16));
		genOre(ModBlocks.oreTin.blockID, 12, 20, world, random, blockX + random.nextInt(16), random.nextInt(64), blockZ + random.nextInt(16));
		genOre(ModBlocks.oreAluminium.blockID, 12, 20, world, random, blockX + random.nextInt(16), random.nextInt(64), blockZ + random.nextInt(16));
		genOre(ModBlocks.oreZinc.blockID, 10, 20, world, random, blockX + random.nextInt(16), random.nextInt(64), blockZ + random.nextInt(16));
		genOre(ModBlocks.oreSilver.blockID, 8, 8, world, random, blockX + random.nextInt(16), random.nextInt(48), blockZ + random.nextInt(16));
		genOre(ModBlocks.oreSulphur.blockID, 6, 8, world, random, blockX + random.nextInt(16), (8 + random.nextInt(16)), blockZ + random.nextInt(16));
		genOre(ModBlocks.oreUranium.blockID, 7, 2, world, random, blockX + random.nextInt(16), (16 + random.nextInt(32)), blockZ + random.nextInt(16));
		if(chunkBiome.biomeID == BiomeGenBase.extremeHills.biomeID)
		{
			genOre(ModBlocks.oreRuby.blockID, 1, (3 + random.nextInt(6)), world, random, blockX + random.nextInt(16), random.nextInt(32), blockZ + random.nextInt(16));
			genOre(ModBlocks.oreSapphire.blockID, 1, (3 + random.nextInt(6)), world, random, blockX + random.nextInt(16), random.nextInt(32), blockZ + random.nextInt(16));
			genOre(ModBlocks.oreAmethyst.blockID, 1, (3 + random.nextInt(6)), world, random, blockX + random.nextInt(16), random.nextInt(32), blockZ + random.nextInt(16));
			genOre(ModBlocks.oreTopaz.blockID, 1, (3 + random.nextInt(6)), world, random, blockX + random.nextInt(16), random.nextInt(32), blockZ + random.nextInt(16));
		}
	}
}