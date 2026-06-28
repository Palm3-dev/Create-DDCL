package com.palm3.ddcl.base.blockentities;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class DimmableCageLampBlockEntity extends BlockEntity {

    private boolean reverseBehaviour = false;  // If the lamp works in reverse (powered -> off, unpowered -> on)

    public DimmableCageLampBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putBoolean("reverse_pwr", this.reverseBehaviour);
    }

    public void setReverseBehaviour(boolean reverseBehaviour) {
        this.reverseBehaviour = reverseBehaviour;
        setChanged();
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        this.reverseBehaviour = tag.getBoolean("reverse_pwr");
    }

    public boolean getReverseBehaviour() {
        return this.reverseBehaviour;
    }
}