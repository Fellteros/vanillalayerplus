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

        layerBlockRecipe(ModBlocks.BIRCH_LAYER, Blocks.BIRCH_PLANKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.BIRCH_LOG_LAYER, Blocks.BIRCH_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.BIRCH_WOOD_LAYER, Blocks.BIRCH_WOOD).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_BIRCH_LOG_LAYER, Blocks.STRIPPED_BIRCH_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_BIRCH_WOOD_LAYER, Blocks.STRIPPED_BIRCH_WOOD).offerTo(exporter);

        layerBlockRecipe(ModBlocks.JUNGLE_LAYER, Blocks.JUNGLE_PLANKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.JUNGLE_LOG_LAYER, Blocks.JUNGLE_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.JUNGLE_WOOD_LAYER, Blocks.JUNGLE_WOOD).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_JUNGLE_LOG_LAYER, Blocks.STRIPPED_JUNGLE_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_JUNGLE_WOOD_LAYER, Blocks.STRIPPED_JUNGLE_WOOD).offerTo(exporter);

        layerBlockRecipe(ModBlocks.ACACIA_LAYER, Blocks.ACACIA_PLANKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.ACACIA_LOG_LAYER, Blocks.ACACIA_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.ACACIA_WOOD_LAYER, Blocks.ACACIA_WOOD).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_ACACIA_LOG_LAYER, Blocks.STRIPPED_ACACIA_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_ACACIA_WOOD_LAYER, Blocks.STRIPPED_ACACIA_WOOD).offerTo(exporter);

        layerBlockRecipe(ModBlocks.DARK_OAK_LAYER, Blocks.DARK_OAK_PLANKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.DARK_OAK_LOG_LAYER, Blocks.DARK_OAK_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.DARK_OAK_WOOD_LAYER, Blocks.DARK_OAK_WOOD).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_DARK_OAK_LOG_LAYER, Blocks.STRIPPED_DARK_OAK_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_DARK_OAK_WOOD_LAYER, Blocks.STRIPPED_DARK_OAK_WOOD).offerTo(exporter);

        layerBlockRecipe(ModBlocks.MANGROVE_LAYER, Blocks.MANGROVE_PLANKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.MANGROVE_LOG_LAYER, Blocks.MANGROVE_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.MANGROVE_WOOD_LAYER, Blocks.MANGROVE_WOOD).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_MANGROVE_LOG_LAYER, Blocks.STRIPPED_MANGROVE_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_MANGROVE_WOOD_LAYER, Blocks.STRIPPED_MANGROVE_WOOD).offerTo(exporter);

        layerBlockRecipe(ModBlocks.CHERRY_LAYER, Blocks.CHERRY_PLANKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.CHERRY_LOG_LAYER, Blocks.CHERRY_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.CHERRY_WOOD_LAYER, Blocks.CHERRY_WOOD).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_CHERRY_LOG_LAYER, Blocks.STRIPPED_CHERRY_LOG).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_CHERRY_WOOD_LAYER, Blocks.STRIPPED_CHERRY_WOOD).offerTo(exporter);

        layerBlockRecipe(ModBlocks.BAMBOO_LAYER, Blocks.BAMBOO_PLANKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.BAMBOO_MOSAIC_LAYER, Blocks.BAMBOO_MOSAIC).offerTo(exporter);
        layerBlockRecipe(ModBlocks.BAMBOO_BLOCK_LAYER, Blocks.BAMBOO_BLOCK).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_BAMBOO_BLOCK_LAYER, Blocks.STRIPPED_BAMBOO_BLOCK).offerTo(exporter);

        layerBlockRecipe(ModBlocks.CRIMSON_LAYER, Blocks.CRIMSON_PLANKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.CRIMSON_STEM_LAYER, Blocks.CRIMSON_STEM).offerTo(exporter);
        layerBlockRecipe(ModBlocks.CRIMSON_HYPHAE_LAYER, Blocks.CRIMSON_HYPHAE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_CRIMSON_STEM_LAYER, Blocks.STRIPPED_CRIMSON_STEM).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_CRIMSON_HYPHAE_LAYER, Blocks.STRIPPED_CRIMSON_HYPHAE).offerTo(exporter);

        layerBlockRecipe(ModBlocks.WARPED_LAYER, Blocks.WARPED_PLANKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.WARPED_STEM_LAYER, Blocks.WARPED_STEM).offerTo(exporter);
        layerBlockRecipe(ModBlocks.WARPED_HYPHAE_LAYER, Blocks.WARPED_HYPHAE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_WARPED_STEM_LAYER, Blocks.STRIPPED_WARPED_STEM).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STR_WARPED_HYPHAE_LAYER, Blocks.STRIPPED_WARPED_HYPHAE).offerTo(exporter);

        layerBlockRecipe(ModBlocks.STONE_LAYER, Blocks.STONE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.COBBLESTONE_LAYER, Blocks.COBBLESTONE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.MOSSY_COBBLESTONE_LAYER, Blocks.MOSSY_COBBLESTONE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.SMOOTH_STONE_LAYER, Blocks.SMOOTH_STONE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.STONE_BRICKS_LAYER, Blocks.STONE_BRICKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.CRACKED_STONE_BRICKS_LAYER, Blocks.CRACKED_STONE_BRICKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.CHISELED_STONE_BRICKS_LAYER, Blocks.CHISELED_STONE_BRICKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.MOSSY_STONE_BRICKS_LAYER, Blocks.MOSSY_STONE_BRICKS).offerTo(exporter);

        layerBlockRecipe(ModBlocks.GRANITE_LAYER, Blocks.GRANITE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.POLISHED_GRANITE_LAYER, Blocks.POLISHED_GRANITE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.DIORITE_LAYER, Blocks.DIORITE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.POLISHED_DIORITE_LAYER, Blocks.POLISHED_DIORITE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.ANDESITE_LAYER, Blocks.ANDESITE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.POLISHED_ANDESITE_LAYER, Blocks.POLISHED_ANDESITE).offerTo(exporter);
        
        layerBlockRecipe(ModBlocks.DEEPSLATE_LAYER, Blocks.DEEPSLATE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.COBBLED_DEEPSLATE_LAYER, Blocks.COBBLED_DEEPSLATE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.CHISELED_DEEPSLATE_LAYER, Blocks.CHISELED_DEEPSLATE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.POLISHED_DEEPSLATE_LAYER, Blocks.POLISHED_DEEPSLATE).offerTo(exporter);
        layerBlockRecipe(ModBlocks.DEEPSLATE_BRICKS_LAYER, Blocks.DEEPSLATE_BRICKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_LAYER, Blocks.CRACKED_DEEPSLATE_BRICKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.DEEPSLATE_TILES_LAYER, Blocks.DEEPSLATE_TILES).offerTo(exporter);
        layerBlockRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_LAYER, Blocks.CRACKED_DEEPSLATE_TILES).offerTo(exporter);
        
        layerBlockRecipe(ModBlocks.TUFF_LAYER, Blocks.TUFF).offerTo(exporter);
        layerBlockRecipe(ModBlocks.CHISELED_TUFF_LAYER, Blocks.CHISELED_TUFF).offerTo(exporter);
        layerBlockRecipe(ModBlocks.POLISHED_TUFF_LAYER, Blocks.POLISHED_TUFF).offerTo(exporter);
        layerBlockRecipe(ModBlocks.TUFF_BRICKS_LAYER, Blocks.TUFF_BRICKS).offerTo(exporter);
        layerBlockRecipe(ModBlocks.CHISELED_TUFF_BRICKS_LAYER, Blocks.CHISELED_TUFF_BRICKS).offerTo(exporter);
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
