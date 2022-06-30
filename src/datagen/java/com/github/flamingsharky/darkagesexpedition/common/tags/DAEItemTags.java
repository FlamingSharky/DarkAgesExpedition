package com.github.flamingsharky.darkagesexpedition.common.tags;

import com.github.flamingsharky.darkagesexpedition.DAExpedition;
import com.github.flamingsharky.darkagesexpedition.common.registries.DAItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DAEItemTags extends ItemTagsProvider {

    public DAEItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, DAExpedition.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                //VENEUM
                .add(DAItems.VENEUM_ORE_ITEM.get())
                .add(DAItems.DEEPSLATE_VENEUM_ORE_ITEM.get())
                //SANCTUM
                .add(DAItems.SANCTUM_ORE_ITEM.get())
                .add(DAItems.DEEPSLATE_SANCTUM_ORE_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(DAItems.SANCTUM_INGOT.get())
                .add(DAItems.VENEUM_INGOT.get());
        tag(Tags.Items.NUGGETS)
                .add(DAItems.SANCTUM_NUGGET.get())
                .add(DAItems.VENEUM_NUGGET.get());
    }

    @Override
    public String getName() {
        return "DAExpedition Tags";
    }
}
