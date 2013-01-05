package GNHRM.src;

import java.util.Random;

public class ModBlockTallMoss extends ModBlockPlant
{
	private Random random = new Random();
	public ModBlockTallMoss(int texture)
	{
		super(texture);
	}
	
	protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == ModBlocks.moss.blockID;
    }
	
	public int idDropped(int par1, Random par2Random, int par3)
    {
		if(par2Random.nextInt(10) == 0)
		{
			return this.blockID;
		}
		else
		{
			return 0;
		}
    }
}