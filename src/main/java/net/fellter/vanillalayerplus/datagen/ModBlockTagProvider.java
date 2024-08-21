package net.fellter.vanillalayerplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fellter.vanillalayerplus.block.ModBlocks;
import net.fellter.vanillalayerplus.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {


        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.OAK_LAYER)
                .add(ModBlocks.OAK_LOG_LAYER)
                .add(ModBlocks.OAK_WOOD_LAYER)
                .add(ModBlocks.STR_OAK_LOG_LAYER)
                .add(ModBlocks.STR_OAK_WOOD_LAYER)

                .add(ModBlocks.SPRUCE_LAYER)
                .add(ModBlocks.SPRUCE_LOG_LAYER)
                .add(ModBlocks.SPRUCE_WOOD_LAYER)
                .add(ModBlocks.STR_SPRUCE_LOG_LAYER)
                .add(ModBlocks.STR_SPRUCE_WOOD_LAYER)

                .add(ModBlocks.BIRCH_LAYER)
                .add(ModBlocks.BIRCH_LOG_LAYER)
                .add(ModBlocks.BIRCH_WOOD_LAYER)
                .add(ModBlocks.STR_BIRCH_LOG_LAYER)
                .add(ModBlocks.STR_BIRCH_WOOD_LAYER)

                .add(ModBlocks.JUNGLE_LAYER)
                .add(ModBlocks.JUNGLE_LOG_LAYER)
                .add(ModBlocks.JUNGLE_WOOD_LAYER)
                .add(ModBlocks.STR_JUNGLE_LOG_LAYER)
                .add(ModBlocks.STR_JUNGLE_WOOD_LAYER)

                .add(ModBlocks.ACACIA_LAYER)
                .add(ModBlocks.ACACIA_LOG_LAYER)
                .add(ModBlocks.ACACIA_WOOD_LAYER)
                .add(ModBlocks.STR_ACACIA_LOG_LAYER)
                .add(ModBlocks.STR_ACACIA_WOOD_LAYER)

                .add(ModBlocks.DARK_OAK_LAYER)
                .add(ModBlocks.DARK_OAK_LOG_LAYER)
                .add(ModBlocks.DARK_OAK_WOOD_LAYER)
                .add(ModBlocks.STR_DARK_OAK_LOG_LAYER)
                .add(ModBlocks.STR_DARK_OAK_WOOD_LAYER)

                .add(ModBlocks.MANGROVE_LAYER)
                .add(ModBlocks.MANGROVE_LOG_LAYER)
                .add(ModBlocks.MANGROVE_WOOD_LAYER)
                .add(ModBlocks.STR_MANGROVE_LOG_LAYER)
                .add(ModBlocks.STR_MANGROVE_WOOD_LAYER)

                .add(ModBlocks.CHERRY_LAYER)
                .add(ModBlocks.CHERRY_LOG_LAYER)
                .add(ModBlocks.CHERRY_WOOD_LAYER)
                .add(ModBlocks.STR_CHERRY_LOG_LAYER)
                .add(ModBlocks.STR_CHERRY_WOOD_LAYER)

                .add(ModBlocks.BAMBOO_LAYER)
                .add(ModBlocks.BAMBOO_MOSAIC_LAYER)
                .add(ModBlocks.BAMBOO_BLOCK_LAYER)
                .add(ModBlocks.STR_BAMBOO_BLOCK_LAYER)

                .add(ModBlocks.CRIMSON_LAYER)
                .add(ModBlocks.CRIMSON_STEM_LAYER)
                .add(ModBlocks.CRIMSON_HYPHAE_LAYER)
                .add(ModBlocks.STR_CRIMSON_STEM_LAYER)
                .add(ModBlocks.STR_CRIMSON_HYPHAE_LAYER)

                .add(ModBlocks.WARPED_LAYER)
                .add(ModBlocks.WARPED_STEM_LAYER)
                .add(ModBlocks.WARPED_HYPHAE_LAYER)
                .add(ModBlocks.STR_WARPED_STEM_LAYER)
                .add(ModBlocks.STR_WARPED_HYPHAE_LAYER)

        ;
        
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STONE_LAYER)
                .add(ModBlocks.COBBLESTONE_LAYER)
                .add(ModBlocks.MOSSY_COBBLESTONE_LAYER)
                .add(ModBlocks.SMOOTH_STONE_LAYER)
                .add(ModBlocks.STONE_BRICKS_LAYER)
                .add(ModBlocks.CRACKED_STONE_BRICKS_LAYER)
                .add(ModBlocks.CHISELED_STONE_BRICKS_LAYER)
                .add(ModBlocks.MOSSY_STONE_BRICKS_LAYER)

                .add(ModBlocks.GRANITE_LAYER)
                .add(ModBlocks.POLISHED_GRANITE_LAYER)
                .add(ModBlocks.DIORITE_LAYER)
                .add(ModBlocks.POLISHED_DIORITE_LAYER)
                .add(ModBlocks.ANDESITE_LAYER)
                .add(ModBlocks.POLISHED_ANDESITE_LAYER)
                
                .add(ModBlocks.DEEPSLATE_LAYER)
                .add(ModBlocks.COBBLED_DEEPSLATE_LAYER)
                .add(ModBlocks.CHISELED_DEEPSLATE_LAYER)
                .add(ModBlocks.POLISHED_DEEPSLATE_LAYER)
                .add(ModBlocks.DEEPSLATE_BRICKS_LAYER)
                .add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_LAYER)
                .add(ModBlocks.DEEPSLATE_TILES_LAYER)
                .add(ModBlocks.CRACKED_DEEPSLATE_TILES_LAYER)
                
                .add(ModBlocks.TUFF_LAYER)
                .add(ModBlocks.CHISELED_TUFF_LAYER)
                .add(ModBlocks.POLISHED_TUFF_LAYER)
                .add(ModBlocks.TUFF_BRICKS_LAYER)
                .add(ModBlocks.CHISELED_TUFF_BRICKS_LAYER)
        ;

        getOrCreateTagBuilder(ModTags.LAYERS)
                .add(ModBlocks.OAK_LAYER)
                .add(ModBlocks.OAK_LOG_LAYER)
                .add(ModBlocks.OAK_WOOD_LAYER)
                .add(ModBlocks.STR_OAK_LOG_LAYER)
                .add(ModBlocks.STR_OAK_WOOD_LAYER)

                .add(ModBlocks.SPRUCE_LAYER)
                .add(ModBlocks.SPRUCE_LOG_LAYER)
                .add(ModBlocks.SPRUCE_WOOD_LAYER)
                .add(ModBlocks.STR_SPRUCE_LOG_LAYER)
                .add(ModBlocks.STR_SPRUCE_WOOD_LAYER)

                .add(ModBlocks.BIRCH_LAYER)
                .add(ModBlocks.BIRCH_LOG_LAYER)
                .add(ModBlocks.BIRCH_WOOD_LAYER)
                .add(ModBlocks.STR_BIRCH_LOG_LAYER)
                .add(ModBlocks.STR_BIRCH_WOOD_LAYER)

                .add(ModBlocks.JUNGLE_LAYER)
                .add(ModBlocks.JUNGLE_LOG_LAYER)
                .add(ModBlocks.JUNGLE_WOOD_LAYER)
                .add(ModBlocks.STR_JUNGLE_LOG_LAYER)
                .add(ModBlocks.STR_JUNGLE_WOOD_LAYER)

                .add(ModBlocks.ACACIA_LAYER)
                .add(ModBlocks.ACACIA_LOG_LAYER)
                .add(ModBlocks.ACACIA_WOOD_LAYER)
                .add(ModBlocks.STR_ACACIA_LOG_LAYER)
                .add(ModBlocks.STR_ACACIA_WOOD_LAYER)

                .add(ModBlocks.DARK_OAK_LAYER)
                .add(ModBlocks.DARK_OAK_LOG_LAYER)
                .add(ModBlocks.DARK_OAK_WOOD_LAYER)
                .add(ModBlocks.STR_DARK_OAK_LOG_LAYER)
                .add(ModBlocks.STR_DARK_OAK_WOOD_LAYER)

                .add(ModBlocks.MANGROVE_LAYER)
                .add(ModBlocks.MANGROVE_LOG_LAYER)
                .add(ModBlocks.MANGROVE_WOOD_LAYER)
                .add(ModBlocks.STR_MANGROVE_LOG_LAYER)
                .add(ModBlocks.STR_MANGROVE_WOOD_LAYER)

                .add(ModBlocks.CHERRY_LAYER)
                .add(ModBlocks.CHERRY_LOG_LAYER)
                .add(ModBlocks.CHERRY_WOOD_LAYER)
                .add(ModBlocks.STR_CHERRY_LOG_LAYER)
                .add(ModBlocks.STR_CHERRY_WOOD_LAYER)

                .add(ModBlocks.BAMBOO_LAYER)
                .add(ModBlocks.BAMBOO_MOSAIC_LAYER)
                .add(ModBlocks.BAMBOO_BLOCK_LAYER)
                .add(ModBlocks.STR_BAMBOO_BLOCK_LAYER)

                .add(ModBlocks.CRIMSON_LAYER)
                .add(ModBlocks.CRIMSON_STEM_LAYER)
                .add(ModBlocks.CRIMSON_HYPHAE_LAYER)
                .add(ModBlocks.STR_CRIMSON_STEM_LAYER)
                .add(ModBlocks.STR_CRIMSON_HYPHAE_LAYER)

                .add(ModBlocks.WARPED_LAYER)
                .add(ModBlocks.WARPED_STEM_LAYER)
                .add(ModBlocks.WARPED_HYPHAE_LAYER)
                .add(ModBlocks.STR_WARPED_STEM_LAYER)
                .add(ModBlocks.STR_WARPED_HYPHAE_LAYER)

                .add(ModBlocks.STONE_LAYER)
                .add(ModBlocks.COBBLESTONE_LAYER)
                .add(ModBlocks.MOSSY_COBBLESTONE_LAYER)
                .add(ModBlocks.SMOOTH_STONE_LAYER)
                .add(ModBlocks.STONE_BRICKS_LAYER)
                .add(ModBlocks.CRACKED_STONE_BRICKS_LAYER)
                .add(ModBlocks.CHISELED_STONE_BRICKS_LAYER)
                .add(ModBlocks.MOSSY_STONE_BRICKS_LAYER)

                .add(ModBlocks.GRANITE_LAYER)
                .add(ModBlocks.POLISHED_GRANITE_LAYER)
                .add(ModBlocks.DIORITE_LAYER)
                .add(ModBlocks.POLISHED_DIORITE_LAYER)
                .add(ModBlocks.ANDESITE_LAYER)
                .add(ModBlocks.POLISHED_ANDESITE_LAYER)

                .add(ModBlocks.DEEPSLATE_LAYER)
                .add(ModBlocks.COBBLED_DEEPSLATE_LAYER)
                .add(ModBlocks.CHISELED_DEEPSLATE_LAYER)
                .add(ModBlocks.POLISHED_DEEPSLATE_LAYER)
                .add(ModBlocks.DEEPSLATE_BRICKS_LAYER)
                .add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_LAYER)
                .add(ModBlocks.DEEPSLATE_TILES_LAYER)
                .add(ModBlocks.CRACKED_DEEPSLATE_TILES_LAYER)

                .add(ModBlocks.TUFF_LAYER)
                .add(ModBlocks.CHISELED_TUFF_LAYER)
                .add(ModBlocks.POLISHED_TUFF_LAYER)
                .add(ModBlocks.TUFF_BRICKS_LAYER)
                .add(ModBlocks.CHISELED_TUFF_BRICKS_LAYER)

        ;
    }
}
