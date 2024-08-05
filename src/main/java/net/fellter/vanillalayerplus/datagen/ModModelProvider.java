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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.VLP_TITLE, Models.GENERATED);
    }
}
