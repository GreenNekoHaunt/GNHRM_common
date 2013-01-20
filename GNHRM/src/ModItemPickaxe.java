package GNHRM.src;

import net.minecraft.item.ItemTool;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import GNHRM.GNHRM;

public class ModItemPickaxe extends ItemTool
{
    public static final Block[] blocksEffectiveAgainst = new Block[] {
        Block.cobblestone, Block.stoneDoubleSlab, Block.stoneSingleSlab, Block.stone, Block.sandStone, Block.cobblestoneMossy,
        Block.oreIron, Block.blockSteel, Block.oreCoal, Block.blockGold, Block.oreGold, Block.oreDiamond,
        Block.blockDiamond, Block.ice, Block.netherrack, Block.oreLapis, Block.blockLapis, Block.oreRedstone,
        Block.oreRedstoneGlowing, Block.rail, Block.railDetector, Block.railPowered, ModBlocks.oreCopper, ModBlocks.oreTin,
        ModBlocks.oreSilver, ModBlocks.oreAluminium, ModBlocks.oreSulphur, ModBlocks.oreUranium, ModBlocks.basalt,
        ModBlocks.marble, ModBlocks.oreRuby, ModBlocks.oreSapphire, ModBlocks.oreAmethyst, ModBlocks.oreTopaz};
    
    public ModItemPickaxe(int x, int y, EnumToolMaterial par2EnumToolMaterial)
    {
        super(ModItems.baseId + ModItems.itemCount, 2, par2EnumToolMaterial, blocksEffectiveAgainst);
        ModItems.itemCount++;
        this.setIconCoord(x, y);
        this.setCreativeTab(GNHRM.tabGNHRM);
    }
    
    @Override
    public boolean canHarvestBlock(Block par1Block)
    {
        if(par1Block == Block.obsidian)
            return this.toolMaterial.getHarvestLevel() == 3;
        else if(par1Block == Block.blockDiamond    || par1Block == Block.oreDiamond)
            return this.toolMaterial.getHarvestLevel() >= 2;
        else if(par1Block == Block.oreEmerald || par1Block == Block.blockEmerald)
            return this.toolMaterial.getHarvestLevel() >= 2;
        else if(par1Block == Block.blockGold || par1Block == Block.oreGold)
            return this.toolMaterial.getHarvestLevel() >= 2;
        else if(par1Block.blockMaterial == Material.anvil)
            return this.toolMaterial.getHarvestLevel() >= 2;
        else if(par1Block.blockMaterial == Material.iron)
            return this.toolMaterial.getHarvestLevel() >= 2;
        else if(par1Block == Block.oreRedstone || par1Block == Block.oreRedstoneGlowing)
            return this.toolMaterial.getHarvestLevel() >= 2;
        else if(par1Block == ModBlocks.oreSilver)
            return this.toolMaterial.getHarvestLevel() >= 2;
        else if(par1Block == ModBlocks.oreRuby)
            return this.toolMaterial.getHarvestLevel() >= 2;
        else if(par1Block == ModBlocks.oreSapphire)
            return this.toolMaterial.getHarvestLevel() >= 2;
        else if(par1Block == ModBlocks.oreAmethyst)
            return this.toolMaterial.getHarvestLevel() >= 2;
        else if(par1Block == ModBlocks.oreTopaz)
            return this.toolMaterial.getHarvestLevel() >= 2;
        else if(par1Block == ModBlocks.oreUranium)
            return this.toolMaterial.getHarvestLevel() >= 2;
        else if(par1Block == Block.blockSteel || par1Block == Block.oreIron)
            return this.toolMaterial.getHarvestLevel() >= 1;
        else if(par1Block == Block.blockLapis || par1Block == Block.oreLapis)
            return this.toolMaterial.getHarvestLevel() >= 1;
        else if(par1Block == ModBlocks.oreAluminium)
            return this.toolMaterial.getHarvestLevel() >= 1;
        else if(par1Block == ModBlocks.oreTin)
            return this.toolMaterial.getHarvestLevel() >= 1;
        else if(par1Block == ModBlocks.oreCopper)
            return this.toolMaterial.getHarvestLevel() >= 1;
        else if(par1Block == ModBlocks.oreSulphur)
            return this.toolMaterial.getHarvestLevel() >= 1;
        else if(par1Block.blockMaterial == Material.rock)
            return true;
        else
            return false;
    }

    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        if(par2Block != null && (par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.anvil
         || par2Block.blockMaterial == Material.rock)
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
