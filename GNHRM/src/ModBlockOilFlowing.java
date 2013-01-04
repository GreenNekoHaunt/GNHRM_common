package GNHRM.src;

import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import GNHRM.GNHRM;

public class ModBlockOilFlowing extends BlockFlowing
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
	
	@Override
	public String getTextureFile()
	{
	    return "/GNHRM/graphics/oil.png";
	}
}