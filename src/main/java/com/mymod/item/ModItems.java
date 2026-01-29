package com.mymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static Item register(String name, Function<FabricItem.Settings, Item> itemFactory, Item.Settings settings) {
        Registry<Item> ItemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FabricDocsReference.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }
}
