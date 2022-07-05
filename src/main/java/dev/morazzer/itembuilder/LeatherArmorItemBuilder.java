package dev.morazzer.itembuilder;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class LeatherArmorItemBuilder extends ItemBuilder<LeatherArmorItemBuilder> {
    public final Color DEFAULT_LEATHER_COLOR = Color.fromRGB(0xA06540);

    public LeatherArmorItemBuilder(Material material) {
        super(material);
    }

    public LeatherArmorItemBuilder color(Color color) {
        ((LeatherArmorMeta) super.meta).setColor(color);
        return this;
    }
}
