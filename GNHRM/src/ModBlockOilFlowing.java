package GNHRM.src;

//import net.minecraftforge.liquids.IBlockLiquid;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import GNHRM.GNHRM;

public class ModBlockOilFlowing extends BlockFlowing// implements IBlockLiquid
{
    protected ModBlockOilFlowing()
    {
        super(ModBlocks.baseId + ModBlocks.blockCount, Material.water);
        ModBlocks.blockCount++;
        this.blockHardness = 100F;
        this.setLightOpacity(1);
        this.setCreativeTab(GNHRM.tabGNHRM);
        this.disableStats();
        this.setRequiresSelfNotify();
    }
    
/*    @Override
    public NBTTagCompound getLiquidProperties()
    {
    
    }*/
    
    @Override
    public String getTextureFile()
    {
        return "/GNHRM/graphics/oil.png";
    }
}
