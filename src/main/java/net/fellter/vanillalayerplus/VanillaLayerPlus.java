package net.fellter.vanillalayerplus;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.impl.util.StringUtil;
import net.fellter.vanillalayerplus.block.ModBlocks;
import net.fellter.vanillalayerplus.item.ModItemGroups;
import net.fellter.vanillalayerplus.item.ModItems;
import net.fellter.vanillalayerplus.registry.ModRegistries;
import net.minecraft.registry.Registries;
import org.apache.commons.lang3.text.WordUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaLayerPlus implements ModInitializer {

	public static final String MOD_ID = "vanillalayerplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModRegistries.registerStrippableBlocks();
		ModRegistries.registerTransparentBlocks();
		ModRegistries.registerTranslucentBlocks();
		ModRegistries.registerOxidizableBlocks();
		ModRegistries.registerFuel();
	}
}