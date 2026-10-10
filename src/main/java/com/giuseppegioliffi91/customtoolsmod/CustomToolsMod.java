package com.giuseppegioliffi91.customtoolsmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public
class CustomToolsMod implements ModInitializer {
    public static final String MOD_ID = "customtoolsmod";

    // Custom Tool Materials
    public static final ToolMaterial CUSTOM_WOOD = new CustomToolMaterial(0, 59, 2.0F, 0.0F, 15);
    public static final ToolMaterial CUSTOM_STONE = new CustomToolMaterial(1, 131, 4.0F, 1.0F, 5);
    public static final ToolMaterial CUSTOM_IRON = new CustomToolMaterial(2, 250, 6.0F, 2.0F, 14);
    public static final ToolMaterial CUSTOM_GOLD = new CustomToolMaterial(0, 32, 12.0F, 0.0F, 22);
    public static final ToolMaterial CUSTOM_DIAMOND = new CustomToolMaterial(3, 1561, 8.0F, 3.0F, 10);
    public static final ToolMaterial CUSTOM_NETHERITE = new CustomToolMaterial(4, 2031, 9.0F, 4.0F, 15);

    // Custom Items
    public static final Item CUSTOM_WOOD_PICKAXE = new CustomPickaxeItem(CUSTOM_WOOD, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item CUSTOM_STONE_PICKAXE = new CustomPickaxeItem(CUSTOM_STONE, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item CUSTOM_IRON_PICKAXE = new CustomPickaxeItem(CUSTOM_IRON, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item CUSTOM_GOLD_PICKAXE = new CustomPickaxeItem(CUSTOM_GOLD, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item CUSTOM_DIAMOND_PICKAXE = new CustomPickaxeItem(CUSTOM_DIAMOND, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item CUSTOM_NETHERITE_PICKAXE = new CustomPickaxeItem(CUSTOM_NETHERITE, new FabricItemSettings().group(ItemGroup.TOOLS));

    @Override
    public void onInitialize() {
        // Register Items
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "custom_wood_pickaxe"), CUSTOM_WOOD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "custom_stone_pickaxe"), CUSTOM_STONE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "custom_iron_pickaxe"), CUSTOM_IRON_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "custom_gold_pickaxe"), CUSTOM_GOLD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "custom_diamond_pickaxe"), CUSTOM_DIAMOND_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "custom_netherite_pickaxe"), CUSTOM_NETHERITE_PICKAXE);
    }
}
