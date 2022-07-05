package dev.morazzer.itembuilder;

import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.inventory.meta.FireworkMeta;

public class FireworkRocketItemBuilder extends ItemBuilder<FireworkRocketItemBuilder> {
    public FireworkRocketItemBuilder(Material material) {
        super(material);
    }

    public FireworkRocketItemBuilder addEffect(FireworkEffect effect) {
        ((FireworkMeta) super.meta).addEffect(effect);
        return this;
    }

    public FireworkRocketItemBuilder addEffects(FireworkEffect... effects) {
        ((FireworkMeta) super.meta).addEffects(effects);
        return this;
    }

    public FireworkRocketItemBuilder removeEffect(int index) {
        ((FireworkMeta) super.meta).removeEffect(index);
        return this;
    }

    public FireworkRocketItemBuilder clearEffects() {
        ((FireworkMeta) super.meta).clearEffects();
        return this;
    }

    public FireworkRocketItemBuilder power(int power) {
        ((FireworkMeta) super.meta).setPower(power);
        return this;
    }

}
