package dev.morazzer.itembuilder;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PotionItemBuilder extends ItemBuilder<PotionItemBuilder> {
    public PotionItemBuilder(Material material) {
        super(material);
    }

    public PotionItemBuilder basePotionData(PotionData data) {
        ((PotionMeta) super.meta).setBasePotionData(data);
        return this;
    }

    public PotionItemBuilder addCustomEffect(PotionEffect effect, boolean overwrite) {
        ((PotionMeta) super.meta).addCustomEffect(effect, overwrite);
        return this;
    }

    public PotionItemBuilder removeCustomEffect(PotionEffectType type) {
        ((PotionMeta) super.meta).removeCustomEffect(type);
        return this;
    }

    public PotionItemBuilder color(Color color) {
        ((PotionMeta) super.meta).setColor(color);
        return this;
    }
}
