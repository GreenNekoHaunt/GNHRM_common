/*package GNHRM.src;

import net.minecraft.world.World;
//import net.minecraftforge.???
import net.minecraft.item.Itembucket;
import net.minecraft.item.ItemStack;

public class ModItemBucketFilled extends ItemBucket
{
	private Block filler;
	private Block altFiller;
	public ModBucketFilled(int x, int y, Item container, int blockInteractId, Block fill, int placedId) 
	{
		super(ModItems.baseId + ModItems.itemCount, blockInteractId);
		this.setIconIndex(x, y);
		this.setContainerItem(container);
		altFiller = filler = fill;
	}
	
	public ModItemBucketFilled(int x, int y, Item container, int blockInteractId, Block fill, Block altFill, int placedId) 
	{
		super(ModItems.baseId + ModItems.itemCount, blockInteractId);
		this.setIconIndex(x, y);
		this.setContainerItem(container);
		filler = fill;
		altFiller = altFill;
	}
	
	@Override
    public ItemStack fillCustomBucket(World world, int x, int y, int z) 
	{
		if (world.getBlockId(i, j, k) == filler || world.getBlockId(x, y, z) == altFiller) {
				world.setBlockWithNotify(x, y, z, 0);
				return new ItemStack(this);
		}
		return null;
    }
}*/