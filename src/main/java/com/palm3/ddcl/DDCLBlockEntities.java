package com.palm3.ddcl;

import com.palm3.ddcl.base.blockentities.DimmableCageLampBlockEntity;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

import static com.palm3.ddcl.DDCLMain.DDCL_REGISTRATE;

public class DDCLBlockEntities {

    public static final BlockEntityEntry<DimmableCageLampBlockEntity> DIMMABLE_LAMPS_BE = DDCL_REGISTRATE
            .blockEntity("dimmable_lamp_be", DimmableCageLampBlockEntity::new)
            .validBlocks(
                    DDCLBlocks.GREEN_ANDESITE_DIMM_LAMP::get,
                    DDCLBlocks.YELLOW_ANDESITE_DIMM_LAMP::get,
                    DDCLBlocks.RED_ANDESITE_DIMM_LAMP::get,
                    DDCLBlocks.BLUE_ANDESITE_DIMM_LAMP::get,
                    DDCLBlocks.GREEN_IRON_DIMM_LAMP::get,
                    DDCLBlocks.YELLOW_IRON_DIMM_LAMP::get,
                    DDCLBlocks.RED_IRON_DIMM_LAMP::get,
                    DDCLBlocks.BLUE_IRON_DIMM_LAMP::get,
                    DDCLBlocks.GREEN_INDUSTRIAL_IRON_DIMM_LAMP::get,
                    DDCLBlocks.YELLOW_INDUSTRIAL_IRON_DIMM_LAMP::get,
                    DDCLBlocks.RED_INDUSTRIAL_IRON_DIMM_LAMP::get,
                    DDCLBlocks.BLUE_INDUSTRIAL_IRON_DIMM_LAMP::get,
                    DDCLBlocks.GREEN_BRASS_DIMM_LAMP::get,
                    DDCLBlocks.YELLOW_BRASS_DIMM_LAMP::get,
                    DDCLBlocks.RED_BRASS_DIMM_LAMP::get,
                    DDCLBlocks.BLUE_BRASS_DIMM_LAMP::get,
                    DDCLBlocks.GREEN_COPPER_DIMM_LAMP::get,
                    DDCLBlocks.YELLOW_COPPER_DIMM_LAMP::get,
                    DDCLBlocks.RED_COPPER_DIMM_LAMP::get,
                    DDCLBlocks.BLUE_COPPER_DIMM_LAMP::get,
                    DDCLBlocks.GREEN_ZINC_DIMM_LAMP::get,
                    DDCLBlocks.YELLOW_ZINC_DIMM_LAMP::get,
                    DDCLBlocks.RED_ZINC_DIMM_LAMP::get,
                    DDCLBlocks.BLUE_ZINC_DIMM_LAMP::get,
                    DDCLBlocks.GREEN_GOLD_DIMM_LAMP::get,
                    DDCLBlocks.YELLOW_GOLD_DIMM_LAMP::get,
                    DDCLBlocks.RED_GOLD_DIMM_LAMP::get,
                    DDCLBlocks.BLUE_GOLD_DIMM_LAMP::get,
                    DDCLBlocks.GREEN_NETHERITE_DIMM_LAMP::get,
                    DDCLBlocks.YELLOW_NETHERITE_DIMM_LAMP::get,
                    DDCLBlocks.RED_NETHERITE_DIMM_LAMP::get,
                    DDCLBlocks.BLUE_NETHERITE_DIMM_LAMP::get
            )
            .register();

    public static void register() {}
}
