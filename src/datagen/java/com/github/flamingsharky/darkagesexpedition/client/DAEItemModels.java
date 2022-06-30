package com.github.flamingsharky.darkagesexpedition.client;

import com.github.flamingsharky.darkagesexpedition.DAExpedition;
import com.github.flamingsharky.darkagesexpedition.common.registries.DAItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DAEItemModels extends ItemModelProvider {

    public DAEItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, DAExpedition.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        // VENEUM BLOCKS
        withExistingParent(DAItems.VENEUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/veneum_block"));
        withExistingParent(DAItems.VENEUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/veneum_ore"));
        withExistingParent(DAItems.DEEPSLATE_VENEUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate_veneum_ore"));
        withExistingParent(DAItems.TUFF_VENEUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/tuff_veneum_ore"));
        // withExistingParent(DAItems.RAW_VENEUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/raw_veneum_block"));

        // SANCTUM
        withExistingParent(DAItems.SANCTUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/sanctum_block"));
        // withExistingParent(DAItems.SANCTUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/sanctum_ore"));
        // withExistingParent(DAItems.DEEPSLATE_SANCTUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate_sanctum_ore"));
    
        singleTexture(DAItems.SANCTUM_SWORD.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/sanctum_sword"));
        singleTexture(DAItems.VENEUM_SWORD.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/veneum_sword"));
        singleTexture(DAItems.VENEUM_LONGSWORD.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/veneum_longsword"));
    
        // TODO: Update texture when proper sprite gets added
        singleTexture(DAItems.SANCTUM_LONGSWORD.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/sanctum_sword"));
        singleTexture(DAItems.SANCTUM_DAGGER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/sanctum_hoe"));
        singleTexture(DAItems.SANCTUM_WARAXE.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/sanctum_axe"));
        singleTexture(DAItems.VENEUM_DAGGER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/veneum_hoe"));
        singleTexture(DAItems.VENEUM_WARAXE.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/veneum_axe"));
    
        // EVERYTHING COMMENTED OUT NEEDS TEXTURES!!

/*      withExistingParent(DAItems.TUFF_SANCTUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/tuff_sanctum_ore"));
        withExistingParent(DAItems.RAW_SANCTUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/raw_sanctum_block"));

        //ITEMS
        //To get the simple things here, here are the normal vanilla metal weapons
        singleTexture(DAItems.IRON_LONGSWORD.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iron_longsword"));
        singleTexture(DAItems.IRON_DAGGER.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iron_dagger"));
        singleTexture(DAItems.IRON_WARAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iron_waraxe"));

        singleTexture(DAItems.DIAMOND_LONGSWORD.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/diamond_longsword"));
        singleTexture(DAItems.DIAMOND_DAGGER.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/diamond_dagger"));
        singleTexture(DAItems.DIAMOND_WARAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/diamond_waraxe"));

        //SANCTUM
        singleTexture(DAItems.RAW_SANCTUM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_sanctum"));
        singleTexture(DAItems.SANCTUM_INGOT.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sanctum_ingot"));
        singleTexture(DAItems.SANCTUM_NUGGET.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sanctum_nugget"));

        //SANCTUM WEAPONS AND TOOLS
        singleTexture(DAItems.SANCTUM_PICKAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sanctum_pickaxe"));
        singleTexture(DAItems.SANCTUM_AXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sanctum_axe"));
        singleTexture(DAItems.SANCTUM_SHOVEL.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sanctum_shovel"));
        singleTexture(DAItems.SANCTUM_HOE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sanctum_hoe"));

        


        //VENEUM
        singleTexture(DAItems.RAW_VENEUM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_veneum"));
        singleTexture(DAItems.VENEUM_INGOT.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/veneum_ingot"));
        singleTexture(DAItems.VENEUM_NUGGET.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/veneum_nugget"));

        //VENEUM WEAPONS AND TOOLS
        singleTexture(DAItems.VENEUM_PICKAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/veneum_pickaxe"));
        singleTexture(DAItems.VENEUM_AXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/veneum_axe"));
        singleTexture(DAItems.VENEUM_SHOVEL.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/veneum_shovel"));
        singleTexture(DAItems.VENEUM_HOE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/veneum_hoe"));*/
    }
}
