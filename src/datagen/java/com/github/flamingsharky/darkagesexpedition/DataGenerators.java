package com.github.flamingsharky.darkagesexpedition;

import com.github.flamingsharky.darkagesexpedition.client.DAEBlockStates;
import com.github.flamingsharky.darkagesexpedition.client.DAEItemModels;
import com.github.flamingsharky.darkagesexpedition.common.DAERecipeProvider;
import com.github.flamingsharky.darkagesexpedition.common.tags.DAEItemTags;
import com.github.flamingsharky.darkagesexpedition.common.tags.DAEBlockTags;
import com.github.flamingsharky.darkagesexpedition.common.loot.DAELootTables;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = DAExpedition.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        
        if (event.includeServer()) {
            DAEBlockTags blockTags = new DAEBlockTags(generator, fileHelper);
    
            generator.addProvider(blockTags);
            generator.addProvider(new DAEItemTags(generator, blockTags, fileHelper));
            generator.addProvider(new DAERecipeProvider(generator));
            generator.addProvider(new DAELootTables(generator));
        }
        if (event.includeClient()) {
            generator.addProvider(new DAEBlockStates(generator, fileHelper));
            generator.addProvider(new DAEItemModels(generator, fileHelper));
        }
    }
}