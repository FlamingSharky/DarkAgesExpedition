package com.github.flamingsharky.darkagesexpedition.common.items;

import com.github.flamingsharky.darkagesexpedition.common.registries.DAItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class WeaponTiers {
    public static final ForgeTier SANCTUM = new ForgeTier(2, 1080, 2f, 2f, 22,
        BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(DAItems.SANCTUM_INGOT.get()));
    
    public static final ForgeTier VENEUM = new ForgeTier(2, 1080, 2f, 2f, 22,
        BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(DAItems.VENEUM_INGOT.get()));
    
    /*public static final ForgeTier GOLDCRUST = new ForgeTier(2, 632, 8f, 2f, 22, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.GOLD_INGOT, Items.IRON_INGOT));*/
}

