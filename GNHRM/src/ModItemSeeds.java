package GNHRM.src;

import GNHRM.GNHRM;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class ModItemSeeds extends ItemSeeds
{
    public ModItemSeeds(int par2, int par3)
    {
        super(ModItems.baseId + ModItems.itemCount, par2, par3);
		this.setCreativeTab(GNHRM.tabGNHRM);
		ModItems.itemCount++;
    }
	
	public ModItemSeeds(int x, int y, int par2, int par3)
    {
        super(ModItems.baseId + ModItems.itemCount, par2, par3);
		this.setCreativeTab(GNHRM.tabGNHRM);
		this.setIconCoord(x, y);
		ModItems.itemCount++;
    }
	
	@Override
	public String getTextureFile()
	{
	    return "/GNHRM/graphics/items.png";
	}
}
