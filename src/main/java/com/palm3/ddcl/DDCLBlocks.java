package com.palm3.ddcl;

import com.palm3.ddcl.base.Helpers;
import com.palm3.ddcl.base.blocks.DoubleTextureDimmableCageLampBlock;
import com.palm3.ddcl.base.blocks.DimmableCageLampBlock;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;

import static com.palm3.ddcl.DDCLMain.DDCL_REGISTRATE;
import static com.palm3.ddcl.base.Helpers.decoParentLamp;
import static com.tterrag.registrate.providers.RegistrateRecipeProvider.has;

public class DDCLBlocks {

    public static final BlockEntry<DimmableCageLampBlock> GREEN_ANDESITE_DIMM_LAMP = DDCL_REGISTRATE
            .block("green_andesite_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.ANDESITE, Helpers.LampColor.GREEN, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> YELLOW_ANDESITE_DIMM_LAMP = DDCL_REGISTRATE
            .block("yellow_andesite_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.ANDESITE, Helpers.LampColor.YELLOW, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> RED_ANDESITE_DIMM_LAMP = DDCL_REGISTRATE
            .block("red_andesite_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.ANDESITE, Helpers.LampColor.RED, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> BLUE_ANDESITE_DIMM_LAMP = DDCL_REGISTRATE
            .block("blue_andesite_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.ANDESITE, Helpers.LampColor.BLUE, null))
            .register();


    public static final BlockEntry<DimmableCageLampBlock> GREEN_IRON_DIMM_LAMP = DDCL_REGISTRATE
            .block("green_iron_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.IRON, Helpers.LampColor.GREEN, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> YELLOW_IRON_DIMM_LAMP = DDCL_REGISTRATE
            .block("yellow_iron_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.IRON, Helpers.LampColor.YELLOW, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> RED_IRON_DIMM_LAMP = DDCL_REGISTRATE
            .block("red_iron_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.IRON, Helpers.LampColor.RED, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> BLUE_IRON_DIMM_LAMP = DDCL_REGISTRATE
            .block("blue_iron_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.IRON, Helpers.LampColor.BLUE, null))
            .register();


    public static final BlockEntry<DimmableCageLampBlock> GREEN_INDUSTRIAL_IRON_DIMM_LAMP = DDCL_REGISTRATE
            .block("green_industrial_iron_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.INDUSTRIAL_IRON, Helpers.LampColor.GREEN, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> YELLOW_INDUSTRIAL_IRON_DIMM_LAMP = DDCL_REGISTRATE
            .block("yellow_industrial_iron_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.INDUSTRIAL_IRON, Helpers.LampColor.YELLOW, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> RED_INDUSTRIAL_IRON_DIMM_LAMP = DDCL_REGISTRATE
            .block("red_industrial_iron_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.INDUSTRIAL_IRON, Helpers.LampColor.RED, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> BLUE_INDUSTRIAL_IRON_DIMM_LAMP = DDCL_REGISTRATE
            .block("blue_industrial_iron_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.INDUSTRIAL_IRON, Helpers.LampColor.BLUE, null))
            .register();


    public static final BlockEntry<DimmableCageLampBlock> GREEN_BRASS_DIMM_LAMP = DDCL_REGISTRATE
            .block("green_brass_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.BRASS, Helpers.LampColor.GREEN, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> YELLOW_BRASS_DIMM_LAMP = DDCL_REGISTRATE
            .block("yellow_brass_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.BRASS, Helpers.LampColor.YELLOW, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> RED_BRASS_DIMM_LAMP = DDCL_REGISTRATE
            .block("red_brass_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.BRASS, Helpers.LampColor.RED, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> BLUE_BRASS_DIMM_LAMP = DDCL_REGISTRATE
            .block("blue_brass_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.BRASS, Helpers.LampColor.BLUE, null))
            .register();


    public static final BlockEntry<DoubleTextureDimmableCageLampBlock> GREEN_COPPER_DIMM_LAMP = DDCL_REGISTRATE
            .block("green_copper_dimmable_lamp", DoubleTextureDimmableCageLampBlock::new)
            .transform(decoParentLamp(true, Helpers.LampMaterial.COPPER, Helpers.LampColor.GREEN, "block/old_copper_lamp_cage"))
            .register();

    public static final BlockEntry<DoubleTextureDimmableCageLampBlock> YELLOW_COPPER_DIMM_LAMP = DDCL_REGISTRATE
            .block("yellow_copper_dimmable_lamp", DoubleTextureDimmableCageLampBlock::new)
            .transform(decoParentLamp(true, Helpers.LampMaterial.COPPER, Helpers.LampColor.YELLOW, "block/old_copper_lamp_cage"))
            .register();

    public static final BlockEntry<DoubleTextureDimmableCageLampBlock> RED_COPPER_DIMM_LAMP = DDCL_REGISTRATE
            .block("red_copper_dimmable_lamp", DoubleTextureDimmableCageLampBlock::new)
            .transform(decoParentLamp(true, Helpers.LampMaterial.COPPER, Helpers.LampColor.RED, "block/old_copper_lamp_cage"))
            .register();

    public static final BlockEntry<DoubleTextureDimmableCageLampBlock> BLUE_COPPER_DIMM_LAMP = DDCL_REGISTRATE
            .block("blue_copper_dimmable_lamp", DoubleTextureDimmableCageLampBlock::new)
            .transform(decoParentLamp(true, Helpers.LampMaterial.COPPER, Helpers.LampColor.BLUE, "block/old_copper_lamp_cage"))
            .register();


    public static final BlockEntry<DimmableCageLampBlock> GREEN_ZINC_DIMM_LAMP = DDCL_REGISTRATE
            .block("green_zinc_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.ZINC, Helpers.LampColor.GREEN, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> YELLOW_ZINC_DIMM_LAMP = DDCL_REGISTRATE
            .block("yellow_zinc_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.ZINC, Helpers.LampColor.YELLOW, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> RED_ZINC_DIMM_LAMP = DDCL_REGISTRATE
            .block("red_zinc_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.ZINC, Helpers.LampColor.RED, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> BLUE_ZINC_DIMM_LAMP = DDCL_REGISTRATE
            .block("blue_zinc_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.ZINC, Helpers.LampColor.BLUE, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> GREEN_GOLD_DIMM_LAMP = DDCL_REGISTRATE
            .block("green_gold_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.GOLD, Helpers.LampColor.GREEN, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> YELLOW_GOLD_DIMM_LAMP = DDCL_REGISTRATE
            .block("yellow_gold_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.GOLD, Helpers.LampColor.YELLOW, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> RED_GOLD_DIMM_LAMP = DDCL_REGISTRATE
            .block("red_gold_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.GOLD, Helpers.LampColor.RED, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> BLUE_GOLD_DIMM_LAMP = DDCL_REGISTRATE
            .block("blue_gold_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.GOLD, Helpers.LampColor.BLUE, null))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> GREEN_NETHERITE_DIMM_LAMP = DDCL_REGISTRATE
            .block("green_netherite_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.NETHERITE, Helpers.LampColor.GREEN, null))
            .recipe((c, p) -> ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, c.get(), 1)
                    .requires(GREEN_INDUSTRIAL_IRON_DIMM_LAMP)
                    .unlockedBy("has_lamp", has(GREEN_INDUSTRIAL_IRON_DIMM_LAMP))
                    .save(p))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> YELLOW_NETHERITE_DIMM_LAMP = DDCL_REGISTRATE
            .block("yellow_netherite_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.NETHERITE, Helpers.LampColor.YELLOW, null))
            .recipe((c, p) -> ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, c.get(), 1)
                    .requires(YELLOW_INDUSTRIAL_IRON_DIMM_LAMP)
                    .unlockedBy("has_lamp", has(YELLOW_INDUSTRIAL_IRON_DIMM_LAMP))
                    .save(p))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> RED_NETHERITE_DIMM_LAMP = DDCL_REGISTRATE
            .block("red_netherite_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.NETHERITE, Helpers.LampColor.RED, null))
            .recipe((c, p) -> ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, c.get(), 1)
                    .requires(RED_INDUSTRIAL_IRON_DIMM_LAMP)
                    .unlockedBy("has_lamp", has(RED_INDUSTRIAL_IRON_DIMM_LAMP))
                    .save(p))
            .register();

    public static final BlockEntry<DimmableCageLampBlock> BLUE_NETHERITE_DIMM_LAMP = DDCL_REGISTRATE
            .block("blue_netherite_dimmable_lamp", DimmableCageLampBlock::new)
            .transform(decoParentLamp(false, Helpers.LampMaterial.NETHERITE, Helpers.LampColor.BLUE, null))
            .recipe((c, p) -> ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, c.get(), 1)
                    .requires(BLUE_INDUSTRIAL_IRON_DIMM_LAMP)
                    .unlockedBy("has_lamp", has(BLUE_INDUSTRIAL_IRON_DIMM_LAMP))
                    .save(p))
            .register();
    
    

    public static void register() {}
}
