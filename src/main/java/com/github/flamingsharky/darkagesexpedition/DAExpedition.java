package com.github.flamingsharky.darkagesexpedition;

import com.github.flamingsharky.darkagesexpedition.client.ClientExecutor;
import com.github.flamingsharky.darkagesexpedition.common.CommonExecutor;
import com.github.flamingsharky.darkagesexpedition.common.registries.DABlocks;
import com.github.flamingsharky.darkagesexpedition.common.registries.DAItems;
import com.github.flamingsharky.darkagesexpedition.common.registries.DATags;
import com.github.flamingsharky.darkagesexpedition.utils.ISidedExecutor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@Mod( DAExpedition.MOD_ID )
public class DAExpedition {
    public static final String MOD_ID = "darkagesexpedition";
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final ISidedExecutor EXECUTOR = DistExecutor.unsafeRunForDist(() -> ClientExecutor::new, () -> CommonExecutor::new);
    
    public static final CreativeModeTab DAE_TAB = new CreativeModeTab(MOD_ID) {
        @Override @NotNull
        public ItemStack makeIcon() {
            return new ItemStack(DAItems.SANCTUM_INGOT.get());
        }
    };
    
    public DAExpedition() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    
        EXECUTOR.setup();
        DABlocks.BLOCKS.register(eventBus);
        DAItems.ITEMS.register(eventBus);
    }
    
    public static ResourceLocation resource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
