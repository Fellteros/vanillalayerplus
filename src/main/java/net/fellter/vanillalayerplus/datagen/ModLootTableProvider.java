package net.fellter.vanillalayerplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fellter.vanillalayerplus.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.state.property.Properties;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.OAK_LAYER, layerDrops(ModBlocks.OAK_LAYER));
        addDrop(ModBlocks.OAK_LOG_LAYER, layerDrops(ModBlocks.OAK_LOG_LAYER));
        addDrop(ModBlocks.OAK_WOOD_LAYER, layerDrops(ModBlocks.OAK_WOOD_LAYER));
        addDrop(ModBlocks.STR_OAK_LOG_LAYER, layerDrops(ModBlocks.STR_OAK_LOG_LAYER));
        addDrop(ModBlocks.STR_OAK_WOOD_LAYER, layerDrops(ModBlocks.STR_OAK_WOOD_LAYER));

        addDrop(ModBlocks.SPRUCE_LAYER, layerDrops(ModBlocks.SPRUCE_LAYER));
        addDrop(ModBlocks.SPRUCE_LOG_LAYER, layerDrops(ModBlocks.SPRUCE_LOG_LAYER));
        addDrop(ModBlocks.SPRUCE_WOOD_LAYER, layerDrops(ModBlocks.SPRUCE_WOOD_LAYER));
        addDrop(ModBlocks.STR_SPRUCE_LOG_LAYER, layerDrops(ModBlocks.STR_SPRUCE_LOG_LAYER));
        addDrop(ModBlocks.STR_SPRUCE_WOOD_LAYER, layerDrops(ModBlocks.STR_SPRUCE_WOOD_LAYER));

        addDrop(ModBlocks.BIRCH_LAYER, layerDrops(ModBlocks.BIRCH_LAYER));
        addDrop(ModBlocks.BIRCH_LOG_LAYER, layerDrops(ModBlocks.BIRCH_LOG_LAYER));
        addDrop(ModBlocks.BIRCH_WOOD_LAYER, layerDrops(ModBlocks.BIRCH_WOOD_LAYER));
        addDrop(ModBlocks.STR_BIRCH_LOG_LAYER, layerDrops(ModBlocks.STR_BIRCH_LOG_LAYER));
        addDrop(ModBlocks.STR_BIRCH_WOOD_LAYER, layerDrops(ModBlocks.STR_BIRCH_WOOD_LAYER));

        addDrop(ModBlocks.JUNGLE_LAYER, layerDrops(ModBlocks.JUNGLE_LAYER));
        addDrop(ModBlocks.JUNGLE_LOG_LAYER, layerDrops(ModBlocks.JUNGLE_LOG_LAYER));
        addDrop(ModBlocks.JUNGLE_WOOD_LAYER, layerDrops(ModBlocks.JUNGLE_WOOD_LAYER));
        addDrop(ModBlocks.STR_JUNGLE_LOG_LAYER, layerDrops(ModBlocks.STR_JUNGLE_LOG_LAYER));
        addDrop(ModBlocks.STR_JUNGLE_WOOD_LAYER, layerDrops(ModBlocks.STR_JUNGLE_WOOD_LAYER));

        addDrop(ModBlocks.ACACIA_LAYER, layerDrops(ModBlocks.ACACIA_LAYER));
        addDrop(ModBlocks.ACACIA_LOG_LAYER, layerDrops(ModBlocks.ACACIA_LOG_LAYER));
        addDrop(ModBlocks.ACACIA_WOOD_LAYER, layerDrops(ModBlocks.ACACIA_WOOD_LAYER));
        addDrop(ModBlocks.STR_ACACIA_LOG_LAYER, layerDrops(ModBlocks.STR_ACACIA_LOG_LAYER));
        addDrop(ModBlocks.STR_ACACIA_WOOD_LAYER, layerDrops(ModBlocks.STR_ACACIA_WOOD_LAYER));

        addDrop(ModBlocks.DARK_OAK_LAYER, layerDrops(ModBlocks.DARK_OAK_LAYER));
        addDrop(ModBlocks.DARK_OAK_LOG_LAYER, layerDrops(ModBlocks.DARK_OAK_LOG_LAYER));
        addDrop(ModBlocks.DARK_OAK_WOOD_LAYER, layerDrops(ModBlocks.DARK_OAK_WOOD_LAYER));
        addDrop(ModBlocks.STR_DARK_OAK_LOG_LAYER, layerDrops(ModBlocks.STR_DARK_OAK_LOG_LAYER));
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_LAYER, layerDrops(ModBlocks.STR_DARK_OAK_WOOD_LAYER));

        addDrop(ModBlocks.MANGROVE_LAYER, layerDrops(ModBlocks.MANGROVE_LAYER));
        addDrop(ModBlocks.MANGROVE_LOG_LAYER, layerDrops(ModBlocks.MANGROVE_LOG_LAYER));
        addDrop(ModBlocks.MANGROVE_WOOD_LAYER, layerDrops(ModBlocks.MANGROVE_WOOD_LAYER));
        addDrop(ModBlocks.STR_MANGROVE_LOG_LAYER, layerDrops(ModBlocks.STR_MANGROVE_LOG_LAYER));
        addDrop(ModBlocks.STR_MANGROVE_WOOD_LAYER, layerDrops(ModBlocks.STR_MANGROVE_WOOD_LAYER));

        addDrop(ModBlocks.CHERRY_LAYER, layerDrops(ModBlocks.CHERRY_LAYER));
        addDrop(ModBlocks.CHERRY_LOG_LAYER, layerDrops(ModBlocks.CHERRY_LOG_LAYER));
        addDrop(ModBlocks.CHERRY_WOOD_LAYER, layerDrops(ModBlocks.CHERRY_WOOD_LAYER));
        addDrop(ModBlocks.STR_CHERRY_LOG_LAYER, layerDrops(ModBlocks.STR_CHERRY_LOG_LAYER));
        addDrop(ModBlocks.STR_CHERRY_WOOD_LAYER, layerDrops(ModBlocks.STR_CHERRY_WOOD_LAYER));

        addDrop(ModBlocks.BAMBOO_LAYER, layerDrops(ModBlocks.BAMBOO_LAYER));
        addDrop(ModBlocks.BAMBOO_MOSAIC_LAYER, layerDrops(ModBlocks.BAMBOO_MOSAIC_LAYER));
        addDrop(ModBlocks.BAMBOO_BLOCK_LAYER, layerDrops(ModBlocks.BAMBOO_BLOCK_LAYER));
        addDrop(ModBlocks.STR_BAMBOO_BLOCK_LAYER, layerDrops(ModBlocks.STR_BAMBOO_BLOCK_LAYER));
    }


    public LootTable.Builder layerDrops(Block drop) {
        return LootTable.builder().pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                .with(this.applyExplosionDecay(drop, ItemEntry.builder(drop)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F))
                                .conditionally(BlockStatePropertyLootCondition.builder(drop)
                                        .properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(Properties.LAYERS, 1))))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0F))
                                .conditionally(BlockStatePropertyLootCondition.builder(drop)
                                        .properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(Properties.LAYERS, 2))))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(3.0F))
                                .conditionally(BlockStatePropertyLootCondition.builder(drop)
                                        .properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(Properties.LAYERS, 3))))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(4.0F))
                                .conditionally(BlockStatePropertyLootCondition.builder(drop)
                                        .properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(Properties.LAYERS, 4))))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(5.0F))
                                .conditionally(BlockStatePropertyLootCondition.builder(drop)
                                        .properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(Properties.LAYERS, 5))))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(6.0F))
                                .conditionally(BlockStatePropertyLootCondition.builder(drop)
                                        .properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(Properties.LAYERS, 6))))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(7.0F))
                                .conditionally(BlockStatePropertyLootCondition.builder(drop)
                                        .properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(Properties.LAYERS, 7))))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(8.0F))
                                .conditionally(BlockStatePropertyLootCondition.builder(drop)
                                        .properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(Properties.LAYERS, 8)))))));
    }


}
