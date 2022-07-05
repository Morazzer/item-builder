package dev.morazzer.itembuilder;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.CrossbowMeta;

import java.util.List;

public class CrossbowItemBuilder extends ItemBuilder<CrossbowItemBuilder> {
    public CrossbowItemBuilder(Material material) {
        super(material);
    }

    public CrossbowItemBuilder setChargedProjectiles(List<ItemStack> projectiles) {
        ((CrossbowMeta)super.meta).setChargedProjectiles(projectiles);
        return this;
    }

    public CrossbowItemBuilder addChargedProjectile(ItemStack projectile) {
        ((CrossbowMeta)super.meta).addChargedProjectile(projectile);
        return this;
    }

}
