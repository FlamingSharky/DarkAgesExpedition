package com.github.flamingsharky.darkagesexpedition.common.registries;

import com.github.flamingsharky.darkagesexpedition.DAExpedition;
import com.github.flamingsharky.darkagesexpedition.common.items.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DAItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DAExpedition.MOD_ID);
    public static final Item.Properties DEFAULT_PROPERTIES = new Item.Properties().tab(DAExpedition.DAE_TAB);
    
    public static final RegistryObject<Item> VENEUM_INGOT = ITEMS.register("veneum_ingot", () -> new Item(DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> VENEUM_NUGGET = ITEMS.register("veneum_nugget", () -> new Item(DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> RAW_VENEUM = ITEMS.register("raw_veneum", () -> new Item(DEFAULT_PROPERTIES));
    
    public static final RegistryObject<Item> SANCTUM_INGOT = ITEMS.register("sanctum_ingot", () -> new Item(DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> SANCTUM_NUGGET = ITEMS.register("sanctum_nugget", () -> new Item(DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> RAW_SANCTUM = ITEMS.register("raw_sanctum", () -> new Item(DEFAULT_PROPERTIES));
    
    public static final RegistryObject<Item> VENEUM_SWORD = ITEMS.register("veneum_sword", () -> new VeneumSwordItem(3, -2.4f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> SANCTUM_SWORD = ITEMS.register("sanctum_sword", () -> new SanctumSwordItem(3, -2.4f, DEFAULT_PROPERTIES));
    
    public static final RegistryObject<Item> SANCTUM_PICKAXE = ITEMS.register("sanctum_pickaxe", () -> new PickaxeItem(WeaponTiers.SANCTUM, 1, 1f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> SANCTUM_SHOVEL = ITEMS.register("sanctum_shovel", () -> new ShovelItem(WeaponTiers.SANCTUM, 0, 0f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> SANCTUM_AXE = ITEMS.register("sanctum_axe", () -> new AxeItem(WeaponTiers.SANCTUM, 4, 0f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> SANCTUM_HOE = ITEMS.register("sanctum_hoe", () -> new HoeItem(WeaponTiers.SANCTUM, 0, 0f, DEFAULT_PROPERTIES));
    
    public static final RegistryObject<Item> VENEUM_PICKAXE = ITEMS.register("veneum_pickaxe", () -> new PickaxeItem(WeaponTiers.SANCTUM, 1, 0f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> VENEUM_SHOVEL = ITEMS.register("veneum_shovel", () -> new ShovelItem(WeaponTiers.SANCTUM, 0, 0f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> VENEUM_AXE = ITEMS.register("veneum_axe", () -> new AxeItem(WeaponTiers.SANCTUM, 4, 0f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> VENEUM_HOE = ITEMS.register("veneum_hoe", () -> new HoeItem(WeaponTiers.SANCTUM, 0, 0f, DEFAULT_PROPERTIES));
    
    //Longswords
    public static final RegistryObject<Item> IRON_LONGSWORD = ITEMS.register("iron_longsword", () -> new SwordItem(Tiers.IRON, 3, -2.8f, DEFAULT_PROPERTIES.durability(2032)));
    public static final RegistryObject<Item> DIAMOND_LONGSWORD = ITEMS.register("diamond_longsword", () -> new SwordItem(Tiers.DIAMOND, 4, -2.8f, DEFAULT_PROPERTIES));
    // public static final RegistryObject<Item> GOLDCRUST_LONGSWORD = ITEMS.register("goldcrust_longsword", () -> new SwordItem(WeaponTiers.GOLDCRUST, 2, -2.8f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> VENEUM_LONGSWORD = ITEMS.register("veneum_longsword", () -> new VeneumSwordItem(4, -2.8f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> SANCTUM_LONGSWORD = ITEMS.register("sanctum_longsword", () -> new SanctumSwordItem(4, -2.8f, DEFAULT_PROPERTIES));
    
    //Waraxes
    public static final RegistryObject<Item> IRON_WARAXE = ITEMS.register("iron_waraxe", () -> new AxeItem(Tiers.IRON, 4, -3.3f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> DIAMOND_WARAXE = ITEMS.register("diamond_waraxe", () -> new AxeItem(Tiers.DIAMOND, 5, -3.3f, DEFAULT_PROPERTIES));
    // public static final RegistryObject<Item> GOLDCRUST_WARAXE = ITEMS.register("goldcrust_waraxe", () -> new AxeItem(WeaponTiers.GOLDCRUST, 10, -3.3f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> VENEUM_WARAXE = ITEMS.register("veneum_waraxe", () -> new VeneumWarAxeItem(5, -3.3f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> SANCTUM_WARAXE = ITEMS.register("sanctum_waraxe", () -> new SanctumWarAxeItem(5, -3.3f, DEFAULT_PROPERTIES));
    
    //Daggers
    public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger", () -> new SwordItem(Tiers.IRON, 2, -1.8f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger", () -> new SwordItem(Tiers.DIAMOND,   2, -1.8f, DEFAULT_PROPERTIES));
    // public static final RegistryObject<Item> GOLDCRUST_DAGGER = ITEMS.register("goldcrust_dagger", () -> new SwordItem(WeaponTiers.GOLDCRUST, 10, 2f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> VENEUM_DAGGER = ITEMS.register("veneum_dagger", () -> new VeneumSwordItem(2, -1.8f, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> SANCTUM_DAGGER = ITEMS.register("sanctum_dagger", () -> new SanctumSwordItem(2, -1.8f, DEFAULT_PROPERTIES));
    
    //region BLOCK ITEMS
    public static final RegistryObject<Item> SANCTUM_ORE_ITEM = fromBlock(DABlocks.SANCTUM_ORE);
    public static final RegistryObject<Item> DEEPSLATE_SANCTUM_ORE_ITEM = fromBlock(DABlocks.DEEPSLATE_SANCTUM_ORE);
    public static final RegistryObject<Item> TUFF_SANCTUM_ORE_ITEM = fromBlock(DABlocks.TUFF_SANCTUM_ORE);
    public static final RegistryObject<Item> RAW_SANCTUM_BLOCK_ITEM = fromBlock(DABlocks.RAW_SANCTUM_BLOCK);
    public static final RegistryObject<Item> SANCTUM_BLOCK_ITEM = fromBlock(DABlocks.SANCTUM_BLOCK);

    public static final RegistryObject<Item> VENEUM_ORE_ITEM = fromBlock(DABlocks.VENEUM_ORE);
    public static final RegistryObject<Item> DEEPSLATE_VENEUM_ORE_ITEM = fromBlock(DABlocks.DEEPSLATE_VENEUM_ORE);
    public static final RegistryObject<Item> TUFF_VENEUM_ORE_ITEM = fromBlock(DABlocks.TUFF_VENEUM_ORE);
    public static final RegistryObject<Item> RAW_VENEUM_BLOCK_ITEM = fromBlock(DABlocks.RAW_VENEUM_BLOCK);
    public static final RegistryObject<Item> VENEUM_BLOCK_ITEM = fromBlock(DABlocks.VENEUM_BLOCK);
    
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), DEFAULT_PROPERTIES));
    }
}
