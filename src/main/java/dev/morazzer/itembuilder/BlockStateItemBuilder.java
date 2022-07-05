package dev.morazzer.itembuilder;

import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.inventory.meta.BlockStateMeta;

public class BlockStateItemBuilder extends ItemBuilder<BlockStateItemBuilder> {
    public BlockStateItemBuilder(Material material) {
        super(material);
    }

    public BlockStateItemBuilder blockState(BlockState blockState) {
        ((BlockStateMeta) super.meta).setBlockState(blockState);
        return this;
    }
}
