package net.fellter.vanillalayerplus.registry;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.impl.content.registry.util.ImmutableCollectionUtils;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import net.fellter.vanillalayerplus.VanillaLayerPlus;
import net.fellter.vanillalayerplus.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.registry.Registries;

import java.util.Map;

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
                    RegistryArgs flag = ModBlocks.REGISTRY_ARGS.get(block);
                    if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaLayerPlus.MOD_ID) && flag.stripped != null) {
                        register(block, flag.stripped);
                    }
                }
            });
        }

        public static void registerTransparentBlocks() {
            Registries.BLOCK.forEach(block -> {
                if (ModBlocks.REGISTRY_ARGS.containsKey(block)) {
                    RegistryArgs flag = ModBlocks.REGISTRY_ARGS.get(block);
                    if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaLayerPlus.MOD_ID) && flag.transparent != null) {
                        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), block);
                    }
                }
            });
        }

        public static void registerOxidizableBlocks() {
            Registries.BLOCK.forEach(block -> {
                if (ModBlocks.REGISTRY_ARGS.containsKey(block)) {
                    RegistryArgs flag = ModBlocks.REGISTRY_ARGS.get(block);
                    if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaLayerPlus.MOD_ID) && flag.oxidizables != null) {
                        OxidizableBlocksRegistry.registerOxidizableBlockPair(block, flag.exposed);
                        OxidizableBlocksRegistry.registerOxidizableBlockPair(flag.exposed, flag.weathered);
                        OxidizableBlocksRegistry.registerOxidizableBlockPair(flag.weathered, flag.oxidized);

                        OxidizableBlocksRegistry.registerWaxableBlockPair(block, flag.waxed);
                        OxidizableBlocksRegistry.registerWaxableBlockPair(flag.exposed, flag.exposedWaxed);
                        OxidizableBlocksRegistry.registerWaxableBlockPair(flag.weathered, flag.weatheredWaxed);
                        OxidizableBlocksRegistry.registerWaxableBlockPair(flag.oxidized, flag.oxidizedWaxed);
                    }
                }
            });
        }

        public static void registerTranslucentBlocks() {
            Registries.BLOCK.forEach(block -> {
                if (ModBlocks.REGISTRY_ARGS.containsKey(block)) {
                    RegistryArgs flag = ModBlocks.REGISTRY_ARGS.get(block);
                    if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaLayerPlus.MOD_ID) && flag.translucent != null) {
                        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), block);
                    }
                }
            });
        }
        public static void registerFuel() {
            Registries.BLOCK.forEach(block -> {
                if (ModBlocks.REGISTRY_ARGS.containsKey(block)) {
                    RegistryArgs flag = ModBlocks.REGISTRY_ARGS.get(block);
                    if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaLayerPlus.MOD_ID) && flag.fuel != null) {
                        FuelRegistryEvents.BUILD.register((builder, context) -> builder.add(block, context.baseSmeltTime()));
                    }
                }
            });
        }

}
