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
