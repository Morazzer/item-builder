package dev.morazzer.itembuilder;

import com.destroystokyo.paper.profile.PlayerProfile;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.meta.SkullMeta;

public class SkullItemBuilder extends ItemBuilder<SkullItemBuilder> {
    public SkullItemBuilder(Material material) {
        super(material);
    }

    public SkullItemBuilder playerProfile(PlayerProfile profile) {
        ((SkullMeta) super.meta).setPlayerProfile(profile);
        return this;
    }

    public SkullItemBuilder setOwningPlayer(OfflinePlayer player) {
        ((SkullMeta) super.meta).setOwningPlayer(player);
        return this;
    }
}
