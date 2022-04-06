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

    //Weapons
    //Longswords
    public static final RegistryObject<Item> IRON_LONGSWORD = ITEMS.register("iron_longsword",
            () -> new SwordItem(Tiers.IRON,2, -2.4f,
                    new Item.Properties().tab(DAEMod.DAEModTab).durability(2032)));
    public static final RegistryObject<Item> DIAMOND_LONGSWORD = ITEMS.register("diamond_longsword",
            () -> new SwordItem(Tiers.DIAMOND, 2, -2.4f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> GOLDCRUST_LONGSWORD = ITEMS.register("goldcrust_longsword",
            () -> new SwordItem(DAEModWeaponTiers.GOLDCRUST, 3, -2.4f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> VENEUM_LONGSWORD = ITEMS.register("veneum_longsword",
            () -> new SwordItem(DAEModWeaponTiers.VENEUM, 4, -2.4f,
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
    public static final RegistryObject<Item> VENEUM_WARAXE = ITEMS.register("veneum_waraxe",
            () -> new AxeItem(DAEModWeaponTiers.VENEUM, 10, 4f,
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
    public static final RegistryObject<Item> SANCTUM_DAGGER = ITEMS.register("veneum_dagger",
            () -> new SwordItem(DAEModWeaponTiers.VENEUM, 10, 4f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
