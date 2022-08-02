package com.github.flamingsharky.darkagesexpedition.common.registries;

import com.github.flamingsharky.darkagesexpedition.DAExpedition;
import com.github.flamingsharky.darkagesexpedition.common.world.blocks.DAEVeneumOre;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DABlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DAExpedition.MOD_ID);
    
    //Poison
    public static final BlockBehaviour.Properties VENEUM_PROPERTIES = BlockBehaviour.Properties.of(Material.METAL).strength(3F).requiresCorrectToolForDrops();
    
    public static final RegistryObject<Block> VENEUM_ORE = BLOCKS.register("veneum_ore", () -> new DAEVeneumOre(VENEUM_PROPERTIES));
    public static final RegistryObject<Block> DEEPSLATE_VENEUM_ORE = BLOCKS.register("deepslate_veneum_ore", () -> new DAEVeneumOre(VENEUM_PROPERTIES));
    public static final RegistryObject<Block> TUFF_VENEUM_ORE = BLOCKS.register("tuff_veneum_ore", () -> new DAEVeneumOre(VENEUM_PROPERTIES));
    public static final RegistryObject<Block> RAW_VENEUM_BLOCK = BLOCKS.register("raw_veneum_block", () -> new Block(VENEUM_PROPERTIES));
    public static final RegistryObject<Block> VENEUM_BLOCK = BLOCKS.register("veneum_block", () -> new Block(VENEUM_PROPERTIES));
    
    //SANCTUM
    public static final BlockBehaviour.Properties SANCTUM_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(3F).requiresCorrectToolForDrops().lightLevel((state) -> {return 5;});
    
    public static final RegistryObject<Block> SANCTUM_ORE = BLOCKS.register("sanctum_ore", () -> new Block(SANCTUM_PROPERTIES));
    public static final RegistryObject<Block> DEEPSLATE_SANCTUM_ORE = BLOCKS.register("deepslate_sanctum_ore", () -> new Block(SANCTUM_PROPERTIES));
    public static final RegistryObject<Block> TUFF_SANCTUM_ORE = BLOCKS.register("tuff_sanctum_ore", () -> new Block(SANCTUM_PROPERTIES));
    public static final RegistryObject<Block> RAW_SANCTUM_BLOCK = BLOCKS.register("raw_sanctum_block", () -> new Block(SANCTUM_PROPERTIES));
    public static final RegistryObject<Block> SANCTUM_BLOCK = BLOCKS.register("sanctum_block", () -> new Block(SANCTUM_PROPERTIES));
}
