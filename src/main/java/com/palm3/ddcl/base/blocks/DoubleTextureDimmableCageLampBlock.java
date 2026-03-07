package com.palm3.ddcl.base.blocks;

import com.simibubi.create.AllItems;
import com.simibubi.create.AllSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
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
    public ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (stack.getItem() == AllItems.WRENCH.asItem()) {
            level.setBlock(pos, state.setValue(OLD_TEXTURE, !state.getValue(OLD_TEXTURE)), 3);
            level.playSound(null, pos, AllSoundEvents.WRENCH_ROTATE.getMainEvent(), SoundSource.BLOCKS, 0.5f, 1.4f);
        }
        return ItemInteractionResult.SUCCESS;
    }

}
