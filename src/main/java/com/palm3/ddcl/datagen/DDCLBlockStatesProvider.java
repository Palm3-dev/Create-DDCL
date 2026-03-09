package com.palm3.ddcl.datagen;

import com.palm3.ddcl.DDCLBlocks;
import com.palm3.ddcl.base.blocks.DimmableCageLampBlock;
import com.palm3.ddcl.base.blocks.DoubleTextureDimmableCageLampBlock;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DDCLBlockStatesProvider extends BlockStateProvider {

    public DDCLBlockStatesProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Single textures
        registerLamp(DDCLBlocks.GREEN_ANDESITE_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.GREEN_BRASS_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.GREEN_IRON_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.GREEN_INDUSTRIAL_IRON_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.GREEN_ZINC_DIMM_LAMP.get());

        registerLamp(DDCLBlocks.YELLOW_ANDESITE_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.YELLOW_BRASS_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.YELLOW_IRON_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.YELLOW_INDUSTRIAL_IRON_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.YELLOW_ZINC_DIMM_LAMP.get());

        registerLamp(DDCLBlocks.RED_ANDESITE_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.RED_BRASS_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.RED_IRON_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.RED_INDUSTRIAL_IRON_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.RED_ZINC_DIMM_LAMP.get());

        registerLamp(DDCLBlocks.BLUE_ANDESITE_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.BLUE_BRASS_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.BLUE_IRON_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.BLUE_INDUSTRIAL_IRON_DIMM_LAMP.get());
        registerLamp(DDCLBlocks.BLUE_ZINC_DIMM_LAMP.get());

        // Double textures
        registerDoubleTextureLamp(DDCLBlocks.GREEN_COPPER_DIMM_LAMP.get());
        registerDoubleTextureLamp(DDCLBlocks.YELLOW_COPPER_DIMM_LAMP.get());
        registerDoubleTextureLamp(DDCLBlocks.RED_COPPER_DIMM_LAMP.get());
        registerDoubleTextureLamp(DDCLBlocks.BLUE_COPPER_DIMM_LAMP.get());
    }

    protected void registerLamp(Block block) {  // For only 1 texture (DimmableCageLampBlock)
        getVariantBuilder(block).forAllStates(state -> {
            String blockName = BuiltInRegistries.BLOCK.getKey(block).getPath();  // Block name
            Direction facing = state.getValue(DimmableCageLampBlock.FACING);      // Facing
            int lightLevel = state.getValue(DimmableCageLampBlock.LIGHT_LEVEL);   // Light Level

            String isOn = lightLevel > 0 ? "_on" : "_off";

            var model = models().getExistingFile(modLoc("block/" + blockName + isOn));

            int xRot = facing == Direction.DOWN ? 180 : (facing.getAxis().isHorizontal() ? 90 : 0);
            int yRot = (int) facing.toYRot();

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationX(xRot)
                    .rotationY(yRot)
                    .build();
        });
    }

    protected void registerDoubleTextureLamp(Block block) {  // For only 2 texture (DoubleTextureDimmableCageLampBlock)
        getVariantBuilder(block).forAllStates(state -> {
            String blockName = BuiltInRegistries.BLOCK.getKey(block).getPath();  // Block name
            Direction facing = state.getValue(DimmableCageLampBlock.FACING);      // Facing
            int lightLevel = state.getValue(DimmableCageLampBlock.LIGHT_LEVEL);   // Light Level
            boolean oldVersion = state.getValue(DoubleTextureDimmableCageLampBlock.OLD_TEXTURE);  // Old texture lamp

            String suffix;
            if (oldVersion && lightLevel > 0) {
                suffix = "_old_on";
            } else if (!oldVersion && lightLevel > 0) {
                suffix = "_on";
            } else if (oldVersion && lightLevel == 0) {
                suffix = "_old_off";
            } else {
                suffix = "_off";
            }

            var model = models().getExistingFile(modLoc("block/" + blockName + suffix));

            int xRot = facing == Direction.DOWN ? 180 : (facing.getAxis().isHorizontal() ? 90 : 0);
            int yRot = (int) facing.toYRot();

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationX(xRot)
                    .rotationY(yRot)
                    .build();
        });
    }
}
