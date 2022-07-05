package dev.morazzer.itembuilder;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.meta.SpawnEggMeta;

public class SpawnEggItemBuilder extends ItemBuilder<SpawnEggItemBuilder> {
    public SpawnEggItemBuilder(Material material) {
        super(material);
    }

    @Deprecated
    public SpawnEggItemBuilder spawnType(EntityType type) {
        ((SpawnEggMeta) super.meta).setSpawnedType(type);
        return this;
    }
}
