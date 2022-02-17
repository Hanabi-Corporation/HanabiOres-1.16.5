package net.soetch.soetchores.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup SOETCHORES_GROUP = new ItemGroup("soModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.LIRIUM_INGOT.get());
        }
    };
}
