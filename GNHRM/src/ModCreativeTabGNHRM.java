package GNHRM.src;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModCreativeTabGNHRM extends CreativeTabs
{
    public ModCreativeTabGNHRM(int par1, String par2Str)
    {
        super(par1, par2Str);
    }
    
    public String getTranslatedTabLabel()
    {
        return "GHN's Reality Mod";
    }
    
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return ModBlocks.hay.blockID;
    }
}
