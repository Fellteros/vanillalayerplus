package net.fellter.vanillalayerplus.util;

import net.fellter.vanillalayerplus.VanillaLayerPlus;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModels {
    public static final Model LAYER_2 = ModModels.block("layer_height2", "_height2", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model LAYER_4 = ModModels.block("layer_height4", "_height4", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model LAYER_6 = ModModels.block("layer_height6", "_height6", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model LAYER_8 = ModModels.block("layer_height8", "_height8", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model LAYER_10 = ModModels.block("layer_height10", "_height10", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model LAYER_12 = ModModels.block("layer_height12", "_height12", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model LAYER_14 = ModModels.block("layer_height14", "_height14", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);



    private static Model block(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(VanillaLayerPlus.MOD_ID, "blockmodels/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, String variant, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(VanillaLayerPlus.MOD_ID, "blockmodels/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}
