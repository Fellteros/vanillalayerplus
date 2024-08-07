package net.fellter.vanillalayerplus.block;

import net.fellter.vanillalayerplus.VanillaLayerPlus;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block OAK_LAYER = registerBlock("oak_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block OAK_LOG_LAYER = registerBlock("oak_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block OAK_WOOD_LAYER = registerBlock("oak_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STR_OAK_LOG_LAYER = registerBlock("str_oak_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block STR_OAK_WOOD_LAYER = registerBlock("str_oak_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block SPRUCE_LAYER = registerBlock("spruce_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block SPRUCE_LOG_LAYER = registerBlock("spruce_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_WOOD_LAYER = registerBlock("spruce_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block STR_SPRUCE_LOG_LAYER = registerBlock("str_spruce_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block STR_SPRUCE_WOOD_LAYER = registerBlock("str_spruce_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));

    public static final Block BIRCH_LAYER = registerBlock("birch_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block BIRCH_LOG_LAYER = registerBlock("birch_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_WOOD_LAYER = registerBlock("birch_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
    public static final Block STR_BIRCH_LOG_LAYER = registerBlock("str_birch_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block STR_BIRCH_WOOD_LAYER = registerBlock("str_birch_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));

    public static final Block JUNGLE_LAYER = registerBlock("jungle_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block JUNGLE_LOG_LAYER = registerBlock("jungle_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_WOOD_LAYER = registerBlock("jungle_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
    public static final Block STR_JUNGLE_LOG_LAYER = registerBlock("str_jungle_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block STR_JUNGLE_WOOD_LAYER = registerBlock("str_jungle_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));

    public static final Block ACACIA_LAYER = registerBlock("acacia_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block ACACIA_LOG_LAYER = registerBlock("acacia_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_WOOD_LAYER = registerBlock("acacia_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
    public static final Block STR_ACACIA_LOG_LAYER = registerBlock("str_acacia_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block STR_ACACIA_WOOD_LAYER = registerBlock("str_acacia_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));

    public static final Block DARK_OAK_LAYER = registerBlock("dark_oak_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block DARK_OAK_LOG_LAYER = registerBlock("dark_oak_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_WOOD_LAYER = registerBlock("dark_oak_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block STR_DARK_OAK_LOG_LAYER = registerBlock("str_dark_oak_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block STR_DARK_OAK_WOOD_LAYER = registerBlock("str_dark_oak_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));

    public static final Block MANGROVE_LAYER = registerBlock("mangrove_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block MANGROVE_LOG_LAYER = registerBlock("mangrove_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block MANGROVE_WOOD_LAYER = registerBlock("mangrove_wood_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block STR_MANGROVE_LOG_LAYER = registerBlock("str_mangrove_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block STR_MANGROVE_WOOD_LAYER = registerBlock("str_mangrove_wood_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block CHERRY_LAYER = registerBlock("cherry_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CHERRY_LOG_LAYER = registerBlock("cherry_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_WOOD_LAYER = registerBlock("cherry_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block STR_CHERRY_LOG_LAYER = registerBlock("str_cherry_log_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block STR_CHERRY_WOOD_LAYER = registerBlock("str_cherry_wood_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));

    public static final Block BAMBOO_LAYER = registerBlock("bamboo_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block BAMBOO_MOSAIC_LAYER = registerBlock("bamboo_mosaic_layer",
            new LayerBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_MOSAIC)));
    public static final Block BAMBOO_BLOCK_LAYER = registerBlock("bamboo_block_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STR_BAMBOO_BLOCK_LAYER = registerBlock("str_bamboo_block_layer",
            new LayerBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.BAMBOO_WOOD)));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaLayerPlus.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VanillaLayerPlus.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        VanillaLayerPlus.LOGGER.info("Registering Mod Blocks for " + VanillaLayerPlus.MOD_ID);
    }
}
