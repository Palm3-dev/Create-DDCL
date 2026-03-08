package com.palm3.ddcl.configs;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class DDCLClientConfig {

    public static final DDCLClientConfig CLIENT_CONFIG;
    public static final ModConfigSpec CONFIG_SPEC;

    static {
        Pair<DDCLClientConfig, ModConfigSpec> pair =
                new ModConfigSpec.Builder().configure(DDCLClientConfig::new);
        CLIENT_CONFIG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    public final ModConfigSpec.BooleanValue arrangeLampsByColor;

    public DDCLClientConfig(ModConfigSpec.Builder builder) {
     builder.push("Creative tab");

     arrangeLampsByColor = builder
             .comment("How the lamps should be arranged in the mod creative tab. CHECK = by color  CROSS = by material. Needs world reload.")
             .define("Lamps Arrangement", false);

     builder.pop();
    }
}
