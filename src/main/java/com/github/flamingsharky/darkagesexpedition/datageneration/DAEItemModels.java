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

        // VENEUM BLOCKS
        withExistingParent(Registration.VENEUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/veneum_block"));
        withExistingParent(Registration.VENEUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/veneum_ore"));
        withExistingParent(Registration.DEEPSLATE_VENEUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate_veneum_ore"));
        withExistingParent(Registration.TUFF_VENEUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/tuff_veneum_ore"));
        // withExistingParent(Registration.RAW_VENEUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/raw_veneum_block"));

        // SANCTUM
        withExistingParent(Registration.SANCTUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/sanctum_block"));
        // withExistingParent(Registration.SANCTUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/sanctum_ore"));
        // withExistingParent(Registration.DEEPSLATE_SANCTUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate_sanctum_ore"));
    
        singleTexture(Tool_List.SANCTUM_SWORD.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/sanctum_sword"));
        singleTexture(Tool_List.VENEUM_SWORD.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/veneum_sword"));
        singleTexture(Tool_List.VENEUM_LONGSWORD.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/veneum_longsword"));
    
        // TODO: Update texture when proper sprite gets added
        singleTexture(Tool_List.SANCTUM_LONGSWORD.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/sanctum_sword"));
        singleTexture(Tool_List.SANCTUM_DAGGER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/sanctum_hoe"));
        singleTexture(Tool_List.SANCTUM_WARAXE.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/sanctum_axe"));
        singleTexture(Tool_List.VENEUM_DAGGER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/veneum_hoe"));
        singleTexture(Tool_List.VENEUM_WARAXE.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/veneum_axe"));
    
        // EVERYTHING COMMENTED OUT NEEDS TEXTURES!!

/*      withExistingParent(Registration.TUFF_SANCTUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/tuff_sanctum_ore"));
        withExistingParent(Registration.RAW_SANCTUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/raw_sanctum_block"));

        //ITEMS
        //To get the simple things here, here are the normal vanilla metal weapons
        singleTexture(Tool_List.IRON_LONGSWORD.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iron_longsword"));
        singleTexture(Tool_List.IRON_DAGGER.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iron_dagger"));
        singleTexture(Tool_List.IRON_WARAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iron_waraxe"));

        singleTexture(Tool_List.DIAMOND_LONGSWORD.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/diamond_longsword"));
        singleTexture(Tool_List.DIAMOND_DAGGER.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/diamond_dagger"));
        singleTexture(Tool_List.DIAMOND_WARAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/diamond_waraxe"));

        //SANCTUM
        singleTexture(Registration.RAW_SANCTUM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_sanctum"));
        singleTexture(Registration.SANCTUM_INGOT.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sanctum_ingot"));
        singleTexture(Registration.SANCTUM_NUGGET.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sanctum_nugget"));

        //SANCTUM WEAPONS AND TOOLS
        singleTexture(Tool_List.SANCTUM_PICKAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sanctum_pickaxe"));
        singleTexture(Tool_List.SANCTUM_AXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sanctum_axe"));
        singleTexture(Tool_List.SANCTUM_SHOVEL.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sanctum_shovel"));
        singleTexture(Tool_List.SANCTUM_HOE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sanctum_hoe"));

        


        //VENEUM
        singleTexture(Registration.RAW_VENEUM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_veneum"));
        singleTexture(Registration.VENEUM_INGOT.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/veneum_ingot"));
        singleTexture(Registration.VENEUM_NUGGET.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/veneum_nugget"));

        //VENEUM WEAPONS AND TOOLS
        singleTexture(Tool_List.VENEUM_PICKAXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/veneum_pickaxe"));
        singleTexture(Tool_List.VENEUM_AXE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/veneum_axe"));
        singleTexture(Tool_List.VENEUM_SHOVEL.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/veneum_shovel"));
        singleTexture(Tool_List.VENEUM_HOE.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/veneum_hoe"));*/
    }
}
