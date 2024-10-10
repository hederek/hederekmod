package com.hederek62.hederekmod.datagen.loot;


import com.hederek62.hederekmod.Blocks.Modblocks;
import com.hederek62.hederekmod.items.Mod_main_items;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(Modblocks.TITANIUM_BLOCK.get());
        this.dropSelf(Modblocks.TITANIUM_ALLOY_1.get());
        this.dropSelf(Modblocks.COMPRESSCOBBLES.get());
        this.dropSelf(Modblocks.COMPRESSCOBBLES1.get());
        this.dropSelf(Modblocks.COMPRESSCOBBLES2.get());
        this.add(Modblocks.TITANIUM_ORE.get(),
                (block) -> createCopperLikeOreDrops(Modblocks.TITANIUM_ORE.get(), Mod_main_items.TITANIUM_RAW.get()));

    }
    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock,Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction
                                        .setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Modblocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}