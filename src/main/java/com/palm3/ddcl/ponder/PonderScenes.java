package com.palm3.ddcl.ponder;

import com.palm3.ddcl.base.blocks.DimmableCageLampBlock;
import com.palm3.ddcl.base.blocks.DoubleTextureDimmableCageLampBlock;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import com.simibubi.create.content.redstone.analogLever.AnalogLeverBlock;
import com.simibubi.create.content.redstone.analogLever.AnalogLeverBlockEntity;
import com.simibubi.create.content.redstone.link.RedstoneLinkBlock;
import com.simibubi.create.content.redstone.link.RedstoneLinkBlockEntity;
import com.simibubi.create.foundation.ponder.CreateSceneBuilder;
import net.createmod.catnip.math.Pointing;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.createmod.ponder.api.scene.Selection;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class PonderScenes {

    public static void dimmableCageLamps(SceneBuilder builder, SceneBuildingUtil util) {
        CreateSceneBuilder scene = new CreateSceneBuilder(builder);
        scene.title("dimmable_cage_lamps", "Normal Lamps");
        scene.configureBasePlate(0, 0, 5);
        scene.world().showSection(util.select().layers(0 ,3), Direction.UP);

        // Pos
        BlockPos lampPos = util.grid().at(3, 2, 1);
        BlockPos analogLeverPos = util.grid().at(1, 1, 1);
        BlockPos txLinkPos = util.grid().at(1, 1, 2);
        BlockPos rxLinkPos = util.grid().at(2, 2, 2);

        // Vec3  idk
        Vec3 lampVec = util.vector().centerOf(lampPos)
                .add(0, .25, .25);

        // Scene
        // 1.
        scene.idle(10);
        scene.overlay().showText(70)
                .attachKeyFrame()
                .text("Dimmable Cage Lamps can change their brightness by varying the redstone power of the block.")
                .placeNearTarget()
                .pointAt(util.vector().centerOf(lampPos));
        scene.idle(90);
        for (int i = 0; i < 8; i++) {
            int leverPower = i;
            scene.world().modifyBlockEntityNBT(util.select().position(analogLeverPos), AnalogLeverBlockEntity.class,
                    tag -> tag.putInt("State", leverPower));
            scene.idle(2);
        }
        scene.idle(5);
        scene.world().modifyBlock(txLinkPos, state -> state.setValue(RedstoneLinkBlock.POWERED, true), false);
        scene.effects().indicateRedstone(txLinkPos);
        scene.world().modifyBlock(rxLinkPos, state -> state.setValue(RedstoneLinkBlock.POWERED, true), false);
        scene.effects().indicateRedstone(rxLinkPos);
        scene.world().modifyBlock(lampPos, state -> state.setValue(DimmableCageLampBlock.LIGHT_LEVEL, 7), false);
        scene.idle(60);

        // 2.
        for (int i = 7; i > 0; i--) {
            int leverPower = i;
            scene.world().modifyBlockEntityNBT(util.select().position(analogLeverPos), AnalogLeverBlockEntity.class,
                    tag -> tag.putInt("State", leverPower));
            scene.idle(3);
        }
        scene.idle(10);
        scene.world().modifyBlock(txLinkPos, state -> state.setValue(RedstoneLinkBlock.POWERED, false), false);
        scene.world().modifyBlock(rxLinkPos, state -> state.setValue(RedstoneLinkBlock.POWERED, false), false);
        scene.world().modifyBlock(lampPos, state -> state.setValue(DimmableCageLampBlock.LIGHT_LEVEL, 0), false);
        scene.idle(5);
        scene.overlay().showText(50)
                .attachKeyFrame()
                .text("If you right click on the block, the operational mode will be switched.")
                .placeNearTarget()
                .pointAt(util.vector().centerOf(lampPos));
        scene.idle(70);

        // 3.
        scene.overlay().showControls(lampVec, Pointing.DOWN, 40).rightClick();
        scene.idle(5);
        scene.world().modifyBlock(lampPos, state -> state.setValue(DimmableCageLampBlock.LIGHT_LEVEL, 15), false);
        scene.idle(35);
        scene.overlay().showText(50)
                .attachKeyFrame()
                .text("Now the lamp's behavior is reversed...")
                .placeNearTarget()
                .pointAt(util.vector().centerOf(lampPos));
        scene.idle(70);

        // 4.
        scene.overlay().showText(50)
                .attachKeyFrame()
                .text("When there is no power, the lamp has max brightness...")
                .placeNearTarget()
                .pointAt(util.vector().centerOf(lampPos));
        scene.idle(70);

        // 5.
        scene.overlay().showText(50)
                .attachKeyFrame()
                .text("And when it's fully powered it's off")
                .placeNearTarget()
                .pointAt(util.vector().centerOf(lampPos));
        scene.idle(60);
    }

    public static void doubleTextureDimmableCageLamps(SceneBuilder builder, SceneBuildingUtil util) {
        CreateSceneBuilder scene = new CreateSceneBuilder(builder);
        scene.title("double_texture_dimmable_cage_lamps", "Copper Lamps");
        scene.configureBasePlate(0, 0, 5);
        scene.world().showSection(util.select().layers(0 ,3), Direction.UP);

        // Pos
        BlockPos lampPos = util.grid().at(3, 2, 1);

        // Vec3  idk
        Vec3 lampVec = util.vector().centerOf(lampPos)
                .add(0, .25, .25);

        // Scene
        // 1.
        scene.idle(10);
        scene.overlay().showText(60)
                .attachKeyFrame()
                .text("Copper lamps have one more feature that the others don't have.")
                .placeNearTarget()
                .pointAt(util.vector().centerOf(lampPos));
        scene.idle(75);

        // 2.
        scene.overlay().showText(50)
                .attachKeyFrame()
                .text("If you right click with a wrench...")
                .placeNearTarget()
                .pointAt(util.vector().centerOf(lampPos));
        scene.idle(70);
        scene.overlay().showControls(lampVec, Pointing.DOWN, 40).rightClick().withItem(AllItems.WRENCH.asStack());
        scene.idle(5);
        scene.world().modifyBlock(lampPos, state -> state.setValue(DoubleTextureDimmableCageLampBlock.OLD_TEXTURE, true), false);
        scene.idle(35);

        // 3.
        scene.overlay().showText(50)
                .attachKeyFrame()
                .text("The lamp changes to the old copper texture.")
                .placeNearTarget()
                .pointAt(util.vector().centerOf(lampPos));
        scene.idle(70);
    }
}
