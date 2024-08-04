package net.fellter.vanillalayerplus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fellter.vanillalayerplus.VanillaLayerPlus;
import net.fellter.vanillalayerplus.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup VLP_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VanillaLayerPlus.MOD_ID, "vlp"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vanillalayerplus"))
                    .icon(() -> new ItemStack(ModItems.VLP_TITLE)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.OAK_LAYER);
                        entries.add(ModBlocks.OAK_LOG_LAYER);
                        entries.add(ModBlocks.OAK_WOOD_LAYER);

                    }).build());


    public static void registerItemGroups() {
        VanillaLayerPlus.LOGGER.info("Registering Item Groups for " + VanillaLayerPlus.MOD_ID);
    }
}
