package dev.morazzer.itembuilder;

import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.inventory.meta.FireworkEffectMeta;

public class FireworkStarItemBuilder extends ItemBuilder<FireworkStarItemBuilder> {
    public FireworkStarItemBuilder(Material material) {
        super(material);
    }

    public FireworkStarItemBuilder effect(FireworkEffect effect) {
        ((FireworkEffectMeta) super.meta).setEffect(effect);
        return this;
    }
}
