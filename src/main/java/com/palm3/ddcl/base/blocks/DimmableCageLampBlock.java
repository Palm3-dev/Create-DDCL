package com.palm3.ddcl.base.blocks;

import com.palm3.ddcl.DDCLBlockEntities;
import com.palm3.ddcl.DDCLMain;
import com.palm3.ddcl.base.blockentities.DimmableCageLampBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.Map;

public class DimmableCageLampBlock extends Block implements EntityBlock {

    public static final IntegerProperty LIGHT_LEVEL = IntegerProperty.create("light_level", 0, 15);
    public static final DirectionProperty FACING = BlockStateProperties.FACING;


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(LIGHT_LEVEL, FACING);
    }

    public DimmableCageLampBlock(Properties props) {
        super(props.lightLevel(state -> state.getValue(LIGHT_LEVEL)));
        this.registerDefaultState(this.defaultBlockState()
                .setValue(LIGHT_LEVEL, 0)
                .setValue(FACING, Direction.NORTH)
        );
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new DimmableCageLampBlockEntity(DDCLBlockEntities.DIMMABLE_LAMPS_BE.get(), pos, state);
    }

    // Shape
    public static final VoxelShape SHAPE_UP = DimmableCageLampBlock.box(5, 0,5,11, 8, 11);
    public static final VoxelShape SHAPE_DOWN = DimmableCageLampBlock.box(5, 9, 5, 11, 16 ,11);
    public static final VoxelShape SHAPE_NORTH = DimmableCageLampBlock.box(5, 5, 0, 11, 11, 8);
    public static final VoxelShape SHAPE_SOUTH = DimmableCageLampBlock.box(5, 5, 9, 11, 11, 16);
    public static final VoxelShape SHAPE_WEST = DimmableCageLampBlock.box(0, 5, 5, 8, 11, 11);
    public static final VoxelShape SHAPE_EAST = DimmableCageLampBlock.box(9, 5, 5, 16, 11, 11);

    private static final Map<Direction, VoxelShape> SHAPES = Map.of(
            Direction.UP, SHAPE_UP,
            Direction.DOWN, SHAPE_DOWN,
            Direction.NORTH, SHAPE_NORTH,
            Direction.SOUTH, SHAPE_SOUTH,
            Direction.EAST, SHAPE_EAST,
            Direction.WEST, SHAPE_WEST
    );


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPES.getOrDefault(state.getValue(FACING), SHAPE_UP);
    }

    // Behaviour
    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (!level.isClientSide) {
            int powerLevel = level.getBestNeighborSignal(pos);
            BlockEntity be = level.getBlockEntity(pos);

            if (be instanceof DimmableCageLampBlockEntity lamp) {
                DDCLMain.LOGGER.info("IS_ISTANCE");
                if (powerLevel != state.getValue(LIGHT_LEVEL) && !lamp.getReverseBehaviour()) {
                    level.setBlock(pos, state.setValue(LIGHT_LEVEL, powerLevel), 3);
                } else if (lamp.getReverseBehaviour()) {
                    level.setBlock(pos, state.setValue(LIGHT_LEVEL, 15 - powerLevel), 3);
                }
            }
        }
    }

    @Override
    public ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (!level.isClientSide) {
            int powerLevel = level.getBestNeighborSignal(pos);
            BlockEntity be = level.getBlockEntity(pos);

            if (be instanceof DimmableCageLampBlockEntity lamp) {
                lamp.setReverseBehaviour(!lamp.getReverseBehaviour());  // Switch behaviour
                if (lamp.getReverseBehaviour()) {
                    level.setBlock(pos, state.setValue(LIGHT_LEVEL, 15 - powerLevel), 3);
                    level.playSound(null, pos, SoundEvents.LEVER_CLICK, SoundSource.BLOCKS, 0.5f, 1.3f);
                } else {
                    level.setBlock(pos, state.setValue(LIGHT_LEVEL, powerLevel), 3);
                    level.playSound(null, pos, SoundEvents.LEVER_CLICK, SoundSource.BLOCKS, 0.5f, 1.1f);
                }
            }
        }
        return ItemInteractionResult.SUCCESS;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        if (context.getClickedFace() == Direction.UP || context.getClickedFace() == Direction.DOWN) {
            return this.defaultBlockState().setValue(FACING, context.getClickedFace());
        } else {
            return this.defaultBlockState().setValue(FACING, context.getClickedFace().getOpposite());
        }
    }

    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter level, BlockPos pos, @Nullable Direction direction) {
        return true;
    }
}
