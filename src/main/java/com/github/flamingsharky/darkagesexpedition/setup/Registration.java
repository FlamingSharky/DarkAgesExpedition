package com.github.flamingsharky.darkagesexpedition.setup;

import com.github.flamingsharky.darkagesexpedition.DAEMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DAEMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, DAEMod.MOD_ID);

    public static void init() {
            IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
            BLOCKS.register(bus);
            ITEMS.register(bus);
    }
    //Tags
    public static final Tags.IOptionalNamedTag<Block> VENEUM_BLOCKS = BlockTags.createOptional(new ResourceLocation(DAEMod.MOD_ID, "veneum_blocks"));
    public static final Tags.IOptionalNamedTag<Item> VENEUM_BLOCKS_ITEM = ItemTags.createOptional(new ResourceLocation(DAEMod.MOD_ID, "veneum_blocks"));

    public static final Tags.IOptionalNamedTag<Block> SANCTUM_BLOCKS = BlockTags.createOptional(new ResourceLocation(DAEMod.MOD_ID, "sanctum_blocks"));
    public static final Tags.IOptionalNamedTag<Item> SANCTUM_BLOCKS_ITEM = ItemTags.createOptional(new ResourceLocation(DAEMod.MOD_ID, "sanctum_blocks"));


    //BLOCKS

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(DAEMod.DAEModTab);

    //Poison
    public static final BlockBehaviour.Properties VENEUM_PROPERTIES = BlockBehaviour.Properties.of(Material.METAL).strength(3F).requiresCorrectToolForDrops();

    public static final RegistryObject<Block> VENEUM_ORE = BLOCKS.register("veneum_ore", () -> new Block(VENEUM_PROPERTIES));
    public static final RegistryObject<Block> DEEPSLATE_VENEUM_ORE = BLOCKS.register("deepslate-veneum_ore", () -> new Block(VENEUM_PROPERTIES));
    public static final RegistryObject<Block> TUFF_VENEUM_ORE = BLOCKS.register("tuff-veneum_ore", () -> new Block(VENEUM_PROPERTIES));
    public static final RegistryObject<Block> RAW_VENEUM_BLOCK = BLOCKS.register("raw-veneum_block", () -> new Block(VENEUM_PROPERTIES));
    public static final RegistryObject<Block> VENEUM_BLOCK = BLOCKS.register("veneum_block", () -> new Block(VENEUM_PROPERTIES));

    //SANCTUM
    public static final BlockBehaviour.Properties SANCTUM_PROPERTIES = BlockBehaviour.Properties.of(Material.METAL).strength(3F).requiresCorrectToolForDrops();

    public static final RegistryObject<Block> SANCTUM_ORE = BLOCKS.register("sanctum_ore", () -> new Block(SANCTUM_PROPERTIES));
    public static final RegistryObject<Block> DEEPSLATE_SANCTUM_ORE = BLOCKS.register("deepslate-sanctum_ore", () -> new Block(SANCTUM_PROPERTIES));
    public static final RegistryObject<Block> TUFF_SANCTUM_ORE = BLOCKS.register("tuff-sanctum_ore", () -> new Block(VENEUM_PROPERTIES));
    public static final RegistryObject<Block> RAW_SANCTUM_BLOCK = BLOCKS.register("raw-sanctum_block", () -> new Block(SANCTUM_PROPERTIES));
    public static final RegistryObject<Block> SANCTUM_BLOCK = BLOCKS.register("sanctum_block", () -> new Block(SANCTUM_PROPERTIES));

    //Block Item (Probably should use a different note name since there is already a value which is BlockItem, but it just gets the block and turns it into an item.)
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }

    //ITEMS
    //SANCTUM
    public static final RegistryObject<Item> SANCTUM_ORE_ITEM = fromBlock(SANCTUM_ORE);
    public static final RegistryObject<Item> DEEPSLATE_SANCTUM_ORE_ITEM = fromBlock(DEEPSLATE_SANCTUM_ORE);
    public static final RegistryObject<Item> TUFF_SANCTUM_ORE_ITEM = fromBlock(TUFF_SANCTUM_ORE);
    public static final RegistryObject<Item> RAW_SANCTUM_BLOCK_ITEM = fromBlock(RAW_SANCTUM_BLOCK);
    public static final RegistryObject<Item> SANCTUM_BLOCK_ITEM = fromBlock(SANCTUM_BLOCK);

    public static final RegistryObject<Item> SANCTUM_INGOT = ITEMS.register("sanctum_ingot",
            () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> SANCTUM_NUGGET = ITEMS.register("sanctum_nugget",
            () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> RAW_SANCTUM = ITEMS.register("raw_sanctum",
            () -> new Item(ITEM_PROPERTIES));

    //VENEUM
    public static final RegistryObject<Item> VENEUM_ORE_ITEM = fromBlock(VENEUM_ORE);
    public static final RegistryObject<Item> DEEPSLATE_VENEUM_ORE_ITEM = fromBlock(DEEPSLATE_VENEUM_ORE);
    public static final RegistryObject<Item> TUFF_VENEUM_ORE_ITEM = fromBlock(TUFF_VENEUM_ORE);
    public static final RegistryObject<Item> RAW_VENEUM_BLOCK_ITEM = fromBlock(RAW_VENEUM_BLOCK);
    public static final RegistryObject<Item> VENEUM_BLOCK_ITEM = fromBlock(VENEUM_BLOCK);

    public static final RegistryObject<Item> VENEUM_INGOT = ITEMS.register("veneum_ingot",
            () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> VENEUM_NUGGET = ITEMS.register("veneum_nugget",
            () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> RAW_VENEUM = ITEMS.register("raw_veneum",
            () -> new Item(ITEM_PROPERTIES));
}