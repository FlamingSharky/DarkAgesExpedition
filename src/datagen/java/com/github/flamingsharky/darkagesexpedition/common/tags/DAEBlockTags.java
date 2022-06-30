package com.github.flamingsharky.darkagesexpedition.common.tags;

import com.github.flamingsharky.darkagesexpedition.DAExpedition;
import com.github.flamingsharky.darkagesexpedition.common.registries.DABlocks;
import com.github.flamingsharky.darkagesexpedition.common.registries.DATags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DAEBlockTags extends BlockTagsProvider {

    public DAEBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, DAExpedition.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                //VENEUM
                .add(DABlocks.VENEUM_BLOCK.get())
                .add(DABlocks.VENEUM_ORE.get())
                .add(DABlocks.DEEPSLATE_VENEUM_ORE.get())
                .add(DABlocks.TUFF_VENEUM_ORE.get())
                .add(DABlocks.RAW_VENEUM_BLOCK.get())
                //SANCTUM
                .add(DABlocks.SANCTUM_BLOCK.get())
                .add(DABlocks.SANCTUM_ORE.get())
                .add(DABlocks.DEEPSLATE_SANCTUM_ORE.get())
                .add(DABlocks.TUFF_SANCTUM_ORE.get())
                .add(DABlocks.RAW_SANCTUM_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                //VENEUM
                .add(DABlocks.VENEUM_BLOCK.get())
                .add(DABlocks.VENEUM_ORE.get())
                .add(DABlocks.DEEPSLATE_VENEUM_ORE.get())
                .add(DABlocks.TUFF_VENEUM_ORE.get())
                .add(DABlocks.RAW_VENEUM_BLOCK.get())
                //SANCTUM
                .add(DABlocks.SANCTUM_BLOCK.get())
                .add(DABlocks.SANCTUM_ORE.get())
                .add(DABlocks.DEEPSLATE_SANCTUM_ORE.get())
                .add(DABlocks.TUFF_SANCTUM_ORE.get())
                .add(DABlocks.RAW_SANCTUM_BLOCK.get());
        tag(BlockTags.STONE_ORE_REPLACEABLES)
                //Pre-Diamond Metals
                .add(DABlocks.VENEUM_ORE.get())
                .add(DABlocks.SANCTUM_ORE.get());

        tag(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
                //Pre-Diamond Metals
                .add(DABlocks.DEEPSLATE_VENEUM_ORE.get())
                .add(DABlocks.DEEPSLATE_SANCTUM_ORE.get());
                //Pre-Netherite Metals
        tag(Tags.Blocks.ORES)
                //VENEUM
                .add(DABlocks.VENEUM_ORE.get())
                .add(DABlocks.DEEPSLATE_VENEUM_ORE.get())
                .add(DABlocks.TUFF_VENEUM_ORE.get())
                //SANCTUM
                .add(DABlocks.SANCTUM_ORE.get())
                .add(DABlocks.DEEPSLATE_SANCTUM_ORE.get())
                .add(DABlocks.TUFF_SANCTUM_ORE.get());
        tag(DATags.Blocks.SANCTUM_BLOCKS)
                .add(DABlocks.SANCTUM_BLOCK.get())
                .add(DABlocks.SANCTUM_ORE.get())
                .add(DABlocks.DEEPSLATE_SANCTUM_ORE.get())
                .add(DABlocks.TUFF_SANCTUM_ORE.get())
                .add(DABlocks.RAW_SANCTUM_BLOCK.get());
        tag(DATags.Blocks.VENEUM_BLOCKS)
                .add(DABlocks.VENEUM_BLOCK.get())
                .add(DABlocks.VENEUM_ORE.get())
                .add(DABlocks.DEEPSLATE_VENEUM_ORE.get())
                .add(DABlocks.TUFF_VENEUM_ORE.get())
                .add(DABlocks.RAW_VENEUM_BLOCK.get());
    }

    @Override
    public String getName() {
        return "DAExpedition Tags";
    }
}
