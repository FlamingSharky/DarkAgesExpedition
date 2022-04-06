package com.github.flamingsharky.darkagesexpedition.datageneration;

import com.github.flamingsharky.darkagesexpedition.item.DAEModItemList;
import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraftforge.common.Tags;

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
        ShapedRecipeBuilder.shaped(DAEModItemList.VENEUM_LONGSWORD.get())
                .pattern("  V")
                .pattern("VV ")
                .pattern("SV ")
                .define('V', Registration.VENEUM_INGOT.get())
                .define('S', Items.STICK)
                .group("darkagesexpedition")
                .unlockedBy("veneum_longsword", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.VENEUM_INGOT.get()))
                .save(consumer, "veneum_longsword");
    }
}
