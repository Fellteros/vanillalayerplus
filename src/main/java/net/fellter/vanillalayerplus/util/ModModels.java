package net.fellter.vanillalayerplus.util;

import java.util.Optional;

import net.fellter.vanillalayerplus.VanillaLayerPlus;

import net.minecraft.client.data.Model;
import net.minecraft.client.data.TextureKey;
import net.minecraft.util.Identifier;

public class ModModels {
	public static final Model LAYER_2 = ModModels.block("layer_height_2", "_height_2", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
	public static final Model LAYER_4 = ModModels.block("layer_height_4", "_height_4", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
	public static final Model LAYER_6 = ModModels.block("layer_height_6", "_height_6", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
	public static final Model LAYER_8 = ModModels.block("layer_height_8", "_height_8", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
	public static final Model LAYER_10 = ModModels.block("layer_height_10", "_height_10", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
	public static final Model LAYER_12 = ModModels.block("layer_height_12", "_height_12", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
	public static final Model LAYER_14 = ModModels.block("layer_height_14", "_height_14", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);

	private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
		return new Model(Optional.of(Identifier.of(VanillaLayerPlus.MOD_ID, "blockmodels/" + parent)), Optional.of(variant), requiredTextureKeys);
	}
}
