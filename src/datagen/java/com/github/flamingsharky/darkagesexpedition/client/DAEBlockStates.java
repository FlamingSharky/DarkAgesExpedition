package com.github.flamingsharky.darkagesexpedition.client;

import com.github.flamingsharky.darkagesexpedition.DAExpedition;
import com.github.flamingsharky.darkagesexpedition.common.registries.DABlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DAEBlockStates extends BlockStateProvider {

    public DAEBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, DAExpedition.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(DABlocks.VENEUM_BLOCK.get());
        simpleBlock(DABlocks.VENEUM_ORE.get());
        simpleBlock(DABlocks.DEEPSLATE_VENEUM_ORE.get());
        simpleBlock(DABlocks.TUFF_VENEUM_ORE.get());
        simpleBlock(DABlocks.RAW_VENEUM_BLOCK.get());


        simpleBlock(DABlocks.SANCTUM_BLOCK.get());
        simpleBlock(DABlocks.SANCTUM_ORE.get());
        simpleBlock(DABlocks.DEEPSLATE_SANCTUM_ORE.get());
        simpleBlock(DABlocks.TUFF_SANCTUM_ORE.get());
        simpleBlock(DABlocks.RAW_SANCTUM_BLOCK.get());
    }
}