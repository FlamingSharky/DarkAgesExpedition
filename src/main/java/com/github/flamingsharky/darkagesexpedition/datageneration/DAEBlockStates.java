package com.github.flamingsharky.darkagesexpedition.datageneration;

import com.github.flamingsharky.darkagesexpedition.DAEMod;
import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DAEBlockStates extends BlockStateProvider {

    public DAEBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, DAEMod.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.VENEUM_BLOCK.get());
        simpleBlock(Registration.VENEUM_ORE.get());
        simpleBlock(Registration.DEEPSLATE_VENEUM_ORE.get());
        simpleBlock(Registration.TUFF_VENEUM_ORE.get());
        simpleBlock(Registration.RAW_VENEUM_BLOCK.get());


        simpleBlock(Registration.SANCTUM_BLOCK.get());
        simpleBlock(Registration.SANCTUM_ORE.get());
        simpleBlock(Registration.DEEPSLATE_SANCTUM_ORE.get());
        simpleBlock(Registration.TUFF_SANCTUM_ORE.get());
        simpleBlock(Registration.RAW_SANCTUM_BLOCK.get());
    }
}