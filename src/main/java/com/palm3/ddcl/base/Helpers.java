package com.palm3.ddcl.base;

import com.palm3.ddcl.base.blocks.DimmableCageLampBlock;
import com.palm3.ddcl.base.blocks.DoubleTextureDimmableCageLampBlock;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.providers.loot.RegistrateBlockLootTables;
import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Direction;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;

import javax.annotation.Nullable;

import static com.palm3.ddcl.DDCLMain.*;
import static com.tterrag.registrate.providers.RegistrateRecipeProvider.has;

@SuppressWarnings("deprecated, removal")
public class Helpers {

    public static TagKey<Item> forgeItemTag(String tag) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", tag));
    }
    public static TagKey<Item> modItemTag(String tag) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MOD_ID, tag));
    }

    public enum LampColor {
        BLUE("blue"),
        RED("red"),
        GREEN("green"),
        YELLOW("yellow");

        public final String color;

        LampColor(String lampColor) {
            color = lampColor;
        }
    }

    public enum LampMaterial {
        ANDESITE("andesite"),
        IRON("iron"),
        INDUSTRIAL_IRON("industrial_iron"),
        ZINC("zinc"),
        BRASS("brass"),
        COPPER("copper"),
        GOLD("gold"),
        NETHERITE("netherite");

        public final String material;

        LampMaterial(String lampMaterial) {
            material = lampMaterial;
        }
    }

    public static <B extends DimmableCageLampBlock> NonNullUnaryOperator<BlockBuilder<B, CreateRegistrate>> decoParentLamp(boolean doubleTexture, LampMaterial lampMaterial, LampColor lampColor, @Nullable String secondTextureLocation) {

        MapColor mapColor = switch (lampMaterial) {
            case IRON -> MapColor.SNOW;
            case ZINC -> MapColor.GLOW_LICHEN;
            case BRASS -> MapColor.TERRACOTTA_YELLOW;
            case COPPER -> MapColor.COLOR_ORANGE;
            case ANDESITE -> MapColor.STONE;
            case INDUSTRIAL_IRON -> MapColor.COLOR_GRAY;
            case GOLD -> MapColor.GOLD;
            case NETHERITE -> MapColor.COLOR_BLACK;
        };

        // Crafting
        TagKey<Item> nugget = switch (lampMaterial) {
            case ANDESITE -> modItemTag("andesite_nugget");
            case COPPER -> forgeItemTag("nuggets/copper");
            case BRASS -> forgeItemTag("nuggets/brass");
            case ZINC -> forgeItemTag("nuggets/zinc");
            case IRON -> forgeItemTag("nuggets/iron");
            case INDUSTRIAL_IRON -> forgeItemTag("nuggets/industrial_iron");
            case GOLD -> forgeItemTag("nuggets/gold");
            case NETHERITE -> forgeItemTag("nuggets/netherite");
        };

        TagKey<Item> plate = switch (lampMaterial) {
            case ANDESITE -> modItemTag("andesite_sheet");
            case COPPER -> forgeItemTag("plates/copper");
            case BRASS -> forgeItemTag("plates/brass");
            case ZINC -> forgeItemTag("plates/zinc");
            case IRON -> forgeItemTag("plates/iron");
            case INDUSTRIAL_IRON -> forgeItemTag("plates/industrial_iron");
            case GOLD -> forgeItemTag("plates/gold");
            case NETHERITE -> forgeItemTag("plates/netherite");
        };

        Item lightSource = switch (lampColor) {
            case RED -> Items.REDSTONE_TORCH;
            case BLUE -> Items.SOUL_TORCH;
            case GREEN -> Items.GLOW_BERRIES;
            case YELLOW -> Items.TORCH;
        };

        String cageAndParticleLoc = "block/palettes/cage_lamp/" + lampMaterial.material + "_lamp";
        String lightLoc = switch (lampColor) {
            case YELLOW -> "block/palettes/cage_lamp/light_default";
            case GREEN -> "block/palettes/cage_lamp/light_green";
            case BLUE -> "block/palettes/cage_lamp/light_soul";
            case RED -> "block/palettes/cage_lamp/light_redstone";
        };
        String lightOffLoc = lightLoc + "_off";

        return b -> b.initialProperties(() -> Blocks.STONE)
                .properties(p -> p.strength(1.0f).mapColor(mapColor).sound(SoundType.LANTERN).requiresCorrectToolForDrops())
                .addLayer(() -> RenderType::cutout)
                .blockstate((c, p) -> {
                    if (!doubleTexture) {
                        ModelFile modelON = p.models().withExistingParent(c.getName() + "_on", decoRes("block/cage_lamp"))
                                .texture("lamp", decoRes(lightLoc))
                                .texture("cage", decoRes(cageAndParticleLoc))
                                .texture("particle", decoRes(cageAndParticleLoc));
                        ModelFile modelOFF = p.models().withExistingParent(c.getName() + "_off", decoRes("block/cage_lamp"))
                                .texture("lamp", decoRes(lightOffLoc))
                                .texture("cage", decoRes(cageAndParticleLoc))
                                .texture("particle", decoRes(cageAndParticleLoc));

                        p.getVariantBuilder(c.getEntry()).forAllStates(state -> {
                            Direction facing = state.getValue(DimmableCageLampBlock.FACING);
                            int lightLevel = state.getValue(DimmableCageLampBlock.LIGHT_LEVEL);

                            ModelFile model = lightLevel > 0 ? modelON : modelOFF;

                            int xRot = facing == Direction.DOWN ? 180 : (facing.getAxis().isHorizontal() ? 90 : 0);
                            int yRot = (int) facing.toYRot();

                            return ConfiguredModel.builder()
                                    .modelFile(model)
                                    .rotationX(xRot)
                                    .rotationY(yRot)
                                    .build();
                        });
                    } else {  // Double texture, only for copper

                        String parentName = lampColor.color + "_" + lampMaterial.material + "_lamp";

                        ModelFile modelON_NEW = p.models().withExistingParent(c.getName() + "_new_on", decoRes("block/" + parentName));
                        ModelFile modelOFF_NEW = p.models().withExistingParent(c.getName() + "_new_off", decoRes("block/" + parentName + "_off"));
                        ModelFile modelON_OLD = p.models().withExistingParent(c.getName() + "_old_on", decoRes("block/" + parentName))
                                .texture("cage", modRes(secondTextureLocation))
                                .texture("particle", modRes(secondTextureLocation));
                        ModelFile modelOFF_OLD = p.models().withExistingParent(c.getName() + "_old_off", decoRes("block/" + parentName + "_off"))
                                .texture("cage", modRes(secondTextureLocation))
                                .texture("particle", modRes(secondTextureLocation));

                        p.getVariantBuilder(c.getEntry()).forAllStates(state -> {
                            Direction facing = state.getValue(DimmableCageLampBlock.FACING);
                            int lightLevel = state.getValue(DimmableCageLampBlock.LIGHT_LEVEL);
                            boolean isOld = state.getValue(DoubleTextureDimmableCageLampBlock.OLD_TEXTURE);
                            boolean isON = lightLevel > 0;

                            ModelFile model = isOld ? isON ? modelON_OLD : modelOFF_OLD : isON ? modelON_NEW : modelOFF_NEW;

                            int xRot = facing == Direction.DOWN ? 180 : (facing.getAxis().isHorizontal() ? 90 : 0);
                            int yRot = (int) facing.toYRot();

                            return ConfiguredModel.builder()
                                    .modelFile(model)
                                    .rotationX(xRot)
                                    .rotationY(yRot)
                                    .build();
                        });
                    }
                })
                .item()
                .model((c, p) -> p.withExistingParent(c.getName(), modRes("item/cage_lamp"))
                        .texture("lamp", decoRes(lightOffLoc))
                        .texture("cage", decoRes(cageAndParticleLoc))
                        .texture("particle", decoRes(cageAndParticleLoc))
                ).build()
                .tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .loot(RegistrateBlockLootTables::dropSelf)
                .recipe((c, p) ->
                        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, c.get(), 1)
                            .pattern(" N ")
                            .pattern(" L ")
                            .pattern("RPR")
                            .define('N', nugget)
                            .define('L', lightSource)
                            .define('R', Items.REDSTONE)
                            .define('P', plate)
                            .unlockedBy("has_redstone", has(Items.REDSTONE))
                            .save(p)
                );
    }
}
