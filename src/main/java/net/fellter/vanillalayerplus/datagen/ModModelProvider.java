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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.VLP_TITLE, Models.GENERATED);
    }
}
