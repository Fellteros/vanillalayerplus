package net.fellter.vanillalayerplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fellter.vanillalayerplus.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        layerBlockRecipe(ModBlocks.OAK_LAYER, Blocks.OAK_PLANKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.OAK_LOG_LAYER, Blocks.OAK_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.OAK_WOOD_LAYER, Blocks.OAK_WOOD).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_OAK_LOG_LAYER, Blocks.STRIPPED_OAK_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_OAK_WOOD_LAYER, Blocks.STRIPPED_OAK_WOOD).offerTo(exporter);

        layerBlockRecipe(ModBlocks.SPRUCE_LAYER, Blocks.SPRUCE_PLANKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.SPRUCE_LOG_LAYER, Blocks.SPRUCE_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.SPRUCE_WOOD_LAYER, Blocks.SPRUCE_WOOD).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_SPRUCE_LOG_LAYER, Blocks.STRIPPED_SPRUCE_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_SPRUCE_WOOD_LAYER, Blocks.STRIPPED_SPRUCE_WOOD).offerTo(exporter);
    }

    public static CraftingRecipeJsonBuilder layerBlockRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 16)
                .input('W', input)
                .pattern(" W")
                .pattern("W ")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
}
