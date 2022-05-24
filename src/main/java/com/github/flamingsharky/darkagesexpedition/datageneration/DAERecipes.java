package com.github.flamingsharky.darkagesexpedition.datageneration;

import com.github.flamingsharky.darkagesexpedition.setup.Tool_List;
import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class DAERecipes extends RecipeProvider {

    public DAERecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        //Veneum Crafting Recipes

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.VENEUM_ORE_ITEM.get()),
                        Registration.VENEUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_ore", has(Registration.VENEUM_ORE_ITEM.get()))
                .save(consumer, "veneum_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.DEEPSLATE_VENEUM_ORE_ITEM.get()),
                        Registration.VENEUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_ore", has(Registration.DEEPSLATE_VENEUM_ORE_ITEM.get()))
                .save(consumer, "veneum_ingot2");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.TUFF_VENEUM_ORE_ITEM.get()),
                        Registration.VENEUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_ore", has(Registration.TUFF_VENEUM_ORE_ITEM.get()))
                .save(consumer, "veneum_ingot3");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_VENEUM.get()),
                        Registration.VENEUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_chunk", has(Registration.RAW_VENEUM.get()))
                .save(consumer, "veneum_ingot4");

        ShapedRecipeBuilder.shaped(Registration.VENEUM_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.VENEUM_INGOT.get())
                .group("darkagesexpedition")
                .unlockedBy("veneum_block1", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.VENEUM_INGOT.get()))
                .save(consumer, "veneum_block1");

        ShapedRecipeBuilder.shaped(Registration.RAW_VENEUM_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.RAW_VENEUM.get())
                .group("darkagesexpedition")
                .unlockedBy("raw-veneum_block1", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.RAW_VENEUM.get()))
                .save(consumer, "raw-veneum_block1");

        ShapedRecipeBuilder.shaped(Registration.VENEUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.VENEUM_NUGGET.get())
                .group("darkagesexpedition")
                .unlockedBy("veneum_ingot5", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.VENEUM_INGOT.get()))
                .save(consumer, "veneum_ingot5");

        ShapelessRecipeBuilder.shapeless(Registration.VENEUM_INGOT.get(), 9)
                .requires(Registration.VENEUM_BLOCK_ITEM.get())
                .group("darkagesexpedition")
                .unlockedBy("veneum_ingot6", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.VENEUM_INGOT.get()))
                .save(consumer, "veneum_ingot6");

        ShapelessRecipeBuilder.shapeless(Registration.VENEUM_NUGGET.get(),9)
                .requires(Registration.VENEUM_INGOT.get())
                .group("darkagesexpedition")
                .unlockedBy("veneum_nugget1", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.VENEUM_INGOT.get()))
                .save(consumer, "veneum_nugget1");

        ShapelessRecipeBuilder.shapeless(Registration.RAW_VENEUM.get(),9)
                .requires(Registration.RAW_VENEUM_BLOCK_ITEM.get())
                .group("darkagesexpedition")
                .unlockedBy("raw_veneum1", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.RAW_VENEUM_BLOCK_ITEM.get()))
                .save(consumer, "raw_veneum1");

        //Veneum Weapons
        ShapedRecipeBuilder.shaped(Tool_List.VENEUM_LONGSWORD.get())
                .pattern("  V")
                .pattern("VV ")
                .pattern("SV ")
                .define('V', Registration.VENEUM_INGOT.get())
                .define('S', Items.STICK)
                .group("darkagesexpedition")
                .unlockedBy("veneum_longsword", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.VENEUM_INGOT.get()))
                .save(consumer, "veneum_longsword");



        //Sanctum

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.SANCTUM_ORE_ITEM.get()),
                        Registration.SANCTUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_ore", has(Registration.SANCTUM_ORE_ITEM.get()))
                .save(consumer, "sanctum_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.DEEPSLATE_SANCTUM_ORE_ITEM.get()),
                        Registration.SANCTUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_ore", has(Registration.DEEPSLATE_SANCTUM_ORE_ITEM.get()))
                .save(consumer, "sanctum_ingot2");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.TUFF_SANCTUM_ORE_ITEM.get()),
                        Registration.SANCTUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_ore", has(Registration.TUFF_SANCTUM_ORE_ITEM.get()))
                .save(consumer, "sanctum_ingot3");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_SANCTUM.get()),
                        Registration.SANCTUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_chunk", has(Registration.RAW_SANCTUM.get()))
                .save(consumer, "sanctum_ingot4");

        ShapedRecipeBuilder.shaped(Registration.SANCTUM_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.SANCTUM_INGOT.get())
                .group("darkagesexpedition")
                .unlockedBy("sanctum_block1",InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SANCTUM_INGOT.get()))
                .save(consumer, "sanctum_block1");

        ShapedRecipeBuilder.shaped(Registration.RAW_SANCTUM_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.RAW_SANCTUM.get())
                .group("darkagesexpedition")
                .unlockedBy("raw-sanctum_block1", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.RAW_SANCTUM.get()))
                .save(consumer, "raw-sanctum_block1");

        ShapedRecipeBuilder.shaped(Registration.SANCTUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.SANCTUM_NUGGET.get())
                .group("darkagesexpedition")
                .unlockedBy("sanctum_ingot5", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SANCTUM_INGOT.get()))
                .save(consumer, "sanctum_ingot5");

        ShapelessRecipeBuilder.shapeless(Registration.SANCTUM_INGOT.get(), 9)
                .requires(Registration.SANCTUM_BLOCK_ITEM.get())
                .group("darkagesexpedition")
                .unlockedBy("sanctum_ingot6", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SANCTUM_INGOT.get()))
                .save(consumer, "sanctum_ingot6");

        ShapelessRecipeBuilder.shapeless(Registration.SANCTUM_NUGGET.get(),9)
                .requires(Registration.SANCTUM_INGOT.get())
                .group("darkagesexpedition")
                .unlockedBy("sanctum_nugget1", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SANCTUM_INGOT.get()))
                .save(consumer, "sanctum_nugget1");

        ShapelessRecipeBuilder.shapeless(Registration.RAW_SANCTUM.get(),9)
                .requires(Registration.RAW_SANCTUM_BLOCK_ITEM.get())
                .group("darkagesexpedition")
                .unlockedBy("raw_sanctum1", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.RAW_SANCTUM_BLOCK_ITEM.get()))
                .save(consumer, "raw_sanctum1");

        //Sanctum Weapons
        ShapedRecipeBuilder.shaped(Tool_List.SANCTUM_LONGSWORD.get())
                .pattern("  V")
                .pattern("VV ")
                .pattern("SV ")
                .define('V', Registration.SANCTUM_INGOT.get())
                .define('S', Items.STICK)
                .group("darkagesexpedition")
                .unlockedBy("sanctum_longsword", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.VENEUM_INGOT.get()))
                .save(consumer, "sanctum_longsword");
    }
}
