package com.palm3.ddcl.base.blocks;

import com.palm3.ddcl.base.blockentities.DimmableCageLampBlockEntity;
import com.simibubi.create.AllItems;
import com.simibubi.create.AllSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;

public class DoubleTextureDimmableCageLampBlock extends DimmableCageLampBlock {

    public static final BooleanProperty OLD_TEXTURE = BooleanProperty.create("old");

    public DoubleTextureDimmableCageLampBlock(Properties props) {
        super(props);
        this.registerDefaultState(this.defaultBlockState().setValue(OLD_TEXTURE, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(OLD_TEXTURE);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        ItemStack stack = player.getItemInHand(hand);

        if (!level.isClientSide) {
            int powerLevel = level.getBestNeighborSignal(pos);
            BlockEntity be = level.getBlockEntity(pos);

            if (stack.getItem() != AllItems.WRENCH.asItem()) {
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
            } else {
                level.setBlock(pos, state.setValue(OLD_TEXTURE, !state.getValue(OLD_TEXTURE)), 3);
                level.playSound(null, pos, AllSoundEvents.WRENCH_ROTATE.getMainEvent(), SoundSource.BLOCKS, 0.5f, 1.4f);
            }
        }
        return InteractionResult.SUCCESS;
    }

}
