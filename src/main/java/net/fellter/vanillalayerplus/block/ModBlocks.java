package net.fellter.vanillalayerplus.block;

import net.fellter.vanillalayerplus.VanillaLayerPlus;
import net.fellter.vanillalayerplus.registry.DatagenArgs;
import net.fellter.vanillalayerplus.registry.RegistryArgs;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.client.data.TextureMap;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static net.fellter.vanillalayerplus.datagen.ModModelProvider.*;

public class ModBlocks {


    public static Map<Block, DatagenArgs> DATAGEN_ARGS = new HashMap<>();
    public static Map<Block, RegistryArgs> REGISTRY_ARGS = new HashMap<>();

    public static final Block LOG_DEF = registerBlock("log_def", Block::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable());


    public static final Block OAK_LAYER = registerBlock("oak_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.OAK_PLANKS).textureMap(TextureMap.all(Blocks.OAK_PLANKS)).recipeIngredient(Blocks.OAK_PLANKS));
    public static final Block STRIPPED_OAK_LOG_LAYER = registerBlock("stripped_oak_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_OAK_LOG).textureMap(blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG)).recipeIngredient(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_OAK_WOOD_LAYER = registerBlock("stripped_oak_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_OAK_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_OAK_LOG)).recipeIngredient(Blocks.STRIPPED_OAK_WOOD));
    public static final Block OAK_LOG_LAYER = registerBlock("oak_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.OAK_LOG).textureMap(blockAndTopForEnds(Blocks.OAK_LOG)).recipeIngredient(Blocks.OAK_LOG),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_OAK_LOG_LAYER).flammable(5, 5));
    public static final Block OAK_WOOD_LAYER = registerBlock("oak_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.OAK_WOOD).textureMap(TextureMap.all(Blocks.OAK_LOG)).recipeIngredient(Blocks.OAK_WOOD),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_OAK_WOOD_LAYER).flammable(5, 5));

    public static final Block SPRUCE_LAYER = registerBlock("spruce_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.SPRUCE_PLANKS).textureMap(TextureMap.all(Blocks.SPRUCE_PLANKS)).recipeIngredient(Blocks.SPRUCE_PLANKS));
    public static final Block STRIPPED_SPRUCE_LOG_LAYER = registerBlock("stripped_spruce_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_SPRUCE_LOG).textureMap(blockAndTopForEnds(Blocks.STRIPPED_SPRUCE_LOG)).recipeIngredient(Blocks.STRIPPED_SPRUCE_LOG));
    public static final Block STRIPPED_SPRUCE_WOOD_LAYER = registerBlock("stripped_spruce_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_SPRUCE_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_SPRUCE_LOG)).recipeIngredient(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final Block SPRUCE_LOG_LAYER = registerBlock("spruce_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.SPRUCE_LOG).textureMap(blockAndTopForEnds(Blocks.SPRUCE_LOG)).recipeIngredient(Blocks.SPRUCE_LOG),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_SPRUCE_LOG_LAYER).flammable(5, 5));
    public static final Block SPRUCE_WOOD_LAYER = registerBlock("spruce_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.SPRUCE_WOOD).textureMap(TextureMap.all(Blocks.SPRUCE_LOG)).recipeIngredient(Blocks.SPRUCE_WOOD),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_SPRUCE_WOOD_LAYER).flammable(5, 5));

    public static final Block BIRCH_LAYER = registerBlock("birch_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.BIRCH_PLANKS).textureMap(TextureMap.all(Blocks.BIRCH_PLANKS)).recipeIngredient(Blocks.BIRCH_PLANKS));
    public static final Block STRIPPED_BIRCH_LOG_LAYER = registerBlock("stripped_birch_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_BIRCH_LOG).textureMap(blockAndTopForEnds(Blocks.STRIPPED_BIRCH_LOG)).recipeIngredient(Blocks.STRIPPED_BIRCH_LOG));
    public static final Block STRIPPED_BIRCH_WOOD_LAYER = registerBlock("stripped_birch_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_BIRCH_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_BIRCH_LOG)).recipeIngredient(Blocks.STRIPPED_BIRCH_WOOD));
    public static final Block BIRCH_LOG_LAYER = registerBlock("birch_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.BIRCH_LOG).textureMap(blockAndTopForEnds(Blocks.BIRCH_LOG)).recipeIngredient(Blocks.BIRCH_LOG),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_BIRCH_LOG_LAYER).flammable(5, 5));
    public static final Block BIRCH_WOOD_LAYER = registerBlock("birch_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.BIRCH_WOOD).textureMap(TextureMap.all(Blocks.BIRCH_LOG)).recipeIngredient(Blocks.BIRCH_WOOD),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_BIRCH_WOOD_LAYER).flammable(5, 5));

    public static final Block JUNGLE_LAYER = registerBlock("jungle_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.JUNGLE_PLANKS).textureMap(TextureMap.all(Blocks.JUNGLE_PLANKS)).recipeIngredient(Blocks.JUNGLE_PLANKS));
    public static final Block STRIPPED_JUNGLE_LOG_LAYER = registerBlock("stripped_jungle_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_JUNGLE_LOG).textureMap(blockAndTopForEnds(Blocks.STRIPPED_JUNGLE_LOG)).recipeIngredient(Blocks.STRIPPED_JUNGLE_LOG));
    public static final Block STRIPPED_JUNGLE_WOOD_LAYER = registerBlock("stripped_jungle_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_JUNGLE_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_JUNGLE_LOG)).recipeIngredient(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final Block JUNGLE_LOG_LAYER = registerBlock("jungle_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.JUNGLE_LOG).textureMap(blockAndTopForEnds(Blocks.JUNGLE_LOG)).recipeIngredient(Blocks.JUNGLE_LOG),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_JUNGLE_LOG_LAYER).flammable(5, 5));
    public static final Block JUNGLE_WOOD_LAYER = registerBlock("jungle_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.JUNGLE_WOOD).textureMap(TextureMap.all(Blocks.JUNGLE_LOG)).recipeIngredient(Blocks.JUNGLE_WOOD),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_JUNGLE_WOOD_LAYER).flammable(5, 5));

    public static final Block ACACIA_LAYER = registerBlock("acacia_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.ACACIA_PLANKS).textureMap(TextureMap.all(Blocks.ACACIA_PLANKS)).recipeIngredient(Blocks.ACACIA_PLANKS));
    public static final Block STRIPPED_ACACIA_LOG_LAYER = registerBlock("stripped_acacia_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_ACACIA_LOG).textureMap(blockAndTopForEnds(Blocks.STRIPPED_ACACIA_LOG)).recipeIngredient(Blocks.STRIPPED_ACACIA_LOG));
    public static final Block STRIPPED_ACACIA_WOOD_LAYER = registerBlock("stripped_acacia_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_ACACIA_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_ACACIA_LOG)).recipeIngredient(Blocks.STRIPPED_ACACIA_WOOD));
    public static final Block ACACIA_LOG_LAYER = registerBlock("acacia_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.ACACIA_LOG).textureMap(blockAndTopForEnds(Blocks.ACACIA_LOG)).recipeIngredient(Blocks.ACACIA_LOG),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_ACACIA_LOG_LAYER).flammable(5, 5));
    public static final Block ACACIA_WOOD_LAYER = registerBlock("acacia_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.ACACIA_WOOD).textureMap(TextureMap.all(Blocks.ACACIA_LOG)).recipeIngredient(Blocks.ACACIA_WOOD),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_ACACIA_WOOD_LAYER).flammable(5, 5));

    public static final Block DARK_OAK_LAYER = registerBlock("dark_oak_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.DARK_OAK_PLANKS).textureMap(TextureMap.all(Blocks.DARK_OAK_PLANKS)).recipeIngredient(Blocks.DARK_OAK_PLANKS));
    public static final Block STRIPPED_DARK_OAK_LOG_LAYER = registerBlock("stripped_dark_oak_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_DARK_OAK_LOG).textureMap(blockAndTopForEnds(Blocks.STRIPPED_DARK_OAK_LOG)).recipeIngredient(Blocks.STRIPPED_DARK_OAK_LOG));
    public static final Block STRIPPED_DARK_OAK_WOOD_LAYER = registerBlock("stripped_dark_oak_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_DARK_OAK_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_DARK_OAK_LOG)).recipeIngredient(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final Block DARK_OAK_LOG_LAYER = registerBlock("dark_oak_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.DARK_OAK_LOG).textureMap(blockAndTopForEnds(Blocks.DARK_OAK_LOG)).recipeIngredient(Blocks.DARK_OAK_LOG),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_DARK_OAK_LOG_LAYER).flammable(5, 5));
    public static final Block DARK_OAK_WOOD_LAYER = registerBlock("dark_oak_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.DARK_OAK_WOOD).textureMap(TextureMap.all(Blocks.DARK_OAK_LOG)).recipeIngredient(Blocks.DARK_OAK_WOOD),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_DARK_OAK_WOOD_LAYER).flammable(5, 5));


    public static final Block MANGROVE_LAYER = registerBlock("mangrove_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.MANGROVE_PLANKS).textureMap(TextureMap.all(Blocks.MANGROVE_PLANKS)).recipeIngredient(Blocks.MANGROVE_PLANKS));
    public static final Block STRIPPED_MANGROVE_LOG_LAYER = registerBlock("stripped_mangrove_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_MANGROVE_LOG).textureMap(blockAndTopForEnds(Blocks.STRIPPED_MANGROVE_LOG)).recipeIngredient(Blocks.STRIPPED_MANGROVE_LOG));
    public static final Block STRIPPED_MANGROVE_WOOD_LAYER = registerBlock("stripped_mangrove_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_MANGROVE_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_MANGROVE_LOG)).recipeIngredient(Blocks.STRIPPED_MANGROVE_WOOD));
    public static final Block MANGROVE_LOG_LAYER = registerBlock("mangrove_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.MANGROVE_LOG).textureMap(blockAndTopForEnds(Blocks.MANGROVE_LOG)).recipeIngredient(Blocks.MANGROVE_LOG),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_MANGROVE_LOG_LAYER).flammable(5, 5));
    public static final Block MANGROVE_WOOD_LAYER = registerBlock("mangrove_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.MANGROVE_WOOD).textureMap(TextureMap.all(Blocks.MANGROVE_LOG)).recipeIngredient(Blocks.MANGROVE_WOOD),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_MANGROVE_WOOD_LAYER).flammable(5, 5));


    public static final Block CHERRY_LAYER = registerBlock("cherry_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.CHERRY_PLANKS).textureMap(TextureMap.all(Blocks.CHERRY_PLANKS)).recipeIngredient(Blocks.CHERRY_PLANKS));
    public static final Block STRIPPED_CHERRY_LOG_LAYER = registerBlock("stripped_cherry_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_CHERRY_LOG).textureMap(blockAndTopForEnds(Blocks.STRIPPED_CHERRY_LOG)).recipeIngredient(Blocks.STRIPPED_CHERRY_LOG));
    public static final Block STRIPPED_CHERRY_WOOD_LAYER = registerBlock("stripped_cherry_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_CHERRY_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_CHERRY_LOG)).recipeIngredient(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block CHERRY_LOG_LAYER = registerBlock("cherry_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.CHERRY_LOG).textureMap(blockAndTopForEnds(Blocks.CHERRY_LOG)).recipeIngredient(Blocks.CHERRY_LOG),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_CHERRY_LOG_LAYER).flammable(5, 5));
    public static final Block CHERRY_WOOD_LAYER = registerBlock("cherry_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.CHERRY_WOOD).textureMap(TextureMap.all(Blocks.CHERRY_LOG)).recipeIngredient(Blocks.CHERRY_WOOD),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_CHERRY_WOOD_LAYER).flammable(5, 5));


    public static final Block PALE_OAK_LAYER = registerBlock("pale_oak_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_PLANKS),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.PALE_OAK_PLANKS).textureMap(TextureMap.all(Blocks.PALE_OAK_PLANKS)).recipeIngredient(Blocks.PALE_OAK_PLANKS));
    public static final Block STRIPPED_PALE_OAK_LOG_LAYER = registerBlock("stripped_pale_oak_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_PALE_OAK_LOG).textureMap(blockAndTopForEnds(Blocks.STRIPPED_PALE_OAK_LOG)).recipeIngredient(Blocks.STRIPPED_PALE_OAK_LOG));
    public static final Block STRIPPED_PALE_OAK_WOOD_LAYER = registerBlock("stripped_pale_oak_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_PALE_OAK_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_PALE_OAK_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_PALE_OAK_LOG)).recipeIngredient(Blocks.STRIPPED_PALE_OAK_WOOD));
    public static final Block PALE_OAK_LOG_LAYER = registerBlock("pale_oak_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.PALE_OAK_LOG).textureMap(blockAndTopForEnds(Blocks.PALE_OAK_LOG)).recipeIngredient(Blocks.PALE_OAK_LOG),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_PALE_OAK_LOG_LAYER).flammable(5, 5));
    public static final Block PALE_OAK_WOOD_LAYER = registerBlock("pale_oak_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.PALE_OAK_WOOD).textureMap(TextureMap.all(Blocks.PALE_OAK_LOG)).recipeIngredient(Blocks.PALE_OAK_WOOD),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_PALE_OAK_WOOD_LAYER).flammable(5, 5));

    public static final Block BAMBOO_DEF = registerBlock("bamboo_def", Block::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.BAMBOO_WOOD));

    public static final Block BAMBOO_LAYER = registerBlock("bamboo_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.BAMBOO_PLANKS).textureMap(TextureMap.all(Blocks.BAMBOO_PLANKS)).recipeIngredient(Blocks.BAMBOO_PLANKS));
    public static final Block BAMBOO_MOSAIC_LAYER = registerBlock("bamboo_mosaic_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_MOSAIC),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.BAMBOO_MOSAIC).textureMap(TextureMap.all(Blocks.BAMBOO_MOSAIC)).recipeIngredient(Blocks.BAMBOO_MOSAIC));
    public static final Block STRIPPED_BAMBOO_BLOCK_LAYER = registerBlock("stripped_bamboo_block_layer", LayerBlock::new, AbstractBlock.Settings.copy(BAMBOO_DEF).sounds(BlockSoundGroup.BAMBOO_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_BAMBOO_BLOCK).textureMap(blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK)).recipeIngredient(Blocks.STRIPPED_BAMBOO_BLOCK));
    public static final Block BAMBOO_BLOCK_LAYER = registerBlock("bamboo_block_layer", LayerBlock::new, AbstractBlock.Settings.copy(BAMBOO_DEF).sounds(BlockSoundGroup.BAMBOO_WOOD),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.BAMBOO_BLOCK).textureMap(blockAndTopForEnds(Blocks.BAMBOO_BLOCK)).recipeIngredient(Blocks.BAMBOO_BLOCK),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_BAMBOO_BLOCK_LAYER).flammable(5, 5));

    public static final Block NETHER_DEF = registerBlock("nether_def", Block::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.NETHER_STEM));

    public static final Block CRIMSON_LAYER = registerBlock("crimson_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.CRIMSON_PLANKS).textureMap(TextureMap.all(Blocks.CRIMSON_PLANKS)).recipeIngredient(Blocks.CRIMSON_PLANKS));
    public static final Block STRIPPED_CRIMSON_STEM_LAYER = registerBlock("stripped_crimson_stem_layer", LayerBlock::new, AbstractBlock.Settings.copy(NETHER_DEF).sounds(BlockSoundGroup.NETHER_STEM),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_CRIMSON_STEM).textureMap(blockAndTopForEnds(Blocks.STRIPPED_CRIMSON_STEM)).recipeIngredient(Blocks.STRIPPED_CRIMSON_STEM));
    public static final Block STRIPPED_CRIMSON_HYPHAE_LAYER = registerBlock("stripped_crimson_hyphae_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_CRIMSON_HYPHAE).textureMap(TextureMap.all(Blocks.STRIPPED_CRIMSON_STEM)).recipeIngredient(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final Block CRIMSON_STEM_LAYER = registerBlock("crimson_stem_layer", LayerBlock::new, AbstractBlock.Settings.copy(NETHER_DEF).sounds(BlockSoundGroup.NETHER_STEM),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.CRIMSON_STEM).textureMap(blockAndTopForEnds(Blocks.CRIMSON_STEM)).recipeIngredient(Blocks.CRIMSON_STEM),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_CRIMSON_STEM_LAYER));
    public static final Block CRIMSON_HYPHAE_LAYER = registerBlock("crimson_hyphae_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.CRIMSON_HYPHAE).textureMap(TextureMap.all(Blocks.CRIMSON_STEM)).recipeIngredient(Blocks.CRIMSON_HYPHAE),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_CRIMSON_HYPHAE_LAYER));

    public static final Block WARPED_LAYER = registerBlock("warped_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.WARPED_PLANKS).textureMap(TextureMap.all(Blocks.WARPED_PLANKS)).recipeIngredient(Blocks.WARPED_PLANKS));
    public static final Block STRIPPED_WARPED_STEM_LAYER = registerBlock("stripped_warped_stem_layer", LayerBlock::new, AbstractBlock.Settings.copy(NETHER_DEF).sounds(BlockSoundGroup.NETHER_STEM),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_WARPED_STEM).textureMap(blockAndTopForEnds(Blocks.STRIPPED_WARPED_STEM)).recipeIngredient(Blocks.STRIPPED_WARPED_STEM));
    public static final Block STRIPPED_WARPED_HYPHAE_LAYER = registerBlock("stripped_warped_hyphae_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.STRIPPED_WARPED_HYPHAE).textureMap(TextureMap.all(Blocks.STRIPPED_WARPED_STEM)).recipeIngredient(Blocks.STRIPPED_WARPED_HYPHAE));
    public static final Block WARPED_STEM_LAYER = registerBlock("warped_stem_layer", LayerBlock::new, AbstractBlock.Settings.copy(NETHER_DEF).sounds(BlockSoundGroup.NETHER_STEM),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.WARPED_STEM).textureMap(blockAndTopForEnds(Blocks.WARPED_STEM)).recipeIngredient(Blocks.WARPED_STEM),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_WARPED_STEM_LAYER));
    public static final Block WARPED_HYPHAE_LAYER = registerBlock("warped_hyphae_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE),
            new DatagenArgs().blockTags(List.of(BlockTags.AXE_MINEABLE)).fullBlock(Blocks.WARPED_HYPHAE).textureMap(TextureMap.all(Blocks.WARPED_STEM)).recipeIngredient(Blocks.WARPED_HYPHAE),
            new RegistryArgs().stripped(ModBlocks.STRIPPED_WARPED_HYPHAE_LAYER));

    public static final Block STONE_LAYER = registerBlock("stone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STONE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.STONE).textureMap(TextureMap.all(Blocks.STONE)).recipeIngredient(Blocks.STONE));
    public static final Block COBBLESTONE_LAYER = registerBlock("cobblestone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLESTONE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.COBBLESTONE).textureMap(TextureMap.all(Blocks.COBBLESTONE)).recipeIngredient(Blocks.COBBLESTONE));
    public static final Block MOSSY_COBBLESTONE_LAYER = registerBlock("mossy_cobblestone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.MOSSY_COBBLESTONE).textureMap(TextureMap.all(Blocks.MOSSY_COBBLESTONE)).recipeIngredient(Blocks.MOSSY_COBBLESTONE));
    public static final Block SMOOTH_STONE_LAYER = registerBlock("smooth_stone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.SMOOTH_STONE).textureMap(TextureMap.all(Blocks.SMOOTH_STONE)).recipeIngredient(Blocks.SMOOTH_STONE));
    public static final Block STONE_BRICKS_LAYER = registerBlock("stone_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.STONE_BRICKS).textureMap(TextureMap.all(Blocks.STONE_BRICKS)).recipeIngredient(Blocks.STONE_BRICKS));
    public static final Block CRACKED_STONE_BRICKS_LAYER = registerBlock("cracked_stone_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.CRACKED_STONE_BRICKS).textureMap(TextureMap.all(Blocks.CRACKED_STONE_BRICKS)).recipeIngredient(Blocks.CRACKED_STONE_BRICKS));
    public static final Block CHISELED_STONE_BRICKS_LAYER = registerBlock("chiseled_stone_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.CRACKED_STONE_BRICKS).textureMap(TextureMap.all(Blocks.CHISELED_STONE_BRICKS)).recipeIngredient(Blocks.CHISELED_STONE_BRICKS));
    public static final Block MOSSY_STONE_BRICKS_LAYER = registerBlock("mossy_stone_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.MOSSY_STONE_BRICKS).textureMap(TextureMap.all(Blocks.MOSSY_STONE_BRICKS)).recipeIngredient(Blocks.MOSSY_STONE_BRICKS));
    
    public static final Block GRANITE_LAYER = registerBlock("granite_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.GRANITE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.GRANITE).textureMap(TextureMap.all(Blocks.GRANITE)).recipeIngredient(Blocks.GRANITE));
    public static final Block POLISHED_GRANITE_LAYER = registerBlock("polished_granite_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.POLISHED_GRANITE).textureMap(TextureMap.all(Blocks.POLISHED_GRANITE)).recipeIngredient(Blocks.POLISHED_GRANITE));
    public static final Block DIORITE_LAYER = registerBlock("diorite_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DIORITE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.DIORITE).textureMap(TextureMap.all(Blocks.DIORITE)).recipeIngredient(Blocks.DIORITE));
    public static final Block POLISHED_DIORITE_LAYER = registerBlock("polished_diorite_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.POLISHED_DIORITE).textureMap(TextureMap.all(Blocks.POLISHED_DIORITE)).recipeIngredient(Blocks.POLISHED_DIORITE));
    public static final Block ANDESITE_LAYER = registerBlock("andesite_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.ANDESITE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.ANDESITE).textureMap(TextureMap.all(Blocks.ANDESITE)).recipeIngredient(Blocks.ANDESITE));
    public static final Block POLISHED_ANDESITE_LAYER = registerBlock("polished_andesite_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.POLISHED_ANDESITE).textureMap(TextureMap.all(Blocks.POLISHED_ANDESITE)).recipeIngredient(Blocks.POLISHED_ANDESITE));
    
    public static final Block DEEPSLATE_LAYER = registerBlock("deepslate_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.DEEPSLATE).textureMap(blockAndTopForEnds(Blocks.DEEPSLATE)).recipeIngredient(Blocks.DEEPSLATE));
    public static final Block COBBLED_DEEPSLATE_LAYER = registerBlock("cobbled_deepslate_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.COBBLED_DEEPSLATE).textureMap(TextureMap.all(Blocks.COBBLED_DEEPSLATE)).recipeIngredient(Blocks.COBBLED_DEEPSLATE));
    public static final Block CHISELED_DEEPSLATE_LAYER = registerBlock("chiseled_deepslate_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.CHISELED_DEEPSLATE).textureMap(TextureMap.all(Blocks.CHISELED_DEEPSLATE)).recipeIngredient(Blocks.CHISELED_DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE_LAYER = registerBlock("polished_deepslate_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.POLISHED_DEEPSLATE).textureMap(TextureMap.all(Blocks.POLISHED_DEEPSLATE)).recipeIngredient(Blocks.POLISHED_DEEPSLATE));
    public static final Block DEEPSLATE_BRICKS_LAYER = registerBlock("deepslate_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.DEEPSLATE_BRICKS).textureMap(TextureMap.all(Blocks.DEEPSLATE_BRICKS)).recipeIngredient(Blocks.DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_BRICKS_LAYER = registerBlock("cracked_deepslate_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.CRACKED_DEEPSLATE_BRICKS).textureMap(TextureMap.all(Blocks.CRACKED_DEEPSLATE_BRICKS)).recipeIngredient(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block DEEPSLATE_TILES_LAYER = registerBlock("deepslate_tiles_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.DEEPSLATE_TILES).textureMap(TextureMap.all(Blocks.DEEPSLATE_TILES)).recipeIngredient(Blocks.DEEPSLATE_TILES));
    public static final Block CRACKED_DEEPSLATE_TILES_LAYER = registerBlock("cracked_deepslate_tiles_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.CRACKED_DEEPSLATE_TILES).textureMap(TextureMap.all(Blocks.CRACKED_DEEPSLATE_TILES)).recipeIngredient(Blocks.CRACKED_DEEPSLATE_TILES));
    
    public static final Block TUFF_LAYER = registerBlock("tuff_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.TUFF).textureMap(TextureMap.all(Blocks.TUFF)).recipeIngredient(Blocks.TUFF));
    public static final Block CHISELED_TUFF_LAYER = registerBlock("chiseled_tuff_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.CHISELED_TUFF).textureMap(blockAndTopForEnds(Blocks.CHISELED_TUFF)).recipeIngredient(Blocks.CHISELED_TUFF));
    public static final Block POLISHED_TUFF_LAYER = registerBlock("polished_tuff_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.POLISHED_TUFF).textureMap(TextureMap.all(Blocks.POLISHED_TUFF)).recipeIngredient(Blocks.POLISHED_TUFF));
    public static final Block TUFF_BRICKS_LAYER = registerBlock("tuff_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.TUFF_BRICKS).textureMap(TextureMap.all(Blocks.TUFF_BRICKS)).recipeIngredient(Blocks.TUFF_BRICKS));
    public static final Block CHISELED_TUFF_BRICKS_LAYER = registerBlock("chiseled_tuff_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS),
            new DatagenArgs().blockTags(List.of(BlockTags.PICKAXE_MINEABLE)).fullBlock(Blocks.CHISELED_TUFF_BRICKS).textureMap(blockAndTopForEnds(Blocks.CHISELED_TUFF_BRICKS)).recipeIngredient(Blocks.CHISELED_TUFF_BRICKS));





    private static Block registerBlock(String name, @NotNull Function<AbstractBlock.Settings, Block> function, AbstractBlock.@NotNull Settings settings) {
        Block block = function.apply(settings.registryKey(keyOfBlock(name)));
        Registry.register(Registries.ITEM, Identifier.of(VanillaLayerPlus.MOD_ID, name), new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(keyOfItem(name))));
        return Registry.register(Registries.BLOCK, keyOfBlock(name), block);
    }

    private static Block registerBlock(String name, @NotNull Function<AbstractBlock.Settings, Block> function, AbstractBlock.@NotNull Settings settings, DatagenArgs datagenArgs) {
        Block block = function.apply(settings.registryKey(keyOfBlock(name)));
        DATAGEN_ARGS.put(block, datagenArgs);
        Registry.register(Registries.ITEM, Identifier.of(VanillaLayerPlus.MOD_ID, name), new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(keyOfItem(name))));
        return Registry.register(Registries.BLOCK, keyOfBlock(name), block);
    }

    private static Block registerBlock(String name, @NotNull Function<AbstractBlock.Settings, Block> function, AbstractBlock.@NotNull Settings settings, DatagenArgs datagenArgs, RegistryArgs registryArgs) {
        Block block = function.apply(settings.registryKey(keyOfBlock(name)));
        DATAGEN_ARGS.put(block, datagenArgs);
        REGISTRY_ARGS.put(block, registryArgs);
        Registry.register(Registries.ITEM, Identifier.of(VanillaLayerPlus.MOD_ID, name), new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(keyOfItem(name))));
        return Registry.register(Registries.BLOCK, keyOfBlock(name), block);
    }



    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaLayerPlus.MOD_ID, name));
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaLayerPlus.MOD_ID, name));
    }

    public static void registerModBlocks() {
    }
}
