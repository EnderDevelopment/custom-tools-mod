package com.giuseppegioliffi91.customtoolsmod;

import net.minecraft.block.Block;
import net.minecraft.block.Material;

public
class CustomOreBlock extends Block {
    public CustomOreBlock() {
        super(Settings.of(Material.STONE).strength(3.0F, 3.0F));
    }
}
