package GNHRM.src;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import GNHRM.GNHRM;

public class ModItemHoe extends ItemHoe
{
    public ModItemHoe(int x, int y, EnumToolMaterial par2EnumToolMaterial)
    {
        super(ModItems.baseId + ModItems.itemCount, par2EnumToolMaterial);
		ModItems.itemCount++;
		this.setIconCoord(x, y);
		this.setCreativeTab(GNHRM.tabGNHRM);
    }
	
	@Override
	public String getTextureFile()
	{
	    return "/GNHRM/graphics/tools.png";
	}
}