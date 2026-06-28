package com.palm3.ddcl.ponder;

import com.palm3.ddcl.DDCLMain;
import com.palm3.ddcl.DDCLPonders;
import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

public class DDCLPonderPlugin implements PonderPlugin {
    @Override
    public String getModId() {
        return DDCLMain.MOD_ID;
    }

    @Override
    public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        DDCLPonders.registerScenes(helper);
    }

    @Override
    public void registerTags(PonderTagRegistrationHelper<ResourceLocation> helper) {
        DDCLPonders.registerTags(helper);
    }
}
