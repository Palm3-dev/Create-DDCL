package com.palm3.ddcl;

import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static com.palm3.ddcl.DDCLMain.*;

public class DDCLItems {

    public static final ItemEntry<Item> NETHERITE_SHEET = DDCL_REGISTRATE
            .item("netherite_sheet", Item::new)
            .properties(p -> p.stacksTo(64).rarity(Rarity.COMMON))
            .model((c, p) -> p.generated(c::get, decoRes("item/netherite_sheet")))
            .register();


    public static void register() {}
}
