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
import net.minecraftforge.common.data.ForgeBlockTagsProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, hederekmod.MODID, existingFileHelper);
    }
//以下方法用于生成标签对应的json文件
    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        //this.tag(Modtag.Blocks.)
//        this.tag(BlockTags.NEEDS_STONE_TOOL)//为方块添加“需要石工具”标签
//                .add(
//                );//添加的方块
        this.tag(BlockTags.NEEDS_IRON_TOOL)//为方块添加“需要铁工具”标签
                .add(Modblocks.TITANIUM_ORE.get()
                        ,Modblocks.COMPRESSCOBBLES1.get()

                        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)//为方块添加“需要钻石工具”标签
                .add(Modblocks.TITANIUM_BLOCK.get(),
                        Modblocks.TITANIUM_ALLOY_1.get(),
                        Modblocks.COMPRESSCOBBLES2.get(),
                        Modblocks.COMPRESSCOBBLES.get()

                        );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)//为方块添加“需要使用镐工具”标签
                .add(Modblocks.TITANIUM_ORE.get(),
                        Modblocks.TITANIUM_BLOCK.get(),
                        Modblocks.TITANIUM_ALLOY_1.get()


                );
        this.tag(ModTags.Blocks.UNIVERSAL_TOOL).addTags(BlockTags.MINEABLE_WITH_PICKAXE,BlockTags.MINEABLE_WITH_AXE,BlockTags.MINEABLE_WITH_HOE,BlockTags.MINEABLE_WITH_SHOVEL,BlockTags.NEEDS_STONE_TOOL)
               ;

        this.tag(ModTags.Blocks.TITANIUN_TOOLS)
                .addTag(Tags.Blocks.STONE)
                .addTag(Tags.Blocks.COBBLESTONE)
        ;

    }
}
