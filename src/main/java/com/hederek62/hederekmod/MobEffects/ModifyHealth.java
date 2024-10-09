package com.hederek62.hederekmod.MobEffects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class ModifyHealth extends MobEffect{

    protected ModifyHealth(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    public void removeAttributeModifiers(LivingEntity pLivingEntity, AttributeMap pAttributeMap, int pAmplifier) {
            super.removeAttributeModifiers(pLivingEntity, pAttributeMap, pAmplifier);
                pLivingEntity.setHealth(pLivingEntity.getMaxHealth());


        }
    }

