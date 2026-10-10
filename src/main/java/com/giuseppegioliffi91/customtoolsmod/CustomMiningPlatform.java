package com.giuseppegioliffi91.customtoolsmod;

import net.minecraft.block.Block;
import net.minecraft.block.Material;

public
class CustomMiningPlatform extends Block {
    public CustomMiningPlatform() {
        super(Settings.of(Material.STONE).strength(2.0F, 6.0F));
    }
}
