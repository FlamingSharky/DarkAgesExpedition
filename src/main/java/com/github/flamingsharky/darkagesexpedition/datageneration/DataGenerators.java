package com.github.flamingsharky.darkagesexpedition.datageneration;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = "darkagesexpedition", bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new DAERecipes(generator));
            generator.addProvider(new DAELootTables(generator));
            DAEBlockTags blockTags = new DAEBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new DAEItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new DAEBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new DAEItemModels(generator, event.getExistingFileHelper()));
        }
    }
}