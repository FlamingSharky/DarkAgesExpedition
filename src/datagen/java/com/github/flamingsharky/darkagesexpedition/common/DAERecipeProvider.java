package com.github.flamingsharky.darkagesexpedition.common;

import com.github.flamingsharky.darkagesexpedition.common.registries.DAItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class DAERecipeProvider extends RecipeProvider implements IConditionBuilder {
    public DAERecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        //Veneum Crafting Recipes
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DAItems.VENEUM_ORE_ITEM.get()),
                DAItems.VENEUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_ore", has(DAItems.VENEUM_ORE_ITEM.get()))
                .save(consumer, "veneum_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DAItems.DEEPSLATE_VENEUM_ORE_ITEM.get()),
                        DAItems.VENEUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_ore", has(DAItems.DEEPSLATE_VENEUM_ORE_ITEM.get()))
                .save(consumer, "veneum_ingot2");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DAItems.TUFF_VENEUM_ORE_ITEM.get()),
                        DAItems.VENEUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_ore", has(DAItems.TUFF_VENEUM_ORE_ITEM.get()))
                .save(consumer, "veneum_ingot3");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DAItems.RAW_VENEUM.get()),
                        DAItems.VENEUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_chunk", has(DAItems.RAW_VENEUM.get()))
                .save(consumer, "veneum_ingot4");

        ShapedRecipeBuilder.shaped(DAItems.VENEUM_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', DAItems.VENEUM_INGOT.get())
                .group("darkagesexpedition")
                .unlockedBy("veneum_block1", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.VENEUM_INGOT.get()))
                .save(consumer, "veneum_block_shaped");

        ShapedRecipeBuilder.shaped(DAItems.RAW_VENEUM_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', DAItems.RAW_VENEUM.get())
                .group("darkagesexpedition")
                .unlockedBy("raw_veneum_block1", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.RAW_VENEUM.get()))
                .save(consumer, "raw_veneum_block_shaped");

        ShapedRecipeBuilder.shaped(DAItems.VENEUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', DAItems.VENEUM_NUGGET.get())
                .group("darkagesexpedition")
                .unlockedBy("veneum_ingot5", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.VENEUM_INGOT.get()))
                .save(consumer, "veneum_ingot_shaped");

        ShapelessRecipeBuilder.shapeless(DAItems.VENEUM_INGOT.get(), 9)
                .requires(DAItems.VENEUM_BLOCK_ITEM.get())
                .group("darkagesexpedition")
                .unlockedBy("veneum_ingot6", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.VENEUM_INGOT.get()))
                .save(consumer, "venenum_ingot1_shapeless");

        ShapelessRecipeBuilder.shapeless(DAItems.VENEUM_NUGGET.get(),9)
                .requires(DAItems.VENEUM_INGOT.get())
                .group("darkagesexpedition")
                .unlockedBy("veneum_nugget1", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.VENEUM_INGOT.get()))
                .save(consumer, "veneum_nugget1_shapeless");

        ShapelessRecipeBuilder.shapeless(DAItems.RAW_VENEUM.get(),9)
                .requires(DAItems.RAW_VENEUM_BLOCK_ITEM.get())
                .group("darkagesexpedition")
                .unlockedBy("raw_veneum1", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.RAW_VENEUM_BLOCK_ITEM.get()))
                .save(consumer, "veneum_raw_nugget1_shapeless");


        //Sanctum
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DAItems.SANCTUM_ORE_ITEM.get()),
                        DAItems.SANCTUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_ore", has(DAItems.SANCTUM_ORE_ITEM.get()))
                .save(consumer, "sanctum_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DAItems.DEEPSLATE_SANCTUM_ORE_ITEM.get()),
                        DAItems.SANCTUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_ore", has(DAItems.DEEPSLATE_SANCTUM_ORE_ITEM.get()))
                .save(consumer, "sanctum_ingot2");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DAItems.TUFF_SANCTUM_ORE_ITEM.get()),
                        DAItems.SANCTUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_ore", has(DAItems.TUFF_SANCTUM_ORE_ITEM.get()))
                .save(consumer, "sanctum_ingot3");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DAItems.RAW_SANCTUM.get()),
                        DAItems.SANCTUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_chunk", has(DAItems.RAW_SANCTUM.get()))
                .save(consumer, "sanctum_ingot4");

        ShapedRecipeBuilder.shaped(DAItems.SANCTUM_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', DAItems.SANCTUM_INGOT.get())
                .group("darkagesexpedition")
                .unlockedBy("sanctum_block1", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.SANCTUM_INGOT.get()))
                .save(consumer, "sanctum_block_shaped");

        ShapedRecipeBuilder.shaped(DAItems.RAW_SANCTUM_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', DAItems.RAW_SANCTUM.get())
                .group("darkagesexpedition")
                .unlockedBy("raw_sanctum_block1", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.RAW_SANCTUM.get()))
                .save(consumer, "raw_sanctum_block_shaped");

        ShapedRecipeBuilder.shaped(DAItems.SANCTUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', DAItems.SANCTUM_NUGGET.get())
                .group("darkagesexpedition")
                .unlockedBy("sanctum_ingot5", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.SANCTUM_INGOT.get()))
                .save(consumer, "sanctum_ingot_shaped");

        ShapelessRecipeBuilder.shapeless(DAItems.SANCTUM_INGOT.get(), 9)
                .requires(DAItems.SANCTUM_BLOCK_ITEM.get())
                .group("darkagesexpedition")
                .unlockedBy("sanctum_ingot6", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.SANCTUM_INGOT.get()))
                .save(consumer, "sanctum_ingot_shapeless1");

        ShapelessRecipeBuilder.shapeless(DAItems.SANCTUM_NUGGET.get(),9)
                .requires(DAItems.SANCTUM_INGOT.get())
                .group("darkagesexpedition")
                .unlockedBy("sanctum_nugget1", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.SANCTUM_INGOT.get()))
                .save(consumer, "sanctum_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(DAItems.RAW_SANCTUM.get(),9)
                .requires(DAItems.RAW_SANCTUM_BLOCK_ITEM.get())
                .group("darkagesexpedition")
                .unlockedBy("raw_sanctum1", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.RAW_SANCTUM_BLOCK_ITEM.get()))
                .save(consumer, "raw_sanctum_shapeless");


        //Veneum Weapons
        ShapedRecipeBuilder.shaped(DAItems.VENEUM_LONGSWORD.get())
                .pattern("  V")
                .pattern("VV ")
                .pattern("SV ")
                .define('V', DAItems.VENEUM_INGOT.get())
                .define('S', Items.STICK)
                .group("darkagesexpedition")
                .unlockedBy("veneum_longsword", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.VENEUM_INGOT.get()))
                .save(consumer, "veneum_longsword_shaped");

        ShapedRecipeBuilder.shaped(DAItems.VENEUM_DAGGER.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("   ")
                .define('V', DAItems.VENEUM_INGOT.get())
                .define('S', Items.STICK)
                .group("darkagesexpedition")
                .unlockedBy("veneum_dagger", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.VENEUM_INGOT.get()))
                .save(consumer, "veneum_dagger_shaped");

        ShapedRecipeBuilder.shaped(DAItems.VENEUM_WARAXE.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("   ")
                .define('V', DAItems.VENEUM_INGOT.get())
                .define('S', Items.STICK)
                .group("darkagesexpedition")
                .unlockedBy("veneum_waraxe", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.VENEUM_INGOT.get()))
                .save(consumer, "veneum_waraxe_shaped");

        //Sanctum Weapons
        ShapedRecipeBuilder.shaped(DAItems.SANCTUM_LONGSWORD.get())
                .pattern("  V")
                .pattern("VV ")
                .pattern("SV ")
                .define('V', DAItems.SANCTUM_INGOT.get())
                .define('S', Items.STICK)
                .group("darkagesexpedition")
                .unlockedBy("sanctum_longsword", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.VENEUM_INGOT.get()))
                .save(consumer, "sanctum_longsword_shaped");

        ShapedRecipeBuilder.shaped(DAItems.SANCTUM_DAGGER.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("   ")
                .define('V', DAItems.SANCTUM_INGOT.get())
                .define('S', Items.STICK)
                .group("darkagesexpedition")
                .unlockedBy("sanctum_dagger", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.VENEUM_INGOT.get()))
                .save(consumer, "sanctum_dagger_shaped");

        ShapedRecipeBuilder.shaped(DAItems.SANCTUM_WARAXE.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("   ")
                .define('V', DAItems.SANCTUM_INGOT.get())
                .define('S', Items.STICK)
                .group("darkagesexpedition")
                .unlockedBy("sanctum_waraxe", InventoryChangeTrigger.TriggerInstance.hasItems(DAItems.VENEUM_INGOT.get()))
                .save(consumer, "sanctum_waraxe_shaped");
    }
}
