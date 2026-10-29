package com.moonrelics;

import com.moonrelics.block.ModBlocks;
import com.moonrelics.item.ModItems;
import com.moonrelics.item.ModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoonRelics.MODID)
public class MoonRelics {
    public static final String MODID = "moonrelics";

    public MoonRelics() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        ModTabs.TABS.register(bus);
    }
}
