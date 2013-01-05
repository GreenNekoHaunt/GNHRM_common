package GNHRM.src;

import net.minecraft.block.BlockFlower;
import GNHRM.GNHRM;

public class ModBlockPlant extends BlockFlower
{
    private boolean creativeTab = true;
    public ModBlockPlant(int texture)
    {
        super(ModBlocks.baseId + ModBlocks.blockCount, texture);
        ModBlocks.blockCount++;
        float f = 0.5F;
        this.setStepSound(soundGrassFootstep);
        this.setTickRandomly(true);
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        this.disableStats();
        this.setRequiresSelfNotify();
    }

    public String getTextureFile()
    {
        return "/GNHRM/graphics/plants.png";
    }
}
