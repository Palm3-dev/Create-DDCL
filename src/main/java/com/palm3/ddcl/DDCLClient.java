package com.palm3.ddcl;

import com.palm3.ddcl.ponder.DDCLPonderPlugin;
import net.createmod.ponder.foundation.PonderIndex;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(value = DDCLMain.MOD_ID, dist = Dist.CLIENT)
public class DDCLClient {

    public DDCLClient(IEventBus modEventBus) {
        onCtorClient(modEventBus);
    }

    public static void onCtorClient(IEventBus modEventBus) {
        //IEventBus neoEventBus = NeoForge.EVENT_BUS;

        modEventBus.addListener(DDCLClient::clientInit);
    }

    public static void clientInit(final FMLClientSetupEvent event) {
        PonderIndex.addPlugin(new DDCLPonderPlugin());
    }
}
