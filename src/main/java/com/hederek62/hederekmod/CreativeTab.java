package com.hederek62.hederekmod;

import com.hederek62.hederekmod.Blocks.Modblocks;
import com.hederek62.hederekmod.items.Mod_main_items;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, hederekmod.MODID);
    public static final RegistryObject<CreativeModeTab> MOREOBJECTS_TAB = CREATIVE_MODE_TABS.register(hederekmod.MODID,
            () -> CreativeModeTab.builder().icon(() -> Mod_main_items.TITANIUM.get().getDefaultInstance())
                    .title(net.minecraft.network.chat.Component.translatable("creativemodetab.hederekmod"))
                    .displayItems((parameters, output) -> {//添加物品到模组对应的创造模式物品栏
                        //元素
                        output.accept(Mod_main_items.H.get());
                        output.accept(Mod_main_items.HE.get());
                        output.accept(Mod_main_items.LI.get());
                        output.accept(Mod_main_items.BE.get());
                        output.accept(Mod_main_items.O.get());
                        output.accept(Mod_main_items.TI.get());


                        //物品
                        output.accept(Mod_main_items.HYDROGEN.get());
                        output.accept(Mod_main_items.HELIUM.get());
                        output.accept(Mod_main_items.LITHIUM.get());
                        output.accept(Mod_main_items.OXYGEN.get());
                        output.accept(Mod_main_items.TITANIUM_RAW.get());
                        output.accept(Mod_main_items.TITANIUM.get());

                        //基于原版的物品
                        output.accept(Mod_main_items.COMPRESS_3_DIAMOND.get());
                        output.accept(Mod_main_items.COMPRESS_3_GOLD.get());
                        output.accept(Modblocks.COMPRESSCOBBLES.get());
                        output.accept(Modblocks.COMPRESSCOBBLES1.get());
                        output.accept(Modblocks.COMPRESSCOBBLES2.get());
                        output.accept(Mod_main_items.COMPRESSCOBBLES3.get());
                        output.accept(Mod_main_items.COMPRESSCOBBLES4.get());

                        //盔甲类
                        output.accept(Mod_main_items.TITANIUM_ALLOY_1_HELMET.get());
                        output.accept(Mod_main_items.TITANIUM_ALLOY_1_CHESTPLATE.get());
                        output.accept(Mod_main_items.TITANIUM_ALLOY_1_LEGGINGS.get());
                        output.accept(Mod_main_items.TITANIUM_ALLOY_1_BOOTS.get());

                        //工具类
                        output.accept(Mod_main_items.TITANIUM_TOOL.get());
                        output.accept(Mod_main_items.TITANIUM_UNIVERSAL_TOOL.get());



                        //方块
                        output.accept(Modblocks.TITANIUM_BLOCK.get());
                        output.accept(Modblocks.TITANIUM_ORE.get());
                        output.accept(Modblocks.TITANIUM_ALLOY_1.get());





                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
