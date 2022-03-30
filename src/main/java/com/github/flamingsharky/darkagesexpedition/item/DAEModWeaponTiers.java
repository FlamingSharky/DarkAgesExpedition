package com.github.flamingsharky.darkagesexpedition.item;


import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class DAEModWeaponTiers {
    public static final ForgeTier SANCTUM = new ForgeTier(2, 1080, 1f,
            0f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(DAEModItemList.SANCTUM_INGOT.get()));

    public static final ForgeTier VENEUM = new ForgeTier(2, 1080, 1f,
            0f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(DAEModItemList.VENEUM_INGOT.get()));

    public static final ForgeTier GOLDCRUST = new ForgeTier(2, 632, 1f,
            0f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.GOLD_INGOT, Items.IRON_INGOT));

}

