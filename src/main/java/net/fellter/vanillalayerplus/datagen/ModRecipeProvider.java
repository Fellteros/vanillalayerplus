package net.fellter.vanillalayerplus.datagen;

import java.util.concurrent.CompletableFuture;

import net.fellter.vanillalayerplus.VanillaLayerPlus;
import net.fellter.vanillalayerplus.block.LayerBlock;
import net.fellter.vanillalayerplus.registry.Args;
import net.fellter.vanillalayerplus.registry.DatagenArgs;

import net.minecraft.data.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

public class ModRecipeProvider extends FabricRecipeProvider {
	public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
		return new RecipeGenerator(registryLookup, exporter) {
			public CraftingRecipeJsonBuilder layerBlockRecipe(ItemConvertible output, ItemConvertible input) {
				return ShapedRecipeJsonBuilder.create(registries.getOrThrow(RegistryKeys.ITEM), RecipeCategory.DECORATIONS, output, 16)
						.input('W', input)
						.pattern(" W")
						.pattern("W ")
						.criterion(hasItem(input), conditionsFromItem(input))
						.showNotification(true);
			}

			public void offerStonecuttingRecipe(ItemConvertible output, ItemConvertible input) {
				this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, output, input, 8);
			}

			@Override
			public void generate() {
				Registries.BLOCK.forEach(block -> {
					if (Args.DATAGEN_ARGS.containsKey(block)) {
						DatagenArgs args = Args.DATAGEN_ARGS.get(block);

						if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaLayerPlus.MOD_ID) && args.parentBlock != null) {
							if (block instanceof LayerBlock) {
								layerBlockRecipe(block, args.parentBlock).offerTo(exporter);
							}

							if (block instanceof LayerBlock && args.stonecuttingInput != null) {
								for (ItemConvertible itemConvertible : args.stonecuttingInput) {
									offerStonecuttingRecipe(block, itemConvertible);
								}
							}
						}
					}
				});
			}
		};
	}

	@Override
	public String getName() {
		return "Recipes";
	}
}
