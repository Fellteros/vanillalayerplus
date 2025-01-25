package net.fellter.vanillalayerplus.block;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.jetbrains.annotations.NotNull;

import net.fellter.vanillalayerplus.VanillaLayerPlus;
import net.fellter.vanillalayerplus.custom_blocks.OxidizableLayerBlock;
import net.fellter.vanillalayerplus.custom_blocks.RedstoneLayerBlock;
import net.fellter.vanillalayerplus.datagen.ModModelProvider;
import net.fellter.vanillalayerplus.registry.DatagenArgs;
import net.fellter.vanillalayerplus.registry.RegistryArgs;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
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

public class ModBlocks {
	public static Map<Block, DatagenArgs> DATAGEN_ARGS = new HashMap<>();
	public static Map<Block, RegistryArgs> REGISTRY_ARGS = new HashMap<>();

	public static final Block LOG_DEF = registerBlock("log_def", Block::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable());

	public static final Block OAK_LAYER = registerBlock("oak_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.OAK_PLANKS).textureMap(TextureMap.all(Blocks.OAK_PLANKS)));
	public static final Block STRIPPED_OAK_LOG_LAYER = registerBlock("stripped_oak_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_OAK_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG)));
	public static final Block STRIPPED_OAK_WOOD_LAYER = registerBlock("stripped_oak_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_OAK_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_OAK_LOG)));
	public static final Block OAK_LOG_LAYER = registerBlock("oak_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.OAK_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.OAK_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_OAK_LOG_LAYER).flammable(5, 5));
	public static final Block OAK_WOOD_LAYER = registerBlock("oak_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.OAK_WOOD).textureMap(TextureMap.all(Blocks.OAK_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_OAK_WOOD_LAYER).flammable(5, 5));

	public static final Block SPRUCE_LAYER = registerBlock("spruce_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.SPRUCE_PLANKS).textureMap(TextureMap.all(Blocks.SPRUCE_PLANKS)));
	public static final Block STRIPPED_SPRUCE_LOG_LAYER = registerBlock("stripped_spruce_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_SPRUCE_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.STRIPPED_SPRUCE_LOG)));
	public static final Block STRIPPED_SPRUCE_WOOD_LAYER = registerBlock("stripped_spruce_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_SPRUCE_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_SPRUCE_LOG)));
	public static final Block SPRUCE_LOG_LAYER = registerBlock("spruce_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.SPRUCE_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.SPRUCE_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_SPRUCE_LOG_LAYER).flammable(5, 5));
	public static final Block SPRUCE_WOOD_LAYER = registerBlock("spruce_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.SPRUCE_WOOD).textureMap(TextureMap.all(Blocks.SPRUCE_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_SPRUCE_WOOD_LAYER).flammable(5, 5));

	public static final Block BIRCH_LAYER = registerBlock("birch_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.BIRCH_PLANKS).textureMap(TextureMap.all(Blocks.BIRCH_PLANKS)));
	public static final Block STRIPPED_BIRCH_LOG_LAYER = registerBlock("stripped_birch_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_BIRCH_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.STRIPPED_BIRCH_LOG)));
	public static final Block STRIPPED_BIRCH_WOOD_LAYER = registerBlock("stripped_birch_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_BIRCH_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_BIRCH_LOG)));
	public static final Block BIRCH_LOG_LAYER = registerBlock("birch_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.BIRCH_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.BIRCH_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_BIRCH_LOG_LAYER).flammable(5, 5));
	public static final Block BIRCH_WOOD_LAYER = registerBlock("birch_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.BIRCH_WOOD).textureMap(TextureMap.all(Blocks.BIRCH_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_BIRCH_WOOD_LAYER).flammable(5, 5));

	public static final Block JUNGLE_LAYER = registerBlock("jungle_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.JUNGLE_PLANKS).textureMap(TextureMap.all(Blocks.JUNGLE_PLANKS)));
	public static final Block STRIPPED_JUNGLE_LOG_LAYER = registerBlock("stripped_jungle_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_JUNGLE_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.STRIPPED_JUNGLE_LOG)));
	public static final Block STRIPPED_JUNGLE_WOOD_LAYER = registerBlock("stripped_jungle_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_JUNGLE_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_JUNGLE_LOG)));
	public static final Block JUNGLE_LOG_LAYER = registerBlock("jungle_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.JUNGLE_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.JUNGLE_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_JUNGLE_LOG_LAYER).flammable(5, 5));
	public static final Block JUNGLE_WOOD_LAYER = registerBlock("jungle_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.JUNGLE_WOOD).textureMap(TextureMap.all(Blocks.JUNGLE_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_JUNGLE_WOOD_LAYER).flammable(5, 5));

	public static final Block ACACIA_LAYER = registerBlock("acacia_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.ACACIA_PLANKS).textureMap(TextureMap.all(Blocks.ACACIA_PLANKS)));
	public static final Block STRIPPED_ACACIA_LOG_LAYER = registerBlock("stripped_acacia_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_ACACIA_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.STRIPPED_ACACIA_LOG)));
	public static final Block STRIPPED_ACACIA_WOOD_LAYER = registerBlock("stripped_acacia_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_ACACIA_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_ACACIA_LOG)));
	public static final Block ACACIA_LOG_LAYER = registerBlock("acacia_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.ACACIA_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.ACACIA_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_ACACIA_LOG_LAYER).flammable(5, 5));
	public static final Block ACACIA_WOOD_LAYER = registerBlock("acacia_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.ACACIA_WOOD).textureMap(TextureMap.all(Blocks.ACACIA_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_ACACIA_WOOD_LAYER).flammable(5, 5));

	public static final Block DARK_OAK_LAYER = registerBlock("dark_oak_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.DARK_OAK_PLANKS).textureMap(TextureMap.all(Blocks.DARK_OAK_PLANKS)));
	public static final Block STRIPPED_DARK_OAK_LOG_LAYER = registerBlock("stripped_dark_oak_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_DARK_OAK_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.STRIPPED_DARK_OAK_LOG)));
	public static final Block STRIPPED_DARK_OAK_WOOD_LAYER = registerBlock("stripped_dark_oak_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_DARK_OAK_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_DARK_OAK_LOG)));
	public static final Block DARK_OAK_LOG_LAYER = registerBlock("dark_oak_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.DARK_OAK_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.DARK_OAK_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_DARK_OAK_LOG_LAYER).flammable(5, 5));
	public static final Block DARK_OAK_WOOD_LAYER = registerBlock("dark_oak_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.DARK_OAK_WOOD).textureMap(TextureMap.all(Blocks.DARK_OAK_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_DARK_OAK_WOOD_LAYER).flammable(5, 5));

	public static final Block MANGROVE_LAYER = registerBlock("mangrove_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.MANGROVE_PLANKS).textureMap(TextureMap.all(Blocks.MANGROVE_PLANKS)));
	public static final Block STRIPPED_MANGROVE_LOG_LAYER = registerBlock("stripped_mangrove_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_MANGROVE_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.STRIPPED_MANGROVE_LOG)));
	public static final Block STRIPPED_MANGROVE_WOOD_LAYER = registerBlock("stripped_mangrove_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_MANGROVE_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_MANGROVE_LOG)));
	public static final Block MANGROVE_LOG_LAYER = registerBlock("mangrove_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.MANGROVE_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.MANGROVE_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_MANGROVE_LOG_LAYER).flammable(5, 5));
	public static final Block MANGROVE_WOOD_LAYER = registerBlock("mangrove_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.MANGROVE_WOOD).textureMap(TextureMap.all(Blocks.MANGROVE_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_MANGROVE_WOOD_LAYER).flammable(5, 5));

	public static final Block CHERRY_LAYER = registerBlock("cherry_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.CHERRY_PLANKS).textureMap(TextureMap.all(Blocks.CHERRY_PLANKS)));
	public static final Block STRIPPED_CHERRY_LOG_LAYER = registerBlock("stripped_cherry_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_CHERRY_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.STRIPPED_CHERRY_LOG)));
	public static final Block STRIPPED_CHERRY_WOOD_LAYER = registerBlock("stripped_cherry_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_CHERRY_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_CHERRY_LOG)));
	public static final Block CHERRY_LOG_LAYER = registerBlock("cherry_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.CHERRY_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.CHERRY_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_CHERRY_LOG_LAYER).flammable(5, 5));
	public static final Block CHERRY_WOOD_LAYER = registerBlock("cherry_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.CHERRY_WOOD).textureMap(TextureMap.all(Blocks.CHERRY_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_CHERRY_WOOD_LAYER).flammable(5, 5));

	public static final Block PALE_OAK_LAYER = registerBlock("pale_oak_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_PLANKS),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.PALE_OAK_PLANKS).textureMap(TextureMap.all(Blocks.PALE_OAK_PLANKS)));
	public static final Block STRIPPED_PALE_OAK_LOG_LAYER = registerBlock("stripped_pale_oak_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_PALE_OAK_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.STRIPPED_PALE_OAK_LOG)));
	public static final Block STRIPPED_PALE_OAK_WOOD_LAYER = registerBlock("stripped_pale_oak_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_PALE_OAK_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_PALE_OAK_WOOD).textureMap(TextureMap.all(Blocks.STRIPPED_PALE_OAK_LOG)));
	public static final Block PALE_OAK_LOG_LAYER = registerBlock("pale_oak_log_layer", LayerBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.PALE_OAK_LOG).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.PALE_OAK_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_PALE_OAK_LOG_LAYER).flammable(5, 5));
	public static final Block PALE_OAK_WOOD_LAYER = registerBlock("pale_oak_wood_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.PALE_OAK_WOOD).textureMap(TextureMap.all(Blocks.PALE_OAK_LOG)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_PALE_OAK_WOOD_LAYER).flammable(5, 5));

	public static final Block BAMBOO_DEF = registerBlock("bamboo_def", Block::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.BAMBOO_WOOD));

	public static final Block BAMBOO_LAYER = registerBlock("bamboo_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.BAMBOO_PLANKS).textureMap(TextureMap.all(Blocks.BAMBOO_PLANKS)));
	public static final Block BAMBOO_MOSAIC_LAYER = registerBlock("bamboo_mosaic_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_MOSAIC),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.BAMBOO_MOSAIC).textureMap(TextureMap.all(Blocks.BAMBOO_MOSAIC)));
	public static final Block STRIPPED_BAMBOO_BLOCK_LAYER = registerBlock("stripped_bamboo_block_layer", LayerBlock::new, AbstractBlock.Settings.copy(BAMBOO_DEF).sounds(BlockSoundGroup.BAMBOO_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_BAMBOO_BLOCK).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK)));
	public static final Block BAMBOO_BLOCK_LAYER = registerBlock("bamboo_block_layer", LayerBlock::new, AbstractBlock.Settings.copy(BAMBOO_DEF).sounds(BlockSoundGroup.BAMBOO_WOOD),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.BAMBOO_BLOCK).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.BAMBOO_BLOCK)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_BAMBOO_BLOCK_LAYER).flammable(5, 5));

	public static final Block NETHER_DEF = registerBlock("nether_def", Block::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.NETHER_STEM));

	public static final Block CRIMSON_LAYER = registerBlock("crimson_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.CRIMSON_PLANKS).textureMap(TextureMap.all(Blocks.CRIMSON_PLANKS)));
	public static final Block STRIPPED_CRIMSON_STEM_LAYER = registerBlock("stripped_crimson_stem_layer", LayerBlock::new, AbstractBlock.Settings.copy(NETHER_DEF).sounds(BlockSoundGroup.NETHER_STEM),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_CRIMSON_STEM).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.STRIPPED_CRIMSON_STEM)));
	public static final Block STRIPPED_CRIMSON_HYPHAE_LAYER = registerBlock("stripped_crimson_hyphae_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_CRIMSON_HYPHAE).textureMap(TextureMap.all(Blocks.STRIPPED_CRIMSON_STEM)));
	public static final Block CRIMSON_STEM_LAYER = registerBlock("crimson_stem_layer", LayerBlock::new, AbstractBlock.Settings.copy(NETHER_DEF).sounds(BlockSoundGroup.NETHER_STEM),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.CRIMSON_STEM).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.CRIMSON_STEM)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_CRIMSON_STEM_LAYER));
	public static final Block CRIMSON_HYPHAE_LAYER = registerBlock("crimson_hyphae_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.CRIMSON_HYPHAE).textureMap(TextureMap.all(Blocks.CRIMSON_STEM)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_CRIMSON_HYPHAE_LAYER));

	public static final Block WARPED_LAYER = registerBlock("warped_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.WARPED_PLANKS).textureMap(TextureMap.all(Blocks.WARPED_PLANKS)));
	public static final Block STRIPPED_WARPED_STEM_LAYER = registerBlock("stripped_warped_stem_layer", LayerBlock::new, AbstractBlock.Settings.copy(NETHER_DEF).sounds(BlockSoundGroup.NETHER_STEM),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_WARPED_STEM).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.STRIPPED_WARPED_STEM)));
	public static final Block STRIPPED_WARPED_HYPHAE_LAYER = registerBlock("stripped_warped_hyphae_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.STRIPPED_WARPED_HYPHAE).textureMap(TextureMap.all(Blocks.STRIPPED_WARPED_STEM)));
	public static final Block WARPED_STEM_LAYER = registerBlock("warped_stem_layer", LayerBlock::new, AbstractBlock.Settings.copy(NETHER_DEF).sounds(BlockSoundGroup.NETHER_STEM),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.WARPED_STEM).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.WARPED_STEM)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_WARPED_STEM_LAYER));
	public static final Block WARPED_HYPHAE_LAYER = registerBlock("warped_hyphae_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE),
			new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).parentBlock(Blocks.WARPED_HYPHAE).textureMap(TextureMap.all(Blocks.WARPED_STEM)),
			new RegistryArgs().stripped(ModBlocks.STRIPPED_WARPED_HYPHAE_LAYER));

	public static final Block STONE_LAYER = registerBlock("stone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.STONE).textureMap(TextureMap.all(Blocks.STONE)));
	public static final Block COBBLESTONE_LAYER = registerBlock("cobblestone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLESTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.COBBLESTONE).textureMap(TextureMap.all(Blocks.COBBLESTONE)));
	public static final Block MOSSY_COBBLESTONE_LAYER = registerBlock("mossy_cobblestone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.MOSSY_COBBLESTONE).textureMap(TextureMap.all(Blocks.MOSSY_COBBLESTONE)));
	public static final Block SMOOTH_STONE_LAYER = registerBlock("smooth_stone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.SMOOTH_STONE).textureMap(TextureMap.all(Blocks.SMOOTH_STONE)));
	public static final Block STONE_BRICKS_LAYER = registerBlock("stone_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.STONE_BRICKS).textureMap(TextureMap.all(Blocks.STONE_BRICKS)));
	public static final Block CRACKED_STONE_BRICKS_LAYER = registerBlock("cracked_stone_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CRACKED_STONE_BRICKS).textureMap(TextureMap.all(Blocks.CRACKED_STONE_BRICKS)));
	public static final Block CHISELED_STONE_BRICKS_LAYER = registerBlock("chiseled_stone_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CRACKED_STONE_BRICKS).textureMap(TextureMap.all(Blocks.CHISELED_STONE_BRICKS)));
	public static final Block MOSSY_STONE_BRICKS_LAYER = registerBlock("mossy_stone_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.MOSSY_STONE_BRICKS).textureMap(TextureMap.all(Blocks.MOSSY_STONE_BRICKS)));

	public static final Block GRANITE_LAYER = registerBlock("granite_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.GRANITE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.GRANITE).textureMap(TextureMap.all(Blocks.GRANITE)));
	public static final Block POLISHED_GRANITE_LAYER = registerBlock("polished_granite_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.POLISHED_GRANITE).textureMap(TextureMap.all(Blocks.POLISHED_GRANITE)));
	public static final Block DIORITE_LAYER = registerBlock("diorite_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DIORITE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.DIORITE).textureMap(TextureMap.all(Blocks.DIORITE)));
	public static final Block POLISHED_DIORITE_LAYER = registerBlock("polished_diorite_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.POLISHED_DIORITE).textureMap(TextureMap.all(Blocks.POLISHED_DIORITE)));
	public static final Block ANDESITE_LAYER = registerBlock("andesite_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.ANDESITE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.ANDESITE).textureMap(TextureMap.all(Blocks.ANDESITE)));
	public static final Block POLISHED_ANDESITE_LAYER = registerBlock("polished_andesite_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.POLISHED_ANDESITE).textureMap(TextureMap.all(Blocks.POLISHED_ANDESITE)));

	public static final Block DEEPSLATE_LAYER = registerBlock("deepslate_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.DEEPSLATE).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.DEEPSLATE)));
	public static final Block COBBLED_DEEPSLATE_LAYER = registerBlock("cobbled_deepslate_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.COBBLED_DEEPSLATE).textureMap(TextureMap.all(Blocks.COBBLED_DEEPSLATE)));
	public static final Block CHISELED_DEEPSLATE_LAYER = registerBlock("chiseled_deepslate_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CHISELED_DEEPSLATE).textureMap(TextureMap.all(Blocks.CHISELED_DEEPSLATE)));
	public static final Block POLISHED_DEEPSLATE_LAYER = registerBlock("polished_deepslate_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.POLISHED_DEEPSLATE).textureMap(TextureMap.all(Blocks.POLISHED_DEEPSLATE)));
	public static final Block DEEPSLATE_BRICKS_LAYER = registerBlock("deepslate_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.DEEPSLATE_BRICKS).textureMap(TextureMap.all(Blocks.DEEPSLATE_BRICKS)));
	public static final Block CRACKED_DEEPSLATE_BRICKS_LAYER = registerBlock("cracked_deepslate_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CRACKED_DEEPSLATE_BRICKS).textureMap(TextureMap.all(Blocks.CRACKED_DEEPSLATE_BRICKS)));
	public static final Block DEEPSLATE_TILES_LAYER = registerBlock("deepslate_tiles_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.DEEPSLATE_TILES).textureMap(TextureMap.all(Blocks.DEEPSLATE_TILES)));
	public static final Block CRACKED_DEEPSLATE_TILES_LAYER = registerBlock("cracked_deepslate_tiles_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CRACKED_DEEPSLATE_TILES).textureMap(TextureMap.all(Blocks.CRACKED_DEEPSLATE_TILES)));

	public static final Block TUFF_LAYER = registerBlock("tuff_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.TUFF).textureMap(TextureMap.all(Blocks.TUFF)));
	public static final Block CHISELED_TUFF_LAYER = registerBlock("chiseled_tuff_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CHISELED_TUFF).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.CHISELED_TUFF)));
	public static final Block POLISHED_TUFF_LAYER = registerBlock("polished_tuff_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.POLISHED_TUFF).textureMap(TextureMap.all(Blocks.POLISHED_TUFF)));
	public static final Block TUFF_BRICKS_LAYER = registerBlock("tuff_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.TUFF_BRICKS).textureMap(TextureMap.all(Blocks.TUFF_BRICKS)));
	public static final Block CHISELED_TUFF_BRICKS_LAYER = registerBlock("chiseled_tuff_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CHISELED_TUFF_BRICKS).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.CHISELED_TUFF_BRICKS)));

	public static final Block BRICKS_LAYER = registerBlock("bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.BRICKS).textureMap(TextureMap.all(Blocks.BRICKS)));
	public static final Block PACKED_MUD_LAYER = registerBlock("packed_mud_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.PACKED_MUD).textureMap(TextureMap.all(Blocks.PACKED_MUD)));
	public static final Block MUD_BRICKS_LAYER = registerBlock("mud_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.MUD_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.MUD_BRICKS).textureMap(TextureMap.all(Blocks.MUD_BRICKS)));
	public static final Block RESIN_BRICKS_LAYER = registerBlock("resin_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.RESIN_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.RESIN_BRICKS).textureMap(TextureMap.all(Blocks.RESIN_BRICKS)));
	public static final Block CHISELED_RESIN_BRICKS_LAYER = registerBlock("chiseled_resin_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_RESIN_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CHISELED_RESIN_BRICKS).textureMap(TextureMap.all(Blocks.CHISELED_RESIN_BRICKS)));

	public static final Block SANDSTONE_LAYER = registerBlock("sandstone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.SANDSTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.SANDSTONE).textureMap(ModModelProvider.blockTB(Blocks.SANDSTONE)));
	public static final Block CHISELED_SANDSTONE_LAYER = registerBlock("chiseled_sandstone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_SANDSTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CHISELED_SANDSTONE).textureMap(ModModelProvider.custom(Blocks.CHISELED_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top")));
	public static final Block SMOOTH_SANDSTONE_LAYER = registerBlock("smooth_sandstone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.SMOOTH_SANDSTONE).textureMap(ModModelProvider.allWithSuffix(Blocks.SANDSTONE, "_top")));
	public static final Block CUT_SANDSTONE_LAYER = registerBlock("cut_sandstone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CUT_SANDSTONE).textureMap(ModModelProvider.custom(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top")));

	public static final Block RED_SANDSTONE_LAYER = registerBlock("red_sandstone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.RED_SANDSTONE).textureMap(ModModelProvider.blockTB(Blocks.RED_SANDSTONE)));
	public static final Block CHISELED_RED_SANDSTONE_LAYER = registerBlock("chiseled_red_sandstone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_RED_SANDSTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CHISELED_RED_SANDSTONE).textureMap(ModModelProvider.custom(Blocks.CHISELED_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top")));
	public static final Block SMOOTH_RED_SANDSTONE_LAYER = registerBlock("smooth_red_sandstone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.SMOOTH_RED_SANDSTONE).textureMap(ModModelProvider.allWithSuffix(Blocks.RED_SANDSTONE, "_top")));
	public static final Block CUT_RED_SANDSTONE_LAYER = registerBlock("cut_red_sandstone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CUT_RED_SANDSTONE).textureMap(ModModelProvider.custom(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top")));

	public static final Block SEA_LANTERN_LAYER = registerBlock("sea_lantern_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.SEA_LANTERN),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.SEA_LANTERN).textureMap(TextureMap.all(Blocks.SEA_LANTERN)));
	public static final Block PRISMARINE_LAYER = registerBlock("prismarine_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.PRISMARINE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.PRISMARINE).textureMap(TextureMap.all(Blocks.PRISMARINE)));
	public static final Block PRISMARINE_BRICKS_LAYER = registerBlock("prismarine_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.PRISMARINE_BRICKS).textureMap(TextureMap.all(Blocks.PRISMARINE_BRICKS)));
	public static final Block DARK_PRISMARINE_LAYER = registerBlock("dark_prismarine_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.DARK_PRISMARINE).textureMap(TextureMap.all(Blocks.DARK_PRISMARINE)));

	public static final Block NETHERRACK_LAYER = registerBlock("netherrack_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERRACK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.NETHERRACK).textureMap(TextureMap.all(Blocks.NETHERRACK)));
	public static final Block NETHER_BRICKS_LAYER = registerBlock("nether_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.NETHER_BRICKS).textureMap(TextureMap.all(Blocks.NETHER_BRICKS)));
	public static final Block CRACKED_NETHER_BRICKS_LAYER = registerBlock("cracked_nether_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CRACKED_NETHER_BRICKS).textureMap(TextureMap.all(Blocks.CRACKED_NETHER_BRICKS)));
	public static final Block CHISELED_NETHER_BRICKS_LAYER = registerBlock("chiseled_nether_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_NETHER_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CHISELED_NETHER_BRICKS).textureMap(TextureMap.all(Blocks.CHISELED_NETHER_BRICKS)));
	public static final Block RED_NETHER_BRICKS_LAYER = registerBlock("red_nether_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.RED_NETHER_BRICKS).textureMap(TextureMap.all(Blocks.RED_NETHER_BRICKS)));

	public static final Block BASALT_LAYER = registerBlock("basalt_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.BASALT),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.BASALT).textureMap(ModModelProvider.sideAndTopForEnds(Blocks.BASALT)));
	public static final Block SMOOTH_BASALT_LAYER = registerBlock("smooth_basalt_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.SMOOTH_BASALT).textureMap(TextureMap.all(Blocks.SMOOTH_BASALT)));
	public static final Block POLISHED_BASALT_LAYER = registerBlock("polished_basalt_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.POLISHED_BASALT).textureMap(ModModelProvider.sideAndTopForEnds(Blocks.POLISHED_BASALT)));

	public static final Block BLACKSTONE_LAYER = registerBlock("blackstone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.BLACKSTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.BLACKSTONE).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.BLACKSTONE)));
	public static final Block GILDED_BLACKSTONE_LAYER = registerBlock("gilded_blackstone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.GILDED_BLACKSTONE).textureMap(TextureMap.all(Blocks.GILDED_BLACKSTONE)));
	public static final Block CHISELED_POLISHED_BLACKSTONE_LAYER = registerBlock("chiseled_polished_blackstone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_POLISHED_BLACKSTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CHISELED_POLISHED_BLACKSTONE).textureMap(TextureMap.all(Blocks.CHISELED_POLISHED_BLACKSTONE)));
	public static final Block POLISHED_BLACKSTONE_LAYER = registerBlock("polished_blackstone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.POLISHED_BLACKSTONE).textureMap(TextureMap.all(Blocks.POLISHED_BLACKSTONE)));
	public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_LAYER = registerBlock("cracked_polished_blackstone_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).textureMap(TextureMap.all(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
	public static final Block POLISHED_BLACKSTONE_BRICKS_LAYER = registerBlock("polished_blackstone_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.POLISHED_BLACKSTONE_BRICKS).textureMap(TextureMap.all(Blocks.POLISHED_BLACKSTONE_BRICKS)));

	public static final Block END_STONE_LAYER = registerBlock("end_stone_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.END_STONE).textureMap(TextureMap.all(Blocks.END_STONE)));
	public static final Block END_STONE_BRICKS_LAYER = registerBlock("end_stone_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.END_STONE_BRICKS).textureMap(TextureMap.all(Blocks.END_STONE_BRICKS)));
	public static final Block PURPUR_LAYER = registerBlock("purpur_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.PURPUR_BLOCK).textureMap(TextureMap.all(Blocks.PURPUR_BLOCK)));
	public static final Block PURPUR_PILLAR_LAYER = registerBlock("purpur_pillar_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.PURPUR_PILLAR),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.PURPUR_PILLAR).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.PURPUR_PILLAR)));

	public static final Block COAL_LAYER = registerBlock("coal_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.COAL_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.COAL_BLOCK).textureMap(TextureMap.all(Blocks.COAL_BLOCK)));
	public static final Block IRON_LAYER = registerBlock("iron_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.IRON_BLOCK).textureMap(TextureMap.all(Blocks.IRON_BLOCK)));
	public static final Block GOLD_LAYER = registerBlock("gold_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.GOLD_BLOCK).textureMap(TextureMap.all(Blocks.GOLD_BLOCK)));
	public static final Block REDSTONE_LAYER = registerBlock("redstone_layer", RedstoneLayerBlock::new, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.REDSTONE_BLOCK).textureMap(TextureMap.all(Blocks.REDSTONE_BLOCK)));
	public static final Block EMERALD_LAYER = registerBlock("emerald_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.EMERALD_BLOCK).textureMap(TextureMap.all(Blocks.EMERALD_BLOCK)));
	public static final Block LAPIS_LAYER = registerBlock("lapis_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.LAPIS_BLOCK).textureMap(TextureMap.all(Blocks.LAPIS_BLOCK)));
	public static final Block DIAMOND_LAYER = registerBlock("diamond_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.DIAMOND_BLOCK).textureMap(TextureMap.all(Blocks.DIAMOND_BLOCK)));
	public static final Block NETHERITE_LAYER = registerBlock("netherite_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.NETHERITE_BLOCK).textureMap(TextureMap.all(Blocks.NETHERITE_BLOCK)));

	public static final Block QUARTZ_LAYER = registerBlock("quartz_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.QUARTZ_BLOCK).textureMap(ModModelProvider.blockSTB(Blocks.QUARTZ_BLOCK)));
	public static final Block CHISELED_QUARTZ_LAYER = registerBlock("chiseled_quartz_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_QUARTZ_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CHISELED_QUARTZ_BLOCK).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.CHISELED_QUARTZ_BLOCK)));
	public static final Block QUARTZ_BRICKS_LAYER = registerBlock("quartz_bricks_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.QUARTZ_BRICKS).textureMap(TextureMap.all(Blocks.QUARTZ_BRICKS)));
	public static final Block QUARTZ_PILLAR_LAYER = registerBlock("quartz_pillar_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_PILLAR),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.QUARTZ_PILLAR).textureMap(ModModelProvider.blockAndTopForEnds(Blocks.QUARTZ_PILLAR)));
	public static final Block SMOOTH_QUARTZ_LAYER = registerBlock("smooth_quartz_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.SMOOTH_QUARTZ).textureMap(ModModelProvider.allWithSuffix(Blocks.QUARTZ_BLOCK, "_bottom")));

	public static final Block AMETHYST_LAYER = registerBlock("amethyst_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.AMETHYST_BLOCK).textureMap(TextureMap.all(Blocks.AMETHYST_BLOCK)));

	public static final Block WAXED_COPPER_LAYER = registerBlock("waxed_copper_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.COPPER_BLOCK, Blocks.WAXED_COPPER_BLOCK).textureMap(TextureMap.all(Blocks.COPPER_BLOCK)));
	public static final Block WAXED_CHISELED_COPPER_LAYER = registerBlock("waxed_chiseled_copper_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CHISELED_COPPER, Blocks.WAXED_CHISELED_COPPER).textureMap(TextureMap.all(Blocks.CHISELED_COPPER)));
	public static final Block WAXED_COPPER_GRATE_LAYER = registerBlock("waxed_copper_grate_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.COPPER_GRATE, Blocks.WAXED_COPPER_GRATE).textureMap(TextureMap.all(Blocks.COPPER_GRATE)),
			new RegistryArgs().transparent());
	public static final Block WAXED_CUT_COPPER_LAYER = registerBlock("waxed_cut_copper_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CUT_COPPER, Blocks.WAXED_CUT_COPPER).textureMap(TextureMap.all(Blocks.CUT_COPPER)));

	public static final Block WAXED_EXPOSED_COPPER_LAYER = registerBlock("waxed_exposed_copper_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.EXPOSED_COPPER, Blocks.WAXED_EXPOSED_COPPER).textureMap(TextureMap.all(Blocks.EXPOSED_COPPER)));
	public static final Block WAXED_EXPOSED_CHISELED_COPPER_LAYER = registerBlock("waxed_exposed_chiseled_copper_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.EXPOSED_CHISELED_COPPER, Blocks.WAXED_EXPOSED_CHISELED_COPPER).textureMap(TextureMap.all(Blocks.EXPOSED_CHISELED_COPPER)));
	public static final Block WAXED_EXPOSED_COPPER_GRATE_LAYER = registerBlock("waxed_exposed_copper_grate_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.EXPOSED_COPPER_GRATE, Blocks.WAXED_EXPOSED_COPPER_GRATE).textureMap(TextureMap.all(Blocks.EXPOSED_COPPER_GRATE)),
			new RegistryArgs().transparent());
	public static final Block WAXED_EXPOSED_CUT_COPPER_LAYER = registerBlock("waxed_exposed_cut_copper_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.EXPOSED_CUT_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER).textureMap(TextureMap.all(Blocks.EXPOSED_CUT_COPPER)));

	public static final Block WAXED_WEATHERED_COPPER_LAYER = registerBlock("waxed_weathered_copper_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.WEATHERED_COPPER, Blocks.WAXED_WEATHERED_COPPER).textureMap(TextureMap.all(Blocks.WEATHERED_COPPER)));
	public static final Block WAXED_WEATHERED_CHISELED_COPPER_LAYER = registerBlock("waxed_weathered_chiseled_copper_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.WEATHERED_CHISELED_COPPER, Blocks.WAXED_WEATHERED_CHISELED_COPPER).textureMap(TextureMap.all(Blocks.WEATHERED_CHISELED_COPPER)));
	public static final Block WAXED_WEATHERED_COPPER_GRATE_LAYER = registerBlock("waxed_weathered_copper_grate_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.WEATHERED_COPPER_GRATE, Blocks.WAXED_WEATHERED_COPPER_GRATE).textureMap(TextureMap.all(Blocks.WEATHERED_COPPER_GRATE)),
			new RegistryArgs().transparent());
	public static final Block WAXED_WEATHERED_CUT_COPPER_LAYER = registerBlock("waxed_weathered_cut_copper_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.WEATHERED_CUT_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER).textureMap(TextureMap.all(Blocks.WEATHERED_CUT_COPPER)));

	public static final Block WAXED_OXIDIZED_COPPER_LAYER = registerBlock("waxed_oxidized_copper_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.OXIDIZED_COPPER, Blocks.WAXED_OXIDIZED_COPPER).textureMap(TextureMap.all(Blocks.OXIDIZED_COPPER)));
	public static final Block WAXED_OXIDIZED_CHISELED_COPPER_LAYER = registerBlock("waxed_oxidized_chiseled_copper_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.OXIDIZED_CHISELED_COPPER, Blocks.WAXED_OXIDIZED_CHISELED_COPPER).textureMap(TextureMap.all(Blocks.OXIDIZED_CHISELED_COPPER)));
	public static final Block WAXED_OXIDIZED_COPPER_GRATE_LAYER = registerBlock("waxed_oxidized_copper_grate_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.OXIDIZED_COPPER_GRATE, Blocks.WAXED_OXIDIZED_COPPER_GRATE).textureMap(TextureMap.all(Blocks.OXIDIZED_COPPER_GRATE)),
			new RegistryArgs().transparent());
	public static final Block WAXED_OXIDIZED_CUT_COPPER_LAYER = registerBlock("waxed_oxidized_cut_copper_layer", LayerBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.OXIDIZED_CUT_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER).textureMap(TextureMap.all(Blocks.OXIDIZED_CUT_COPPER)));

	public static final Block EXPOSED_COPPER_LAYER = registerBlock("exposed_copper_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.EXPOSED_COPPER).textureMap(TextureMap.all(Blocks.EXPOSED_COPPER)));
	public static final Block EXPOSED_CHISELED_COPPER_LAYER = registerBlock("exposed_chiseled_copper_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.EXPOSED_CHISELED_COPPER).textureMap(TextureMap.all(Blocks.EXPOSED_CHISELED_COPPER)));
	public static final Block EXPOSED_COPPER_GRATE_LAYER = registerBlock("exposed_copper_grate_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.EXPOSED_COPPER_GRATE).textureMap(TextureMap.all(Blocks.EXPOSED_COPPER_GRATE)),
			new RegistryArgs().transparent());
	public static final Block EXPOSED_CUT_COPPER_LAYER = registerBlock("exposed_cut_copper_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.EXPOSED_CUT_COPPER).textureMap(TextureMap.all(Blocks.EXPOSED_CUT_COPPER)));

	public static final Block WEATHERED_COPPER_LAYER = registerBlock("weathered_copper_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.WEATHERED_COPPER).textureMap(TextureMap.all(Blocks.WEATHERED_COPPER)));
	public static final Block WEATHERED_CHISELED_COPPER_LAYER = registerBlock("weathered_chiseled_copper_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.WEATHERED_CHISELED_COPPER).textureMap(TextureMap.all(Blocks.WEATHERED_CHISELED_COPPER)));
	public static final Block WEATHERED_COPPER_GRATE_LAYER = registerBlock("weathered_copper_grate_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.WEATHERED_COPPER_GRATE).textureMap(TextureMap.all(Blocks.WEATHERED_COPPER_GRATE)),
			new RegistryArgs().transparent());
	public static final Block WEATHERED_CUT_COPPER_LAYER = registerBlock("weathered_cut_copper_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.WEATHERED_CUT_COPPER).textureMap(TextureMap.all(Blocks.WEATHERED_CUT_COPPER)));

	public static final Block OXIDIZED_COPPER_LAYER = registerBlock("oxidized_copper_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.OXIDIZED_COPPER).textureMap(TextureMap.all(Blocks.OXIDIZED_COPPER)));
	public static final Block OXIDIZED_CHISELED_COPPER_LAYER = registerBlock("oxidized_chiseled_copper_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.OXIDIZED_CHISELED_COPPER).textureMap(TextureMap.all(Blocks.OXIDIZED_CHISELED_COPPER)));
	public static final Block OXIDIZED_COPPER_GRATE_LAYER = registerBlock("oxidized_copper_grate_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.OXIDIZED_COPPER_GRATE).textureMap(TextureMap.all(Blocks.OXIDIZED_COPPER_GRATE)),
			new RegistryArgs().transparent());
	public static final Block OXIDIZED_CUT_COPPER_LAYER = registerBlock("oxidized_cut_copper_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.OXIDIZED_CUT_COPPER).textureMap(TextureMap.all(Blocks.OXIDIZED_CUT_COPPER)));

	public static final Block COPPER_LAYER = registerBlock("copper_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.COPPER_BLOCK).textureMap(TextureMap.all(Blocks.COPPER_BLOCK)),
			new RegistryArgs()
					.oxidizable(EXPOSED_COPPER_LAYER, WEATHERED_COPPER_LAYER, OXIDIZED_COPPER_LAYER,
							WAXED_COPPER_LAYER, WAXED_EXPOSED_COPPER_LAYER, WAXED_WEATHERED_COPPER_LAYER, WAXED_OXIDIZED_COPPER_LAYER));
	public static final Block CHISELED_COPPER_LAYER = registerBlock("chiseled_copper_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CHISELED_COPPER).textureMap(TextureMap.all(Blocks.CHISELED_COPPER)),
			new RegistryArgs()
					.oxidizable(EXPOSED_CHISELED_COPPER_LAYER, WEATHERED_CHISELED_COPPER_LAYER, OXIDIZED_CHISELED_COPPER_LAYER,
							WAXED_CHISELED_COPPER_LAYER, WAXED_EXPOSED_CHISELED_COPPER_LAYER, WAXED_WEATHERED_CHISELED_COPPER_LAYER, WAXED_OXIDIZED_CHISELED_COPPER_LAYER));
	public static final Block COPPER_GRATE_LAYER = registerBlock("copper_grate_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.COPPER_GRATE).textureMap(TextureMap.all(Blocks.COPPER_GRATE)),
			new RegistryArgs().transparent()
					.oxidizable(EXPOSED_COPPER_GRATE_LAYER, WEATHERED_COPPER_GRATE_LAYER, OXIDIZED_COPPER_GRATE_LAYER,
							WAXED_COPPER_GRATE_LAYER, WEATHERED_COPPER_GRATE_LAYER, WAXED_WEATHERED_COPPER_GRATE_LAYER, WAXED_OXIDIZED_COPPER_GRATE_LAYER));
	public static final Block CUT_COPPER_LAYER = registerBlock("cut_copper_layer", settings -> new OxidizableLayerBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CUT_COPPER),
			new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).parentBlock(Blocks.CUT_COPPER).textureMap(TextureMap.all(Blocks.CUT_COPPER)),
			new RegistryArgs()
					.oxidizable(EXPOSED_CUT_COPPER_LAYER, WEATHERED_CUT_COPPER_LAYER, OXIDIZED_CUT_COPPER_LAYER,
							WAXED_CUT_COPPER_LAYER, WAXED_EXPOSED_CUT_COPPER_LAYER, WAXED_WEATHERED_CUT_COPPER_LAYER, WAXED_OXIDIZED_CUT_COPPER_LAYER));

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
