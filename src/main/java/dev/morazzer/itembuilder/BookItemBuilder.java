package dev.morazzer.itembuilder;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.meta.BookMeta;

public class BookItemBuilder extends ItemBuilder<BookItemBuilder> {
    public BookItemBuilder(Material material) {
        super(material);
    }

    public BookItemBuilder title(Component title) {
        ((BookMeta) super.meta).title(title);
        return this;
    }

    public BookItemBuilder author(Component author) {
        ((BookMeta) super.meta).author(author);
        return this;
    }

    public BookItemBuilder generation(BookMeta.Generation generation) {
        ((BookMeta) super.meta).setGeneration(generation);
        return this;
    }

    public BookItemBuilder page(int page, Component data) {
        ((BookMeta) super.meta).page(page, data);
        return this;
    }

    public BookItemBuilder addPages(Component... pages) {
        ((BookMeta) super.meta).addPages(pages);
        return this;
    }

}
