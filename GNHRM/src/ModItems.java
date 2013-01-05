package GNHRM.src;

import net.minecraft.item.Item;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.LanguageRegistry;
import GNHRM.GNHRM;

public class ModItems extends Item
{
    public static int baseId = ModBlocks.baseId + ModBlocks.blockCount + 1;
    public static int itemCount = 0;
    
    public static Item ingotCopper = new ModItems(0, 0).setItemName("ingotCopper");
    public static Item ingotTin = new ModItems(1, 0).setItemName("ingotTin");
    public static Item ingotAluminium = new ModItems(2, 0).setItemName("ingotAluminium");
    public static Item ingotZinc = new ModItems(4, 0).setItemName("ingotZinc");
    public static Item ingotSilver = new ModItems(3, 0).setItemName("ingotSilver");
    public static Item ingotBrass = new ModItems(5, 0).setItemName("ingotBrass");
    public static Item ingotBronze = new ModItems(6, 0).setItemName("ingotBronze");
    public static Item uranium = new ModItems(7, 0).setItemName("uranium");
    public static Item ruby = new ModItems(8, 0).setItemName("ruby");
    public static Item sapphire = new ModItems(9, 0).setItemName("sapphire");
    public static Item amethyst = new ModItems(10, 0).setItemName("amethyst");
    public static Item topaz = new ModItems(11, 0).setItemName("topaz");
    public static Item sulphur = new ModItems(12, 0).setItemName("modSulphur");
    public static Item swordCopper = new ModItemSword(0, 0, ModEnumToolMaterial.COPPER).setItemName("swordCopper");
    public static Item swordTin = new ModItemSword(1, 0, ModEnumToolMaterial.TIN).setItemName("swordTin");
    public static Item swordAluminium = new ModItemSword(2, 0, ModEnumToolMaterial.ALUMINIUM).setItemName("swordAluminium");
    public static Item swordZinc = new ModItemSword(3, 0, ModEnumToolMaterial.ZINC).setItemName("swordZinc");
    public static Item swordSilver = new ModItemSword(4, 0, ModEnumToolMaterial.SILVER).setItemName("swordSilver");
    public static Item swordObsidian = new ModItemSword(5, 0, ModEnumToolMaterial.OBSIDIAN).setItemName("swordObsidian");
    public static Item swordBrass = new ModItemSword(6, 0, ModEnumToolMaterial.BRASS).setItemName("swordBrass");
    public static Item swordBronze = new ModItemSword(7, 0, ModEnumToolMaterial.BRONZE).setItemName("swordBronze");
    public static Item shovelCopper = new ModItemShovel(0, 1, ModEnumToolMaterial.COPPER).setItemName("shovelCopper");
    public static Item shovelTin = new ModItemShovel(1, 1, ModEnumToolMaterial.TIN).setItemName("shovelTin");
    public static Item shovelAluminium = new ModItemShovel(2, 1, ModEnumToolMaterial.ALUMINIUM).setItemName("shovelAluminium");
    public static Item shovelZinc = new ModItemShovel(3, 1, ModEnumToolMaterial.ZINC).setItemName("shovelZinc");
    public static Item shovelSilver = new ModItemShovel(4, 1, ModEnumToolMaterial.SILVER).setItemName("shovelSilver");
    public static Item shovelObsidian = new ModItemShovel(5, 1, ModEnumToolMaterial.OBSIDIAN).setItemName("shovelObsidian");
    public static Item shovelBrass = new ModItemShovel(6, 1, ModEnumToolMaterial.BRASS).setItemName("shovelBrass");
    public static Item shovelBronze = new ModItemShovel(7, 1, ModEnumToolMaterial.BRONZE).setItemName("shovelBronze");
    public static Item pickaxeCopper = new ModItemPickaxe(0, 2, ModEnumToolMaterial.COPPER).setItemName("pickaxeCopper");
    public static Item pickaxeTin = new ModItemPickaxe(1, 2, ModEnumToolMaterial.TIN).setItemName("pickaxeTin");
    public static Item pickaxeAluminium = new ModItemPickaxe(2, 2, ModEnumToolMaterial.ALUMINIUM).setItemName("pickaxeAluminium");
    public static Item pickaxeZinc = new ModItemPickaxe(3, 2, ModEnumToolMaterial.ZINC).setItemName("pickaxeZinc");
    public static Item pickaxeSilver = new ModItemPickaxe(4, 2, ModEnumToolMaterial.SILVER).setItemName("pickaxeSilver");
    public static Item pickaxeObsidian = new ModItemPickaxe(5, 2, ModEnumToolMaterial.OBSIDIAN).setItemName("pickaxeObsidian");
    public static Item pickaxeBrass = new ModItemPickaxe(6, 2, ModEnumToolMaterial.BRASS).setItemName("pickaxeBrass");
    public static Item pickaxeBronze = new ModItemPickaxe(7, 2, ModEnumToolMaterial.BRONZE).setItemName("pickaxeBronze");
    public static Item axeCopper = new ModItemAxe(0, 3, ModEnumToolMaterial.COPPER).setItemName("axeCopper");
    public static Item axeTin = new ModItemAxe(1, 3, ModEnumToolMaterial.TIN).setItemName("axeTin");
    public static Item axeAluminium = new ModItemAxe(2, 3, ModEnumToolMaterial.ALUMINIUM).setItemName("axeAluminium");
    public static Item axeZinc = new ModItemAxe(3, 3, ModEnumToolMaterial.ZINC).setItemName("axeZinc");
    public static Item axeSilver = new ModItemAxe(4, 3, ModEnumToolMaterial.SILVER).setItemName("axeSilver");
    public static Item axeObsidian = new ModItemAxe(5, 3, ModEnumToolMaterial.OBSIDIAN).setItemName("axeObsidian");
    public static Item axeBrass = new ModItemAxe(6, 3, ModEnumToolMaterial.BRASS).setItemName("axeBrass");
    public static Item axeBronze = new ModItemAxe(7, 3, ModEnumToolMaterial.BRONZE).setItemName("axeBronze");
    public static Item hoeCopper = new ModItemHoe(0, 4, ModEnumToolMaterial.COPPER).setItemName("hoeCopper");
    public static Item hoeTin = new ModItemHoe(1, 4, ModEnumToolMaterial.TIN).setItemName("hoeTin");
    public static Item hoeAluminium = new ModItemHoe(2, 4, ModEnumToolMaterial.ALUMINIUM).setItemName("hoeAluminium");
    public static Item hoeZinc = new ModItemHoe(3, 4, ModEnumToolMaterial.ZINC).setItemName("hoeZinc");
    public static Item hoeSilver = new ModItemHoe(4, 4, ModEnumToolMaterial.SILVER).setItemName("hoeSilver");
    public static Item hoeObsidian = new ModItemHoe(5, 4, ModEnumToolMaterial.OBSIDIAN).setItemName("hoeObsidian");
    public static Item hoeBrass = new ModItemHoe(6, 4, ModEnumToolMaterial.BRASS).setItemName("hoeBrass");
    public static Item hoeBronze = new ModItemHoe(7, 4, ModEnumToolMaterial.BRONZE).setItemName("hoeBronze");
    public static Item ryeSeeds = new ModItemSeeds(0, 15, ModBlocks.ryeCrops.blockID, Block.tilledField.blockID).setItemName("ryeSeeds");
    public static Item rice = new ModItemSeeds(1, 15, ModBlocks.riceCrops.blockID, Block.tilledField.blockID).setItemName("riceSeeds");
    public static Item oat = new ModItemSeeds(2, 15, ModBlocks.oatCrops.blockID, Block.tilledField.blockID).setItemName("oat");
    public static Item barleySeeds = new ModItemSeeds(3, 15, ModBlocks.barleyCrops.blockID, Block.tilledField.blockID).setItemName("barleyCrops");
    public static Item rye = new ModItems(0, 14).setItemName("rye");
    public static Item barley = new ModItems(1, 14).setItemName("barley");
    public static Item corn = new ModItems(2, 14).setItemName("corn");
    public static Item currant = new ModItems(3, 14).setItemName("currant");
    public static Item blackberry = new ModItems(4, 14).setItemName("blackberry");
    public static Item raspberry = new ModItems(5, 14).setItemName("raspberry");
    public static Item cherry = new ModItems(6, 14).setItemName("cherry");
    public static Item bucketOil = new ModItemBucketOil(15, 16).setItemName("bucketOil");
    public static Item bucketPoison = new ModItemBucketPoison(16, 16).setItemName("bucketPoison");
    
