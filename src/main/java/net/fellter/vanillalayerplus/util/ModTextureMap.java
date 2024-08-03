package net.fellter.vanillalayerplus.util;

import net.minecraft.block.Block;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;

public class ModTextureMap {

    public static TextureMap custom(Block sideBlock, Block topBlock, Block bottomBlock, String sideSuffix, String topSuffix, String bottomSuffix) {
        return new TextureMap().put(TextureKey.SIDE, TextureMap.getSubId(sideBlock, sideSuffix))
                .put(TextureKey.TOP, TextureMap.getSubId(topBlock, topSuffix))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(bottomBlock, bottomSuffix));
    }
}
