package net.fellter.vanillalayerplus;

import net.fellter.vanillalayerplus.datagen.ModBlockTagProvider;
import net.fellter.vanillalayerplus.datagen.ModLanguageProvider;
import net.fellter.vanillalayerplus.datagen.ModLootTableProvider;
import net.fellter.vanillalayerplus.datagen.ModModelProvider;
import net.fellter.vanillalayerplus.datagen.ModRecipeProvider;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

@Environment(EnvType.CLIENT)
public class VanillaLayerPlusDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModLanguageProvider::new);
	}
}
