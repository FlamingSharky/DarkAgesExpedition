package com.github.flamingsharky.darkagesexpedition;


import com.github.flamingsharky.darkagesexpedition.setup.ClientSetup;
import com.github.flamingsharky.darkagesexpedition.setup.ModSetup;
import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import com.github.flamingsharky.darkagesexpedition.setup.Tool_List;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(DAEMod.MOD_ID)
public class DAEMod {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "darkagesexpedition";

    public DAEMod() {
        Registration.init();
        // Register ourselves for server and other game events we are interested in
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(ModSetup::init);
        if (FMLEnvironment.dist == Dist.CLIENT) {
            eventBus.addListener(ClientSetup::init);
        }
        ModSetup.setup();
        Tool_List.register(eventBus);
    }

    public static final CreativeModeTab DAEModTab = new CreativeModeTab("darkagescreativetab") {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(Registration.SANCTUM_INGOT.get());
        }
    };
}
