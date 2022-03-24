package com.github.flamingsharky.darkagesexpedition.setup;

import com.github.flamingsharky.darkagesexpedition.DAEMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
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

    //BLOCKS

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(DAEMod.DAEModTab);

    //Greenmetal
    public static final BlockBehaviour.Properties GREENMETAL_PROPERTIES = BlockBehaviour.Properties.of(Material.METAL).strength(3F).requiresCorrectToolForDrops();

    public static final RegistryObject<Block> GREENMETAL_ORE = BLOCKS.register("poisonmetal_ore", () -> new Block(GREENMETAL_PROPERTIES));
    public static final RegistryObject<Item> GREENMETAL_ORE_ITEM = fromBlock(GREENMETAL_ORE);
    public static final RegistryObject<Block> DEEPSLATE_GREENMETAL_ORE = BLOCKS.register("deepslate-poisonmetal_ore", () -> new Block(GREENMETAL_PROPERTIES));
    public static final RegistryObject<Item> DEEPSLATE_GREENMETAL_ORE_ITEM = fromBlock(DEEPSLATE_GREENMETAL_ORE);
    public static final RegistryObject<Block> RAW_GREENMETAL_BLOCK = BLOCKS.register("raw-poisonmetal_block", () -> new Block(GREENMETAL_PROPERTIES));
    public static final RegistryObject<Item> RAW_GREENMETAL_BLOCK_ITEM = fromBlock(RAW_GREENMETAL_BLOCK);
    public static final RegistryObject<Block> GREENMETAL_BLOCK = BLOCKS.register("poisonmetal_block", () -> new Block(GREENMETAL_PROPERTIES));
    public static final RegistryObject<Item> GREENMETAL_BLOCK_ITEM = fromBlock(GREENMETAL_BLOCK);

    //Whitemetal
    public static final BlockBehaviour.Properties WHITEMETAL_PROPERTIES = BlockBehaviour.Properties.of(Material.METAL).strength(3F).requiresCorrectToolForDrops();

    public static final RegistryObject<Block> WHITEMETAL_ORE = BLOCKS.register("holymetal_ore", () -> new Block(WHITEMETAL_PROPERTIES));
    public static final RegistryObject<Item> WHITEMETAL_ORE_ITEM = fromBlock(WHITEMETAL_ORE);
    public static final RegistryObject<Block> DEEPSLATE_WHITEMETAL_ORE = BLOCKS.register("deepslate-holymetal_ore", () -> new Block(WHITEMETAL_PROPERTIES));
    public static final RegistryObject<Item> DEEPSLATE_WHITEMETAL_ORE_ITEM = fromBlock(DEEPSLATE_WHITEMETAL_ORE);
    public static final RegistryObject<Block> RAW_WHITEMETAL_BLOCK = BLOCKS.register("raw-holymetal_block", () -> new Block(WHITEMETAL_PROPERTIES));
    public static final RegistryObject<Item> RAW_WHITEMETAL_BLOCK_ITEM = fromBlock(RAW_WHITEMETAL_BLOCK);
    public static final RegistryObject<Block> WHITEMETAL_BLOCK = BLOCKS.register("holymetal_block", () -> new Block(WHITEMETAL_PROPERTIES));
    public static final RegistryObject<Item> WHITEMETAL_BLOCK_ITEM = fromBlock(WHITEMETAL_BLOCK);


    //Block Item (Probably should use a different note name since there is already a value which is BlockItem, but it just gets the block and turns it into an item.)
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }

    //ITEMS
}
