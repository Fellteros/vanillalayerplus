package net.fellter.vanillalayerplus.util;

import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class ModBlockStateModelGenerator {

    public static void registerLayerBlock(Block layerBlock, Block fullBlock, BlockStateModelGenerator bsmg, TextureMap textureMap, TextureMap fullBlockTextureMap) {
        Identifier id = ModModels.LAYER_2.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id2 = ModModels.LAYER_4.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id3 = ModModels.LAYER_6.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id4 = ModModels.LAYER_8.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id5 = ModModels.LAYER_10.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id6 = ModModels.LAYER_12.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id7 = ModModels.LAYER_14.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id8 = Models.CUBE_BOTTOM_TOP.upload(fullBlock, fullBlockTextureMap, bsmg.modelCollector);
        bsmg.blockStateCollector.accept(createLayerBlockState(layerBlock, id, id2, id3, id4, id5, id6, id7, id8));
        bsmg.registerParentedItemModel(layerBlock, id);
    }

    public static void registerLayerBlock(Block layerBlock, Block fullBlock, BlockStateModelGenerator bsmg, TextureMap textureMap) {
        Identifier id = ModModels.LAYER_2.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id2 = ModModels.LAYER_4.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id3 = ModModels.LAYER_6.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id4 = ModModels.LAYER_8.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id5 = ModModels.LAYER_10.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id6 = ModModels.LAYER_12.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id7 = ModModels.LAYER_14.upload(layerBlock, textureMap, bsmg.modelCollector);
        Identifier id8 = Models.CUBE_BOTTOM_TOP.upload(fullBlock, TextureMap.all(fullBlock), bsmg.modelCollector);
        bsmg.blockStateCollector.accept(createLayerBlockState(layerBlock, id, id2, id3, id4, id5, id6, id7, id8));
        bsmg.registerParentedItemModel(layerBlock, id);
    }



    public static BlockStateSupplier createLayerBlockState(Block layerBlock, Identifier h2, Identifier h4, Identifier h6, Identifier h8,
                                                           Identifier h10, Identifier h12, Identifier h14, Identifier fullBlock) {
        VariantSetting<Identifier> model = VariantSettings.MODEL;
        VariantSetting<VariantSettings.Rotation> x = VariantSettings.X;
        VariantSetting<VariantSettings.Rotation> y = VariantSettings.Y;
        VariantSettings.Rotation r90 = VariantSettings.Rotation.R90;
        VariantSettings.Rotation r180 = VariantSettings.Rotation.R180;
        VariantSettings.Rotation r270 = VariantSettings.Rotation.R270;
        return VariantsBlockStateSupplier.create(layerBlock).coordinate(BlockStateVariantMap.create(Properties.LAYERS, Properties.FACING)
                //down
                .register(1, Direction.DOWN, BlockStateVariant.create().put(model, h2))
                .register(2, Direction.DOWN, BlockStateVariant.create().put(model, h4))
                .register(3, Direction.DOWN, BlockStateVariant.create().put(model, h6))
                .register(4, Direction.DOWN, BlockStateVariant.create().put(model, h8))
                .register(5, Direction.DOWN, BlockStateVariant.create().put(model, h10))
                .register(6, Direction.DOWN, BlockStateVariant.create().put(model, h12))
                .register(7, Direction.DOWN, BlockStateVariant.create().put(model, h14))
                .register(8, Direction.DOWN, BlockStateVariant.create().put(model, fullBlock))
                //up
                .register(1, Direction.UP, BlockStateVariant.create().put(model, h2).put(x, r180))
                .register(2, Direction.UP, BlockStateVariant.create().put(model, h4).put(x, r180))
                .register(3, Direction.UP, BlockStateVariant.create().put(model, h6).put(x, r180))
                .register(4, Direction.UP, BlockStateVariant.create().put(model, h8).put(x, r180))
                .register(5, Direction.UP, BlockStateVariant.create().put(model, h10).put(x, r180))
                .register(6, Direction.UP, BlockStateVariant.create().put(model, h12).put(x, r180))
                .register(7, Direction.UP, BlockStateVariant.create().put(model, h14).put(x, r180))
                .register(8, Direction.UP, BlockStateVariant.create().put(model, fullBlock).put(x, r180))
                //north
                .register(1, Direction.NORTH, BlockStateVariant.create().put(model, h2).put(x, r270))
                .register(2, Direction.NORTH, BlockStateVariant.create().put(model, h4).put(x, r270))
                .register(3, Direction.NORTH, BlockStateVariant.create().put(model, h6).put(x, r270))
                .register(4, Direction.NORTH, BlockStateVariant.create().put(model, h8).put(x, r270))
                .register(5, Direction.NORTH, BlockStateVariant.create().put(model, h10).put(x, r270))
                .register(6, Direction.NORTH, BlockStateVariant.create().put(model, h12).put(x, r270))
                .register(7, Direction.NORTH, BlockStateVariant.create().put(model, h14).put(x, r270))
                .register(8, Direction.NORTH, BlockStateVariant.create().put(model, fullBlock).put(x, r270))
                //west
                .register(1, Direction.WEST, BlockStateVariant.create().put(model, h2).put(x, r270).put(y, r270))
                .register(2, Direction.WEST, BlockStateVariant.create().put(model, h4).put(x, r270).put(y, r270))
                .register(3, Direction.WEST, BlockStateVariant.create().put(model, h6).put(x, r270).put(y, r270))
                .register(4, Direction.WEST, BlockStateVariant.create().put(model, h8).put(x, r270).put(y, r270))
                .register(5, Direction.WEST, BlockStateVariant.create().put(model, h10).put(x, r270).put(y, r270))
                .register(6, Direction.WEST, BlockStateVariant.create().put(model, h12).put(x, r270).put(y, r270))
                .register(7, Direction.WEST, BlockStateVariant.create().put(model, h14).put(x, r270).put(y, r270))
                .register(8, Direction.WEST, BlockStateVariant.create().put(model, fullBlock).put(x, r270).put(y, r270))
                //south
                .register(1, Direction.SOUTH, BlockStateVariant.create().put(model, h2).put(x, r90))
                .register(2, Direction.SOUTH, BlockStateVariant.create().put(model, h4).put(x, r90))
                .register(3, Direction.SOUTH, BlockStateVariant.create().put(model, h6).put(x, r90))
                .register(4, Direction.SOUTH, BlockStateVariant.create().put(model, h8).put(x, r90))
                .register(5, Direction.SOUTH, BlockStateVariant.create().put(model, h10).put(x, r90))
                .register(6, Direction.SOUTH, BlockStateVariant.create().put(model, h12).put(x, r90))
                .register(7, Direction.SOUTH, BlockStateVariant.create().put(model, h14).put(x, r90))
                .register(8, Direction.SOUTH, BlockStateVariant.create().put(model, fullBlock).put(x, r90))
                //east
                .register(1, Direction.EAST, BlockStateVariant.create().put(model, h2).put(x, r270).put(y, r90))
                .register(2, Direction.EAST, BlockStateVariant.create().put(model, h4).put(x, r270).put(y, r90))
                .register(3, Direction.EAST, BlockStateVariant.create().put(model, h6).put(x, r270).put(y, r90))
                .register(4, Direction.EAST, BlockStateVariant.create().put(model, h8).put(x, r270).put(y, r90))
                .register(5, Direction.EAST, BlockStateVariant.create().put(model, h10).put(x, r270).put(y, r90))
                .register(6, Direction.EAST, BlockStateVariant.create().put(model, h12).put(x, r270).put(y, r90))
                .register(7, Direction.EAST, BlockStateVariant.create().put(model, h14).put(x, r270).put(y, r90))
                .register(8, Direction.EAST, BlockStateVariant.create().put(model, fullBlock).put(x, r270).put(y, r90)));
    }
}
