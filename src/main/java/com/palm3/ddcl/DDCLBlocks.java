package com.palm3.ddcl;

import com.palm3.ddcl.base.blocks.CopperDimmableCageLampBlock;
import com.palm3.ddcl.base.blocks.DimmableCageLampBlock;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

import static com.palm3.ddcl.DDCLMain.MOD_REGISTRATE;
import static net.minecraft.world.level.block.state.properties.BlockStateProperties.POWER;

public class DDCLBlocks {

    // Dimmable Cage Lamps
    public static final BlockEntry<DimmableCageLampBlock> GREEN_ANDESITE_DIMM_LAMP = MOD_REGISTRATE
            .block("green_andesite_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> YELLOW_ANDESITE_DIMM_LAMP = MOD_REGISTRATE
            .block("yellow_andesite_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> RED_ANDESITE_DIMM_LAMP = MOD_REGISTRATE
            .block("red_andesite_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> BLUE_ANDESITE_DIMM_LAMP = MOD_REGISTRATE
            .block("blue_andesite_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();


    public static final BlockEntry<DimmableCageLampBlock> GREEN_IRON_DIMM_LAMP = MOD_REGISTRATE
            .block("green_iron_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> YELLOW_IRON_DIMM_LAMP = MOD_REGISTRATE
            .block("yellow_iron_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> RED_IRON_DIMM_LAMP = MOD_REGISTRATE
            .block("red_iron_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> BLUE_IRON_DIMM_LAMP = MOD_REGISTRATE
            .block("blue_iron_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();


    public static final BlockEntry<DimmableCageLampBlock> GREEN_INDUSTRIAL_IRON_DIMM_LAMP = MOD_REGISTRATE
            .block("green_industrial_iron_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> YELLOW_INDUSTRIAL_IRON_DIMM_LAMP = MOD_REGISTRATE
            .block("yellow_industrial_iron_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> RED_INDUSTRIAL_IRON_DIMM_LAMP = MOD_REGISTRATE
            .block("red_industrial_iron_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> BLUE_INDUSTRIAL_IRON_DIMM_LAMP = MOD_REGISTRATE
            .block("blue_industrial_iron_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();


    public static final BlockEntry<DimmableCageLampBlock> GREEN_BRASS_DIMM_LAMP = MOD_REGISTRATE
            .block("green_brass_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> YELLOW_BRASS_DIMM_LAMP = MOD_REGISTRATE
            .block("yellow_brass_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> RED_BRASS_DIMM_LAMP = MOD_REGISTRATE
            .block("red_brass_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> BLUE_BRASS_DIMM_LAMP = MOD_REGISTRATE
            .block("blue_brass_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();


    public static final BlockEntry<CopperDimmableCageLampBlock> GREEN_COPPER_DIMM_LAMP = MOD_REGISTRATE
            .block("green_copper_dimm_lamp", CopperDimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<CopperDimmableCageLampBlock> YELLOW_COPPER_DIMM_LAMP = MOD_REGISTRATE
            .block("yellow_copper_dimm_lamp", CopperDimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<CopperDimmableCageLampBlock> RED_COPPER_DIMM_LAMP = MOD_REGISTRATE
            .block("red_copper_dimm_lamp", CopperDimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<CopperDimmableCageLampBlock> BLUE_COPPER_DIMM_LAMP = MOD_REGISTRATE
            .block("blue_copper_dimm_lamp", CopperDimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();


    public static final BlockEntry<DimmableCageLampBlock> GREEN_ZINC_DIMM_LAMP = MOD_REGISTRATE
            .block("green_zinc_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> YELLOW_ZINC_DIMM_LAMP = MOD_REGISTRATE
            .block("yellow_zinc_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> RED_ZINC_DIMM_LAMP = MOD_REGISTRATE
            .block("red_zinc_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static final BlockEntry<DimmableCageLampBlock> BLUE_ZINC_DIMM_LAMP = MOD_REGISTRATE
            .block("blue_zinc_dimm_lamp", DimmableCageLampBlock::new)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_GRAY).noOcclusion())
            .simpleItem()
            .register();

    public static void register() {}
}
