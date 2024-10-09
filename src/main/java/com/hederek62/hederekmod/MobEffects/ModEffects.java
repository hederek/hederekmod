package com.hederek62.hederekmod.MobEffects;

import com.hederek62.hederekmod.hederekmod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;




public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, hederekmod.MODID);

    public static final RegistryObject<MobEffect> SUPER_WEAKNESS = MOB_EFFECTS.register("super_weakness",
            () -> new ModifyAttackDamage(MobEffectCategory.BENEFICIAL, 4738657,-6000.0D)
                    .addAttributeModifier(Attributes.ATTACK_DAMAGE, "22653B89-116E-49DC-9B6B-9971489B5BE7", 0.0D, AttributeModifier.Operation.ADDITION));
    public static final RegistryObject<MobEffect> SUPER_STRENGTH = MOB_EFFECTS.register("super_strength",
            () -> new ModifyAttackDamage(MobEffectCategory.BENEFICIAL, 4738657,6000.0D)
                    .addAttributeModifier(Attributes.ATTACK_DAMAGE, "22653B89-116E-49DC-9B6B-9971489B5BE7", 0.0D, AttributeModifier.Operation.ADDITION));
    public static final RegistryObject<MobEffect> SUPER_HEALTH_BOOST = MOB_EFFECTS.register("super_health_boost",
            () -> new ModifyHealth(MobEffectCategory.BENEFICIAL, 4738657)
                    .addAttributeModifier(Attributes.MAX_HEALTH, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 25.0D, AttributeModifier.Operation.ADDITION));

    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}
