package net.fellter.vanillalayerplus.registry;

import net.minecraft.block.Block;
import net.minecraft.client.data.TextureMap;
import net.minecraft.client.render.item.tint.TintSource;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.tag.TagKey;

import java.util.List;

public class DatagenArgs {
    public List<TagKey<Block>> blockTags;
    public Block fullBlock;
    public TextureMap textureMap;
    public ItemConvertible recipeIngredient;
    public TintSource tintSource;
    public Boolean y15 = false;

    public DatagenArgs() {
    }

    public DatagenArgs create() {
        return new DatagenArgs();
    }

    public DatagenArgs blockTags(List<TagKey<Block>> blockTags) {
        this.blockTags = blockTags;
        return this;
    }

    public DatagenArgs fullBlock(Block fullBlock) {
        this.fullBlock = fullBlock;
        return this;
    }

    public DatagenArgs recipeIngredient(ItemConvertible recipeIngredient) {
        this.recipeIngredient = recipeIngredient;
        return this;
    }

    public DatagenArgs textureMap(TextureMap textureMap) {
        this.textureMap = textureMap;
        return this;
    }

    public DatagenArgs tintSource(TintSource tintSource) {
        this.tintSource = tintSource;
        return this;
    }

    public DatagenArgs y15() {
        this.y15 = true;
        return this;
    }

}
