package com.palm3.ddcl;

import com.palm3.ddcl.ponder.PonderScenes;
import com.simibubi.create.infrastructure.ponder.AllCreatePonderTags;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

public class DDCLPonders {
    public static final ResourceLocation DIMMABLE_CAGE_LAMPS = DDCLMain.modRes("dimmable_cage_lamps");

    public static void registerTags(PonderTagRegistrationHelper<ResourceLocation> helper) {
        PonderTagRegistrationHelper<RegistryEntry<?>> HELPER = helper.withKeyFunction(RegistryEntry::getId);

        HELPER.registerTag(DIMMABLE_CAGE_LAMPS)
                .addToIndex()
                .item(DDCLBlocks.GREEN_ANDESITE_DIMM_LAMP.get(),true, false)
                .title("Dimmable Cage Lamps")
                .description("Lamps that can change the emitted light level")
                .register();

        HELPER.addToTag(DIMMABLE_CAGE_LAMPS)
                .add(DDCLBlocks.YELLOW_ANDESITE_DIMM_LAMP)
                .add(DDCLBlocks.RED_ANDESITE_DIMM_LAMP)
                .add(DDCLBlocks.BLUE_ANDESITE_DIMM_LAMP)

                .add(DDCLBlocks.GREEN_IRON_DIMM_LAMP)
                .add(DDCLBlocks.YELLOW_IRON_DIMM_LAMP)
                .add(DDCLBlocks.RED_IRON_DIMM_LAMP)
                .add(DDCLBlocks.BLUE_IRON_DIMM_LAMP)

                .add(DDCLBlocks.GREEN_INDUSTRIAL_IRON_DIMM_LAMP)
                .add(DDCLBlocks.YELLOW_INDUSTRIAL_IRON_DIMM_LAMP)
                .add(DDCLBlocks.RED_INDUSTRIAL_IRON_DIMM_LAMP)
                .add(DDCLBlocks.BLUE_INDUSTRIAL_IRON_DIMM_LAMP)

                .add(DDCLBlocks.GREEN_BRASS_DIMM_LAMP)
                .add(DDCLBlocks.YELLOW_BRASS_DIMM_LAMP)
                .add(DDCLBlocks.RED_BRASS_DIMM_LAMP)
                .add(DDCLBlocks.BLUE_BRASS_DIMM_LAMP)

                .add(DDCLBlocks.GREEN_COPPER_DIMM_LAMP)
                .add(DDCLBlocks.YELLOW_COPPER_DIMM_LAMP)
                .add(DDCLBlocks.RED_COPPER_DIMM_LAMP)
                .add(DDCLBlocks.BLUE_COPPER_DIMM_LAMP)

                .add(DDCLBlocks.GREEN_ZINC_DIMM_LAMP)
                .add(DDCLBlocks.YELLOW_ZINC_DIMM_LAMP)
                .add(DDCLBlocks.RED_ZINC_DIMM_LAMP)
                .add(DDCLBlocks.BLUE_ZINC_DIMM_LAMP)

                .add(DDCLBlocks.GREEN_GOLD_DIMM_LAMP)
                .add(DDCLBlocks.YELLOW_GOLD_DIMM_LAMP)
                .add(DDCLBlocks.RED_GOLD_DIMM_LAMP)
                .add(DDCLBlocks.BLUE_GOLD_DIMM_LAMP)

                .add(DDCLBlocks.GREEN_NETHERITE_DIMM_LAMP)
                .add(DDCLBlocks.YELLOW_NETHERITE_DIMM_LAMP)
                .add(DDCLBlocks.RED_NETHERITE_DIMM_LAMP)
                .add(DDCLBlocks.BLUE_NETHERITE_DIMM_LAMP);
    }

    public static void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        PonderSceneRegistrationHelper<ItemProviderEntry<?>> HELPER = helper.withKeyFunction(RegistryEntry::getId);

        HELPER.forComponents(
                DDCLBlocks.GREEN_ANDESITE_DIMM_LAMP,
                DDCLBlocks.YELLOW_ANDESITE_DIMM_LAMP,
                DDCLBlocks.RED_ANDESITE_DIMM_LAMP,
                DDCLBlocks.BLUE_ANDESITE_DIMM_LAMP,

                DDCLBlocks.GREEN_IRON_DIMM_LAMP,
                DDCLBlocks.YELLOW_IRON_DIMM_LAMP,
                DDCLBlocks.RED_IRON_DIMM_LAMP,
                DDCLBlocks.BLUE_IRON_DIMM_LAMP,

                DDCLBlocks.GREEN_INDUSTRIAL_IRON_DIMM_LAMP,
                DDCLBlocks.YELLOW_INDUSTRIAL_IRON_DIMM_LAMP,
                DDCLBlocks.RED_INDUSTRIAL_IRON_DIMM_LAMP,
                DDCLBlocks.BLUE_INDUSTRIAL_IRON_DIMM_LAMP,

                DDCLBlocks.GREEN_BRASS_DIMM_LAMP,
                DDCLBlocks.YELLOW_BRASS_DIMM_LAMP,
                DDCLBlocks.RED_BRASS_DIMM_LAMP,
                DDCLBlocks.BLUE_BRASS_DIMM_LAMP,

                DDCLBlocks.GREEN_COPPER_DIMM_LAMP,
                DDCLBlocks.YELLOW_COPPER_DIMM_LAMP,
                DDCLBlocks.RED_COPPER_DIMM_LAMP,
                DDCLBlocks.BLUE_COPPER_DIMM_LAMP,

                DDCLBlocks.GREEN_ZINC_DIMM_LAMP,
                DDCLBlocks.YELLOW_ZINC_DIMM_LAMP,
                DDCLBlocks.RED_ZINC_DIMM_LAMP,
                DDCLBlocks.BLUE_ZINC_DIMM_LAMP,

                DDCLBlocks.GREEN_GOLD_DIMM_LAMP,
                DDCLBlocks.YELLOW_GOLD_DIMM_LAMP,
                DDCLBlocks.RED_GOLD_DIMM_LAMP,
                DDCLBlocks.BLUE_GOLD_DIMM_LAMP,

                DDCLBlocks.GREEN_NETHERITE_DIMM_LAMP,
                DDCLBlocks.YELLOW_NETHERITE_DIMM_LAMP,
                DDCLBlocks.RED_NETHERITE_DIMM_LAMP,
                DDCLBlocks.BLUE_NETHERITE_DIMM_LAMP
                )
                .addStoryBoard("dimmable_cage_lamps", PonderScenes::dimmableCageLamps, AllCreatePonderTags.REDSTONE, DIMMABLE_CAGE_LAMPS)
                .addStoryBoard("double_texture_dimmable_cage_lamps", PonderScenes::doubleTextureDimmableCageLamps, AllCreatePonderTags.REDSTONE, DIMMABLE_CAGE_LAMPS);
    }
}
