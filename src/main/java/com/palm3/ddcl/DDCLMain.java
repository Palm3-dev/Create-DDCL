package com.palm3.ddcl;

import com.palm3.ddcl.configs.DDCLClientConfig;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(DDCLMain.MOD_ID)
public class DDCLMain {
    public static final String MOD_ID = "ddcl";

    public static final CreateRegistrate MOD_REGISTRATE = CreateRegistrate.create(MOD_ID).defaultCreativeTab((ResourceKey<CreativeModeTab>) null);

    public DDCLMain(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.CLIENT, DDCLClientConfig.CONFIG_SPEC);
        MOD_REGISTRATE.registerEventListeners(modEventBus);
        DDCLBlocks.register();
        DDCLTabs.DDCL_TABS.register(modEventBus);
    }
}
