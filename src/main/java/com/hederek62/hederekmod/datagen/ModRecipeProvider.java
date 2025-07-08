package com.hederek62.hederekmod.datagen;


import com.hederek62.hederekmod.Blocks.Modblocks;
import com.hederek62.hederekmod.hederekmod;
import com.hederek62.hederekmod.items.Mod_main_items;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }
    //以下方法用于定义熔炼的矿石
    private static final List<ItemLike> TITANIUM_SMELTABLES = List.of(Mod_main_items.TITANIUM_RAW.get());
//    private static final List<ItemLike> BLUESTONE_ORE_SMELTABLES = List.of(moditems.BLUESTONE_Essence.get(),
//            blocks.BLUESTONE_ORE.get());


    //以下方法用于将配方注册
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        //钛的高炉和熔炉配方
        oreBlasting(pWriter,TITANIUM_SMELTABLES, RecipeCategory.MISC, Mod_main_items.TITANIUM.get(), 0.7f, 200, "titanium");
        oreSmelting(pWriter,TITANIUM_SMELTABLES, RecipeCategory.MISC, Mod_main_items.TITANIUM.get(), 0.7f, 100, "titanium");
//        oreBlasting(pWriter,BLUESTONE_ORE_SMELTABLES, RecipeCategory.MISC, moditems.BLUESTONE_Essence.get(), 0.7f, 100, "bluestone_essence");
//        oreSmelting(pWriter,BLUESTONE_ORE_SMELTABLES, RecipeCategory.MISC, moditems.BLUESTONE_Essence.get(), 0.7f, 100, "bluestone_essence");


//烈焰粉合成烈焰棒
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BLAZE_ROD)
                .pattern("SS")
                .define('S',Items.BLAZE_POWDER)
                .unlockedBy(getHasName(Items.BLAZE_POWDER), has(Items.BLAZE_ROD)).save(pWriter);
//钛合成钛块
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Modblocks.TITANIUM_BLOCK.get(), 1)
                .requires(Ingredient.of(Mod_main_items.TITANIUM.get()),9)
                .unlockedBy(getHasName(Mod_main_items.TITANIUM.get()), has(Mod_main_items.TITANIUM.get()))
                .save(pWriter);
//万能工具配方
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Mod_main_items.TITANIUM_TOOL.get())
                .pattern("SSS")
                .pattern(" S ")
                .pattern(" S ")
                .define('S',Modblocks.COMPRESSCOBBLES1.get())
                .unlockedBy(getHasName(Modblocks.COMPRESSCOBBLES.get()), has(Tags.Items.COBBLESTONE)).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Mod_main_items.TITANIUM_UNIVERSAL_TOOL.get())
                .pattern("SSS")
                .pattern(" S ")
                .pattern(" S ")
                .define('S',Modblocks.COMPRESSCOBBLES1.get())
                .unlockedBy(getHasName(Modblocks.COMPRESSCOBBLES.get()), has(Tags.Items.COBBLESTONE)).save(pWriter);
