package dev.morazzer.itembuilder;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.meta.KnowledgeBookMeta;

import java.util.List;

public class KnowledgeBookItemBuilder extends ItemBuilder<KnowledgeBookItemBuilder> {
    public KnowledgeBookItemBuilder(Material material) {
        super(material);
    }

    public KnowledgeBookItemBuilder setRecipes(List<NamespacedKey> recipes) {
        ((KnowledgeBookMeta)super.meta).setRecipes(recipes);
        return this;
    }

    public KnowledgeBookItemBuilder addRecipe(NamespacedKey recipe) {
        ((KnowledgeBookMeta)super.meta).addRecipe(recipe);
        return this;
    }
}
