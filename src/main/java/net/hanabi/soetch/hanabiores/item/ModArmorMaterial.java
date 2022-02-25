package net.hanabi.soetch.hanabiores.item;

import net.hanabi.soetch.hanabiores.util.Reference;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {
    LIRIUM("lirium", 18, new int[]{ 3, 5, 7, 3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.4f, 0,0f,
            () -> {
                return Ingredient.fromItems(ModItems.LIRIUM_INGOT.get());
    }),
    AMATITE("amatite", 20, new int[]{ 5, 7, 9, 5}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.6f, 0,0f,
            () -> {
                return Ingredient.fromItems(ModItems.AMATITE_INGOT.get());
    }),
    MAYITH("mayith", 22, new int[]{ 7, 9, 11, 7}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.8f, 0,0f,
            () -> {
        return Ingredient.fromItems(ModItems.MAYITH_INGOT.get());
    }),
    SYPHITE("syphite", 24, new int[]{ 9, 11, 13, 9}, 18, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 1.0f, 0,0f,
            () -> {
                return Ingredient.fromItems(ModItems.SYPHITE_INGOT.get());
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairMaterial;

    private ModArmorMaterial(String name, int maxDamageFactor,
                             int[] damageReductionAmountArray, int enchantability,
                             SoundEvent soundEvent, float toughness, float knockbackResistance,
                             float v, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return Reference.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
