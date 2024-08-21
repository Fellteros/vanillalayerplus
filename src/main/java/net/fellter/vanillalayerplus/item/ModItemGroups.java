package net.fellter.vanillalayerplus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fellter.vanillalayerplus.VanillaLayerPlus;
import net.fellter.vanillalayerplus.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup VLP_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VanillaLayerPlus.MOD_ID, "vlp"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vanillalayerplus"))
                    .icon(() -> new ItemStack(ModItems.VLP_TITLE)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.OAK_LAYER);
                        entries.add(ModBlocks.OAK_LOG_LAYER);
                        entries.add(ModBlocks.OAK_WOOD_LAYER);
                        entries.add(ModBlocks.STR_OAK_LOG_LAYER);
                        entries.add(ModBlocks.STR_OAK_WOOD_LAYER);

                        entries.add(ModBlocks.SPRUCE_LAYER);
                        entries.add(ModBlocks.SPRUCE_LOG_LAYER);
                        entries.add(ModBlocks.SPRUCE_WOOD_LAYER);
                        entries.add(ModBlocks.STR_SPRUCE_LOG_LAYER);
                        entries.add(ModBlocks.STR_SPRUCE_WOOD_LAYER);

                        entries.add(ModBlocks.BIRCH_LAYER);
                        entries.add(ModBlocks.BIRCH_LOG_LAYER);
                        entries.add(ModBlocks.BIRCH_WOOD_LAYER);
                        entries.add(ModBlocks.STR_BIRCH_LOG_LAYER);
                        entries.add(ModBlocks.STR_BIRCH_WOOD_LAYER);

                        entries.add(ModBlocks.JUNGLE_LAYER);
                        entries.add(ModBlocks.JUNGLE_LOG_LAYER);
                        entries.add(ModBlocks.JUNGLE_WOOD_LAYER);
                        entries.add(ModBlocks.STR_JUNGLE_LOG_LAYER);
                        entries.add(ModBlocks.STR_JUNGLE_WOOD_LAYER);

                        entries.add(ModBlocks.ACACIA_LAYER);
                        entries.add(ModBlocks.ACACIA_LOG_LAYER);
                        entries.add(ModBlocks.ACACIA_WOOD_LAYER);
                        entries.add(ModBlocks.STR_ACACIA_LOG_LAYER);
                        entries.add(ModBlocks.STR_ACACIA_WOOD_LAYER);

                        entries.add(ModBlocks.DARK_OAK_LAYER);
                        entries.add(ModBlocks.DARK_OAK_LOG_LAYER);
                        entries.add(ModBlocks.DARK_OAK_WOOD_LAYER);
                        entries.add(ModBlocks.STR_DARK_OAK_LOG_LAYER);
                        entries.add(ModBlocks.STR_DARK_OAK_WOOD_LAYER);

                        entries.add(ModBlocks.MANGROVE_LAYER);
                        entries.add(ModBlocks.MANGROVE_LOG_LAYER);
                        entries.add(ModBlocks.MANGROVE_WOOD_LAYER);
                        entries.add(ModBlocks.STR_MANGROVE_LOG_LAYER);
                        entries.add(ModBlocks.STR_MANGROVE_WOOD_LAYER);

                        entries.add(ModBlocks.CHERRY_LAYER);
                        entries.add(ModBlocks.CHERRY_LOG_LAYER);
                        entries.add(ModBlocks.CHERRY_WOOD_LAYER);
                        entries.add(ModBlocks.STR_CHERRY_LOG_LAYER);
                        entries.add(ModBlocks.STR_CHERRY_WOOD_LAYER);

                        entries.add(ModBlocks.BAMBOO_LAYER);
                        entries.add(ModBlocks.BAMBOO_MOSAIC_LAYER);
                        entries.add(ModBlocks.BAMBOO_BLOCK_LAYER);
                        entries.add(ModBlocks.STR_BAMBOO_BLOCK_LAYER);

                        entries.add(ModBlocks.CRIMSON_LAYER);
                        entries.add(ModBlocks.CRIMSON_STEM_LAYER);
                        entries.add(ModBlocks.CRIMSON_HYPHAE_LAYER);
                        entries.add(ModBlocks.STR_CRIMSON_STEM_LAYER);
                        entries.add(ModBlocks.STR_CRIMSON_HYPHAE_LAYER);

                        entries.add(ModBlocks.WARPED_LAYER);
                        entries.add(ModBlocks.WARPED_STEM_LAYER);
                        entries.add(ModBlocks.WARPED_HYPHAE_LAYER);
                        entries.add(ModBlocks.STR_WARPED_STEM_LAYER);
                        entries.add(ModBlocks.STR_WARPED_HYPHAE_LAYER);

                        entries.add(ModBlocks.STONE_LAYER);
                        entries.add(ModBlocks.COBBLESTONE_LAYER);
                        entries.add(ModBlocks.MOSSY_COBBLESTONE_LAYER);
                        entries.add(ModBlocks.SMOOTH_STONE_LAYER);
                        entries.add(ModBlocks.STONE_BRICKS_LAYER);
                        entries.add(ModBlocks.CRACKED_STONE_BRICKS_LAYER);
                        entries.add(ModBlocks.CHISELED_STONE_BRICKS_LAYER);
                        entries.add(ModBlocks.MOSSY_STONE_BRICKS_LAYER);

                        entries.add(ModBlocks.GRANITE_LAYER);
                        entries.add(ModBlocks.POLISHED_GRANITE_LAYER);
                        entries.add(ModBlocks.DIORITE_LAYER);
                        entries.add(ModBlocks.POLISHED_DIORITE_LAYER);
                        entries.add(ModBlocks.ANDESITE_LAYER);
                        entries.add(ModBlocks.POLISHED_ANDESITE_LAYER);
                        
                        entries.add(ModBlocks.DEEPSLATE_LAYER);
                        entries.add(ModBlocks.COBBLED_DEEPSLATE_LAYER);
                        entries.add(ModBlocks.CHISELED_DEEPSLATE_LAYER);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_LAYER);
                        entries.add(ModBlocks.DEEPSLATE_BRICKS_LAYER);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_LAYER);
                        entries.add(ModBlocks.DEEPSLATE_TILES_LAYER);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILES_LAYER);
                        
                        entries.add(ModBlocks.TUFF_LAYER);
                        entries.add(ModBlocks.CHISELED_TUFF_LAYER);
                        entries.add(ModBlocks.POLISHED_TUFF_LAYER);
                        entries.add(ModBlocks.TUFF_BRICKS_LAYER);
                        entries.add(ModBlocks.CHISELED_TUFF_BRICKS_LAYER);

                    }).build());


    public static void registerItemGroups() {
        VanillaLayerPlus.LOGGER.info("Registering Item Groups for " + VanillaLayerPlus.MOD_ID);
    }
}
