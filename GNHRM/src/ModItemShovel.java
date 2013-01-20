package GNHRM.src;

import net.minecraft.item.ItemTool;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.block.Block;
import GNHRM.GNHRM;

public class ModItemShovel extends ItemTool
{
    public static final Block[] blocksEffectiveAgainst = new Block[] {
        Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow,
        Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium, ModBlocks.mud,
        ModBlocks.moss};
    
    public ModItemShovel(int x, int y, EnumToolMaterial par2EnumToolMaterial)
    {
        super(ModItems.baseId + ModItems.itemCount, 1, par2EnumToolMaterial, blocksEffectiveAgainst);
        ModItems.itemCount++;
        this.setIconCoord(x, y);
        this.setCreativeTab(GNHRM.tabGNHRM);
    }
    
    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block == Block.snow ? true : par1Block == Block.blockSnow;
    }
    
    @Override
    public String getTextureFile()
    {
        return "/GNHRM/graphics/tools.png";
    }
}
