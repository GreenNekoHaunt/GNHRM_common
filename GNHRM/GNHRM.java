package GNHRM;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.TickRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.creativetab.CreativeTabs;
import GNHRM.src.ModCreativeTabGNHRM;
import GNHRM.src.ModBlocks;
import GNHRM.src.ModItems;
import GNHRM.src.ModRecipes;
import GNHRM.src.ModEnumToolMaterial;
import GNHRM.src.ModGenerator;
import GNHRM.src.ModDungeonLoot;

@Mod(modid="GreenNekoHaunt_GNHRM", name="GNH's Real Mod", version="0.0.3")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class GNHRM 
{
    public static CreativeTabs tabGNHRM = new ModCreativeTabGNHRM(CreativeTabs.getNextID(), "GNH's Reality Mod");

    @SidedProxy(clientSide = "GNHRM.ClientProxy", serverSide ="GNHRM.CommonProxy")
    public static CommonProxy proxy;
    
    @Init
    public void load(FMLInitializationEvent event)
    {
        ModEnumToolMaterial.initModEnumToolMaterial();
        ModBlocks.initBlocks();
        ModBlocks.initNames();
        ModBlocks.initHarvestLevel();
//        MinecraftForge.registerCustomBucketHandler(ModItems.bucketOil);
//        MinecraftForge.registerCustomBucketHandler(ModItems.bucketPoison);
        ModItems.initNames();
        ModRecipes.initShapelessCraftingRecipes();
        ModRecipes.initShapedCraftingRecipes();
        ModRecipes.initSmeltingRecipe();
        ModGenerator.initGenerators();
        ModDungeonLoot.addDungeonLoot();
        proxy.registerRenderThings();
    }
}
