package com.github.flamingsharky.darkagesexpedition.datageneration;

import com.github.flamingsharky.darkagesexpedition.DAEMod;
import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DAEItemModels extends ItemModelProvider {

    public DAEItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, DAEMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.GREENMETAL_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/greenmetal_block"));
        withExistingParent(Registration.GREENMETAL_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/greenmetal_ore"));
        withExistingParent(Registration.DEEPSLATE_GREENMETAL_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate-greenmetal_ore"));
        withExistingParent(Registration.RAW_GREENMETAL_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/raw-greenmetal_block"));

        withExistingParent(Registration.WHITEMETAL_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/whitemetal_block"));
        withExistingParent(Registration.WHITEMETAL_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/whitemetal_ore"));
        withExistingParent(Registration.DEEPSLATE_WHITEMETAL_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate-whitemetal_ore"));
        withExistingParent(Registration.RAW_WHITEMETAL_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/raw-whitemetal_block"));
    }
}
