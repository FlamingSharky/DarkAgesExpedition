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
                //VENEUM
                .add(Registration.VENEUM_BLOCK.get())
                .add(Registration.VENEUM_ORE.get())
                .add(Registration.DEEPSLATE_VENEUM_ORE.get())
                .add(Registration.TUFF_VENEUM_ORE.get())
                .add(Registration.RAW_VENEUM_BLOCK.get())
                //SANCTUM
                .add(Registration.SANCTUM_BLOCK.get())
                .add(Registration.SANCTUM_ORE.get())
                .add(Registration.DEEPSLATE_SANCTUM_ORE.get())
                .add(Registration.TUFF_SANCTUM_ORE.get())
                .add(Registration.RAW_SANCTUM_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                //VENEUM
                .add(Registration.VENEUM_BLOCK.get())
                .add(Registration.VENEUM_ORE.get())
                .add(Registration.DEEPSLATE_VENEUM_ORE.get())
                .add(Registration.TUFF_VENEUM_ORE.get())
                .add(Registration.RAW_VENEUM_BLOCK.get())
                //SANCTUM
                .add(Registration.SANCTUM_BLOCK.get())
                .add(Registration.SANCTUM_ORE.get())
                .add(Registration.DEEPSLATE_SANCTUM_ORE.get())
                .add(Registration.TUFF_SANCTUM_ORE.get())
                .add(Registration.RAW_SANCTUM_BLOCK.get());
        tag(BlockTags.STONE_ORE_REPLACEABLES)
                //Pre-Diamond Metals
                .add(Registration.VENEUM_ORE.get())
                .add(Registration.SANCTUM_ORE.get());

        tag(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
                //Pre-Diamond Metals
                .add(Registration.DEEPSLATE_VENEUM_ORE.get())
                .add(Registration.DEEPSLATE_SANCTUM_ORE.get());
                //Pre-Netherite Metals
        tag(Tags.Blocks.ORES)
                //VENEUM
                .add(Registration.VENEUM_ORE.get())
                .add(Registration.DEEPSLATE_VENEUM_ORE.get())
                .add(Registration.TUFF_VENEUM_ORE.get())
                //SANCTUM
                .add(Registration.SANCTUM_ORE.get())
                .add(Registration.DEEPSLATE_SANCTUM_ORE.get())
                .add(Registration.TUFF_SANCTUM_ORE.get());
    }

    @Override
    public String getName() {
        return "DAEMod Tags";
    }
}
