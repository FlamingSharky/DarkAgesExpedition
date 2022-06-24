package com.github.flamingsharky.darkagesexpedition.setup;

import com.github.flamingsharky.darkagesexpedition.DAEMod;
import com.github.flamingsharky.darkagesexpedition.items.SanctumSwordItem;
import com.github.flamingsharky.darkagesexpedition.items.SanctumWarAxeItem;
import com.github.flamingsharky.darkagesexpedition.items.VeneumSwordItem;
import com.github.flamingsharky.darkagesexpedition.items.VeneumWarAxeItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Tool_List {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, DAEMod.MOD_ID);

    //Weapons

    //Modded Metal Normal Weapons
    public static final RegistryObject<Item> VENEUM_SWORD = ITEMS.register("veneum_sword",
        () -> new VeneumSwordItem(3, -2.4f, new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> SANCTUM_SWORD = ITEMS.register("sanctum_sword",
        () -> new SanctumSwordItem(3, -2.4f, new Item.Properties().tab(DAEMod.DAEModTab)));


    public static final RegistryObject<Item> SANCTUM_PICKAXE = ITEMS.register("sanctum_pickaxe",
            () -> new PickaxeItem(Weapon_Tiers.SANCTUM, 1, 1f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> SANCTUM_SHOVEL = ITEMS.register("sanctum_shovel",
            () -> new ShovelItem(Weapon_Tiers.SANCTUM, 0, 1f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> SANCTUM_AXE = ITEMS.register("sanctum_axe",
            () -> new AxeItem(Weapon_Tiers.SANCTUM, 4, 0f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> SANCTUM_HOE = ITEMS.register("sanctum_hoe",
            () -> new HoeItem(Weapon_Tiers.SANCTUM, 0, 0f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));


    public static final RegistryObject<Item> VENEUM_PICKAXE = ITEMS.register("veneum_pickaxe",
            () -> new PickaxeItem(Weapon_Tiers.SANCTUM, 1, 1f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> VENEUM_SHOVEL = ITEMS.register("veneum_shovel",
            () -> new ShovelItem(Weapon_Tiers.SANCTUM, 0, 1f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> VENEUM_AXE = ITEMS.register("veneum_axe",
            () -> new AxeItem(Weapon_Tiers.SANCTUM, 4, 0f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> VENEUM_HOE = ITEMS.register("veneum_hoe",
            () -> new HoeItem(Weapon_Tiers.SANCTUM, 0, 0f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));


    //Longswords
    public static final RegistryObject<Item> IRON_LONGSWORD = ITEMS.register("iron_longsword",
            () -> new SwordItem(Tiers.IRON,3, -2.8f,
                    new Item.Properties().tab(DAEMod.DAEModTab).durability(2032)));
    public static final RegistryObject<Item> DIAMOND_LONGSWORD = ITEMS.register("diamond_longsword",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.8f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    /*public static final RegistryObject<Item> GOLDCRUST_LONGSWORD = ITEMS.register("goldcrust_longsword",
            () -> new SwordItem(Weapon_Tiers.GOLDCRUST, 2, -2.8f,
                   new Item.Properties().tab(DAEMod.DAEModTab)));*/
    public static final RegistryObject<Item> VENEUM_LONGSWORD = ITEMS.register("veneum_longsword",
        () -> new VeneumSwordItem(4, -2.8f, new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> SANCTUM_LONGSWORD = ITEMS.register("sanctum_longsword",
        () -> new SanctumSwordItem(4, -2.8f, new Item.Properties().tab(DAEMod.DAEModTab)));

    //Waraxes
    public static final RegistryObject<Item> IRON_WARAXE = ITEMS.register("iron_waraxe",
            () -> new AxeItem(Tiers.IRON, 4, 3f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> DIAMOND_WARAXE = ITEMS.register("diamond_waraxe",
            () -> new AxeItem(Tiers.DIAMOND, 5, 3f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    /*public static final RegistryObject<Item> GOLDCRUST_WARAXE = ITEMS.register("goldcrust_waraxe",
            () -> new AxeItem(Weapon_Tiers.GOLDCRUST, 10, 3f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));*/
    public static final RegistryObject<Item> VENEUM_WARAXE = ITEMS.register("veneum_waraxe",
            () -> new VeneumWarAxeItem(5, -3f, new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> SANCTUM_WARAXE = ITEMS.register("sanctum_waraxe",
            () -> new SanctumWarAxeItem(5, -3f, new Item.Properties().tab(DAEMod.DAEModTab)));

    //Daggers
    public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger",
            () -> new SwordItem(Tiers.IRON, 1, 2f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger",
            () -> new SwordItem(Tiers.DIAMOND, 2, 2f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));
    /*public static final RegistryObject<Item> GOLDCRUST_DAGGER = ITEMS.register("goldcrust_dagger",
            () -> new SwordItem(Weapon_Tiers.GOLDCRUST, 10, 2f,
                    new Item.Properties().tab(DAEMod.DAEModTab)));*/
    public static final RegistryObject<Item> VENEUM_DAGGER = ITEMS.register("veneum_dagger",
            () -> new VeneumSwordItem(2, -1.8f, new Item.Properties().tab(DAEMod.DAEModTab)));
    public static final RegistryObject<Item> SANCTUM_DAGGER = ITEMS.register("sanctum_dagger",
            () -> new SanctumSwordItem(2, -1.8f, new Item.Properties().tab(DAEMod.DAEModTab)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