//压缩原石
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Modblocks.COMPRESSCOBBLES.get(), 1)
                .requires(Ingredient.of(Tags.Items.COBBLESTONE),9)
                .unlockedBy(getHasName(Items.COBBLESTONE), has(Tags.Items.COBBLESTONE))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Modblocks.COMPRESSCOBBLES1.get(), 1)
                .requires(Modblocks.COMPRESSCOBBLES.get(),9)
                .unlockedBy(getHasName(Items.COBBLESTONE), has(Tags.Items.COBBLESTONE))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Modblocks.COMPRESSCOBBLES2.get(), 1)
                .requires(Modblocks.COMPRESSCOBBLES1.get(),9)
                .unlockedBy(getHasName(Items.COBBLESTONE), has(Tags.Items.COBBLESTONE))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Mod_main_items.COMPRESSCOBBLES3.get(), 1)
                .requires(Modblocks.COMPRESSCOBBLES2.get(),9)
                .unlockedBy(getHasName(Items.COBBLESTONE), has(Tags.Items.COBBLESTONE))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Mod_main_items.COMPRESSCOBBLES4.get(), 1)
                .requires(Mod_main_items.COMPRESSCOBBLES3.get(),9)
                .unlockedBy(getHasName(Items.COBBLESTONE), has(Tags.Items.COBBLESTONE))
                .save(pWriter);


        //压缩金锭
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Mod_main_items.COMPRESS_3_GOLD.get())
                .pattern("SSS")
                .define('S',Items.GOLD_INGOT)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Mod_main_items.COMPRESS_3_GOLD.get())).save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GOLD_INGOT, 3)
                .requires(Mod_main_items.COMPRESS_3_GOLD.get())
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Mod_main_items.COMPRESS_3_GOLD.get()))
                .save(pWriter);
        //压缩钻石
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Mod_main_items.COMPRESS_3_DIAMOND.get())
                .pattern("SSS")
                .define('S', Items.DIAMOND)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND)).save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIAMOND, 3)
                .requires(Mod_main_items.COMPRESS_3_DIAMOND.get())
                .unlockedBy(getHasName(Items.DIAMOND), has(Mod_main_items.COMPRESS_3_DIAMOND.get()))
                .save(pWriter);

        //I型钛合金
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Modblocks.TITANIUM_ALLOY_1.get())
                .pattern("BCB")
                .pattern("SAS")
                .pattern("SSS")
                .define('S',Modblocks.TITANIUM_BLOCK.get())
                .define('A',Mod_main_items.COMPRESS_3_DIAMOND.get())
                .define('B',Mod_main_items.COMPRESS_3_GOLD.get())
                .define('C', Blocks.REDSTONE_BLOCK)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT)).save(pWriter);

        //矿工套装
            //矿工头盔
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Mod_main_items.TITANIUM_ALLOY_1_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S',Modblocks.TITANIUM_ALLOY_1.get())
                .unlockedBy(getHasName(Mod_main_items.TITANIUM_ALLOY_1_HELMET.get()), has(Modblocks.TITANIUM_ALLOY_1.get())).save(pWriter);
            //矿工胸甲
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Mod_main_items.TITANIUM_ALLOY_1_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S',Modblocks.TITANIUM_ALLOY_1.get())
                .unlockedBy(getHasName(Mod_main_items.TITANIUM_ALLOY_1_CHESTPLATE.get()), has(Modblocks.TITANIUM_ALLOY_1.get())).save(pWriter);
            //矿工护腿
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Mod_main_items.TITANIUM_ALLOY_1_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S',Modblocks.TITANIUM_ALLOY_1.get())
                .unlockedBy(getHasName(Mod_main_items.TITANIUM_ALLOY_1_LEGGINGS.get()), has(Modblocks.TITANIUM_ALLOY_1.get())).save(pWriter);
            //矿工靴子
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Mod_main_items.TITANIUM_ALLOY_1_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S',Modblocks.TITANIUM_ALLOY_1.get())
                .unlockedBy(getHasName(Mod_main_items.TITANIUM_ALLOY_1_BOOTS.get()), has(Modblocks.TITANIUM_ALLOY_1.get())).save(pWriter);

        //此方法用于添加工作台合成配方
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, blocks.BLUESTONE_BLOCK.get())
//                .pattern("SSS")
//                .pattern("SSS")
//                .pattern("SSS")
//                .define('S', moditems.BLUESTONE_INGOT.get())
//                .unlockedBy(getHasName(moditems.BLUESTONE_INGOT.get()),has(moditems.BLUESTONE_INGOT.get()))
//                .save(pWriter);
//
//
//        //以下方法用于添加工作台分解配方
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, moditems.BLUESTONE_INGOT.get(), 9)
//                .requires(blocks.BLUESTONE_BLOCK.get())
//                .unlockedBy(getHasName(blocks.BLUESTONE_BLOCK.get()), has(blocks.BLUESTONE_BLOCK.get()))
//                .save(pWriter);


    }
    //以下方法用于添加矿石熔炼的配方
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }
    //以下方法用于添加矿石在高炉中熔炼的配方
    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }
    //以下方法用于添加食物烹饪的配方
    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, hederekmod.MODID +":"+ getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

}
