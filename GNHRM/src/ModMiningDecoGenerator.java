package GNHRM.src;

import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import java.util.Random;

public class ModMiningDecoGenerator
{
	public static void generateSurfaceDecoration(World world, Random random, int blockX, int blockZ)
	{	
		BiomeGenBase chunkBiome = world.getBiomeGenForCoords(blockX, blockZ);
		genDeco(ModBlocks.mud.blockID, 32, 10, world, random, blockX + random.nextInt(16), random.nextInt(128), blockZ + random.nextInt(16));
		genDeco(ModBlocks.marble.blockID, 48, 10, world, random, blockX + random.nextInt(16), random.nextInt(128), blockZ + random.nextInt(16));
		if(random.nextInt(20) < 5)
		{
			genLiquid(ModBlocks.oilFlowing.blockID, world, random, blockX + random.nextInt(16), random.nextInt(96), blockZ + random.nextInt(16));
		}
		if(chunkBiome.biomeID == BiomeGenBase.swampland.biomeID || chunkBiome.biomeID == BiomeGenBase.jungle.biomeID)
		{
			genLiquid(ModBlocks.poisonWaterFlowing.blockID, world, random, blockX + random.nextInt(16), random.nextInt(96), blockZ + random.nextInt(16));
		}
	}
	
	public static void generateNetherDecoration(World world, Random random, int blockX, int blockZ)
	{
		genDecoCustom(ModBlocks.basalt.blockID, Block.netherrack.blockID, 128, 5, world, random, blockX + random.nextInt(16), random.nextInt(256), blockZ + random.nextInt(16));
	}
	
	private static void genDeco(int blockID, int decoSize, int amount, World world, Random random, int Xcoord, int Ycoord, int Zcoord)
	{
		for (int var5 = 0; var5 < amount; ++var5)
        {
			(new WorldGenMinable(blockID, decoSize)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
	
	private static void genLiquid(int blockID, World world, Random random, int blockX, int blockY, int blockZ)
	{
		(new WorldGenLiquids(blockID)).generate(world, random, blockX, blockY, blockZ);
		(new WorldGenLakes(blockID)).generate(world, random, blockX, blockY, blockZ);
	}
	
	private static void genDecoCustom(int blockID, int replacedBlockId, int decoSize, int amount, World world, Random random, int Xcoord, int Ycoord, int Zcoord)
	{
		for (int var5 = 0; var5 < amount; ++var5)
        {
			(new ModWorldGenMinableCustom(blockID, replacedBlockId, decoSize)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
}