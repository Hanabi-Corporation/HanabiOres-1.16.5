package net.hanabi.soetch.hanabiores.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup HANABIORES_GROUP = new ItemGroup("haModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.LIRIUM_INGOT.get());
        }
    };
}
