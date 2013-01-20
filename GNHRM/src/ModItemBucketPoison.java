package GNHRM.src;

import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;

public class ModItemBucketPoison extends ItemBucket
{
    public ModItemBucketPoison(int x, int y) 
    {
        super(ModItems.baseId + ModItems.itemCount, ModBlocks.poisonWaterFlowing.blockID);
        ModItems.itemCount++;
        this.setIconCoord(x, y);
        this.setContainerItem(Item.bucketEmpty);
    }
    
    public ItemStack fillCustomBucket(World world, int x, int y, int z) 
    {
        if (world.getBlockId(x, y, z) == ModBlocks.poisonWaterFlowing.blockID || world.getBlockId(x, y, z)
            == ModBlocks.poisonWaterStill.blockID)
        {
                world.setBlockWithNotify(x, y, z, 0);
                return new ItemStack(this);
        }
        return null;
    }
    
    @Override
    public String getTextureFile()
    {
        return "/GNHRM/graphics/items.png";
    }
}
