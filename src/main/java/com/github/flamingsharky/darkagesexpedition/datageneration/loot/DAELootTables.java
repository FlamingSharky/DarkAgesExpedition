package com.github.flamingsharky.darkagesexpedition.datageneration.loot;

import com.github.flamingsharky.darkagesexpedition.datageneration.DAELootTableProvider;
import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import net.minecraft.data.DataGenerator;

public class DAELootTables extends DAELootTableProvider {

    public DAELootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        //Veneum
        lootTables.put(Registration.VENEUM_ORE.get(), createSilkTouchTable("veneum_ore",
                Registration.VENEUM_ORE.get(),
                Registration.RAW_VENEUM.get(), 1, 1));
        lootTables.put(Registration.DEEPSLATE_VENEUM_ORE.get(), createSilkTouchTable("deepslate-veneum_ore",
                Registration.DEEPSLATE_VENEUM_ORE.get(),
                Registration.RAW_VENEUM.get(), 1, 1));
        lootTables.put(Registration.TUFF_VENEUM_ORE.get(), createSilkTouchTable("tuff-veneum_ore",
                Registration.TUFF_VENEUM_ORE.get(),
                Registration.RAW_VENEUM.get(), 1, 1));
        lootTables.put(Registration.VENEUM_BLOCK.get(), createSimpleTable("veneum_block",
                Registration.VENEUM_BLOCK.get()));
        lootTables.put(Registration.RAW_VENEUM_BLOCK.get(), createSimpleTable("raw-veneum_block",
                Registration.RAW_VENEUM_BLOCK.get()));

        //Sanctum
        lootTables.put(Registration.SANCTUM_ORE.get(), createSilkTouchTable("sanctum_ore",
                Registration.SANCTUM_ORE.get(),
                Registration.RAW_SANCTUM.get(), 1, 1));
        lootTables.put(Registration.DEEPSLATE_SANCTUM_ORE.get(), createSilkTouchTable("deepslate-sanctum_ore",
                Registration.DEEPSLATE_SANCTUM_ORE.get(),
                Registration.RAW_SANCTUM.get(), 1, 1));
        lootTables.put(Registration.TUFF_SANCTUM_ORE.get(), createSilkTouchTable("tuff-sanctum_ore",
                Registration.TUFF_SANCTUM_ORE.get(),
                Registration.RAW_SANCTUM.get(), 1, 1));
        lootTables.put(Registration.SANCTUM_BLOCK.get(), createSimpleTable("sanctum_block",
                Registration.SANCTUM_BLOCK.get()));
        lootTables.put(Registration.RAW_SANCTUM_BLOCK.get(), createSimpleTable("raw-sanctum_block",
                Registration.RAW_SANCTUM_BLOCK.get()));

    }
}
