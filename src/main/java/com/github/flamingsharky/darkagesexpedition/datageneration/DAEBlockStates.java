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
        simpleBlock(Registration.GREENMETAL_BLOCK.get());
        simpleBlock(Registration.GREENMETAL_ORE.get());
        simpleBlock(Registration.DEEPSLATE_GREENMETAL_ORE.get());
        simpleBlock(Registration.RAW_GREENMETAL_BLOCK.get());


        simpleBlock(Registration.WHITEMETAL_BLOCK.get());
        simpleBlock(Registration.WHITEMETAL_ORE.get());
        simpleBlock(Registration.DEEPSLATE_WHITEMETAL_ORE.get());
        simpleBlock(Registration.RAW_WHITEMETAL_BLOCK.get());
    }
}