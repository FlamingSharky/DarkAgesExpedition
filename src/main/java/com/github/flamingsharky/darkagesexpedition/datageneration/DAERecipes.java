package com.github.flamingsharky.darkagesexpedition.datageneration;

import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class DAERecipes extends RecipeProvider {

    public DAERecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.VENEUM_ORE_ITEM.get()),
                        Registration.VENEUM_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.VENEUM_ORE_ITEM.get()))
                .save(consumer, "veneum_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_VENEUM.get()),
                        Registration.VENEUM_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_VENEUM.get()))
                .save(consumer, "veneum_ingot2");
    }
}
