package com.github.flamingsharky.darkagesexpedition.common.loot;

import com.github.flamingsharky.darkagesexpedition.common.registries.DABlocks;
import com.github.flamingsharky.darkagesexpedition.common.registries.DAItems;
import net.minecraft.data.DataGenerator;

public class DAELootTables extends DAELootTableProvider {

    public DAELootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        //Veneum
        lootTables.put(DABlocks.VENEUM_ORE.get(), createSilkTouchTable("veneum_ore",
            DABlocks.VENEUM_ORE.get(),
                DAItems.RAW_VENEUM.get(), 1, 1));
        lootTables.put(DABlocks.DEEPSLATE_VENEUM_ORE.get(), createSilkTouchTable("deepslate_veneum_ore",
            DABlocks.DEEPSLATE_VENEUM_ORE.get(),
                DAItems.RAW_VENEUM.get(), 1, 1));
        lootTables.put(DABlocks.TUFF_VENEUM_ORE.get(), createSilkTouchTable("tuff_veneum_ore",
            DABlocks.TUFF_VENEUM_ORE.get(),
                DAItems.RAW_VENEUM.get(), 1, 1));
        lootTables.put(DABlocks.VENEUM_BLOCK.get(), createSimpleTable("veneum_block",
            DABlocks.VENEUM_BLOCK.get()));
        lootTables.put(DABlocks.RAW_VENEUM_BLOCK.get(), createSimpleTable("raw_veneum_block",
            DABlocks.RAW_VENEUM_BLOCK.get()));

        //Sanctum
        lootTables.put(DABlocks.SANCTUM_ORE.get(), createSilkTouchTable("sanctum_ore",
            DABlocks.SANCTUM_ORE.get(),
                DAItems.RAW_SANCTUM.get(), 1, 1));
        lootTables.put(DABlocks.DEEPSLATE_SANCTUM_ORE.get(), createSilkTouchTable("deepslate_sanctum_ore",
            DABlocks.DEEPSLATE_SANCTUM_ORE.get(),
                DAItems.RAW_SANCTUM.get(), 1, 1));
        lootTables.put(DABlocks.TUFF_SANCTUM_ORE.get(), createSilkTouchTable("tuff_sanctum_ore",
            DABlocks.TUFF_SANCTUM_ORE.get(),
                DAItems.RAW_SANCTUM.get(), 1, 1));
        lootTables.put(DABlocks.SANCTUM_BLOCK.get(), createSimpleTable("sanctum_block",
            DABlocks.SANCTUM_BLOCK.get()));
        lootTables.put(DABlocks.RAW_SANCTUM_BLOCK.get(), createSimpleTable("raw_sanctum_block",
            DABlocks.RAW_SANCTUM_BLOCK.get()));

    }
}
