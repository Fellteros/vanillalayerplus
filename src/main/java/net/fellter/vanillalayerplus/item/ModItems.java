package net.fellter.vanillalayerplus.item;

import net.fellter.vanillalayerplus.VanillaLayerPlus;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item VLP_TITLE = registerItem("vlp_title", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VanillaLayerPlus.MOD_ID, name), item);
    }
}
