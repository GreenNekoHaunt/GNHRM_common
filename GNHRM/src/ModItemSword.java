package GNHRM.src;

import net.minecraft.item.ItemSword;
import net.minecraft.item.EnumToolMaterial;
import GNHRM.GNHRM;

public class ModItemSword extends ItemSword
{

	public ModItemSword(int x, int y, EnumToolMaterial par2EnumToolMaterial)
    {
        super(ModItems.baseId + ModItems.itemCount, par2EnumToolMaterial);
		ModItems.itemCount++;
        this.setCreativeTab(GNHRM.tabGNHRM);
		this.setIconCoord(x, y);
    }
	
	@Override
	public String getTextureFile()
	{
	    return "/GNHRM/graphics/tools.png";
	}
}