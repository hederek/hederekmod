package com.hederek62.hederekmod.datagen;


import com.hederek62.hederekmod.hederekmod;
import com.hederek62.hederekmod.items.Mod_main_items;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {


    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, hederekmod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // 添加盔甲标签
        this.tag(ItemTags.TRIMMABLE_ARMOR).add(Mod_main_items.TITANIUM_ALLOY_1_BOOTS.get()
                ,Mod_main_items.TITANIUM_ALLOY_1_CHESTPLATE.get()
                ,Mod_main_items.TITANIUM_ALLOY_1_HELMET.get()
                ,Mod_main_items.TITANIUM_ALLOY_1_LEGGINGS.get()
        );

    }
}
