package net.fellter.vanillalayerplus.item;

import net.fellter.vanillalayerplus.VanillaLayerPlus;
import net.fellter.vanillalayerplus.block.ModBlocks;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class ModItemGroups {
	public static final ItemGroup VLP_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(VanillaLayerPlus.MOD_ID, "vlp"),
			FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vanillalayerplus"))
					.icon(() -> new ItemStack(ModItems.VLP_TITLE)).entries((displayContext, entries) -> {
						entries.add(ModBlocks.OAK_LAYER);
						entries.add(ModBlocks.OAK_LOG_LAYER);
						entries.add(ModBlocks.OAK_WOOD_LAYER);
						entries.add(ModBlocks.STRIPPED_OAK_LOG_LAYER);
						entries.add(ModBlocks.STRIPPED_OAK_WOOD_LAYER);

						entries.add(ModBlocks.SPRUCE_LAYER);
						entries.add(ModBlocks.SPRUCE_LOG_LAYER);
						entries.add(ModBlocks.SPRUCE_WOOD_LAYER);
						entries.add(ModBlocks.STRIPPED_SPRUCE_LOG_LAYER);
						entries.add(ModBlocks.STRIPPED_SPRUCE_WOOD_LAYER);

						entries.add(ModBlocks.BIRCH_LAYER);
						entries.add(ModBlocks.BIRCH_LOG_LAYER);
						entries.add(ModBlocks.BIRCH_WOOD_LAYER);
						entries.add(ModBlocks.STRIPPED_BIRCH_LOG_LAYER);
						entries.add(ModBlocks.STRIPPED_BIRCH_WOOD_LAYER);

						entries.add(ModBlocks.JUNGLE_LAYER);
						entries.add(ModBlocks.JUNGLE_LOG_LAYER);
						entries.add(ModBlocks.JUNGLE_WOOD_LAYER);
						entries.add(ModBlocks.STRIPPED_JUNGLE_LOG_LAYER);
						entries.add(ModBlocks.STRIPPED_JUNGLE_WOOD_LAYER);

						entries.add(ModBlocks.ACACIA_LAYER);
						entries.add(ModBlocks.ACACIA_LOG_LAYER);
						entries.add(ModBlocks.ACACIA_WOOD_LAYER);
						entries.add(ModBlocks.STRIPPED_ACACIA_LOG_LAYER);
						entries.add(ModBlocks.STRIPPED_ACACIA_WOOD_LAYER);

						entries.add(ModBlocks.DARK_OAK_LAYER);
						entries.add(ModBlocks.DARK_OAK_LOG_LAYER);
						entries.add(ModBlocks.DARK_OAK_WOOD_LAYER);
						entries.add(ModBlocks.STRIPPED_DARK_OAK_LOG_LAYER);
						entries.add(ModBlocks.STRIPPED_DARK_OAK_WOOD_LAYER);

						entries.add(ModBlocks.MANGROVE_LAYER);
						entries.add(ModBlocks.MANGROVE_LOG_LAYER);
						entries.add(ModBlocks.MANGROVE_WOOD_LAYER);
						entries.add(ModBlocks.STRIPPED_MANGROVE_LOG_LAYER);
						entries.add(ModBlocks.STRIPPED_MANGROVE_WOOD_LAYER);

						entries.add(ModBlocks.CHERRY_LAYER);
						entries.add(ModBlocks.CHERRY_LOG_LAYER);
						entries.add(ModBlocks.CHERRY_WOOD_LAYER);
						entries.add(ModBlocks.STRIPPED_CHERRY_LOG_LAYER);
						entries.add(ModBlocks.STRIPPED_CHERRY_WOOD_LAYER);

						entries.add(ModBlocks.PALE_OAK_LAYER);
						entries.add(ModBlocks.PALE_OAK_LOG_LAYER);
						entries.add(ModBlocks.PALE_OAK_WOOD_LAYER);
						entries.add(ModBlocks.STRIPPED_PALE_OAK_LOG_LAYER);
						entries.add(ModBlocks.STRIPPED_PALE_OAK_WOOD_LAYER);

						entries.add(ModBlocks.BAMBOO_LAYER);
						entries.add(ModBlocks.BAMBOO_MOSAIC_LAYER);
						entries.add(ModBlocks.BAMBOO_BLOCK_LAYER);
						entries.add(ModBlocks.STRIPPED_BAMBOO_BLOCK_LAYER);

						entries.add(ModBlocks.CRIMSON_LAYER);
						entries.add(ModBlocks.CRIMSON_STEM_LAYER);
						entries.add(ModBlocks.CRIMSON_HYPHAE_LAYER);
						entries.add(ModBlocks.STRIPPED_CRIMSON_STEM_LAYER);
						entries.add(ModBlocks.STRIPPED_CRIMSON_HYPHAE_LAYER);

						entries.add(ModBlocks.WARPED_LAYER);
						entries.add(ModBlocks.WARPED_STEM_LAYER);
						entries.add(ModBlocks.WARPED_HYPHAE_LAYER);
						entries.add(ModBlocks.STRIPPED_WARPED_STEM_LAYER);
						entries.add(ModBlocks.STRIPPED_WARPED_HYPHAE_LAYER);

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

						entries.add(ModBlocks.BRICKS_LAYER);
						entries.add(ModBlocks.PACKED_MUD_LAYER);
						entries.add(ModBlocks.MUD_BRICKS_LAYER);
						entries.add(ModBlocks.RESIN_BRICKS_LAYER);
						entries.add(ModBlocks.CHISELED_RESIN_BRICKS_LAYER);

						entries.add(ModBlocks.SANDSTONE_LAYER);
						entries.add(ModBlocks.CHISELED_SANDSTONE_LAYER);
						entries.add(ModBlocks.SMOOTH_SANDSTONE_LAYER);
						entries.add(ModBlocks.CUT_SANDSTONE_LAYER);

						entries.add(ModBlocks.RED_SANDSTONE_LAYER);
						entries.add(ModBlocks.CHISELED_RED_SANDSTONE_LAYER);
						entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_LAYER);
						entries.add(ModBlocks.CUT_RED_SANDSTONE_LAYER);

						entries.add(ModBlocks.SEA_LANTERN_LAYER);
						entries.add(ModBlocks.PRISMARINE_LAYER);
						entries.add(ModBlocks.PRISMARINE_BRICKS_LAYER);
						entries.add(ModBlocks.DARK_PRISMARINE_LAYER);

						entries.add(ModBlocks.NETHERRACK_LAYER);
						entries.add(ModBlocks.NETHER_BRICKS_LAYER);
						entries.add(ModBlocks.CRACKED_NETHER_BRICKS_LAYER);
						entries.add(ModBlocks.CHISELED_NETHER_BRICKS_LAYER);
						entries.add(ModBlocks.RED_NETHER_BRICKS_LAYER);

						entries.add(ModBlocks.BASALT_LAYER);
						entries.add(ModBlocks.SMOOTH_BASALT_LAYER);
						entries.add(ModBlocks.POLISHED_BASALT_LAYER);

						entries.add(ModBlocks.BLACKSTONE_LAYER);
						entries.add(ModBlocks.GILDED_BLACKSTONE_LAYER);
						entries.add(ModBlocks.CHISELED_POLISHED_BLACKSTONE_LAYER);
						entries.add(ModBlocks.POLISHED_BLACKSTONE_LAYER);
						entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_LAYER);
						entries.add(ModBlocks.POLISHED_BLACKSTONE_BRICKS_LAYER);

						entries.add(ModBlocks.END_STONE_LAYER);
						entries.add(ModBlocks.END_STONE_BRICKS_LAYER);
						entries.add(ModBlocks.PURPUR_LAYER);
						entries.add(ModBlocks.PURPUR_PILLAR_LAYER);

						entries.add(ModBlocks.COAL_LAYER);
						entries.add(ModBlocks.IRON_LAYER);
						entries.add(ModBlocks.GOLD_LAYER);
						entries.add(ModBlocks.REDSTONE_LAYER);
						entries.add(ModBlocks.EMERALD_LAYER);
						entries.add(ModBlocks.LAPIS_LAYER);
						entries.add(ModBlocks.DIAMOND_LAYER);
						entries.add(ModBlocks.NETHERITE_LAYER);

						entries.add(ModBlocks.QUARTZ_LAYER);
						entries.add(ModBlocks.CHISELED_QUARTZ_LAYER);
						entries.add(ModBlocks.QUARTZ_BRICKS_LAYER);
						entries.add(ModBlocks.QUARTZ_PILLAR_LAYER);
						entries.add(ModBlocks.SMOOTH_QUARTZ_LAYER);

						entries.add(ModBlocks.AMETHYST_LAYER);

						entries.add(ModBlocks.COPPER_LAYER);
						entries.add(ModBlocks.CHISELED_COPPER_LAYER);
						entries.add(ModBlocks.COPPER_GRATE_LAYER);
						entries.add(ModBlocks.CUT_COPPER_LAYER);

						entries.add(ModBlocks.EXPOSED_COPPER_LAYER);
						entries.add(ModBlocks.EXPOSED_CHISELED_COPPER_LAYER);
						entries.add(ModBlocks.EXPOSED_COPPER_GRATE_LAYER);
						entries.add(ModBlocks.EXPOSED_CUT_COPPER_LAYER);

						entries.add(ModBlocks.WEATHERED_COPPER_LAYER);
						entries.add(ModBlocks.WEATHERED_CHISELED_COPPER_LAYER);
						entries.add(ModBlocks.WEATHERED_COPPER_GRATE_LAYER);
						entries.add(ModBlocks.WEATHERED_CUT_COPPER_LAYER);

						entries.add(ModBlocks.OXIDIZED_COPPER_LAYER);
						entries.add(ModBlocks.OXIDIZED_CHISELED_COPPER_LAYER);
						entries.add(ModBlocks.OXIDIZED_COPPER_GRATE_LAYER);
						entries.add(ModBlocks.OXIDIZED_CUT_COPPER_LAYER);

						entries.add(ModBlocks.WAXED_COPPER_LAYER);
						entries.add(ModBlocks.WAXED_CHISELED_COPPER_LAYER);
						entries.add(ModBlocks.WAXED_COPPER_GRATE_LAYER);
						entries.add(ModBlocks.WAXED_CUT_COPPER_LAYER);

						entries.add(ModBlocks.WAXED_EXPOSED_COPPER_LAYER);
						entries.add(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_LAYER);
						entries.add(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_LAYER);
						entries.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_LAYER);

						entries.add(ModBlocks.WAXED_WEATHERED_COPPER_LAYER);
						entries.add(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_LAYER);
						entries.add(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_LAYER);
						entries.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_LAYER);

						entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_LAYER);
						entries.add(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_LAYER);
						entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_LAYER);
						entries.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_LAYER);
					}).build());
	public static void registerItemGroups() {
	}
}
