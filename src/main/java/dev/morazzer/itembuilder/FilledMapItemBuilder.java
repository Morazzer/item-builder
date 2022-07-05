package dev.morazzer.itembuilder;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.map.MapView;

public class FilledMapItemBuilder extends ItemBuilder<FilledMapItemBuilder> {
    public FilledMapItemBuilder(Material material) {
        super(material);
    }

    public FilledMapItemBuilder mapView(MapView map) {
        ((MapMeta) super.meta).setMapView(map);
        return this;
    }

    public FilledMapItemBuilder scale(boolean scale) {
        ((MapMeta) super.meta).setScaling(scale);
        return this;
    }

    public FilledMapItemBuilder locationName(String name) {
        ((MapMeta) super.meta).setLocationName(name);
        return this;
    }

    public FilledMapItemBuilder color(Color color) {
        ((MapMeta) super.meta).setColor(color);
        return this;
    }
}
