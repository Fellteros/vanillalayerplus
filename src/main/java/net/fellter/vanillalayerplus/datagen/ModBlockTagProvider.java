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
                .add(ModBlocks.STR_SPRUCE_WOOD_LAYER);
    }
}