    public ModItems()
    {
        super(baseId + itemCount);
        this.setCreativeTab(GNHRM.tabGNHRM);
        itemCount++;
    }
    
    public ModItems(int x, int y)
    {
        super(baseId + itemCount);
        this.setCreativeTab(GNHRM.tabGNHRM);
        itemCount++;
        this.setIconCoord(x, y);
    }
    
    public static void initNames()
    {
        LanguageRegistry.addName(ingotCopper, "Copper Ingot");
        LanguageRegistry.addName(ingotTin, "Tin Ingot");
        LanguageRegistry.addName(ingotAluminium, "Aluminium Ingot");
        LanguageRegistry.addName(ingotZinc, "Zinc Ingot");
        LanguageRegistry.addName(ingotSilver, "Silver Ingot");
        LanguageRegistry.addName(ingotBronze, "Bronze Ingot");
        LanguageRegistry.addName(ingotBrass, "Brass Ingot");
        LanguageRegistry.addName(uranium, "Uranium");
        LanguageRegistry.addName(ruby, "Ruby");
        LanguageRegistry.addName(sapphire, "Sapphire");
        LanguageRegistry.addName(amethyst, "Amethyst");
        LanguageRegistry.addName(topaz, "Topaz");
        LanguageRegistry.addName(sulphur, "Sulphur");
        LanguageRegistry.addName(swordCopper, "Copper Sword");
        LanguageRegistry.addName(swordTin, "Tin Sword");
        LanguageRegistry.addName(swordAluminium, "Aluminium Sword");
        LanguageRegistry.addName(swordZinc, "Zinc Sword");
        LanguageRegistry.addName(swordSilver, "Silver Sword");
        LanguageRegistry.addName(swordObsidian, "Obsidian Sword");
        LanguageRegistry.addName(swordBrass, "Brass Sword");
        LanguageRegistry.addName(swordBronze, "Bronze Sword");
        LanguageRegistry.addName(shovelCopper, "Copper Shovel");
        LanguageRegistry.addName(shovelTin, "Tin Shovel");
        LanguageRegistry.addName(shovelAluminium, "Aluminium Shovel");
        LanguageRegistry.addName(shovelZinc, "Zinc Shovel");
        LanguageRegistry.addName(shovelSilver, "Silver Shovel");
        LanguageRegistry.addName(shovelObsidian, "Obsidian Shovel");
        LanguageRegistry.addName(shovelBrass, "Brass Shovel");
        LanguageRegistry.addName(shovelBronze, "Bronze Shovel");
        LanguageRegistry.addName(pickaxeCopper, "Copper Pickaxe");
        LanguageRegistry.addName(pickaxeTin, "Tin Pickaxe");
        LanguageRegistry.addName(pickaxeAluminium, "Aluminium Pickaxe");
        LanguageRegistry.addName(pickaxeZinc, "Zinc Pickaxe");
        LanguageRegistry.addName(pickaxeSilver, "Silver Pickaxe");
        LanguageRegistry.addName(pickaxeObsidian, "Obsidian Pickaxe");
        LanguageRegistry.addName(pickaxeBrass, "Brass Pickaxe");
        LanguageRegistry.addName(pickaxeBronze, "Bronze Pickaxe");
        LanguageRegistry.addName(axeCopper, "Copper Axe");
        LanguageRegistry.addName(axeTin, "Tin Axe");
        LanguageRegistry.addName(axeAluminium, "Aluminium Axe");
        LanguageRegistry.addName(axeZinc, "Zinc Axe");
        LanguageRegistry.addName(axeSilver, "Silver Axe");
        LanguageRegistry.addName(axeObsidian, "Obsidian Axe");
        LanguageRegistry.addName(axeBrass, "Brass Axe");
        LanguageRegistry.addName(axeBronze, "Bronze Axe");
        LanguageRegistry.addName(hoeCopper, "Copper Hoe");
        LanguageRegistry.addName(hoeTin, "Tin Hoe");
        LanguageRegistry.addName(hoeAluminium, "Aluminium Hoe");
        LanguageRegistry.addName(hoeZinc, "Zinc Hoe");
        LanguageRegistry.addName(hoeSilver, "Silver Hoe");
        LanguageRegistry.addName(hoeObsidian, "Obsidian Hoe");
        LanguageRegistry.addName(hoeBrass, "Brass Hoe");
        LanguageRegistry.addName(hoeBronze, "Bronze Hoe");
        LanguageRegistry.addName(ryeSeeds, "Rye Seeds");
        LanguageRegistry.addName(barleySeeds, "Barley Seeds");
        LanguageRegistry.addName(rice, "Rice");
        LanguageRegistry.addName(rye, "Rye");
        LanguageRegistry.addName(oat, "Oat");
        LanguageRegistry.addName(barley, "Barley");
        LanguageRegistry.addName(corn, "Corn");
        LanguageRegistry.addName(bucketOil, "Oil Bucket");
        LanguageRegistry.addName(bucketPoison, "Poisononous Water Bucket");
        LanguageRegistry.addName(currant, "Currant");
        LanguageRegistry.addName(blackberry, "Blackberry");
        LanguageRegistry.addName(raspberry, "Raspberry");
    }
    
    @Override
    public String getTextureFile()
    {
        return "/GNHRM/graphics/items.png";
    }
}
