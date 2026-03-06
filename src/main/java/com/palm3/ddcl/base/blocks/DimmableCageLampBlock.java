package com.palm3.ddcl.base.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DimmableCageLampBlock extends Block {

    public static final IntegerProperty LIGHT_LEVEL = IntegerProperty.create("light_level", 0, 15);
    public static final IntegerProperty POWER_LEVEL = BlockStateProperties.POWER;


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(LIGHT_LEVEL);
        builder.add(POWER_LEVEL);
    }

    public DimmableCageLampBlock(Properties props) {
        super(props.lightLevel(state -> state.getValue(LIGHT_LEVEL)));
        this.registerDefaultState(this.defaultBlockState().setValue(LIGHT_LEVEL, 0).setValue(POWER_LEVEL, 0));
    }
    // Shape
    public static final VoxelShape SHAPE = DimmableCageLampBlock.box(5, 0,5,11, 8, 11);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    // Behaviour
    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (!level.isClientSide) {
            int powerLevel = level.getBestNeighborSignal(pos);
            if (powerLevel != state.getValue(LIGHT_LEVEL)) {
                level.setBlock(pos, state.setValue(LIGHT_LEVEL, powerLevel).setValue(POWER_LEVEL, powerLevel), 3);
            }
        }
    }
}
