package com.hederek62.hederekmod.items;

import com.hederek62.hederekmod.Blocks.Modblocks;
import com.hederek62.hederekmod.hederekmod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    TITANIUM_ALLOY_1("titanium_alloy_1",360,new int[]{ 50, 70, 50, 40},25
            ,SoundEvents.ARMOR_EQUIP_DIAMOND,2f,2f,() -> Ingredient.of(Modblocks.TITANIUM_ALLOY_1.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipsound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> reparIngredient;

    private static final int[] BASE_DURABILTTY = {11,16,16,13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipsound, float toughness, float knockbackResistance, Supplier<Ingredient> reparIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipsound = equipsound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.reparIngredient = reparIngredient;
    }

    @Override//耐久度
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILTTY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override//防御力
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override//附魔值
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override// 音效
    public SoundEvent getEquipSound() {
        return this.equipsound;
    }

    @Override// 材料
    public Ingredient getRepairIngredient() {
        return this.reparIngredient.get();
    }

    @Override// 名称
    public String getName() {
        return hederekmod.MODID + ":" + this.name;
    }

    @Override// 韧性
    public float getToughness() {
        return this.toughness;
    }

    @Override// 击退抗性
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
