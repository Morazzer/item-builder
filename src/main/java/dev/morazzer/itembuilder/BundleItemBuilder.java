package dev.morazzer.itembuilder;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BundleMeta;

import java.util.List;

public class BundleItemBuilder extends ItemBuilder<BundleItemBuilder> {
    public BundleItemBuilder(Material material) {
        super(material);
    }

    public BundleItemBuilder setItems(List<ItemStack> items) {
        ((BundleMeta) super.meta).setItems(items);
        return this;
    }

    public BundleItemBuilder item(ItemStack item) {
        ((BundleMeta) super.meta).addItem(item);
        return this;
    }
}
