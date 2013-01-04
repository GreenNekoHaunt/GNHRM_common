package GNHRM;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{	
    @Override
	public void registerRenderThings()
	{
		MinecraftForgeClient.preloadTexture("/GNHRM/graphics/blocks.png");
		MinecraftForgeClient.preloadTexture("/GNHRM/graphics/items.png");
		MinecraftForgeClient.preloadTexture("/GNHRM/graphics/plants.png");
		MinecraftForgeClient.preloadTexture("/GNHRM/graphics/oil.png");
		MinecraftForgeClient.preloadTexture("/GNHRM/graphics/poison.png");
	}
}