package GNHRM.src;

import net.minecraftforge.common.EnumHelper;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class ModEnumToolMaterial
{
	public static EnumToolMaterial COPPER;
	public static EnumToolMaterial TIN;
	public static EnumToolMaterial ALUMINIUM;
	public static EnumToolMaterial ZINC;
	public static EnumToolMaterial SILVER;
	public static EnumToolMaterial OBSIDIAN;
	public static EnumToolMaterial BRASS;
	public static EnumToolMaterial BRONZE;
	
	public static void initModEnumToolMaterial()
	{
		COPPER = EnumHelper.addToolMaterial("COPPER", 1, 156, 4.5F, 1, 10);
		TIN = EnumHelper.addToolMaterial("TIN", 1, 198, 5.0F, 2, 12);
		ALUMINIUM = EnumHelper.addToolMaterial("ALUMINIUM", 1, 16, 1.0F, 2, 12);
		ZINC = EnumHelper.addToolMaterial("ZINC", 1, 234, 5.5F, 2, 10);
		SILVER = EnumHelper.addToolMaterial("SILVER", 2, 963, 7.0F, 2, 18);
		OBSIDIAN = EnumHelper.addToolMaterial("OBSIDIAN", 3, 2341, 5.0F, 2, 4);
		BRONZE = EnumHelper.addToolMaterial("BRONZE", 2, 531, 6.0F, 2, 12);
		BRASS = EnumHelper.addToolMaterial("BRASS", 2, 752, 6.5F, 2, 14);
	}
}