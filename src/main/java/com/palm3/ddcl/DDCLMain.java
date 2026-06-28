package com.palm3.ddcl;

import com.palm3.ddcl.configs.DDCLClientConfig;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DDCLMain.MOD_ID)
public class DDCLMain {
    public static final String MOD_ID = "ddcl";
    public static final String DECO_ID = "createdeco";

    public static final CreateRegistrate DDCL_REGISTRATE = CreateRegistrate.create(MOD_ID).defaultCreativeTab((ResourceKey<CreativeModeTab>) null);

    public DDCLMain(FMLJavaModLoadingContext ctx) {
        IEventBus modEventBus = ctx.getModEventBus();
        DDCL_REGISTRATE.registerEventListeners(modEventBus);

        ctx.registerConfig(ModConfig.Type.CLIENT, DDCLClientConfig.CONFIG_SPEC);

        DDCLBlocks.register();
        DDCLItems.register();
        DDCLBlockEntities.register();
        DDCLTabs.DDCL_TABS.register(modEventBus);
        DDCLLangs.addLangs();
    }

    public static ResourceLocation modRes(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static ResourceLocation decoRes(String path) {
        return ResourceLocation.fromNamespaceAndPath(DECO_ID, path);
    }
}
