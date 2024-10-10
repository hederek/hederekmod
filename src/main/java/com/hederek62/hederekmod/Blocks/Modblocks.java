package com.hederek62.hederekmod.Blocks;

import com.hederek62.hederekmod.hederekmod;
import com.hederek62.hederekmod.items.Mod_main_items;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Modblocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, hederekmod.MODID);


    //以下方法用于添加方块
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)),64);
    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)),64);
    public static final RegistryObject<Block> TITANIUM_ALLOY_1 = registerBlock("titanium_alloy_1",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).strength(4f)),64);

    public static final RegistryObject<Block> COMPRESSCOBBLES1 = registerBlock("compress_cobbles1",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)),128);
    public static final RegistryObject<Block> COMPRESSCOBBLES2 = registerBlock("compress_cobbles2",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)),128);
    public static final RegistryObject<Block> COMPRESSCOBBLES =  registerBlock("compress_cobbles",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)),128);




    //以下定义了注册方块的方法
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,int stack) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn,stack);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,int stack) {
        return Mod_main_items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(stack)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
