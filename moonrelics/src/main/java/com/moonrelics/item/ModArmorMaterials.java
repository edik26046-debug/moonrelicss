package com.moonrelics.item;

import com.moonrelics.MoonRelics;
import java.util.function.Supplier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmorMaterials implements ArmorMaterial {
    MOONSTONE("moonstone", 35, new int[]{3, 6, 8, 3}, 20,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5f, 0.05f,
            () -> Ingredient.of(ModItems.MOONSTONE.get()));

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protection;
    private final int enchantability;
    private final SoundEvent sound;
    private final float toughness, knockback;
    private final Supplier<Ingredient> repair;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protection, int enchantability,
                      SoundEvent sound, float toughness, float knockback, Supplier<Ingredient> repair) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protection = protection;
        this.enchantability = enchantability;
        this.sound = sound;
        this.toughness = toughness;
        this.knockback = knockback;
        this.repair = repair;
    }

    @Override public int getDurabilityForType(ArmorItem.Type type) { return BASE_DURABILITY[type.ordinal()] * durabilityMultiplier; }
    @Override public int getDefenseForType(ArmorItem.Type type) { return protection[type.ordinal()]; }
    @Override public int getEnchantmentValue() { return enchantability; }
    @Override public SoundEvent getEquipSound() { return sound; }
    @Override public Ingredient getRepairIngredient() { return repair.get(); }
    @Override public String getName() { return MoonRelics.MODID + ":" + name; }
    @Override public float getToughness() { return toughness; }
    @Override public float getKnockbackResistance() { return knockback; }
}
