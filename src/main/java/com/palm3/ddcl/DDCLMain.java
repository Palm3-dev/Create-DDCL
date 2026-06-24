package com.palm3.ddcl;

import com.mojang.logging.LogUtils;
import com.palm3.ddcl.configs.DDCLClientConfig;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(DDCLMain.MOD_ID)
public class DDCLMain {
    public static final String MOD_ID = "ddcl";
    public static final String DECO_ID = "createdeco";

    public static final CreateRegistrate DDCL_REGISTRATE = CreateRegistrate.create(MOD_ID).defaultCreativeTab((ResourceKey<CreativeModeTab>) null);

    public static final Logger LOGGER = LogUtils.getLogger();

    public DDCLMain(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.CLIENT, DDCLClientConfig.CONFIG_SPEC);
        DDCL_REGISTRATE.registerEventListeners(modEventBus);
        DDCLBlocks.register();
        DDCLItems.register();
        DDCLBlockEntities.register();
        DDCLTabs.DDCL_TABS.register(modEventBus);
        DDCLLangs.addLangs();
    }

    public static ResourceLocation resource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static ResourceLocation deco(String path) {
        return ResourceLocation.fromNamespaceAndPath(DECO_ID, path);
    }
}
