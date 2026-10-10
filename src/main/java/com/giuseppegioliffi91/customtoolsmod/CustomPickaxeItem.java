package com.giuseppegioliffi91.customtoolsmod;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public
class CustomPickaxeItem extends PickaxeItem {
    public CustomPickaxeItem(ToolMaterial material, Settings settings) {
        super(material, (int) material.getAttackDamage(), -2.8F, settings);
    }
}
