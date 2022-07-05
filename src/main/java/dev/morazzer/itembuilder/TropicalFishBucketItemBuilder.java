package dev.morazzer.itembuilder;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.TropicalFish;
import org.bukkit.inventory.meta.TropicalFishBucketMeta;

public class TropicalFishBucketItemBuilder extends ItemBuilder<TropicalFishBucketItemBuilder> {
    public TropicalFishBucketItemBuilder(Material material) {
        super(material);
    }

    public TropicalFishBucketItemBuilder patternColor(DyeColor color) {
        ((TropicalFishBucketMeta)super.meta).setPatternColor(color);
        return this;
    }

    public TropicalFishBucketItemBuilder bodyColor(DyeColor color) {
        ((TropicalFishBucketMeta)super.meta).setBodyColor(color);
        return this;
    }

    public TropicalFishBucketItemBuilder pattern(TropicalFish.Pattern pattern) {
        ((TropicalFishBucketMeta)super.meta).setPattern(pattern);
        return this;
    }
}
