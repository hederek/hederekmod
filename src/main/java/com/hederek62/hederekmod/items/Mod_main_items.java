package com.hederek62.hederekmod.items;

import com.hederek62.hederekmod.ModTags;
import com.hederek62.hederekmod.hederekmod;
import com.hederek62.hederekmod.items.custom.ModArmorItem;
import com.hederek62.hederekmod.items.custom.Titanium_tool;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Mod_main_items {
    //主注册方法
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, hederekmod.MODID);
    //添加物品
    //各种元素
    public static final RegistryObject<Item> TI =//添加物品"钛元素"
            ITEMS.register("ti", () -> new Item(new Item.Properties().stacksTo(512)));
    public static final RegistryObject<Item> H =//添加物品"氢元素"
            ITEMS.register("h", ()-> new Item(new Item.Properties().stacksTo(512)));
    public static final RegistryObject<Item> HE = //添加物品"氦元素"
            ITEMS.register("he", ()-> new Item(new Item.Properties().stacksTo(512)));
    public static final RegistryObject<Item> LI =//添加物品"锂元素"
            ITEMS.register("li", ()-> new Item(new Item.Properties().stacksTo(512)));
    public static final RegistryObject<Item> BE =//添加物品"铍元素"
            ITEMS.register("be", ()-> new Item(new Item.Properties().stacksTo(512)));
    public static final RegistryObject<Item> O =//添加物品"氧元素"
            ITEMS.register("o", ()-> new Item(new Item.Properties().stacksTo(512)));



//钛相关
    public static final RegistryObject<Item> TITANIUM = //添加物品"熔融钛"
            ITEMS.register("titanium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_RAW =//添加物品"粗钛矿"
            ITEMS.register("titanium_raw", ()-> new Item(new Item.Properties().stacksTo(128)));
    //盔甲类
    public static final RegistryObject<Item> TITANIUM_ALLOY_1_HELMET =ITEMS.register("titanium_alloy_1_helmet", //添加物品"I型钛合金头盔"
            ()-> new ModArmorItem(ModArmorMaterials.TITANIUM_ALLOY_1, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> TITANIUM_ALLOY_1_CHESTPLATE = ITEMS.register("titanium_alloy_1_chestplate", //添加物品"I型钛合金胸甲"
            ()-> new ModArmorItem(ModArmorMaterials.TITANIUM_ALLOY_1, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> TITANIUM_ALLOY_1_LEGGINGS =ITEMS.register("titanium_alloy_1_leggings", //添加物品"I型钛合金护腿"
            ()-> new ModArmorItem(ModArmorMaterials.TITANIUM_ALLOY_1, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> TITANIUM_ALLOY_1_BOOTS = ITEMS.register("titanium_alloy_1_boots", //添加物品"I型钛合金靴子"
            ()-> new ModArmorItem(ModArmorMaterials.TITANIUM_ALLOY_1, ArmorItem.Type.BOOTS, new Item.Properties()));


//其它物品
    public static final RegistryObject<Item> HYDROGEN =//添加物品"氢气"
            ITEMS.register("hydrogen", ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HELIUM =//添加物品"氦气"
            ITEMS.register("helium", ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OXYGEN =//添加物品"氧气"
            ITEMS.register("oxygen", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LITHIUM =//添加物品"熔融锂"
            ITEMS.register("lithium", ()-> new Item(new Item.Properties()));


//基于原版的物品
    public static final RegistryObject<Item> COMPRESS_3_DIAMOND =
            ITEMS.register("compress_3_diamond",() -> new Item(new Item.Properties().stacksTo(128)));
    public static final RegistryObject<Item> COMPRESS_3_GOLD =
            ITEMS.register("compress_3_gold",() -> new Item(new Item.Properties().stacksTo(128)));

//压缩原石

    public static final RegistryObject<Item> COMPRESSCOBBLES3 =
            ITEMS.register("compress_cobbles3",()-> new Item(new Item.Properties().stacksTo(128)));
    public static final RegistryObject<Item> COMPRESSCOBBLES4 =
            ITEMS.register("compress_cobbles4",()-> new Item(new Item.Properties().stacksTo(128)));

//工具
    public static final RegistryObject<Item> TITANIUM_TOOL = ITEMS.register("titanium_tool",
        () -> new Titanium_tool(10.0f, -4.0F, Tiers.NETHERITE, ModTags.Blocks.UNIVERSAL_TOOL, new Item.Properties()));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
