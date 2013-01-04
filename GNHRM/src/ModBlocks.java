package GNHRM.src;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.MinecraftForge;
import GNHRM.GNHRM;

public class ModBlocks extends Block
{
	public static int baseId = 3000;
	public static int blockCount = 0;
	public static Block oreCopper;
	public static Block oreTin;
	public static Block oreAluminium;
	public static Block oreZinc;
	public static Block oreSilver;
	public static Block oreUranium;
	public static Block oreRuby;
	public static Block oreSapphire;
	public static Block oreAmethyst;
	public static Block oreTopaz;
	public static Block oreSulphur;
	public static Block oilStill;
	public static Block oilFlowing;
	public static Block poisonWaterStill;
	public static Block poisonWaterFlowing;
	public static Block mud;
	public static Block moss;
	public static Block marble;
	public static Block basalt;
	public static Block blockCopper;
	public static Block blockTin;
	public static Block blockAluminium;
	public static Block blockZinc;
	public static Block blockSilver;
	public static Block blockRuby;
	public static Block blockSapphire;
	public static Block blockAmethyst;
	public static Block blockTopaz;
	public static Block blockBrass;
	public static Block blockBronze;
	public static Block marbleCobble;
	public static Block basaltCobble;
	public static Block marbleBrick;
	public static Block basaltBrick;
	public static Block tallMoss;
	public static Block ryeCrops;
	public static Block riceCrops;
	public static Block oatCrops;
	public static Block barleyCrops;
	public static Block hay;
	
	public ModBlocks(Material material)
	{
		super(baseId + blockCount, material);
		this.setCreativeTab(GNHRM.tabGNHRM);
		blockCount++;
	}
	
	public ModBlocks(int texture, Material material)
	{
		super(baseId + blockCount, texture, material);
		this.setCreativeTab(GNHRM.tabGNHRM);
		blockCount++;
	}
	
