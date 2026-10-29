package com.moonrelics.item;

import com.moonrelics.MoonRelics;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoonRelics.MODID);

    public static final RegistryObject<CreativeModeTab> MAIN = TABS.register("main",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.moonrelics"))
                    .icon(() -> new ItemStack(ModItems.MOONSTONE.get()))
                    .displayItems((params, output) ->
                            ModItems.ITEMS.getEntries().forEach(i -> output.accept(i.get())))
                    .build());
}
