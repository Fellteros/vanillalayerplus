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
