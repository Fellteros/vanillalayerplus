package net.fellter.vanillalayerplus.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.fellter.vanillalayerplus.VanillaLayerPlus;
import net.fellter.vanillalayerplus.block.LayerBlock;
import net.fellter.vanillalayerplus.registry.Args;
import net.fellter.vanillalayerplus.util.ModTags;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		Registries.BLOCK.stream().filter(VanillaLayerPlus::isNamespaced).forEach(block -> {
			Identifier identifier = Registries.BLOCK.getId(block);
			if (block instanceof LayerBlock && Args.DATAGEN_ARGS.containsKey(block)) {
				getTagBuilder(ModTags.LAYERS).add(identifier);
				List<TagKey<Block>> key = Args.DATAGEN_ARGS.get(block).blockTags;

				for (TagKey<Block> blockTagKey : key) {
					getTagBuilder(blockTagKey).add(identifier);
				}
			}
		});
	}
}
