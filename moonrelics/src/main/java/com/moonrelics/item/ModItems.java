package com.moonrelics.item;

import com.moonrelics.MoonRelics;
import com.moonrelics.block.ModBlocks;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoonRelics.MODID);

    public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOONSTONE_ORE = ITEMS.register("moonstone_ore",
            () -> new BlockItem(ModBlocks.MOONSTONE_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_MOONSTONE_ORE = ITEMS.register("deepslate_moonstone_ore",
            () -> new BlockItem(ModBlocks.DEEPSLATE_MOONSTONE_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_BLOCK = ITEMS.register("moonstone_block",
            () -> new BlockItem(ModBlocks.MOONSTONE_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> MOON_SWORD = ITEMS.register("moon_sword",
            () -> new MoonSword(new Item.Properties()));
    public static final RegistryObject<Item> MOON_PICKAXE = ITEMS.register("moon_pickaxe",
            () -> new PickaxeItem(ModTiers.MOONSTONE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> MOON_HELMET = ITEMS.register("moon_helmet",
            () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MOON_CHESTPLATE = ITEMS.register("moon_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MOON_LEGGINGS = ITEMS.register("moon_leggings",
            () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MOON_BOOTS = ITEMS.register("moon_boots",
            () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> MOON_STAFF = ITEMS.register("moon_staff",
            () -> new MoonStaffItem(new Item.Properties().stacksTo(1).durability(250)));
}
