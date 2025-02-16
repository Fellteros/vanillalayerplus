package net.fellter.vanillalayerplus;

import net.fellter.vanillalayerplus.registry.Args;
import net.fellter.vanillalayerplus.registry.ModRegistries;

import net.fabricmc.api.ClientModInitializer;

public class VanillaLayerPlusClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Args.registerRegistryArgs();

		ModRegistries.registerFoliage();
		ModRegistries.registerTranslucentBlocks();
		ModRegistries.registerTransparentBlocks();
		ModRegistries.registerStrippableBlocks();
		ModRegistries.registerOxidizableBlocks();
		ModRegistries.registerFuel();
		ModRegistries.registerFlattenableBlocks();
		ModRegistries.registerTillableBlocks();
	}
}
