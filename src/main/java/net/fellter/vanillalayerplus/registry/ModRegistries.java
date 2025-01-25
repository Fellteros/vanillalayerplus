package net.fellter.vanillalayerplus.registry;

import java.util.Map;

import net.fellter.vanillalayerplus.VanillaLayerPlus;
import net.fellter.vanillalayerplus.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.registry.Registries;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.impl.content.registry.util.ImmutableCollectionUtils;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;

public class ModRegistries {
	public static void register(Block input, Block stripped) {
		Block old = getRegistry().put(input, stripped);

		if (old != null) {
			VanillaLayerPlus.LOGGER.debug("Replaced old stripping mapping from {} to {} with {}", input, old, stripped);
		}
	}

	@SuppressWarnings("unstable")
	private static Map<Block, Block> getRegistry() {
		return ImmutableCollectionUtils.getAsMutableMap(AxeItemAccessor::getStrippedBlocks, AxeItemAccessor::setStrippedBlocks);
	}

	public static void registerStrippableBlocks() {
		Registries.BLOCK.forEach(block -> {
			if (ModBlocks.REGISTRY_ARGS.containsKey(block)) {
				RegistryArgs registryArgs = ModBlocks.REGISTRY_ARGS.get(block);

				if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaLayerPlus.MOD_ID) && registryArgs.stripped != null) {
					register(block, registryArgs.stripped);
				}
			}
		});
	}

	public static void registerTransparentBlocks() {
		Registries.BLOCK.forEach(block -> {
			if (ModBlocks.REGISTRY_ARGS.containsKey(block)) {
				RegistryArgs registryArgs = ModBlocks.REGISTRY_ARGS.get(block);

				if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaLayerPlus.MOD_ID) && registryArgs.transparent != null) {
					BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), block);
				}
			}
		});
	}

	public static void registerOxidizableBlocks() {
		Registries.BLOCK.forEach(block -> {
			if (ModBlocks.REGISTRY_ARGS.containsKey(block)) {
				RegistryArgs registryArgs = ModBlocks.REGISTRY_ARGS.get(block);

				if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaLayerPlus.MOD_ID) && registryArgs.oxidizables != null) {
					OxidizableBlocksRegistry.registerOxidizableBlockPair(block, registryArgs.exposed);
					OxidizableBlocksRegistry.registerOxidizableBlockPair(registryArgs.exposed, registryArgs.weathered);
					OxidizableBlocksRegistry.registerOxidizableBlockPair(registryArgs.weathered, registryArgs.oxidized);

					OxidizableBlocksRegistry.registerWaxableBlockPair(block, registryArgs.waxed);
					OxidizableBlocksRegistry.registerWaxableBlockPair(registryArgs.exposed, registryArgs.exposedWaxed);
					OxidizableBlocksRegistry.registerWaxableBlockPair(registryArgs.weathered, registryArgs.weatheredWaxed);
					OxidizableBlocksRegistry.registerWaxableBlockPair(registryArgs.oxidized, registryArgs.oxidizedWaxed);
				}
			}
		});
	}

	public static void registerTranslucentBlocks() {
		Registries.BLOCK.forEach(block -> {
			if (ModBlocks.REGISTRY_ARGS.containsKey(block)) {
				RegistryArgs registryArgs = ModBlocks.REGISTRY_ARGS.get(block);

				if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaLayerPlus.MOD_ID) && registryArgs.translucent != null) {
					BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), block);
				}
			}
		});
	}

	public static void registerFuel() {
		Registries.BLOCK.forEach(block -> {
			if (ModBlocks.REGISTRY_ARGS.containsKey(block)) {
				RegistryArgs registryArgs = ModBlocks.REGISTRY_ARGS.get(block);

				if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaLayerPlus.MOD_ID) && registryArgs.fuel != null) {
					FuelRegistryEvents.BUILD.register((builder, context) -> builder.add(block, context.baseSmeltTime()));
				}
			}
		});
	}
}
