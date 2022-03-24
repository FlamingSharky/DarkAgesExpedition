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
                //Poisonmetal
                .add(Registration.GREENMETAL_ORE_ITEM.get())
                .add(Registration.DEEPSLATE_GREENMETAL_ORE_ITEM.get())
                //Holymetal
                .add(Registration.WHITEMETAL_ORE_ITEM.get())
                .add(Registration.DEEPSLATE_WHITEMETAL_ORE_ITEM.get());
    }

    @Override
    public String getName() {
        return "DAEMod Tags";
    }
}
