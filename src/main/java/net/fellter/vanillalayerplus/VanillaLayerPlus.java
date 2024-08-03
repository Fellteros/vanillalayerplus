package net.fellter.vanillalayerplus;

import net.fabricmc.api.ModInitializer;

import net.fellter.vanillalayerplus.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaLayerPlus implements ModInitializer {

	public static final String MOD_ID = "vanillalayerplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}