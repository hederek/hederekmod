package com.hederek62.hederekmod.items.custom;

import com.hederek62.hederekmod.MobEffects.ModEffects;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;

public class Titanium_tool extends DiggerItem {

    public Titanium_tool(float pAttackDamageModifier, float pAttackSpeedModifier, Tier pTier, TagKey<Block> pBlocks, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, pBlocks, pProperties);
    }

    public static final MobEffectInstance EFFECT1 = new MobEffectInstance(MobEffects.NIGHT_VISION, 200000, 1);
    //public static final MobEffectInstance EFFECT2 = new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200000, 1);
    //public static final MobEffectInstance EFFECT3 = new MobEffectInstance(ModEffects.SUPER_HEALTH_BOOST.get(), 2000000, 1);
    public static final MobEffectInstance EFFECT4 = new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200000, 1);
    public static final MobEffectInstance EFFECT5 = new MobEffectInstance(MobEffects.WATER_BREATHING, 200000, 1);
    public static final MobEffectInstance EFFECT6 = new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200000, 1);
   // public static final MobEffectInstance EFFECT7 = new MobEffectInstance(ModEffects.SUPER_STRENGTH.get(), 200000, 1);
@Override
    public InteractionResult useOn(UseOnContext pContext){

        Player player = pContext.getPlayer();
        player.addEffect(EFFECT1);
//        player.addEffect(EFFECT2);
//        player.addEffect(EFFECT3);
        player.addEffect(EFFECT4);
        player.addEffect(EFFECT5);
        player.addEffect(EFFECT6);
        //player.addEffect(EFFECT7);
        return InteractionResult.SUCCESS;

    }


}
