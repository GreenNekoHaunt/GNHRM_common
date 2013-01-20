package GNHRM.src;

//import net.minecraftforge.liquids.IBlockLiquid;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;
import net.minecraft.util.DamageSource;
import GNHRM.GNHRM;

public class ModBlockPoisonWaterFlowing extends BlockFlowing// implements IBlockLiquid
{
    protected ModBlockPoisonWaterFlowing()
    {
        super(ModBlocks.baseId + ModBlocks.blockCount, Material.water);
        ModBlocks.blockCount++;
        this.blockHardness = 100F;
        this.setLightOpacity(2);
        this.setCreativeTab(GNHRM.tabGNHRM);
        this.disableStats();
        this.setRequiresSelfNotify();
    }
    
    @Override
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        if(par5Entity instanceof EntityLiving)
        {
            if(!((EntityLiving)par5Entity).isPotionActive(Potion.poison))
            {
                ((EntityLiving)par5Entity).addPotionEffect(new PotionEffect(Potion.poison.id, 600));
            }
            if(((EntityLiving)par5Entity).getHealth() == 1)
            {
                par5Entity.attackEntityFrom(DamageSource.magic, 1);
            }
        }
        
    }
    
    @Override
    public String getTextureFile()
    {
        return "/GNHRM/graphics/poison.png";
    }
}
