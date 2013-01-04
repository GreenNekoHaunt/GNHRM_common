package GNHRM.src;

import net.minecraft.block.material.Material;
import java.util.Random;

public class ModBlockCustomStone extends ModBlocks
{
	private int dropId;
	public ModBlockCustomStone(int texture, int dropID)
	{
		super(texture, Material.rock);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		dropId = dropID;
	}
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return dropId;
    }
}