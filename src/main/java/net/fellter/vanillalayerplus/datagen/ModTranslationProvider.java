package net.fellter.vanillalayerplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.loader.impl.util.StringUtil;
import net.fellter.vanillalayerplus.VanillaLayerPlus;
import net.fellter.vanillalayerplus.block.ModBlocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModTranslationProvider extends FabricLanguageProvider {
    public ModTranslationProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        Registries.BLOCK.forEach(block -> {
            if (ModBlocks.DATAGEN_ARGS.containsKey(block)) {
                Identifier identifier = Registries.BLOCK.getId(block);
                if (identifier.getNamespace().equals(VanillaLayerPlus.MOD_ID)) {
                    String[] var10000 = identifier.getPath().split("_");
                    StringBuilder stringBuilder = new StringBuilder();
                    String var10001;
                    for (String string : var10000) {
                        var10001 = stringBuilder.append(StringUtil.capitalize(string)).append(" ").toString();
                    }
                    var10001 = stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length()).toString();
                    translationBuilder.add(block, var10001);
                }
            }
        });

        translationBuilder.add(RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(VanillaLayerPlus.MOD_ID, "vlp")), "Vanilla+ Layers");
    }
}
