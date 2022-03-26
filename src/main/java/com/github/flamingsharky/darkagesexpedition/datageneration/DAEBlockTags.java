package com.github.flamingsharky.darkagesexpedition.datageneration;

import com.github.flamingsharky.darkagesexpedition.DAEMod;
import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DAEBlockTags  extends BlockTagsProvider {

    public DAEBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, DAEMod.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                //Poisonmetal
                .add(Registration.GREENMETAL_BLOCK.get())
                .add(Registration.GREENMETAL_ORE.get())
                .add(Registration.DEEPSLATE_GREENMETAL_ORE.get())
                .add(Registration.RAW_GREENMETAL_BLOCK.get())
                //Holymetal
                .add(Registration.WHITEMETAL_BLOCK.get())
                .add(Registration.WHITEMETAL_ORE.get())
                .add(Registration.DEEPSLATE_WHITEMETAL_ORE.get())
                .add(Registration.RAW_WHITEMETAL_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                //Poisonmetal
                .add(Registration.GREENMETAL_BLOCK.get())
                .add(Registration.GREENMETAL_ORE.get())
                .add(Registration.DEEPSLATE_GREENMETAL_ORE.get())
                .add(Registration.RAW_GREENMETAL_BLOCK.get())
                //Holymetal
                .add(Registration.WHITEMETAL_BLOCK.get())
                .add(Registration.WHITEMETAL_ORE.get())
                .add(Registration.DEEPSLATE_WHITEMETAL_ORE.get())
                .add(Registration.RAW_WHITEMETAL_BLOCK.get());
        tag(BlockTags.STONE_ORE_REPLACEABLES)
                //Pre-Diamond Metals
                .add(Registration.GREENMETAL_ORE.get())
                .add(Registration.WHITEMETAL_ORE.get());

        tag(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
                //Pre-Diamond Metals
                .add(Registration.DEEPSLATE_GREENMETAL_ORE.get())
                .add(Registration.DEEPSLATE_WHITEMETAL_ORE.get());
                //Pre-Netherite Metals
        tag(Tags.Blocks.ORES)
                //Poisonmetal
                .add(Registration.GREENMETAL_ORE.get())
                .add(Registration.DEEPSLATE_GREENMETAL_ORE.get())
                //Holymetal
                .add(Registration.WHITEMETAL_ORE.get())
                .add(Registration.DEEPSLATE_WHITEMETAL_ORE.get());
    }

    @Override
    public String getName() {
        return "DAEMod Tags";
    }
}