	public static void initBlocks()
	{
		oreCopper = new ModBlockModOre(0).setBlockName("oreCopper");
		oreTin = new ModBlockModOre(1).setBlockName("oreTin");
		oreAluminium = new ModBlockModOre(2).setBlockName("oreAluminium");
		oreZinc = new ModBlockModOre(4).setBlockName("oreZinc");
		oreSilver = new ModBlockModOre(3).setBlockName("oreSilver");
		oreUranium = new ModBlockModOre(5).setBlockName("oreUranium");
		oreRuby = new ModBlockModOre(6).setBlockName("oreRuby");
		oreSapphire = new ModBlockModOre(7).setBlockName("oreSapphire");
		oreAmethyst = new ModBlockModOre(8).setBlockName("oreAmethyst");
		oreTopaz = new ModBlockModOre(9).setBlockName("oreTopaz");
		oreSulphur = new ModBlockModOre(10).setBlockName("oreSulphur");
		mud = new ModBlockMud(32).setBlockName("mud");
		moss = new ModBlockMoss(33).setBlockName("moss");
		marbleCobble = new ModBlocks(37, Material.rock).setHardness(2.5F).setResistance(10.0F).setStepSound(soundStoneFootstep).setBlockName("marble");
		basaltCobble = new ModBlocks(38, Material.rock).setHardness(2.5F).setResistance(10.0F).setStepSound(soundStoneFootstep).setBlockName("basalt");
		marbleBrick = new ModBlocks(39, Material.rock).setHardness(2.0F).setResistance(10.0F).setStepSound(soundStoneFootstep).setBlockName("marble");
		basaltBrick = new ModBlocks(40, Material.rock).setHardness(2.0F).setResistance(10.0F).setStepSound(soundStoneFootstep).setBlockName("basalt");
		marble = new ModBlockCustomStone(35, marbleCobble.blockID).setBlockName("marble");
		basalt = new ModBlockCustomStone(36, basaltCobble.blockID).setBlockName("basalt");
		blockCopper = new ModBlocks(16, Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setBlockName("blockCopper");
		blockTin = new ModBlocks(17, Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setBlockName("blockTin");
		blockAluminium = new ModBlocks(18, Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setBlockName("blockAluminium");
		blockZinc = new ModBlocks(20, Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setBlockName("blockZinc");
		blockSilver = new ModBlocks(19, Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setBlockName("blockSilver");
		blockRuby = new ModBlocks(21, Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setBlockName("blockRuby");
		blockSapphire = new ModBlocks(22, Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setBlockName("blockSapphire");
		blockAmethyst = new ModBlocks(23, Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setBlockName("blockAmethyst");
		blockTopaz = new ModBlocks(24, Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setBlockName("blockTopaz");
		blockBrass = new ModBlocks(25, Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setBlockName("blockBrass");
		blockBronze = new ModBlocks(26, Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setBlockName("blockBronze");
		oilFlowing = new ModBlockOilFlowing().setBlockName("oilFlowing");
		oilStill = new ModBlockOilStill().setBlockName("oilStill");
		poisonWaterFlowing = new ModBlockPoisonWaterFlowing().setBlockName("poisonWaterFlowing");
		poisonWaterStill = new ModBlockPoisonWaterStill().setBlockName("poisonWaterStill");
		hay = new ModBlockHay(48).setBlockName("hay");
		tallMoss = new ModBlockTallMoss(6).setBlockName("tallMoss");
		ryeCrops = new ModBlockRye(16).setBlockName("ryeCrops");
		riceCrops = new ModBlockRice(0).setBlockName("riceCrops");
		oatCrops = new ModBlockOat(32).setBlockName("oatCrops");
		barleyCrops = new ModBlockBarley(48).setBlockName("barleyCrops");
		registerBlocks();
	}

	public static void initHarvestLevel()
	{
		MinecraftForge.setBlockHarvestLevel(oreCopper, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(blockCopper, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(oreTin, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(blockTin, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(oreAluminium, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(blockAluminium, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(oreZinc, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(blockZinc, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(oreSulphur, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(oreSilver, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blockSilver, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(oreUranium, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(oreRuby, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blockRuby, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(oreSapphire, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blockSapphire, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(oreAmethyst, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blockAmethyst, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(oreTopaz, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blockTopaz, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blockBronze, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blockBrass, "pickaxe", 2);
	}
	
	private static void registerBlocks()
	{
		GameRegistry.registerBlock(oreCopper);
		GameRegistry.registerBlock(oreTin);
		GameRegistry.registerBlock(oreAluminium);
		GameRegistry.registerBlock(oreZinc);
		GameRegistry.registerBlock(oreSilver);
		GameRegistry.registerBlock(oreUranium);
		GameRegistry.registerBlock(oreRuby);
		GameRegistry.registerBlock(oreSapphire);
		GameRegistry.registerBlock(oreAmethyst);
		GameRegistry.registerBlock(oreTopaz);
		GameRegistry.registerBlock(oreSulphur);
		GameRegistry.registerBlock(mud);
		GameRegistry.registerBlock(moss);
		GameRegistry.registerBlock(marble);
		GameRegistry.registerBlock(basalt);
		GameRegistry.registerBlock(blockCopper);
		GameRegistry.registerBlock(blockTin);
		GameRegistry.registerBlock(blockAluminium);
		GameRegistry.registerBlock(blockZinc);
		GameRegistry.registerBlock(blockSilver);
		GameRegistry.registerBlock(blockRuby);
		GameRegistry.registerBlock(blockSapphire);
		GameRegistry.registerBlock(blockAmethyst);
		GameRegistry.registerBlock(blockTopaz);
		GameRegistry.registerBlock(blockBrass);
		GameRegistry.registerBlock(blockBronze);
		GameRegistry.registerBlock(oilStill);
		GameRegistry.registerBlock(oilFlowing);
		GameRegistry.registerBlock(poisonWaterStill);
		GameRegistry.registerBlock(poisonWaterFlowing);
		GameRegistry.registerBlock(marbleCobble);
		GameRegistry.registerBlock(basaltCobble);
		GameRegistry.registerBlock(marbleBrick);
		GameRegistry.registerBlock(basaltBrick);
		GameRegistry.registerBlock(tallMoss);
		GameRegistry.registerBlock(ryeCrops);
		GameRegistry.registerBlock(riceCrops);
		GameRegistry.registerBlock(oatCrops);
		GameRegistry.registerBlock(barleyCrops);
		GameRegistry.registerBlock(hay);
	}

	public static void initNames()
	{
		LanguageRegistry.addName(oreCopper, "Copper Ore");
		LanguageRegistry.addName(oreTin, "Tin Ore");
		LanguageRegistry.addName(oreAluminium, "Aluminium Ore");
		LanguageRegistry.addName(oreZinc, "Zinc Ore");
		LanguageRegistry.addName(oreSilver, "Silver Ore");
		LanguageRegistry.addName(oreUranium, "Uranium Ore");
		LanguageRegistry.addName(oreRuby, "Ruby Ore");
		LanguageRegistry.addName(oreSapphire, "Sapphire Ore");
		LanguageRegistry.addName(oreAmethyst, "Amethyst Ore");
		LanguageRegistry.addName(oreTopaz, "Topaz Ore");
		LanguageRegistry.addName(oreSulphur, "Sulphur Ore");
		LanguageRegistry.addName(mud, "Mud");
		LanguageRegistry.addName(moss, "Moss");
		LanguageRegistry.addName(marble, "Marble");
		LanguageRegistry.addName(basalt, "Basalt");
		LanguageRegistry.addName(blockCopper, "Block of Copper");
		LanguageRegistry.addName(blockTin, "Block of Tin");
		LanguageRegistry.addName(blockAluminium, "Block of Aluminium");
		LanguageRegistry.addName(blockZinc, "Block of Zinc");
		LanguageRegistry.addName(blockSilver, "Block of Silver");
		LanguageRegistry.addName(blockRuby, "Block of Ruby");
		LanguageRegistry.addName(blockSapphire, "Block of Sapphire");
		LanguageRegistry.addName(blockAmethyst, "Block of Amethyst");
		LanguageRegistry.addName(blockTopaz, "Block of Topaz");
		LanguageRegistry.addName(blockBrass, "Block of Brass");
		LanguageRegistry.addName(blockBronze, "Block of Bronze");
		LanguageRegistry.addName(oilStill, "Oil (Still)");
		LanguageRegistry.addName(oilFlowing, "Oil (Flowing)");
		LanguageRegistry.addName(poisonWaterStill, "Poisonous Water (Still)");
		LanguageRegistry.addName(poisonWaterFlowing, "Poisonous Water (Flowing)");
		LanguageRegistry.addName(marbleCobble, "Cobble Marble");
		LanguageRegistry.addName(basaltCobble, "Cobble Basalt");
		LanguageRegistry.addName(marbleBrick, "Marble Brick");
		LanguageRegistry.addName(basaltBrick, "Basalt Brick");
		LanguageRegistry.addName(tallMoss, "Tall Moss");
		LanguageRegistry.addName(ryeCrops, "Rye Crops");
		LanguageRegistry.addName(riceCrops, "Rice Crops");
		LanguageRegistry.addName(oatCrops, "Oat Crops");
		LanguageRegistry.addName(barleyCrops, "Barley Crops");
		LanguageRegistry.addName(hay, "Hay");
	}
	
	public String getTextureFile()
	{
	    return "/GNHRM/graphics/blocks.png";
	}
}