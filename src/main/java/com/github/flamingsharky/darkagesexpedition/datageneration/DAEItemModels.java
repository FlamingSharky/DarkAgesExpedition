package com.github.flamingsharky.darkagesexpedition.datageneration;

import com.github.flamingsharky.darkagesexpedition.DAEMod;
import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class  DAEItemModels extends ItemModelProvider {

    public DAEItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, DAEMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //VENEUM BLOCKS
        withExistingParent(Registration.VENEUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/veneum_block"));
        withExistingParent(Registration.VENEUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/veneum_ore"));
        withExistingParent(Registration.DEEPSLATE_VENEUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate-veneum_ore"));
        withExistingParent(Registration.TUFF_VENEUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/tuff-veneum_ore"));
        withExistingParent(Registration.RAW_VENEUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/raw-veneum_block"));
        //SANCTUM
        withExistingParent(Registration.SANCTUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/sanctum_block"));
        withExistingParent(Registration.SANCTUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/sanctum_ore"));
        withExistingParent(Registration.DEEPSLATE_SANCTUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate-sanctum_ore"));
        withExistingParent(Registration.TUFF_SANCTUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/tuff-sanctum_ore"));
        withExistingParent(Registration.RAW_SANCTUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/raw-sanctum_block"));


        //ITEMS

        //SANCTUM
        singleTexture(Registration.RAW_SANCTUM.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_sanctum"));
        singleTexture(Registration.SANCTUM_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/sanctum_ingot"));
        singleTexture(Registration.SANCTUM_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/sanctum_nugget"));

        //VENEUM
        singleTexture(Registration.RAW_VENEUM.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_veneum"));
        singleTexture(Registration.VENEUM_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/veneum_ingot"));
        singleTexture(Registration.VENEUM_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/veneum_nugget"));
    }
}
