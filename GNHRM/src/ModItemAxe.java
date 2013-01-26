package GNHRM.src;

import net.minecraft.item.ItemTool;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import GNHRM.GNHRM;

public class ModItemAxe extends ItemTool
{
    public static final Block[] blocksEffectiveAgainst = new Block[] {
        Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.stoneDoubleSlab, Block.stoneSingleSlab,
        Block.pumpkin, Block.pumpkinLantern};
    
    public ModItemAxe(int x, int y, EnumToolMaterial par2EnumToolMaterial)
    {
        super(ModItems.baseId + ModItems.itemCount, 3, par2EnumToolMaterial, blocksEffectiveAgainst);
        ModItems.itemCount++;
        this.setIconCoord(x, y);
        this.setCreativeTab(GNHRM.tabGNHRM);
    }
    
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        if(par2Block != null && (par2Block.blockMaterial == Material.wood || par2Block.blockMaterial == Material.plants
            || par2Block.blockMaterial == Material.vine))
        {
            return this.efficiencyOnProperMaterial;
        }
        else
        {
            return super.getStrVsBlock(par1ItemStack, par2Block);
        }
    }
    
    @Override
    public String getTextureFile()
    {
        return "/GNHRM/graphics/tools.png";
    }
}
