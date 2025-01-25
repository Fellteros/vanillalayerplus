package net.fellter.vanillalayerplus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fellter.vanillalayerplus.block.ModBlocks;
import net.fellter.vanillalayerplus.item.ModItemGroups;
import net.fellter.vanillalayerplus.item.ModItems;
import net.fellter.vanillalayerplus.registry.ModRegistries;

import net.fabricmc.api.ModInitializer;

public class VanillaLayerPlus implements ModInitializer {
	public static final String MOD_ID = "vanillalayerplus";
	public static final Logger LOGGER = LoggerFactory.getLogger("Vanilla+ Layers");

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModRegistries.registerStrippableBlocks();
		ModRegistries.registerOxidizableBlocks();
		ModRegistries.registerFuel();
	}
}
