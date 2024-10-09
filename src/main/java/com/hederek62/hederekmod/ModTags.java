package com.hederek62.hederekmod;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> UNIVERSAL_TOOL = tag("universal_tool");
        public static final TagKey<Block> TITANIUN_TOOLS = tag("titanium_tools");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(hederekmod.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> UNIVERSAL_TOOL1 = tag("universal_tool1");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(hederekmod.MODID, name));
        }
    }
}

