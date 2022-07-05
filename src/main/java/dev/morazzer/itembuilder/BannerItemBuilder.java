package dev.morazzer.itembuilder;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.List;

public class BannerItemBuilder extends ItemBuilder<BannerItemBuilder> {
    public BannerItemBuilder(Material material) {
        super(material);
    }

    public BannerItemBuilder setPatterns(List<Pattern> patterns) {
        ((BannerMeta) super.meta).setPatterns(patterns);
        return this;
    }

    public BannerItemBuilder addPattern(Pattern pattern) {
        ((BannerMeta) super.meta).addPattern(pattern);
        return this;
    }

    public BannerItemBuilder setPattern(int index, Pattern pattern) {
        ((BannerMeta) super.meta).setPattern(index, pattern);
        return this;
    }
}
