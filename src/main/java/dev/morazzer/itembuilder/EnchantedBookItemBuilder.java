package dev.morazzer.itembuilder;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class EnchantedBookItemBuilder extends ItemBuilder<EnchantedBookItemBuilder> {
    public EnchantedBookItemBuilder(Material material) {
        super(material);
    }

    public EnchantedBookItemBuilder addStoredEnchant(Enchantment enchantment, int level, boolean ignoreLevelRestriction) {
        ((EnchantmentStorageMeta) super.meta).addStoredEnchant(enchantment, level, ignoreLevelRestriction);
        return this;
    }

    public EnchantedBookItemBuilder removeStoredEnchant(Enchantment enchantment) {
        ((EnchantmentStorageMeta) super.meta).removeStoredEnchant(enchantment);
        return this;
    }

}
