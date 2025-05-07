package net.fellter.vanillalayerplus.util;

import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.client.render.item.tint.TintSource;
import net.minecraft.client.render.model.json.ModelVariantOperator;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.AxisRotation;
import net.minecraft.util.math.Direction;

public class ModBlockStateModelGenerator {
	public static WeightedVariant varOf(Identifier id) {
		return BlockStateModelGenerator.createWeightedVariant(id);
	}

	public static void registerLayerBlock(Block layerBlock, Block fullBlock, BlockStateModelGenerator bsmg, TextureMap textureMap, TintSource tintSource) {
		Identifier id = ModModels.LAYER_2.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id2 = ModModels.LAYER_4.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id3 = ModModels.LAYER_6.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id4 = ModModels.LAYER_8.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id5 = ModModels.LAYER_10.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id6 = ModModels.LAYER_12.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id7 = ModModels.LAYER_14.upload(layerBlock, textureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(createLayerBlockState(layerBlock, varOf(id), varOf(id2), varOf(id3), varOf(id4), varOf(id5), varOf(id6), varOf(id7), varOf(ModelIds.getBlockModelId(fullBlock))));
		bsmg.registerTintedItemModel(layerBlock, id, tintSource);
	}

	public static void registerLayerBlockY15(Block layerBlock, Block fullBlock, BlockStateModelGenerator bsmg, TextureMap textureMap, TintSource tintSource) {
		Identifier id = ModModels.LAYER_1.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id2 = ModModels.LAYER_3.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id3 = ModModels.LAYER_5.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id4 = ModModels.LAYER_7.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id5 = ModModels.LAYER_9.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id6 = ModModels.LAYER_11.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id7 = ModModels.LAYER_13.upload(layerBlock, textureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(createLayerBlockState(layerBlock, varOf(id), varOf(id2), varOf(id3), varOf(id4), varOf(id5), varOf(id6), varOf(id7), varOf(ModelIds.getBlockModelId(fullBlock))));
		bsmg.registerTintedItemModel(layerBlock, id, tintSource);
	}

	public static void registerLayerBlock(Block layerBlock, Block fullBlock, BlockStateModelGenerator bsmg, TextureMap textureMap) {
		Identifier id = ModModels.LAYER_2.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id2 = ModModels.LAYER_4.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id3 = ModModels.LAYER_6.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id4 = ModModels.LAYER_8.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id5 = ModModels.LAYER_10.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id6 = ModModels.LAYER_12.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id7 = ModModels.LAYER_14.upload(layerBlock, textureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(createLayerBlockState(layerBlock, varOf(id), varOf(id2), varOf(id3), varOf(id4), varOf(id5), varOf(id6), varOf(id7), varOf(ModelIds.getBlockModelId(fullBlock))));
		bsmg.registerParentedItemModel(layerBlock, id);
	}

	public static void registerLayerBlock(Block layerBlock, Identifier fullBlock, BlockStateModelGenerator bsmg, TextureMap textureMap) {
		Identifier id = ModModels.LAYER_2.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id2 = ModModels.LAYER_4.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id3 = ModModels.LAYER_6.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id4 = ModModels.LAYER_8.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id5 = ModModels.LAYER_10.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id6 = ModModels.LAYER_12.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id7 = ModModels.LAYER_14.upload(layerBlock, textureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(createLayerBlockState(layerBlock, varOf(id), varOf(id2), varOf(id3), varOf(id4), varOf(id5), varOf(id6), varOf(id7), varOf(fullBlock)));
		bsmg.registerParentedItemModel(layerBlock, id);
	}

	public static void registerLayerBlockY15(Block layerBlock, Block fullBlock, BlockStateModelGenerator bsmg, TextureMap textureMap) {
		Identifier id = ModModels.LAYER_1.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id2 = ModModels.LAYER_3.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id3 = ModModels.LAYER_5.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id4 = ModModels.LAYER_7.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id5 = ModModels.LAYER_9.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id6 = ModModels.LAYER_11.upload(layerBlock, textureMap, bsmg.modelCollector);
		Identifier id7 = ModModels.LAYER_13.upload(layerBlock, textureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(createLayerBlockState(layerBlock, varOf(id), varOf(id2), varOf(id3), varOf(id4), varOf(id5), varOf(id6), varOf(id7), varOf(ModelIds.getBlockModelId(fullBlock))));
		bsmg.registerParentedItemModel(layerBlock, id);
	}

	public static BlockModelDefinitionCreator createLayerBlockState(Block layerBlock, WeightedVariant h2, WeightedVariant h4, WeightedVariant h6, WeightedVariant h8, WeightedVariant h10, WeightedVariant h12, WeightedVariant h14, WeightedVariant fullBlock) {
		ModelVariantOperator x90 = ModelVariantOperator.ROTATION_X.withValue(AxisRotation.R90);
		ModelVariantOperator x180 = ModelVariantOperator.ROTATION_X.withValue(AxisRotation.R180);
		ModelVariantOperator x270 = ModelVariantOperator.ROTATION_X.withValue(AxisRotation.R270);
		ModelVariantOperator y90 = ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R90);
		ModelVariantOperator y270 = ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R270);
		return VariantsBlockModelDefinitionCreator.of(layerBlock).with(BlockStateVariantMap.models(Properties.LAYERS, Properties.FACING)
				//down
				.register(1, Direction.DOWN, h2)
				.register(2, Direction.DOWN, h4)
				.register(3, Direction.DOWN, h6)
				.register(4, Direction.DOWN, h8)
				.register(5, Direction.DOWN, h10)
				.register(6, Direction.DOWN, h12)
				.register(7, Direction.DOWN, h14)
				.register(8, Direction.DOWN, fullBlock)
				//up
				.register(1, Direction.UP, h2.apply(x180))
				.register(2, Direction.UP, h4.apply(x180))
				.register(3, Direction.UP, h6.apply(x180))
				.register(4, Direction.UP, h8.apply(x180))
				.register(5, Direction.UP, h10.apply(x180))
				.register(6, Direction.UP, h12.apply(x180))
				.register(7, Direction.UP, h14.apply(x180))
				.register(8, Direction.UP, fullBlock.apply(x180))
				//north
				.register(1, Direction.NORTH, h2.apply(x270))
				.register(2, Direction.NORTH, h4.apply(x270))
				.register(3, Direction.NORTH, h6.apply(x270))
				.register(4, Direction.NORTH, h8.apply(x270))
				.register(5, Direction.NORTH, h10.apply(x270))
				.register(6, Direction.NORTH, h12.apply(x270))
				.register(7, Direction.NORTH, h14.apply(x270))
				.register(8, Direction.NORTH, fullBlock.apply(x270))
				//west
				.register(1, Direction.WEST, h2.apply(x270).apply(y270))
				.register(2, Direction.WEST, h4.apply(x270).apply(y270))
				.register(3, Direction.WEST, h6.apply(x270).apply(y270))
				.register(4, Direction.WEST, h8.apply(x270).apply(y270))
				.register(5, Direction.WEST, h10.apply(x270).apply(y270))
				.register(6, Direction.WEST, h12.apply(x270).apply(y270))
				.register(7, Direction.WEST, h14.apply(x270).apply(y270))
				.register(8, Direction.WEST, fullBlock.apply(x270).apply(y270))
				//south
				.register(1, Direction.SOUTH, h2.apply(x90))
				.register(2, Direction.SOUTH, h4.apply(x90))
				.register(3, Direction.SOUTH, h6.apply(x90))
				.register(4, Direction.SOUTH, h8.apply(x90))
				.register(5, Direction.SOUTH, h10.apply(x90))
				.register(6, Direction.SOUTH, h12.apply(x90))
				.register(7, Direction.SOUTH, h14.apply(x90))
				.register(8, Direction.SOUTH, fullBlock.apply(x90))
				//east
				.register(1, Direction.EAST, h2.apply(x270).apply(y90))
				.register(2, Direction.EAST, h4.apply(x270).apply(y90))
				.register(3, Direction.EAST, h6.apply(x270).apply(y90))
				.register(4, Direction.EAST, h8.apply(x270).apply(y90))
				.register(5, Direction.EAST, h10.apply(x270).apply(y90))
				.register(6, Direction.EAST, h12.apply(x270).apply(y90))
				.register(7, Direction.EAST, h14.apply(x270).apply(y90))
				.register(8, Direction.EAST, fullBlock.apply(x270).apply(y90)));
	}
}
