package dev.morazzer.itembuilder;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.meta.CompassMeta;

public class CompassItemBuilder extends ItemBuilder<CompassItemBuilder> {
    public CompassItemBuilder(Material material) {
        super(material);
    }

    public CompassItemBuilder loadstone(Location location) {
        ((CompassMeta)super.meta).setLodestone(location);
        return this;
    }

    public CompassItemBuilder loadstoneTracked(boolean tracked) {
        ((CompassMeta)super.meta).setLodestoneTracked(tracked);
        return this;
    }
}
