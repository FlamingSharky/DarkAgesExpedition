package com.github.flamingsharky.darkagesexpedition.datageneration;

import com.github.flamingsharky.darkagesexpedition.DAEMod;
import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DAEItemTags extends ItemTagsProvider {

    public DAEItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, DAEMod.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                //VENEUM
                .add(Registration.VENEUM_ORE_ITEM.get())
                .add(Registration.DEEPSLATE_VENEUM_ORE_ITEM.get())
                //SANCTUM
                .add(Registration.SANCTUM_ORE_ITEM.get())
                .add(Registration.DEEPSLATE_SANCTUM_ORE_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(Registration.SANCTUM_INGOT.get())
                .add(Registration.VENEUM_INGOT.get());
        tag(Tags.Items.NUGGETS)
                .add(Registration.SANCTUM_NUGGET.get())
                .add(Registration.VENEUM_NUGGET.get());
    }

    @Override
    public String getName() {
        return "DAEMod Tags";
    }
}
