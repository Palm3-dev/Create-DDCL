package com.palm3.ddcl;

import com.palm3.ddcl.ponder.DDCLPonderPlugin;
import net.createmod.ponder.foundation.PonderIndex;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class DDCLClient {

    public static void onCtorClient(IEventBus modEventBus) {
        modEventBus.addListener(DDCLClient::clientInit);
    }

    public static void clientInit(final FMLClientSetupEvent event) {
        PonderIndex.addPlugin(new DDCLPonderPlugin());
    }
}
