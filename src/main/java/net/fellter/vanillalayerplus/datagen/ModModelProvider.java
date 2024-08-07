package net.fellter.vanillalayerplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fellter.vanillalayerplus.block.ModBlocks;
import net.fellter.vanillalayerplus.item.ModItems;
import net.fellter.vanillalayerplus.util.ModTextureMap;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;

import static net.fellter.vanillalayerplus.util.ModBlockStateModelGenerator.registerLayerBlock;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator bsmg) {

        registerLayerBlock(ModBlocks.OAK_LAYER, Blocks.OAK_PLANKS, bsmg, TextureMap.all(Blocks.OAK_PLANKS));
        registerLayerBlock(ModBlocks.OAK_LOG_LAYER, Blocks.OAK_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.OAK_LOG), ModTextureMap.blockAndTopForEnds(Blocks.OAK_LOG));
        registerLayerBlock(ModBlocks.OAK_WOOD_LAYER, Blocks.OAK_WOOD, bsmg, TextureMap.all(Blocks.OAK_LOG), TextureMap.all(Blocks.OAK_LOG));
        registerLayerBlock(ModBlocks.STR_OAK_LOG_LAYER, Blocks.STRIPPED_OAK_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG), ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG));
        registerLayerBlock(ModBlocks.STR_OAK_WOOD_LAYER, Blocks.STRIPPED_OAK_WOOD, bsmg, TextureMap.all(Blocks.STRIPPED_OAK_LOG), TextureMap.all(Blocks.STRIPPED_OAK_LOG));

        registerLayerBlock(ModBlocks.SPRUCE_LAYER, Blocks.SPRUCE_PLANKS, bsmg, TextureMap.all(Blocks.SPRUCE_PLANKS));
        registerLayerBlock(ModBlocks.SPRUCE_LOG_LAYER, Blocks.SPRUCE_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.SPRUCE_LOG), ModTextureMap.blockAndTopForEnds(Blocks.SPRUCE_LOG));
        registerLayerBlock(ModBlocks.SPRUCE_WOOD_LAYER, Blocks.SPRUCE_WOOD, bsmg, TextureMap.all(Blocks.SPRUCE_LOG), TextureMap.all(Blocks.SPRUCE_LOG));
        registerLayerBlock(ModBlocks.STR_SPRUCE_LOG_LAYER, Blocks.STRIPPED_SPRUCE_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_SPRUCE_LOG), ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_SPRUCE_LOG));
        registerLayerBlock(ModBlocks.STR_SPRUCE_WOOD_LAYER, Blocks.STRIPPED_SPRUCE_WOOD, bsmg, TextureMap.all(Blocks.STRIPPED_SPRUCE_LOG), TextureMap.all(Blocks.STRIPPED_SPRUCE_LOG));

        registerLayerBlock(ModBlocks.BIRCH_LAYER, Blocks.BIRCH_PLANKS, bsmg, TextureMap.all(Blocks.BIRCH_PLANKS));
        registerLayerBlock(ModBlocks.BIRCH_LOG_LAYER, Blocks.BIRCH_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.BIRCH_LOG), ModTextureMap.blockAndTopForEnds(Blocks.BIRCH_LOG));
        registerLayerBlock(ModBlocks.BIRCH_WOOD_LAYER, Blocks.BIRCH_WOOD, bsmg, TextureMap.all(Blocks.BIRCH_LOG), TextureMap.all(Blocks.BIRCH_LOG));
        registerLayerBlock(ModBlocks.STR_BIRCH_LOG_LAYER, Blocks.STRIPPED_BIRCH_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_BIRCH_LOG), ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_BIRCH_LOG));
        registerLayerBlock(ModBlocks.STR_BIRCH_WOOD_LAYER, Blocks.STRIPPED_BIRCH_WOOD, bsmg, TextureMap.all(Blocks.STRIPPED_BIRCH_LOG), TextureMap.all(Blocks.STRIPPED_BIRCH_LOG));

        registerLayerBlock(ModBlocks.JUNGLE_LAYER, Blocks.JUNGLE_PLANKS, bsmg, TextureMap.all(Blocks.JUNGLE_PLANKS));
        registerLayerBlock(ModBlocks.JUNGLE_LOG_LAYER, Blocks.JUNGLE_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.JUNGLE_LOG), ModTextureMap.blockAndTopForEnds(Blocks.JUNGLE_LOG));
        registerLayerBlock(ModBlocks.JUNGLE_WOOD_LAYER, Blocks.JUNGLE_WOOD, bsmg, TextureMap.all(Blocks.JUNGLE_LOG), TextureMap.all(Blocks.JUNGLE_LOG));
        registerLayerBlock(ModBlocks.STR_JUNGLE_LOG_LAYER, Blocks.STRIPPED_JUNGLE_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_JUNGLE_LOG), ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_JUNGLE_LOG));
        registerLayerBlock(ModBlocks.STR_JUNGLE_WOOD_LAYER, Blocks.STRIPPED_JUNGLE_WOOD, bsmg, TextureMap.all(Blocks.STRIPPED_JUNGLE_LOG), TextureMap.all(Blocks.STRIPPED_JUNGLE_LOG));

        registerLayerBlock(ModBlocks.ACACIA_LAYER, Blocks.ACACIA_PLANKS, bsmg, TextureMap.all(Blocks.ACACIA_PLANKS));
        registerLayerBlock(ModBlocks.ACACIA_LOG_LAYER, Blocks.ACACIA_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.ACACIA_LOG), ModTextureMap.blockAndTopForEnds(Blocks.ACACIA_LOG));
        registerLayerBlock(ModBlocks.ACACIA_WOOD_LAYER, Blocks.ACACIA_WOOD, bsmg, TextureMap.all(Blocks.ACACIA_LOG), TextureMap.all(Blocks.ACACIA_LOG));
        registerLayerBlock(ModBlocks.STR_ACACIA_LOG_LAYER, Blocks.STRIPPED_ACACIA_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_ACACIA_LOG), ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_ACACIA_LOG));
        registerLayerBlock(ModBlocks.STR_ACACIA_WOOD_LAYER, Blocks.STRIPPED_ACACIA_WOOD, bsmg, TextureMap.all(Blocks.STRIPPED_ACACIA_LOG), TextureMap.all(Blocks.STRIPPED_ACACIA_LOG));

        registerLayerBlock(ModBlocks.DARK_OAK_LAYER, Blocks.DARK_OAK_PLANKS, bsmg, TextureMap.all(Blocks.DARK_OAK_PLANKS));
        registerLayerBlock(ModBlocks.DARK_OAK_LOG_LAYER, Blocks.DARK_OAK_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.DARK_OAK_LOG), ModTextureMap.blockAndTopForEnds(Blocks.DARK_OAK_LOG));
        registerLayerBlock(ModBlocks.DARK_OAK_WOOD_LAYER, Blocks.DARK_OAK_WOOD, bsmg, TextureMap.all(Blocks.DARK_OAK_LOG), TextureMap.all(Blocks.DARK_OAK_LOG));
        registerLayerBlock(ModBlocks.STR_DARK_OAK_LOG_LAYER, Blocks.STRIPPED_DARK_OAK_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_DARK_OAK_LOG), ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_DARK_OAK_LOG));
        registerLayerBlock(ModBlocks.STR_DARK_OAK_WOOD_LAYER, Blocks.STRIPPED_DARK_OAK_WOOD, bsmg, TextureMap.all(Blocks.STRIPPED_DARK_OAK_LOG), TextureMap.all(Blocks.STRIPPED_DARK_OAK_LOG));

        registerLayerBlock(ModBlocks.MANGROVE_LAYER, Blocks.MANGROVE_PLANKS, bsmg, TextureMap.all(Blocks.MANGROVE_PLANKS));
        registerLayerBlock(ModBlocks.MANGROVE_LOG_LAYER, Blocks.MANGROVE_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.MANGROVE_LOG), ModTextureMap.blockAndTopForEnds(Blocks.MANGROVE_LOG));
        registerLayerBlock(ModBlocks.MANGROVE_WOOD_LAYER, Blocks.MANGROVE_WOOD, bsmg, TextureMap.all(Blocks.MANGROVE_LOG), TextureMap.all(Blocks.MANGROVE_LOG));
        registerLayerBlock(ModBlocks.STR_MANGROVE_LOG_LAYER, Blocks.STRIPPED_MANGROVE_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_MANGROVE_LOG), ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_MANGROVE_LOG));
        registerLayerBlock(ModBlocks.STR_MANGROVE_WOOD_LAYER, Blocks.STRIPPED_MANGROVE_WOOD, bsmg, TextureMap.all(Blocks.STRIPPED_MANGROVE_LOG), TextureMap.all(Blocks.STRIPPED_MANGROVE_LOG));

        registerLayerBlock(ModBlocks.CHERRY_LAYER, Blocks.CHERRY_PLANKS, bsmg, TextureMap.all(Blocks.CHERRY_PLANKS));
        registerLayerBlock(ModBlocks.CHERRY_LOG_LAYER, Blocks.CHERRY_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.CHERRY_LOG), ModTextureMap.blockAndTopForEnds(Blocks.CHERRY_LOG));
        registerLayerBlock(ModBlocks.CHERRY_WOOD_LAYER, Blocks.CHERRY_WOOD, bsmg, TextureMap.all(Blocks.CHERRY_LOG), TextureMap.all(Blocks.CHERRY_LOG));
        registerLayerBlock(ModBlocks.STR_CHERRY_LOG_LAYER, Blocks.STRIPPED_CHERRY_LOG, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_CHERRY_LOG), ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_CHERRY_LOG));
        registerLayerBlock(ModBlocks.STR_CHERRY_WOOD_LAYER, Blocks.STRIPPED_CHERRY_WOOD, bsmg, TextureMap.all(Blocks.STRIPPED_CHERRY_LOG), TextureMap.all(Blocks.STRIPPED_CHERRY_LOG));

        registerLayerBlock(ModBlocks.BAMBOO_LAYER, Blocks.BAMBOO_PLANKS, bsmg, TextureMap.all(Blocks.BAMBOO_PLANKS));
        registerLayerBlock(ModBlocks.BAMBOO_MOSAIC_LAYER, Blocks.BAMBOO_MOSAIC, bsmg, TextureMap.all(Blocks.BAMBOO_MOSAIC));
        registerLayerBlock(ModBlocks.BAMBOO_BLOCK_LAYER, Blocks.BAMBOO_BLOCK, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.BAMBOO_BLOCK), ModTextureMap.blockAndTopForEnds(Blocks.BAMBOO_BLOCK));
        registerLayerBlock(ModBlocks.STR_BAMBOO_BLOCK_LAYER, Blocks.STRIPPED_BAMBOO_BLOCK, bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK), ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.VLP_TITLE, Models.GENERATED);
    }
}
