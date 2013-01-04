package GNHRM.src;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModGenerator
{
	public static void initGenerators()
	{
		GameRegistry.registerWorldGenerator(new ModWorldGenerator());
	}
}