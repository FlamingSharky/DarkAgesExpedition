package com.github.flamingsharky.darkagesexpedition.common.registries;

import com.github.flamingsharky.darkagesexpedition.DAExpedition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DATags {
    public static void setup() {
        DATags.Blocks.init();
        DATags.Items.init();
    }
    
    public static class Blocks {
        private static void init() {}
        
        public static final TagKey<Block> VENEUM_BLOCKS = tag("veneum_blocks");
        public static final TagKey<Block> SANCTUM_BLOCKS = tag("sanctum_blocks");
        
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(DAExpedition.resource(name));
        }
        
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
    
    public static class Items {
        private static void init() {}
    
        public static final TagKey<Item> VENEUM_BLOCKS_ITEM = tag("veneum_blocks");
        public static final TagKey<Item> SANCTUM_BLOCKS_ITEM = tag("sanctum_blocks");
    
    
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(DAExpedition.resource(name));
        }
        
        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
