package com.github.flamingsharky.darkagesexpedition.datageneration;

import com.github.flamingsharky.darkagesexpedition.DAEMod;
import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class DAELanguageProvider extends LanguageProvider {

    public DAELanguageProvider(DataGenerator gen, String locale) {
        super(gen, DAEMod.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + DAEMod.DAEModTab, "Dark Ages Expedition");
        //Poisonmetal
        add(Registration.GREENMETAL_BLOCK.get(), "Poisonmetal Block");
        add(Registration.GREENMETAL_ORE.get(), "Poisonmetal Ore");
        add(Registration.DEEPSLATE_GREENMETAL_ORE.get(), "Deepslate Poisonmetal Ore");
        add(Registration.RAW_GREENMETAL_BLOCK.get(), "Raw Poisonmetal Block");
        //Holymetal
        add(Registration.WHITEMETAL_BLOCK.get(), "Holymetal Block");
        add(Registration.WHITEMETAL_ORE.get(), "Holymetal Ore");
        add(Registration.DEEPSLATE_WHITEMETAL_ORE.get(), "Deepslate Holymetal");
        add(Registration.RAW_WHITEMETAL_BLOCK.get(), "Raw Holymetal Block");
    }
}
