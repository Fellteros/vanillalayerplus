package net.fellter.vanillalayerplus.registry;

import net.fabricmc.fabric.impl.content.registry.util.ImmutableCollectionUtils;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import net.fellter.vanillalayerplus.block.ModBlocks;
import net.minecraft.block.Block;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class StrippableBlocksRegistry {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StrippableBlocksRegistry.class);
    public static void register(Block input, Block stripped) {
        Block old = getRegistry().put(input, stripped);

        if (old != null) {
            LOGGER.debug("Replaced old stripping mapping from {} to {} with {}", input, old, stripped);
        }
    }
    @SuppressWarnings("unstable")
    private static Map<Block, Block> getRegistry() {
        return ImmutableCollectionUtils.getAsMutableMap(AxeItemAccessor::getStrippedBlocks, AxeItemAccessor::setStrippedBlocks);
    }



    public static void registerStrippableBlocks() {
        register(ModBlocks.OAK_LOG_LAYER, ModBlocks.STR_OAK_LOG_LAYER);
        register(ModBlocks.OAK_WOOD_LAYER, ModBlocks.STR_OAK_WOOD_LAYER);

        register(ModBlocks.SPRUCE_LOG_LAYER, ModBlocks.STR_SPRUCE_LOG_LAYER);
        register(ModBlocks.SPRUCE_WOOD_LAYER, ModBlocks.STR_SPRUCE_WOOD_LAYER);

        register(ModBlocks.BIRCH_LOG_LAYER, ModBlocks.STR_BIRCH_LOG_LAYER);
        register(ModBlocks.BIRCH_WOOD_LAYER, ModBlocks.STR_BIRCH_WOOD_LAYER);

        register(ModBlocks.JUNGLE_LOG_LAYER, ModBlocks.STR_JUNGLE_LOG_LAYER);
        register(ModBlocks.JUNGLE_WOOD_LAYER, ModBlocks.STR_JUNGLE_WOOD_LAYER);

        register(ModBlocks.ACACIA_LOG_LAYER, ModBlocks.STR_ACACIA_LOG_LAYER);
        register(ModBlocks.ACACIA_WOOD_LAYER, ModBlocks.STR_ACACIA_WOOD_LAYER);

        register(ModBlocks.DARK_OAK_LOG_LAYER, ModBlocks.STR_DARK_OAK_LOG_LAYER);
        register(ModBlocks.DARK_OAK_WOOD_LAYER, ModBlocks.STR_DARK_OAK_WOOD_LAYER);

        register(ModBlocks.MANGROVE_LOG_LAYER, ModBlocks.STR_MANGROVE_LOG_LAYER);
        register(ModBlocks.MANGROVE_WOOD_LAYER, ModBlocks.STR_MANGROVE_WOOD_LAYER);

        register(ModBlocks.CHERRY_LOG_LAYER, ModBlocks.STR_CHERRY_LOG_LAYER);
        register(ModBlocks.CHERRY_WOOD_LAYER, ModBlocks.STR_CHERRY_WOOD_LAYER);

        register(ModBlocks.BAMBOO_BLOCK_LAYER, ModBlocks.STR_BAMBOO_BLOCK_LAYER);

        register(ModBlocks.CRIMSON_STEM_LAYER, ModBlocks.STR_CRIMSON_STEM_LAYER);
        register(ModBlocks.CRIMSON_HYPHAE_LAYER, ModBlocks.STR_CRIMSON_HYPHAE_LAYER);

        register(ModBlocks.WARPED_STEM_LAYER, ModBlocks.STR_WARPED_STEM_LAYER);
        register(ModBlocks.WARPED_HYPHAE_LAYER, ModBlocks.STR_WARPED_HYPHAE_LAYER);
    }
}
