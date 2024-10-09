package com.hederek62.hederekmod.datagen;


import com.hederek62.hederekmod.Blocks.Modblocks;
import com.hederek62.hederekmod.hederekmod;
import com.hederek62.hederekmod.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, hederekmod.MODID, existingFileHelper);
    }
//以下方法用于生成标签对应的json文件
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //this.tag(Modtag.Blocks.)
//        this.tag(BlockTags.NEEDS_STONE_TOOL)//为方块添加“需要石工具”标签
//                .add(
//                );//添加的方块
        this.tag(BlockTags.NEEDS_IRON_TOOL)//为方块添加“需要铁工具”标签
                .add(Modblocks.TITANIUM_ORE.get()

                        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)//为方块添加“需要钻石工具”标签
                .add(Modblocks.TITANIUM_BLOCK.get(),
                        Modblocks.TITANIUM_ALLOY_1.get()

                        );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)//为方块添加“需要使用镐工具”标签
                .add(Modblocks.TITANIUM_ORE.get(),
                        Modblocks.TITANIUM_BLOCK.get(),
                        Modblocks.TITANIUM_ALLOY_1.get()


                );
        this.tag(ModTags.Blocks.UNIVERSAL_TOOL)
//                .add(Modblocks.TITANIUM_ORE.get(),Modblocks.TITANIUM_BLOCK.get(),Modblocks.TITANIUM_ALLOY_1.get(), Blocks.BLACKSTONE,Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.EMERALD_ORE, Blocks.DEEPSLATE_EMERALD_ORE, Blocks.EMERALD_BLOCK, Blocks.GOLD_BLOCK, Blocks.RAW_GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE, Blocks.REDSTONE_ORE, Blocks.DEEPSLATE_REDSTONE_ORE,Blocks.OBSIDIAN, Blocks.CRYING_OBSIDIAN, Blocks.NETHERITE_BLOCK, Blocks.RESPAWN_ANCHOR, Blocks.ANCIENT_DEBRIS,Blocks.IRON_BLOCK, Blocks.RAW_IRON_BLOCK, Blocks.IRON_ORE, Blocks.DEEPSLATE_IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.DEEPSLATE_LAPIS_ORE, Blocks.COPPER_BLOCK, Blocks.RAW_COPPER_BLOCK, Blocks.COPPER_ORE, Blocks.DEEPSLATE_COPPER_ORE, Blocks.CUT_COPPER_SLAB, Blocks.CUT_COPPER_STAIRS, Blocks.CUT_COPPER, Blocks.WEATHERED_COPPER, Blocks.WEATHERED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER_STAIRS, Blocks.WEATHERED_CUT_COPPER, Blocks.OXIDIZED_COPPER, Blocks.OXIDIZED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER_STAIRS, Blocks.OXIDIZED_CUT_COPPER, Blocks.EXPOSED_COPPER, Blocks.EXPOSED_CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER_STAIRS, Blocks.EXPOSED_CUT_COPPER, Blocks.WAXED_COPPER_BLOCK, Blocks.WAXED_CUT_COPPER_SLAB, Blocks.WAXED_CUT_COPPER_STAIRS, Blocks.WAXED_CUT_COPPER, Blocks.WAXED_WEATHERED_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER, Blocks.WAXED_EXPOSED_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER, Blocks.WAXED_OXIDIZED_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER, Blocks.LIGHTNING_ROD,
//                        Blocks.NOTE_BLOCK, Blocks.ATTACHED_MELON_STEM, Blocks.ATTACHED_PUMPKIN_STEM, Blocks.AZALEA, Blocks.BAMBOO, Blocks.BARREL, Blocks.BEE_NEST, Blocks.BEEHIVE, Blocks.BEETROOTS, Blocks.BIG_DRIPLEAF_STEM, Blocks.BIG_DRIPLEAF, Blocks.BOOKSHELF, Blocks.BROWN_MUSHROOM_BLOCK, Blocks.BROWN_MUSHROOM, Blocks.CAMPFIRE, Blocks.CARROTS, Blocks.CARTOGRAPHY_TABLE, Blocks.CARVED_PUMPKIN, Blocks.CAVE_VINES_PLANT, Blocks.CAVE_VINES, Blocks.CHEST, Blocks.CHORUS_FLOWER, Blocks.CHORUS_PLANT, Blocks.COCOA, Blocks.COMPOSTER, Blocks.CRAFTING_TABLE, Blocks.CRIMSON_FUNGUS, Blocks.DAYLIGHT_DETECTOR, Blocks.DEAD_BUSH, Blocks.FERN, Blocks.FLETCHING_TABLE, Blocks.GLOW_LICHEN, Blocks.GRASS, Blocks.HANGING_ROOTS, Blocks.JACK_O_LANTERN, Blocks.JUKEBOX, Blocks.LADDER, Blocks.LARGE_FERN, Blocks.LECTERN, Blocks.LILY_PAD, Blocks.LOOM, Blocks.MELON_STEM, Blocks.MELON, Blocks.MUSHROOM_STEM, Blocks.NETHER_WART, Blocks.POTATOES, Blocks.PUMPKIN_STEM, Blocks.PUMPKIN, Blocks.RED_MUSHROOM_BLOCK, Blocks.RED_MUSHROOM, Blocks.SCAFFOLDING, Blocks.SMALL_DRIPLEAF, Blocks.SMITHING_TABLE, Blocks.SOUL_CAMPFIRE, Blocks.SPORE_BLOSSOM, Blocks.SUGAR_CANE, Blocks.SWEET_BERRY_BUSH, Blocks.TALL_GRASS, Blocks.TRAPPED_CHEST, Blocks.TWISTING_VINES_PLANT, Blocks.TWISTING_VINES, Blocks.VINE, Blocks.WARPED_FUNGUS, Blocks.WEEPING_VINES_PLANT, Blocks.WEEPING_VINES, Blocks.WHEAT).addTag(BlockTags.BANNERS).addTag(BlockTags.FENCE_GATES).addTag(BlockTags.LOGS).addTag(BlockTags.PLANKS).addTag(BlockTags.SAPLINGS).addTag(BlockTags.SIGNS).addTag(BlockTags.WOODEN_BUTTONS).addTag(BlockTags.WOODEN_DOORS).addTag(BlockTags.WOODEN_FENCES).addTag(BlockTags.WOODEN_PRESSURE_PLATES).addTag(BlockTags.WOODEN_SLABS).addTag(BlockTags.WOODEN_STAIRS).addTag(BlockTags.WOODEN_TRAPDOORS).add(Blocks.MANGROVE_ROOTS).addTag(BlockTags.ALL_HANGING_SIGNS).add(Blocks.BAMBOO_MOSAIC, Blocks.BAMBOO_MOSAIC_SLAB, Blocks.BAMBOO_MOSAIC_STAIRS).addTag(BlockTags.BAMBOO_BLOCKS).add(Blocks.CHISELED_BOOKSHELF

                .addTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(BlockTags.MINEABLE_WITH_AXE)
                .addTag(BlockTags.MINEABLE_WITH_SHOVEL)
                .addTag(BlockTags.MINEABLE_WITH_HOE)
               ;

        this.tag(ModTags.Blocks.TITANIUN_TOOLS)
                .addTag(Tags.Blocks.STONE)
                .addTag(Tags.Blocks.COBBLESTONE)
        ;

    }
}
