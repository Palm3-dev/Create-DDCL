package com.palm3.ddcl;

import com.mojang.logging.LogUtils;
import com.palm3.ddcl.configs.DDCLClientConfig;
import com.palm3.ddcl.providers.DDCLBlockStatesProvider;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.slf4j.Logger;

@Mod(DDCLMain.MOD_ID)
public class DDCLMain {
    public static final String MOD_ID = "ddcl";

    public static final CreateRegistrate MOD_REGISTRATE = CreateRegistrate.create(MOD_ID).defaultCreativeTab((ResourceKey<CreativeModeTab>) null);

    public static final Logger LOGGER = LogUtils.getLogger();

    public DDCLMain(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::gatherData);
        modContainer.registerConfig(ModConfig.Type.CLIENT, DDCLClientConfig.CONFIG_SPEC);
        MOD_REGISTRATE.registerEventListeners(modEventBus);
        DDCLBlocks.register();
        DDCLBlockEntities.register();
        DDCLTabs.DDCL_TABS.register(modEventBus);
    }

    public void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();

        gen.addProvider(event.includeClient(), new DDCLBlockStatesProvider(packOutput, MOD_ID, helper));
    }


}
