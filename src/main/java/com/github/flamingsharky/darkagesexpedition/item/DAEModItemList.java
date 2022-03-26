package com.github.flamingsharky.darkagesexpedition.item;

import com.github.flamingsharky.darkagesexpedition.DAEMod;
import com.github.flamingsharky.darkagesexpedition.setup.ModSetup;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DAEModItemList {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, DAEMod.MOD_ID);


    //Whitemetal
    public static final RegistryObject<Item> WHITEMETAL_INGOT = ITEMS.register("holymetal_ingot",
            () -> new Item(new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> WHITEMETAL_NUGGET = ITEMS.register("holymetal_nugget",
            () -> new Item(new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> RAW_WHITEMETAL = ITEMS.register("raw_holymetal",
            () -> new Item(new Item.Properties().tab(DAEMod.DAEModTab)));
    //Greenmetal
    public static final RegistryObject<Item> GREENMETAL_INGOT = ITEMS.register("poisonmetal_ingot",
            () -> new Item(new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> GREENMETAL_NUGGET = ITEMS.register("poisonmetal_nugget",
            () -> new Item(new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> RAW_GREENMETAL = ITEMS.register("raw_poisonmetal",
            () -> new Item(new Item.Properties().tab(DAEMod.DAEModTab)));


    //Weapons
    //Longswords
    public static final RegistryObject<Item> IRON_LONGSWORD = ITEMS.register("iron_longsword",
            () -> new SwordItem(Tiers.IRON,2, 0.8f,
                    new Item.Properties().tab(DAEMod.DAEModTab).durability(2032)));
    public static final RegistryObject<Item> DIAMOND_LONGSWORD = ITEMS.register("diamond_longsword",
            () -> new SwordItem(Tiers.DIAMOND, 2, 0.8f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> GOLDCRUST_LONGSWORD = ITEMS.register("goldcrust_longsword",
            () -> new SwordItem(DAEModWeaponTiers.GOLDCRUST, 2, 0.8f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> WHITEMETAL_LONGSWORD = ITEMS.register("holymetal_longsword",
            () -> new SwordItem(DAEModWeaponTiers.WHITEMETAL, 2, 0.8f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));

    //Waraxes
    public static final RegistryObject<Item> IRON_WARAXE = ITEMS.register("iron_waraxe",
            () -> new AxeItem(Tiers.IRON, 10, 4f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> DIAMOND_WARAXE = ITEMS.register("diamond_waraxe",
            () -> new AxeItem(Tiers.DIAMOND, 10, 4f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> GOLDCRUST_WARAXE = ITEMS.register("goldcrust_waraxe",
            () -> new AxeItem(DAEModWeaponTiers.GOLDCRUST, 10, 4f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> WHITEMETAL_WARAXE = ITEMS.register("holymetal_waraxe",
            () -> new AxeItem(DAEModWeaponTiers.WHITEMETAL, 10, 4f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));

    //Daggers
    public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger",
            () -> new SwordItem(Tiers.IRON, 10, 4f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger",
            () -> new SwordItem(Tiers.DIAMOND, 10, 4f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> GOLDCRUST_DAGGER = ITEMS.register("goldcrust_dagger",
            () -> new SwordItem(DAEModWeaponTiers.GOLDCRUST, 10, 4f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> WHITEMETAL_DAGGER = ITEMS.register("holymetal_dagger",
            () -> new SwordItem(DAEModWeaponTiers.WHITEMETAL, 10, 4f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
