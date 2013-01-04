package GNHRM.src;

import net.minecraftforge.common.DungeonHooks;
import net.minecraft.item.ItemStack;

public class ModDungeonLoot
{
	public static void addDungeonLoot()
	{
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.ingotCopper), 1, 3, 8);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.ingotAluminium), 1, 3, 8);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.ingotTin), 1, 3, 8);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.ingotZinc), 1, 3, 8);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.ingotSilver), 1, 3, 8);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.ingotBrass), 1, 3, 8);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.ingotBronze), 1, 3, 8);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.ruby), 1, 3, 8);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.sapphire), 1, 3, 8);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.amethyst), 1, 3, 8);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.topaz), 1, 3, 8);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.ryeSeeds), 1, 2, 4);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.rice), 1, 2, 4);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.oat), 1, 2, 4);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.barley), 1, 2, 4);
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.corn), 1, 1, 2);
	}
}

