package com.github.flamingsharky.darkagesexpedition.datageneration;

import com.github.flamingsharky.darkagesexpedition.DAEMod;
import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import com.github.flamingsharky.darkagesexpedition.setup.Tool_List;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DAEItemModels extends ItemModelProvider {

    public DAEItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, DAEMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //VENEUM BLOCKS
        withExistingParent(Registration.VENEUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/metal-blocks/veneum_block"));
        withExistingParent(Registration.VENEUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/metal-blocks/veneum_ore"));
        withExistingParent(Registration.DEEPSLATE_VENEUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/metal-blocks/deepslate-veneum_ore"));
        withExistingParent(Registration.TUFF_VENEUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/metal-blocks/tuff-veneum_ore"));
        withExistingParent(Registration.RAW_VENEUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/metal-blocks/raw-veneum_block"));
        //SANCTUM
        withExistingParent(Registration.SANCTUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/metal-blocks/sanctum_block"));
        withExistingParent(Registration.SANCTUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/metal-blocks/sanctum_ore"));
        withExistingParent(Registration.DEEPSLATE_SANCTUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/metal-blocks/deepslate-sanctum_ore"));
        withExistingParent(Registration.TUFF_SANCTUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/metal-blocks/tuff-sanctum_ore"));
        withExistingParent(Registration.RAW_SANCTUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/metal-blocks/raw-sanctum_block"));


        //ITEMS

        //To get the simple things here, here are the normal vanilla metal weapons
        singleTexture(Tool_List.IRON_LONGSWORD.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/iron_longsword"));
        singleTexture(Tool_List.IRON_DAGGER.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/iron_dagger"));
        singleTexture(Tool_List.IRON_WARAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/iron_waraxe"));

        singleTexture(Tool_List.DIAMOND_LONGSWORD.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/diamond_longsword"));
        singleTexture(Tool_List.DIAMOND_DAGGER.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/diamond_dagger"));
        singleTexture(Tool_List.DIAMOND_WARAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/diamond_waraxe"));



        //SANCTUM
        singleTexture(Registration.RAW_SANCTUM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/metal-items/raw_sanctum"));
        singleTexture(Registration.SANCTUM_INGOT.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/metal-items/sanctum_ingot"));
        singleTexture(Registration.SANCTUM_NUGGET.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/metal-items/sanctum_nugget"));

        //SANCTUM WEAPONS AND TOOLS
        singleTexture(Tool_List.SANCTUM_SWORD.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/sanctum_sword"));
        singleTexture(Tool_List.SANCTUM_PICKAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/sanctum_pickaxe"));
        singleTexture(Tool_List.SANCTUM_AXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/sanctum_axe"));
        singleTexture(Tool_List.SANCTUM_SHOVEL.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/sanctum_shovel"));
        singleTexture(Tool_List.SANCTUM_HOE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/sanctum_hoe"));

        singleTexture(Tool_List.SANCTUM_LONGSWORD.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/sanctum_longsword"));
        singleTexture(Tool_List.SANCTUM_DAGGER.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/sanctum_dagger"));
        singleTexture(Tool_List.SANCTUM_WARAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/sanctum_waraxe"));


        //VENEUM
        singleTexture(Registration.RAW_VENEUM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/metal-items/raw_veneum"));
        singleTexture(Registration.VENEUM_INGOT.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/metal-items/veneum_ingot"));
        singleTexture(Registration.VENEUM_NUGGET.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/metal-items/veneum_nugget"));

        //VENEUM WEAPONS AND TOOLS
        singleTexture(Tool_List.VENEUM_SWORD.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/veneum_sword"));
        singleTexture(Tool_List.VENEUM_PICKAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/veneum_pickaxe"));
        singleTexture(Tool_List.VENEUM_AXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/veneum_axe"));
        singleTexture(Tool_List.VENEUM_SHOVEL.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/veneum_shovel"));
        singleTexture(Tool_List.VENEUM_HOE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/veneum_hoe"));

        singleTexture(Tool_List.VENEUM_LONGSWORD.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/veneum_longsword"));
        singleTexture(Tool_List.VENEUM_DAGGER.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/veneum_dagger"));
        singleTexture(Tool_List.VENEUM_WARAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/weapons/veneum_waraxe"));
    }
}
