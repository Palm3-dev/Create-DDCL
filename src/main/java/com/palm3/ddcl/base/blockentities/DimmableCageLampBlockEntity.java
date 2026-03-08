package com.palm3.ddcl.base.blockentities;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class DimmableCageLampBlockEntity extends BlockEntity {

    public boolean reverseBehaviour = false;  // If the lamp works in reverse (powered -> off, unpowered -> on)

    public DimmableCageLampBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.putBoolean("reverse_pwr", this.reverseBehaviour);
    }

    public void setReverseBehaviour(boolean reverseBehaviour) {
        this.reverseBehaviour = reverseBehaviour;
        setChanged();
    }

    @Override
    public void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        this.reverseBehaviour = tag.getBoolean("reverse_pwr");
    }

    public boolean getReverseBehaviour() {
        return this.reverseBehaviour;
    }
}