package net.soetch.soetchores.item;

import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.soetch.soetchores.util.Reference;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    /* This section registers the Ingots */
    public static final RegistryObject<Item> LIRIUM_INGOT = ITEMS.register("lirium_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.SOETCHORES_GROUP)));
    /* End of the Ingots */

    /* This section registers the Lirium Tools. */
    public static final RegistryObject<Item> LIRIUM_SWORD = ITEMS.register("lirium_sword",
            () -> new SwordItem(ModItemTier.LIRIUM,4, -2.4f,
                    new Item.Properties().group(ModItemGroup.SOETCHORES_GROUP)));

    public static final RegistryObject<Item> LIRIUM_PICKAXE = ITEMS.register("lirium_pickaxe",
            () -> new PickaxeItem(ModItemTier.LIRIUM,1, -2.8f,
                    new Item.Properties().group(ModItemGroup.SOETCHORES_GROUP)));

    public static final RegistryObject<Item> LIRIUM_SHOVEL = ITEMS.register("lirium_shovel",
            () -> new ShovelItem(ModItemTier.LIRIUM,1.5f, -3.0f,
                    new Item.Properties().group(ModItemGroup.SOETCHORES_GROUP)));

    public static final RegistryObject<Item> LIRIUM_AXE = ITEMS.register("lirium_axe",
            () -> new AxeItem(ModItemTier.LIRIUM,6, -3.0f,
                    new Item.Properties().group(ModItemGroup.SOETCHORES_GROUP)));

    public static final RegistryObject<Item> LIRIUM_HOE = ITEMS.register("lirium_hoe",
            () -> new HoeItem(ModItemTier.LIRIUM,-2, 0f,
                    new Item.Properties().group(ModItemGroup.SOETCHORES_GROUP)));
    /* End of the Lirium Tools */

    // Adds the Tools to the eventBus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
