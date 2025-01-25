package net.fellter.vanillalayerplus.registry;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.data.TextureMap;
import net.minecraft.client.render.item.tint.TintSource;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.tag.TagKey;

public class DatagenArgs {
	public List<TagKey<Block>> blockTags;
	public Block parentBlock;
	public TextureMap textureMap;
	public ItemConvertible recipeIngredient;
	public TintSource tintSource;
	public Boolean y15 = false;

	public DatagenArgs() {
	}

	public DatagenArgs create() {
		return new DatagenArgs();
	}

	@SafeVarargs
	public final DatagenArgs blockTags(TagKey<Block>... blockTags) {
		this.blockTags = List.of(blockTags);
		return this;
	}

	public DatagenArgs parentBlock(Block fullBlock) {
		this.parentBlock = fullBlock;
		this.recipeIngredient = fullBlock;
		return this;
	}

	public DatagenArgs parentBlock(Block fullBlock, ItemConvertible recipeIngredient) {
		this.parentBlock = fullBlock;
		this.recipeIngredient = recipeIngredient;
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
