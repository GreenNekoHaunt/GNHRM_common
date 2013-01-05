package GNHRM.src;

import net.minecraft.block.material.Material;
import java.util.Random;

public class ModBlockHay extends ModBlocks
{
    public ModBlockHay(int texture)
    {
        super(texture, Material.grass);
        this.setHardness(0.6F);
        this.setStepSound(soundGrassFootstep);
    }
    
    @Override
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        if(par1 == 4 || par1 == 5)
        {
            return this.blockIndexInTexture + 1;
        }
        else
        {
            return this.blockIndexInTexture;
        }
    }
}
