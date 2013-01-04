package GNHRM.src;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;

public class ModRecipes
{
	private static Object[] recipeItems;
	private static Object[][] recipeResults;
	private static String[][] recipePatterns;

	public static void initShapelessCraftingRecipes()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 2), ModItems.sulphur, new ItemStack(Item.coal, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotBronze, 1), ModItems.ingotCopper, ModItems.ingotTin);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotBrass, 1), ModItems.ingotCopper, ModItems.ingotZinc);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.moss, 1), new ItemStack(ModBlocks.tallMoss, 3), ModBlocks.mud);
		GameRegistry.addShapelessRecipe(new ItemStack(Block.stoneBrick, 1, 1), new ItemStack(ModBlocks.tallMoss, 3), new ItemStack(Block.stoneBrick, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(Block.cobblestoneMossy, 1), new ItemStack(ModBlocks.tallMoss, 3), Block.cobblestone);
	}
	
	public static void initShapedCraftingRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(ModBlocks.marbleBrick), "xx", "xx", 'x', ModBlocks.marble);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.basaltBrick), "xx", "xx", 'x', ModBlocks.basalt);
		GameRegistry.addRecipe(new ItemStack(Item.wheat), "xxx", "xxx", "xxx", 'x', ModBlocks.hay);
		GameRegistry.addRecipe(new ItemStack(ModItems.rye), "xxx", "xxx", "xxx", 'x', ModBlocks.hay);
		GameRegistry.addRecipe(new ItemStack(Item.bread), "xxx", 'x', ModItems.rye);
		initOreStorageRecipes();
		initToolRecipes();
	}
	
	public static void initSmeltingRecipe()
	{
		GameRegistry.addSmelting(ModBlocks.oreCopper.blockID, new ItemStack(ModItems.ingotCopper), 0.5F);
		GameRegistry.addSmelting(ModBlocks.oreTin.blockID, new ItemStack(ModItems.ingotTin), 0.5F);
		GameRegistry.addSmelting(ModBlocks.oreAluminium.blockID, new ItemStack(ModItems.ingotAluminium), 0.5F);
		GameRegistry.addSmelting(ModBlocks.oreZinc.blockID, new ItemStack(ModItems.ingotZinc), 0.5F);
		GameRegistry.addSmelting(ModBlocks.oreSilver.blockID, new ItemStack(ModItems.ingotSilver), 0.8F);
		GameRegistry.addSmelting(ModBlocks.marbleCobble.blockID, new ItemStack(ModBlocks.marble), 0.1F);
		GameRegistry.addSmelting(ModBlocks.basaltCobble.blockID, new ItemStack(ModBlocks.marble), 0.1F);
	}
	
	private static void initOreStorageRecipes()
	{
		recipeItems = new Object[]{ModItems.ingotCopper, ModItems.ingotTin, ModItems.ingotAluminium, ModItems.ingotZinc, ModItems.ingotSilver,
		ModItems.ingotBronze, ModItems.ingotBrass, ModItems.ruby, ModItems.sapphire, ModItems.amethyst, ModItems.topaz};
		recipeResults = new Object[][]{{ModBlocks.blockCopper, ModBlocks.blockTin, ModBlocks.blockAluminium, ModBlocks.blockZinc, ModBlocks.blockSilver,
		ModBlocks.blockBronze, ModBlocks.blockBrass, ModBlocks.blockRuby, ModBlocks.blockSapphire, ModBlocks.blockAmethyst, ModBlocks.blockTopaz}};
		
		for(int var2 = 0; var2 < recipeItems.length; ++var2)
		{
			Object var3 = recipeItems[var2];

			Block var5 = (Block)recipeResults[0][var2];
			GameRegistry.addRecipe(new ItemStack(var5), "xxx", "xxx", "xxx", 'x', var3);
		}
	}
	
	private static void initToolRecipes()
	{
		recipePatterns = new String[][]{{"x", "x", "y"}, {"x", "y", "y"}, {"xxx", " y ", " y "}, {"xx", "xy", " y"}, {"xx", " y", " y"}};
		recipeItems = new Object[]{ModItems.ingotCopper, ModItems.ingotTin, ModItems.ingotAluminium, ModItems.ingotZinc, ModItems.ingotSilver,
			ModBlocks.obsidian, ModItems.ingotBronze, ModItems.ingotBrass};
		recipeResults = new Object[][]{
		{ModItems.swordCopper, ModItems.swordTin, ModItems.swordAluminium, ModItems.swordZinc, ModItems.swordSilver, ModItems.swordObsidian, ModItems.swordBronze, ModItems.swordBrass},
		{ModItems.shovelCopper, ModItems.shovelTin, ModItems.shovelAluminium, ModItems.shovelZinc, ModItems.shovelSilver, ModItems.shovelObsidian, ModItems.shovelBronze, ModItems.shovelBrass},
		{ModItems.pickaxeCopper, ModItems.pickaxeTin, ModItems.pickaxeAluminium, ModItems.pickaxeZinc, ModItems.pickaxeSilver, ModItems.pickaxeObsidian, ModItems.pickaxeBronze, ModItems.pickaxeBrass},
		{ModItems.axeCopper, ModItems.axeTin, ModItems.axeAluminium, ModItems.axeZinc, ModItems.axeSilver, ModItems.axeObsidian, ModItems.axeBronze, ModItems.axeBrass},
		{ModItems.hoeCopper, ModItems.hoeTin, ModItems.hoeAluminium, ModItems.hoeZinc, ModItems.hoeSilver, ModItems.hoeObsidian, ModItems.hoeBronze, ModItems.hoeBrass}};
		
		for(int var6 = 0; var6 < recipePatterns.length; ++var6)
		{
			for(int var2 = 0; var2 < recipeItems.length; ++var2)
			{
				Object var3 = recipeItems[var2];

				Item var5 = (Item)recipeResults[var6][var2];
				GameRegistry.addRecipe(new ItemStack(var5), recipePatterns[var6], 'x', var3, 'y', Item.stick);
			}
		}
	}
}