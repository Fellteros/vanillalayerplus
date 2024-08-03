package net.fellter.vanillalayerplus.util;

import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

public class ModBlockStateModelGenerator {

    public static void registerLayerBlock(BlockStateModelGenerator bsmg, TextureMap textureMap, Block layerBlock, Block fullBlock) {
        Identifier id = ModModels.LAYER_2.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id2 = ModModels.LAYER_4.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id3 = ModModels.LAYER_6.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id4 = ModModels.LAYER_8.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id5 = ModModels.LAYER_10.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id6 = ModModels.LAYER_12.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id7 = ModModels.LAYER_14.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id8 = Models.CUBE_ALL.upload(fullBlock, TextureMap.all(fullBlock), bsmg.modelCollector);
        bsmg.blockStateCollector.accept(createLayerBlockState(layerBlock, id, id2, id3, id4, id5, id6, id7, id8));
        bsmg.registerParentedItemModel(layerBlock, id);
    }


    public static VariantsBlockStateSupplier createSingletonBlockState(Block block, Identifier modelId) {
        return VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, modelId));
    }

    public static BlockStateSupplier createLayerBlockState(Block layerBlock, Identifier h2, Identifier h4, Identifier h6, Identifier h8,
                                                           Identifier h10, Identifier h12, Identifier h14, Identifier fullBlock) {
        VariantSetting<Identifier> var = VariantSettings.MODEL;
        return VariantsBlockStateSupplier.create(layerBlock).coordinate(BlockStateVariantMap.create(Properties.LAYERS)
                .register(1, BlockStateVariant.create().put(var, h2))
                .register(2, BlockStateVariant.create().put(var, h4))
                .register(3, BlockStateVariant.create().put(var, h6))
                .register(4, BlockStateVariant.create().put(var, h8))
                .register(5, BlockStateVariant.create().put(var, h10))
                .register(6, BlockStateVariant.create().put(var, h12))
                .register(7, BlockStateVariant.create().put(var, h14))
                .register(8, BlockStateVariant.create().put(var, fullBlock)));
    }
}
