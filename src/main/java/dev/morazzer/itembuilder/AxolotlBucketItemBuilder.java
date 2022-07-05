package dev.morazzer.itembuilder;

import org.bukkit.Material;
import org.bukkit.entity.Axolotl;
import org.bukkit.inventory.meta.AxolotlBucketMeta;

public class AxolotlBucketItemBuilder extends ItemBuilder<AxolotlBucketItemBuilder> {
    public AxolotlBucketItemBuilder(Material material) {
        super(material);
    }

    public AxolotlBucketItemBuilder variant(Axolotl.Variant variant) {
        ((AxolotlBucketMeta) super.meta).setVariant(variant);
        return this;
    }
}
