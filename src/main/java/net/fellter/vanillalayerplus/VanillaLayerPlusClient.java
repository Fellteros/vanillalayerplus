package net.fellter.vanillalayerplus;

import net.fellter.vanillalayerplus.registry.ModRegistries;

import net.fabricmc.api.ClientModInitializer;

public class VanillaLayerPlusClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModRegistries.registerTransparentBlocks();
		ModRegistries.registerTranslucentBlocks();
	}
}
