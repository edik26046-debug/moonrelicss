package com.moonrelics.block;

import com.moonrelics.MoonRelics;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoonRelics.MODID);

    public static final RegistryObject<Block> MOONSTONE_ORE = BLOCKS.register("moonstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f).requiresCorrectToolForDrops().lightLevel(s -> 3),
                    UniformInt.of(2, 5)));

    public static final RegistryObject<Block> DEEPSLATE_MOONSTONE_ORE = BLOCKS.register("deepslate_moonstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)
                    .strength(4.5f, 3.0f).requiresCorrectToolForDrops().lightLevel(s -> 3),
                    UniformInt.of(3, 6)));

    public static final RegistryObject<Block> MOONSTONE_BLOCK = BLOCKS.register("moonstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(5.0f, 6.0f).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST).lightLevel(s -> 8)));
}
