package net.fellter.vanillalayerplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fellter.vanillalayerplus.block.ModBlocks;
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
        ;
    }
}
