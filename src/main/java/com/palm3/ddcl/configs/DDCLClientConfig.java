package com.palm3.ddcl.configs;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class DDCLClientConfig {

    public static final DDCLClientConfig CLIENT_CONFIG;
    public static final ForgeConfigSpec CONFIG_SPEC;

    static {
        Pair<DDCLClientConfig, ForgeConfigSpec> pair =
                new ForgeConfigSpec.Builder().configure(DDCLClientConfig::new);
        CLIENT_CONFIG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    public final ForgeConfigSpec.BooleanValue arrangeLampsByColor;

    public DDCLClientConfig(ForgeConfigSpec.Builder builder) {
     builder.push("Creative tab");

     arrangeLampsByColor = builder
             .comment("How the lamps should be arranged in the mod creative tab. CHECK = by color  CROSS = by material. Needs world reload.")
             .define("Lamps Arrangement", false);

     builder.pop();
    }
}
