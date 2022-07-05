package dev.morazzer.itembuilder;

import org.bukkit.Material;
import org.bukkit.inventory.meta.SuspiciousStewMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SuspiciousStewItemBuilder extends ItemBuilder<SuspiciousStewItemBuilder>{
    public SuspiciousStewItemBuilder(Material material) {
        super(material);
    }

    public SuspiciousStewItemBuilder addCustomEffect(PotionEffect effect, boolean override) {
        ((SuspiciousStewMeta)super.meta).addCustomEffect(effect, override);
        return this;
    }

    public SuspiciousStewItemBuilder removeCustomEffect(PotionEffectType effect) {
        ((SuspiciousStewMeta)super.meta).removeCustomEffect(effect);
        return this;
    }

    public SuspiciousStewItemBuilder clearCustomEffects() {
        ((SuspiciousStewMeta)super.meta).clearCustomEffects();
        return this;
    }
}
