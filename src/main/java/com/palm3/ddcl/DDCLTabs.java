package com.palm3.ddcl;

import com.palm3.ddcl.configs.DDCLClientConfig;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.BinaryOperator;

public class DDCLTabs {

    public static final DeferredRegister<CreativeModeTab> DDCL_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DDCLMain.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAIN_TAB = DDCL_TABS
            .register("main_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.ddcl.main_tab"))
                    .icon(() -> new ItemStack(DDCLBlocks.GREEN_ANDESITE_DIMM_LAMP.get()))
                    .displayItems((params, output) -> {
                        if (DDCLClientConfig.CLIENT_CONFIG.arrangeLampsByColor.get()) {  // By color
                            output.accept(DDCLBlocks.GREEN_BRASS_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.GREEN_COPPER_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.GREEN_ANDESITE_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.GREEN_ZINC_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.GREEN_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.GREEN_INDUSTRIAL_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.GREEN_GOLD_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.GREEN_NETHERITE_DIMM_LAMP.asItem());

                            output.accept(DDCLBlocks.YELLOW_BRASS_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_COPPER_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_ANDESITE_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_ZINC_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_INDUSTRIAL_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_GOLD_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_NETHERITE_DIMM_LAMP.asItem());

                            output.accept(DDCLBlocks.RED_BRASS_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_COPPER_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_ANDESITE_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_ZINC_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_INDUSTRIAL_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_GOLD_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_NETHERITE_DIMM_LAMP.asItem());

                            output.accept(DDCLBlocks.BLUE_BRASS_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_COPPER_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_ANDESITE_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_ZINC_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_INDUSTRIAL_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_GOLD_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_NETHERITE_DIMM_LAMP.asItem());

                            output.accept(DDCLItems.NETHERITE_SHEET.get());

                        } else {  // By material
                            output.accept(DDCLBlocks.GREEN_BRASS_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_BRASS_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_BRASS_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_BRASS_DIMM_LAMP.asItem());

                            output.accept(DDCLBlocks.GREEN_COPPER_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_COPPER_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_COPPER_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_COPPER_DIMM_LAMP.asItem());

                            output.accept(DDCLBlocks.GREEN_ANDESITE_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_ANDESITE_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_ANDESITE_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_ANDESITE_DIMM_LAMP.asItem());

                            output.accept(DDCLBlocks.GREEN_ZINC_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_ZINC_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_ZINC_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_ZINC_DIMM_LAMP.asItem());

                            output.accept(DDCLBlocks.GREEN_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_IRON_DIMM_LAMP.asItem());

                            output.accept(DDCLBlocks.GREEN_INDUSTRIAL_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_INDUSTRIAL_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_INDUSTRIAL_IRON_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_INDUSTRIAL_IRON_DIMM_LAMP.asItem());

                            output.accept(DDCLBlocks.GREEN_GOLD_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_GOLD_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_GOLD_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_GOLD_DIMM_LAMP.asItem());

                            output.accept(DDCLBlocks.GREEN_NETHERITE_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.YELLOW_NETHERITE_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.RED_NETHERITE_DIMM_LAMP.asItem());
                            output.accept(DDCLBlocks.BLUE_NETHERITE_DIMM_LAMP.asItem());

                            output.accept(DDCLItems.NETHERITE_SHEET.get());
                        }
                    })
                    .build()
            );
}
