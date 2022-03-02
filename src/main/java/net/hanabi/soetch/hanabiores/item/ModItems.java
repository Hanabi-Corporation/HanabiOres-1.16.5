package net.hanabi.soetch.hanabiores.item;

import net.hanabi.soetch.hanabiores.util.Reference;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    /* This section registers the Ingots */
    public static final RegistryObject<Item> LIRIUM_INGOT = ITEMS.register("lirium_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> AMATITE_INGOT = ITEMS.register("amatite_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> MAYITH_INGOT = ITEMS.register("mayith_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> SYPHITE_INGOT = ITEMS.register("syphite_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    /* End of the Ingots */

    /* This section registers the Armors */
    // Lirium Armor
    public static final RegistryObject<Item> LIRIUM_HELMET = ITEMS.register("lirium_helmet",
            () -> new ArmorItem(ModArmorMaterial.LIRIUM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> LIRIUM_CHESTPLATE = ITEMS.register("lirium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.LIRIUM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> LIRIUM_LEGGINGS = ITEMS.register("lirium_leggings",
            () -> new ArmorItem(ModArmorMaterial.LIRIUM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> LIRIUM_BOOTS = ITEMS.register("lirium_boots",
            () -> new ArmorItem(ModArmorMaterial.LIRIUM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    // Amatite Armor
    public static final RegistryObject<Item> AMATITE_HELMET = ITEMS.register("amatite_helmet",
            () -> new ArmorItem(ModArmorMaterial.AMATITE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> AMATITE_CHESTPLATE = ITEMS.register("amatite_chestplate",
            () -> new ArmorItem(ModArmorMaterial.AMATITE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> AMATITE_LEGGINGS = ITEMS.register("amatite_leggings",
            () -> new ArmorItem(ModArmorMaterial.AMATITE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> AMATITE_BOOTS = ITEMS.register("amatite_boots",
            () -> new ArmorItem(ModArmorMaterial.AMATITE, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    // Mayith Armor
    public static final RegistryObject<Item> MAYITH_HELMET = ITEMS.register("mayith_helmet",
            () -> new ArmorItem(ModArmorMaterial.MAYITH, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> MAYITH_CHESTPLATE = ITEMS.register("mayith_chestplate",
            () -> new ArmorItem(ModArmorMaterial.MAYITH, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> MAYITH_LEGGINGS = ITEMS.register("mayith_leggings",
            () -> new ArmorItem(ModArmorMaterial.MAYITH, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> MAYITH_BOOTS = ITEMS.register("mayith_boots",
            () -> new ArmorItem(ModArmorMaterial.MAYITH, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    // Syphite Armor
    public static final RegistryObject<Item> SYPHITE_HELMET = ITEMS.register("syphite_helmet",
            () -> new ArmorItem(ModArmorMaterial.SYPHITE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> SYPHITE_CHESTPLATE = ITEMS.register("syphite_chestplate",
            () -> new ArmorItem(ModArmorMaterial.SYPHITE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> SYPHITE_LEGGINGS = ITEMS.register("syphite_leggings",
            () -> new ArmorItem(ModArmorMaterial.SYPHITE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    public static final RegistryObject<Item> SYPHITE_BOOTS = ITEMS.register("syphite_boots",
            () -> new ArmorItem(ModArmorMaterial.SYPHITE, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    /* End of the Armors*/

    /* This section registers the Lirium Tools. */
    public static final RegistryObject<Item> LIRIUM_SWORD = ITEMS.register("lirium_sword",
            () -> new SwordItem(ModItemTier.LIRIUM,4, -2.4f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> LIRIUM_PICKAXE = ITEMS.register("lirium_pickaxe",
            () -> new PickaxeItem(ModItemTier.LIRIUM,1, -2.8f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> LIRIUM_SHOVEL = ITEMS.register("lirium_shovel",
            () -> new ShovelItem(ModItemTier.LIRIUM,1.5f, -3.0f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> LIRIUM_AXE = ITEMS.register("lirium_axe",
            () -> new AxeItem(ModItemTier.LIRIUM,6, -3.0f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> LIRIUM_HOE = ITEMS.register("lirium_hoe",
            () -> new HoeItem(ModItemTier.LIRIUM,-2, 0f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    /* End of the Lirium Tools */
    /* This section registers the Amatite Tools. */
    public static final RegistryObject<Item> AMATITE_SWORD = ITEMS.register("amatite_sword",
            () -> new SwordItem(ModItemTier.AMATITE,6, -2f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> AMATITE_PICKAXE = ITEMS.register("amatite_pickaxe",
            () -> new PickaxeItem(ModItemTier.AMATITE,1, -2.8f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> AMATITE_SHOVEL = ITEMS.register("amatite_shovel",
            () -> new ShovelItem(ModItemTier.AMATITE,1.5f, -2.0f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> AMATITE_AXE = ITEMS.register("amatite_axe",
            () -> new AxeItem(ModItemTier.AMATITE,7, -2.0f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> AMATITE_HOE = ITEMS.register("amatite_hoe",
            () -> new HoeItem(ModItemTier.AMATITE,-2, 0f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    /* End of Amatite Tools */
    /* This section registers the Mayith Tools.*/
    public static final RegistryObject<Item> MAYITH_SWORD = ITEMS.register("mayith_sword",
            () -> new SwordItem(ModItemTier.MAYITH,6, -2f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> MAYITH_PICKAXE = ITEMS.register("mayith_pickaxe",
            () -> new PickaxeItem(ModItemTier.MAYITH,1, -2.8f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> MAYITH_SHOVEL = ITEMS.register("mayith_shovel",
            () -> new ShovelItem(ModItemTier.MAYITH,1.5f, -2.0f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> MAYITH_AXE = ITEMS.register("mayith_axe",
            () -> new AxeItem(ModItemTier.MAYITH,7, -2.0f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> MAYITH_HOE = ITEMS.register("mayith_hoe",
            () -> new HoeItem(ModItemTier.MAYITH,-2, 0f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    /* End of Mayith Tools. */
    /* This section registers the Syphite Tools. */
    public static final RegistryObject<Item> SYPHITE_SWORD = ITEMS.register("syphite_sword",
            () -> new SwordItem(ModItemTier.SYPHITE,4, -2.4f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> SYPHITE_PICKAXE = ITEMS.register("syphite_pickaxe",
            () -> new PickaxeItem(ModItemTier.SYPHITE,1, -2.8f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> SYPHITE_SHOVEL = ITEMS.register("syphite_shovel",
            () -> new ShovelItem(ModItemTier.SYPHITE,1.5f, -3.0f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> SYPHITE_AXE = ITEMS.register("syphite_axe",
            () -> new AxeItem(ModItemTier.SYPHITE,6, -3.0f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));

    public static final RegistryObject<Item> SYPHITE_HOE = ITEMS.register("syphite_hoe",
            () -> new HoeItem(ModItemTier.SYPHITE,-2, 0f,
                    new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    /* End of Syphite Tools.*/

    // Adds the Tools to the eventBus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
