package com.palm3.ddcl;

import static com.palm3.ddcl.DDCLMain.DDCL_REGISTRATE;

public class DDCLLangs {

    private static void add(String key, String value) {
        DDCL_REGISTRATE.addRawLang(key, value);
    }

    public static void addLangs() {
        add("itemGroup.ddcl.main_tab", "Create: DDCL");


        add("ddcl.ponder.tag.dimmable_cage_lamps", "Dimmable Cage Lamps");
        add("ddcl.ponder.tag.dimmable_cage_lamps.description", "Lamps that can change the emitted light");

        add("ddcl.ponder.dimmable_cage_lamps.header", "Normal Lamps");
        add("ddcl.ponder.dimmable_cage_lamps.text_1", "Dimmable Cage Lamps can change their brightness by varying the redstone power of the block.");
        add("ddcl.ponder.dimmable_cage_lamps.text_2", "If you right click on the block, the operational mode will be switched.");
        add("ddcl.ponder.dimmable_cage_lamps.text_3", "Now the lamp's behavior is reversed...");
        add("ddcl.ponder.dimmable_cage_lamps.text_4", "When there is no power, the lamp has max brightness...");
        add("ddcl.ponder.dimmable_cage_lamps.text_5", "And when it's fully powered, it's off");

        add("ddcl.ponder.double_texture_dimmable_cage_lamps.header", "Copper Lamps");
        add("ddcl.ponder.double_texture_dimmable_cage_lamps.text_1", "Copper lamps have one more feature that the others don't have.");
        add("ddcl.ponder.double_texture_dimmable_cage_lamps.text_2", "If you right click with a wrench...");
        add("ddcl.ponder.double_texture_dimmable_cage_lamps.text_3", "The lamp changes to the old copper texture.");
    }
}
