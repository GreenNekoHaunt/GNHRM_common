package GNHRM.src;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.MinecraftForge;
import GNHRM.GNHRM;

public class ModBlocks extends Block
{
    private boolean creativeTab = true;
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
    public static Block currantBush;
    public static Block blackberryBush;
    public static Block raspberryBush;
    public static Block currantBranch;
    public static Block blackberryBranch;
    public static Block raspberryBranch;
    public static Block cherryWood;
    public static Block orangeWood;
    public static Block cherryPlanks;
    public static Block orangePlanks;
    public static Block concrete;
    public static Block granite;
    public static Block burningBasalt;
//    public static Block modSapling;
//    public static Block modLeaves;
//    public static Block stairBasalt;
//    public static Block stairMarble;
//    public static BlockHalfSlab slabBasalt;
//    public static BlockHalfSlab slabMarble;
//    public static BlockHalfSlab slabModWood;
    
    public ModBlocks(Material material)
    {
        super(baseId + blockCount, material);
        blockCount++;
    }
    
    public ModBlocks(int texture, Material material)
    {
        super(baseId + blockCount, texture, material);
        blockCount++;
    }
    
    public static void initBlocks()
    {
        oreCopper = new ModBlockModOre(0).setModCreativeTab().setBlockName("oreCopper");
        oreTin = new ModBlockModOre(1).setModCreativeTab().setBlockName("oreTin");
        oreAluminium = new ModBlockModOre(2).setModCreativeTab().setBlockName("oreAluminium");
        oreZinc = new ModBlockModOre(4).setModCreativeTab().setBlockName("oreZinc");
        oreSilver = new ModBlockModOre(3).setModCreativeTab().setBlockName("oreSilver");
        oreUranium = new ModBlockModOre(5).setModCreativeTab().setBlockName("oreUranium");
        oreRuby = new ModBlockModOre(6).setModCreativeTab().setBlockName("oreRuby");
        oreSapphire = new ModBlockModOre(7).setModCreativeTab().setBlockName("oreSapphire");
        oreAmethyst = new ModBlockModOre(8).setModCreativeTab().setBlockName("oreAmethyst");
        oreTopaz = new ModBlockModOre(9).setModCreativeTab().setBlockName("oreTopaz");
        oreSulphur = new ModBlockModOre(10).setModCreativeTab().setBlockName("oreSulphur");
        mud = new ModBlockMud(32).setModCreativeTab().setBlockName("mud");
        moss = new ModBlockMoss(33).setModCreativeTab().setBlockName("moss");
        marbleCobble = new ModBlocks(37, Material.rock).setModCreativeTab().setHardness(2.5F).setResistance(10.0F)
            .setStepSound(soundStoneFootstep).setBlockName("marbleCobble");
        basaltCobble = new ModBlocks(38, Material.rock).setModCreativeTab().setHardness(2.5F).setResistance(10.0F)
            .setStepSound(soundStoneFootstep).setBlockName("basaltCobble");
        marble = new ModBlockCustomStone(35, marbleCobble.blockID).setModCreativeTab().setBlockName("marble");
        basalt = new ModBlockCustomStone(36, basaltCobble.blockID).setModCreativeTab().setBlockName("basalt");
        marbleBrick = new ModBlocks(39, Material.rock).setModCreativeTab().setHardness(3.0F).setResistance(10.0F)
            .setStepSound(soundStoneFootstep).setBlockName("marbleBrick");
        basaltBrick = new ModBlocks(40, Material.rock).setModCreativeTab().setHardness(3.0F).setResistance(10.0F)
            .setStepSound(soundStoneFootstep).setBlockName("basaltBrick");
        concrete = new ModBlocks(41, Material.rock).setModCreativeTab().setHardness(5.0F).setResistance(20.0F)
            .setStepSound(soundStoneFootstep).setBlockName("concrete");
        granite = new ModBlocks(42, Material.rock).setModCreativeTab().setHardness(1.2F).setResistance(6.0F)
            .setStepSound(soundStoneFootstep).setBlockName("granite");
        burningBasalt = new ModBlockBurningBasalt(50).setModCreativeTab().setBlockName("burningBasalt");
        blockCopper = new ModBlocks(16, Material.iron).setModCreativeTab().setHardness(5.0F).setResistance(10.0F)
            .setStepSound(soundMetalFootstep).setBlockName("blockCopper");
        blockTin = new ModBlocks(17, Material.iron).setModCreativeTab().setHardness(5.0F).setResistance(10.0F)
            .setStepSound(soundMetalFootstep).setBlockName("blockTin");
        blockAluminium = new ModBlocks(18, Material.iron).setModCreativeTab().setHardness(5.0F).setResistance(10.0F)
            .setStepSound(soundMetalFootstep).setBlockName("blockAluminium");
        blockZinc = new ModBlocks(20, Material.iron).setModCreativeTab().setHardness(5.0F).setResistance(10.0F)
            .setStepSound(soundMetalFootstep).setBlockName("blockZinc");
        blockSilver = new ModBlocks(19, Material.iron).setModCreativeTab().setHardness(5.0F).setResistance(10.0F)
            .setStepSound(soundMetalFootstep).setBlockName("blockSilver");
        blockRuby = new ModBlocks(21, Material.iron).setModCreativeTab().setHardness(5.0F).setResistance(10.0F)
            .setStepSound(soundMetalFootstep).setBlockName("blockRuby");
        blockSapphire = new ModBlocks(22, Material.iron).setModCreativeTab().setHardness(5.0F).setResistance(10.0F)
            .setStepSound(soundMetalFootstep).setBlockName("blockSapphire");
        blockAmethyst = new ModBlocks(23, Material.iron).setModCreativeTab().setHardness(5.0F).setResistance(10.0F)
            .setStepSound(soundMetalFootstep).setBlockName("blockAmethyst");
        blockTopaz = new ModBlocks(24, Material.iron).setModCreativeTab().setHardness(5.0F).setResistance(10.0F)
            .setStepSound(soundMetalFootstep).setBlockName("blockTopaz");
        blockBrass = new ModBlocks(25, Material.iron).setModCreativeTab().setHardness(5.0F).setResistance(10.0F)
            .setStepSound(soundMetalFootstep).setBlockName("blockBrass");
        blockBronze = new ModBlocks(26, Material.iron).setModCreativeTab().setHardness(5.0F).setResistance(10.0F)
            .setStepSound(soundMetalFootstep).setBlockName("blockBronze");
        cherryWood = new ModBlockModLog(64).setModCreativeTab().setBlockName("cherryWood");
        orangeWood = new ModBlockModLog(67).setModCreativeTab().setBlockName("orangeWood");
        cherryPlanks = new ModBlocks(66, Material.wood).setModCreativeTab().setHardness(2.0F).setResistance(5.0F)
            .setStepSound(soundWoodFootstep).setBlockName("cherryPlanks").setRequiresSelfNotify();
        orangePlanks = new ModBlocks(69, Material.wood).setModCreativeTab().setHardness(2.0F).setResistance(5.0F)
            .setStepSound(soundWoodFootstep).setBlockName("orangePlanks").setRequiresSelfNotify();
        oilFlowing = new ModBlockOilFlowing().setBlockName("oilFlowing");
        oilStill = new ModBlockOilStill().setBlockName("oilStill");
        poisonWaterFlowing = new ModBlockPoisonWaterFlowing().setBlockName("poisonWaterFlowing");
        poisonWaterStill = new ModBlockPoisonWaterStill().setBlockName("poisonWaterStill");
        hay = new ModBlockHay(48).setModCreativeTab().setBlockName("hay");
        tallMoss = new ModBlockTallMoss(6).setBlockName("tallMoss");
        ryeCrops = new ModBlockRye(16).setCreativeTab((CreativeTabs)null).setBlockName("ryeCrops");
        riceCrops = new ModBlockRice(0).setCreativeTab((CreativeTabs)null).setBlockName("riceCrops");
        oatCrops = new ModBlockOat(32).setCreativeTab((CreativeTabs)null).setBlockName("oatCrops");
        barleyCrops = new ModBlockBarley(48).setCreativeTab((CreativeTabs)null).setBlockName("barleyCrops");
        currantBranch = new ModBlockBranch(12, ModItems.currant).setCreativeTab((CreativeTabs)null)
            .setBlockName("currantBranch");
        blackberryBranch = new ModBlockBranch(28, ModItems.blackberry).setCreativeTab((CreativeTabs)null)
            .setBlockName("blackberryBranch");
        raspberryBranch = new ModBlockBranch(44, ModItems.raspberry).setCreativeTab((CreativeTabs)null)
            .setBlockName("raspberryBranch");
        currantBush = new ModBlockBush(8, currantBranch, ModItems.currant).setModCreativeTab().setBlockName("currantBush");
        blackberryBush = new ModBlockBush(24, blackberryBranch, ModItems.blackberry).setModCreativeTab()
            .setBlockName("blackberryBush");
        raspberryBush = new ModBlockBush(40, raspberryBranch, ModItems.raspberry).setModCreativeTab()
            .setBlockName("raspberryBush");
        
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
        MinecraftForge.setBlockHarvestLevel(currantBush, "shovel", 0);
        MinecraftForge.setBlockHarvestLevel(blackberryBush, "shovel", 0);
        MinecraftForge.setBlockHarvestLevel(raspberryBush, "shovel", 0);
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
        GameRegistry.registerBlock(marbleCobble);
        GameRegistry.registerBlock(basaltCobble);
        GameRegistry.registerBlock(marbleBrick);
        GameRegistry.registerBlock(basaltBrick);
        GameRegistry.registerBlock(concrete);
        GameRegistry.registerBlock(granite);
		GameRegistry.registerBlock(burningBasalt);
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
        GameRegistry.registerBlock(cherryWood);
        GameRegistry.registerBlock(orangeWood);
        GameRegistry.registerBlock(cherryPlanks);
        GameRegistry.registerBlock(orangePlanks);
        GameRegistry.registerBlock(oilStill);
        GameRegistry.registerBlock(oilFlowing);
        GameRegistry.registerBlock(poisonWaterStill);
        GameRegistry.registerBlock(poisonWaterFlowing);
        GameRegistry.registerBlock(tallMoss);
        GameRegistry.registerBlock(ryeCrops);
        GameRegistry.registerBlock(riceCrops);
        GameRegistry.registerBlock(oatCrops);
        GameRegistry.registerBlock(barleyCrops);
        GameRegistry.registerBlock(hay);
        GameRegistry.registerBlock(currantBush);
        GameRegistry.registerBlock(blackberryBush);
        GameRegistry.registerBlock(raspberryBush);
        GameRegistry.registerBlock(currantBranch);
        GameRegistry.registerBlock(blackberryBranch);
        GameRegistry.registerBlock(raspberryBranch);
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
        LanguageRegistry.addName(marbleCobble, "Cobble Marble");
        LanguageRegistry.addName(basaltCobble, "Cobble Basalt");
        LanguageRegistry.addName(marbleBrick, "Marble Brick");
        LanguageRegistry.addName(basaltBrick, "Basalt Brick");
        LanguageRegistry.addName(concrete, "Concrete");
        LanguageRegistry.addName(granite, "Granite");
		LanguageRegistry.addName(burningBasalt, "Burning Basalt");
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
        LanguageRegistry.addName(cherryWood, "Cherry Wood");
        LanguageRegistry.addName(orangeWood, "Orange Wood");
        LanguageRegistry.addName(cherryPlanks, "Cherry Wood Planks");
        LanguageRegistry.addName(orangePlanks, "Orange Wood Planks");
        LanguageRegistry.addName(oilStill, "Oil (Still)");
        LanguageRegistry.addName(oilFlowing, "Oil (Flowing)");
        LanguageRegistry.addName(poisonWaterStill, "Poisonous Water (Still)");
        LanguageRegistry.addName(poisonWaterFlowing, "Poisonous Water (Flowing)");
        LanguageRegistry.addName(tallMoss, "Tall Moss");
        LanguageRegistry.addName(ryeCrops, "Rye Crops");
        LanguageRegistry.addName(riceCrops, "Rice Crops");
        LanguageRegistry.addName(oatCrops, "Oat Crops");
        LanguageRegistry.addName(barleyCrops, "Barley Crops");
        LanguageRegistry.addName(hay, "Hay");
        LanguageRegistry.addName(currantBush, "Currant Bush");
        LanguageRegistry.addName(blackberryBush, "Blackberry Bush");
        LanguageRegistry.addName(raspberryBush, "Raspberry Bush");
        LanguageRegistry.addName(currantBranch, "Currant Branch");
        LanguageRegistry.addName(blackberryBranch, "Blackberry Branch");
        LanguageRegistry.addName(raspberryBranch, "Raspberry Branch");
    }
    
    public Block setModCreativeTab()
    {
        this.setCreativeTab(GNHRM.tabGNHRM);
        return this;
    }
    
    public String getTextureFile()
    {
        return "/GNHRM/graphics/blocks.png";
    }
}
