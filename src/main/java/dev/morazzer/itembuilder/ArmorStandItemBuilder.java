package dev.morazzer.itembuilder;

import com.destroystokyo.paper.inventory.meta.ArmorStandMeta;
import org.bukkit.Material;

public class ArmorStandItemBuilder extends ItemBuilder<ArmorStandItemBuilder> {
    public ArmorStandItemBuilder(Material material) {
        super(material);
    }

    public ArmorStandItemBuilder invisible(boolean invisible) {
        ((ArmorStandMeta) super.meta).setInvisible(invisible);
        return this;
    }

    public ArmorStandItemBuilder showArms(boolean showArms) {
        ((ArmorStandMeta) super.meta).setShowArms(showArms);
        return this;
    }

    public ArmorStandItemBuilder small(boolean small) {
        ((ArmorStandMeta) super.meta).setSmall(small);
        return this;
    }

    public ArmorStandItemBuilder noBasePlate(boolean noBasePlate) {
        ((ArmorStandMeta) super.meta).setNoBasePlate(noBasePlate);
        return this;
    }

    public ArmorStandItemBuilder marker(boolean marker) {
        ((ArmorStandMeta) super.meta).setMarker(marker);
        return this;
    }
}
