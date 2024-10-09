package com.hederek62.hederekmod.MobEffects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import org.jetbrains.annotations.NotNull;

public class ModifyAttackDamage extends MobEffect {
    protected final double multiplier;

    protected ModifyAttackDamage(MobEffectCategory pCategory, int pColor, double pMultiplier) {
        super(pCategory, pColor);
        this.multiplier = pMultiplier;
    }
    public double getAttributeModifierValue(int pAmplifier, @NotNull AttributeModifier pModifier) {
        return this.multiplier * (double)(pAmplifier + 1);
    }
}
