package net.hanabi.soetch.hanabiores.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    /* This section registers the materials (aka ItemTiers) */
    LIRIUM(2, 400, 7.0F, 2.5F, 12, () -> {
        return Ingredient.fromItems(ModItems.LIRIUM_INGOT.get());
    }),
    AMATITE(2, 750, 8.5f, 4f, 16, () -> {
        return Ingredient.fromItems(ModItems.AMATITE_INGOT.get());
    }),
    MAYITH(3, 1250, 10f, 6f, 18, () -> {
        return Ingredient.fromItems(ModItems.MAYITH_INGOT.get());
    }),
    SYPHITE(3, 1700, 12f, 8f, 20, () -> {
        return Ingredient.fromItems(ModItems.SYPHITE_INGOT.get());
    });
    /* End of ItemTiers */

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}
