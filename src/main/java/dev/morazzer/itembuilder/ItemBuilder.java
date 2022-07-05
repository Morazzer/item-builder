package dev.morazzer.itembuilder;

import com.destroystokyo.paper.Namespaced;
import com.google.common.collect.Multimap;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ItemBuilder<T extends ItemBuilder<?>> {

    public static ItemBuilder<?> of(Material material) {
        return of(material, ItemBuilder.class);
    }

    public static <T extends ItemBuilder<?>> T of(Material material, Class<T> clazz) {
        ItemBuilder itemBuilder;

        switch (material) {
            case AIR:
                return null;
            case WRITTEN_BOOK:
            case WRITABLE_BOOK:
                itemBuilder = new BookItemBuilder(material);
                break;
            case CREEPER_HEAD:
            case CREEPER_WALL_HEAD:
            case DRAGON_HEAD:
            case DRAGON_WALL_HEAD:
            case PLAYER_HEAD:
            case PLAYER_WALL_HEAD:
            case SKELETON_SKULL:
            case SKELETON_WALL_SKULL:
            case WITHER_SKELETON_SKULL:
            case WITHER_SKELETON_WALL_SKULL:
            case ZOMBIE_HEAD:
            case ZOMBIE_WALL_HEAD:
                itemBuilder = new SkullItemBuilder(material);
                break;
            case LEATHER_HELMET:
            case LEATHER_HORSE_ARMOR:
            case LEATHER_CHESTPLATE:
            case LEATHER_LEGGINGS:
            case LEATHER_BOOTS:
                itemBuilder = new LeatherArmorItemBuilder(material);
                break;
            case POTION:
            case SPLASH_POTION:
            case LINGERING_POTION:
            case TIPPED_ARROW:
                itemBuilder = new PotionItemBuilder(material);
                break;
            case FILLED_MAP:
                itemBuilder = new FilledMapItemBuilder(material);
                break;
            case FIREWORK_ROCKET:
                itemBuilder = new FireworkRocketItemBuilder(material);
                break;
            case FIREWORK_STAR:
                itemBuilder = new FireworkStarItemBuilder(material);
                break;
            case ENCHANTED_BOOK:
                itemBuilder = new EnchantedBookItemBuilder(material);
                break;
            case BLACK_BANNER:
            case BLACK_WALL_BANNER:
            case BLUE_BANNER:
            case BLUE_WALL_BANNER:
            case BROWN_BANNER:
            case BROWN_WALL_BANNER:
            case CYAN_BANNER:
            case CYAN_WALL_BANNER:
            case GRAY_BANNER:
            case GRAY_WALL_BANNER:
            case GREEN_BANNER:
            case GREEN_WALL_BANNER:
            case LIGHT_BLUE_BANNER:
            case LIGHT_BLUE_WALL_BANNER:
            case LIGHT_GRAY_BANNER:
            case LIGHT_GRAY_WALL_BANNER:
            case LIME_BANNER:
            case LIME_WALL_BANNER:
            case MAGENTA_BANNER:
            case MAGENTA_WALL_BANNER:
            case ORANGE_BANNER:
            case ORANGE_WALL_BANNER:
            case PINK_BANNER:
            case PINK_WALL_BANNER:
            case PURPLE_BANNER:
            case PURPLE_WALL_BANNER:
            case RED_BANNER:
            case RED_WALL_BANNER:
            case WHITE_BANNER:
            case WHITE_WALL_BANNER:
            case YELLOW_BANNER:
            case YELLOW_WALL_BANNER:
                itemBuilder = new BannerItemBuilder(material);
                break;
            case BAT_SPAWN_EGG:
            case BEE_SPAWN_EGG:
            case BLAZE_SPAWN_EGG:
            case CAT_SPAWN_EGG:
            case CAVE_SPIDER_SPAWN_EGG:
            case CHICKEN_SPAWN_EGG:
            case COD_SPAWN_EGG:
            case COW_SPAWN_EGG:
            case CREEPER_SPAWN_EGG:
            case DOLPHIN_SPAWN_EGG:
            case DONKEY_SPAWN_EGG:
            case DROWNED_SPAWN_EGG:
            case ELDER_GUARDIAN_SPAWN_EGG:
            case ENDERMAN_SPAWN_EGG:
            case ENDERMITE_SPAWN_EGG:
            case EVOKER_SPAWN_EGG:
            case FOX_SPAWN_EGG:
            case GHAST_SPAWN_EGG:
            case GUARDIAN_SPAWN_EGG:
            case HOGLIN_SPAWN_EGG:
            case HORSE_SPAWN_EGG:
            case HUSK_SPAWN_EGG:
            case LLAMA_SPAWN_EGG:
            case MAGMA_CUBE_SPAWN_EGG:
            case MOOSHROOM_SPAWN_EGG:
            case MULE_SPAWN_EGG:
            case OCELOT_SPAWN_EGG:
            case PANDA_SPAWN_EGG:
            case PARROT_SPAWN_EGG:
            case PHANTOM_SPAWN_EGG:
            case PIGLIN_SPAWN_EGG:
            case PIG_SPAWN_EGG:
            case PILLAGER_SPAWN_EGG:
            case POLAR_BEAR_SPAWN_EGG:
            case PUFFERFISH_SPAWN_EGG:
            case RABBIT_SPAWN_EGG:
            case RAVAGER_SPAWN_EGG:
            case SALMON_SPAWN_EGG:
            case SHEEP_SPAWN_EGG:
            case SHULKER_SPAWN_EGG:
            case SILVERFISH_SPAWN_EGG:
            case SKELETON_HORSE_SPAWN_EGG:
            case SKELETON_SPAWN_EGG:
            case SLIME_SPAWN_EGG:
            case SPIDER_SPAWN_EGG:
            case SQUID_SPAWN_EGG:
            case STRAY_SPAWN_EGG:
            case STRIDER_SPAWN_EGG:
            case TRADER_LLAMA_SPAWN_EGG:
            case TROPICAL_FISH_SPAWN_EGG:
            case TURTLE_SPAWN_EGG:
            case VEX_SPAWN_EGG:
            case VILLAGER_SPAWN_EGG:
            case VINDICATOR_SPAWN_EGG:
            case WANDERING_TRADER_SPAWN_EGG:
            case WITCH_SPAWN_EGG:
            case WITHER_SKELETON_SPAWN_EGG:
            case WOLF_SPAWN_EGG:
            case ZOGLIN_SPAWN_EGG:
            case ZOMBIE_HORSE_SPAWN_EGG:
            case ZOMBIE_SPAWN_EGG:
            case ZOMBIE_VILLAGER_SPAWN_EGG:
            case ZOMBIFIED_PIGLIN_SPAWN_EGG:
                itemBuilder = new SpawnEggItemBuilder(material);
                break;
            case ARMOR_STAND:
                itemBuilder = new ArmorStandItemBuilder(material);
                break;
            case KNOWLEDGE_BOOK:
                itemBuilder = new KnowledgeBookItemBuilder(material);
                break;
            case FURNACE:
            case CHEST:
            case TRAPPED_CHEST:
            case JUKEBOX:
            case DISPENSER:
            case DROPPER:
            case ACACIA_SIGN:
            case ACACIA_WALL_SIGN:
            case BIRCH_SIGN:
            case BIRCH_WALL_SIGN:
            case CRIMSON_SIGN:
            case CRIMSON_WALL_SIGN:
            case DARK_OAK_SIGN:
            case DARK_OAK_WALL_SIGN:
            case JUNGLE_SIGN:
            case JUNGLE_WALL_SIGN:
            case OAK_SIGN:
            case OAK_WALL_SIGN:
            case SPRUCE_SIGN:
            case SPRUCE_WALL_SIGN:
            case WARPED_SIGN:
            case WARPED_WALL_SIGN:
            case SPAWNER:
            case BREWING_STAND:
            case ENCHANTING_TABLE:
            case COMMAND_BLOCK:
            case REPEATING_COMMAND_BLOCK:
            case CHAIN_COMMAND_BLOCK:
            case BEACON:
            case DAYLIGHT_DETECTOR:
            case HOPPER:
            case COMPARATOR:
            case SHIELD:
            case STRUCTURE_BLOCK:
            case SHULKER_BOX:
            case WHITE_SHULKER_BOX:
            case ORANGE_SHULKER_BOX:
            case MAGENTA_SHULKER_BOX:
            case LIGHT_BLUE_SHULKER_BOX:
            case YELLOW_SHULKER_BOX:
            case LIME_SHULKER_BOX:
            case PINK_SHULKER_BOX:
            case GRAY_SHULKER_BOX:
            case LIGHT_GRAY_SHULKER_BOX:
            case CYAN_SHULKER_BOX:
            case PURPLE_SHULKER_BOX:
            case BLUE_SHULKER_BOX:
            case BROWN_SHULKER_BOX:
            case GREEN_SHULKER_BOX:
            case RED_SHULKER_BOX:
            case BLACK_SHULKER_BOX:
            case ENDER_CHEST:
            case BARREL:
            case BELL:
            case BLAST_FURNACE:
            case CAMPFIRE:
            case SOUL_CAMPFIRE:
            case JIGSAW:
            case LECTERN:
            case SMOKER:
            case BEEHIVE:
            case BEE_NEST:
                itemBuilder = new BlockStateItemBuilder(material);
                break;
            case AXOLOTL_BUCKET:
                itemBuilder = new AxolotlBucketItemBuilder(material);
                break;
            case TROPICAL_FISH_BUCKET:
                itemBuilder = new TropicalFishBucketItemBuilder(material);
                break;
            case CROSSBOW:
                itemBuilder = new CrossbowItemBuilder(material);
                break;
            case SUSPICIOUS_STEW:
                itemBuilder = new SuspiciousStewItemBuilder(material);
                break;
            case COMPASS:
                itemBuilder = new CompassItemBuilder(material);
                break;
            case BUNDLE:
                itemBuilder = new BundleItemBuilder(material);
                break;
            default:
                itemBuilder = new ItemBuilder(material);
        }

        try {
            return (T) itemBuilder;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Provided ItemBuilder class " + clazz.getName() + " does not match the real class " + itemBuilder.getClass().getName());
        }
    }


    Material material;
    ItemMeta meta;

    public ItemBuilder(Material material) {
        this.material = material;
        this.meta = Bukkit.getItemFactory().getItemMeta(material);
    }

    public T displayName(Component displayName) {
        meta.displayName(displayName);
        return (T) this;
    }

    public T lore(Component... lore) {
        meta.lore(Arrays.asList(lore));
        return (T) this;
    }

    public T lore(List<Component> lore) {
        meta.lore(lore);
        return (T) this;
    }

    public T customModelData(Integer customModelData) {
        meta.setCustomModelData(customModelData);
        return (T) this;
    }

    public T addEnchant(Enchantment enchantment, int level, boolean ignoreLevelRestriction) {
        meta.addEnchant(enchantment, level, ignoreLevelRestriction);
        return (T) this;
    }

    public T removeEnchant(Enchantment enchantment) {
        meta.removeEnchant(enchantment);
        return (T) this;
    }

    public T addItemFlags(ItemFlag... itemFlags) {
        meta.addItemFlags(itemFlags);
        return (T) this;
    }

    public T removeItemFlags(ItemFlag... itemFlags) {
        meta.removeItemFlags(itemFlags);
        return (T) this;
    }

    public T unbreakable(boolean unbreakable) {
        meta.setUnbreakable(unbreakable);
        return (T) this;
    }

    public T addAttributeModifier(Attribute attribute, AttributeModifier modifier) {
        meta.addAttributeModifier(attribute, modifier);
        return (T) this;
    }

    public T removeAttributeModifier(Attribute attribute, AttributeModifier modifier) {
        meta.removeAttributeModifier(attribute, modifier);
        return (T) this;
    }

    public T setAttributeModifiers(Multimap<Attribute, AttributeModifier> modifiers) {
        meta.setAttributeModifiers(modifiers);
        return (T) this;
    }

    public T destroyableKeys(Collection<Namespaced> canDestroy) {
        meta.setDestroyableKeys(canDestroy);
        return (T) this;
    }

    public T placeableKeys(Collection<Namespaced> canPlaceOn) {
        meta.setPlaceableKeys(canPlaceOn);
        return (T) this;
    }

    public final ItemStack build() {
        ItemStack itemStack = new ItemStack(material);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

}
