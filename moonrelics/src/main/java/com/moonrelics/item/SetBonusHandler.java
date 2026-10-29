package com.moonrelics.item;

import com.moonrelics.MoonRelics;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoonRelics.MODID)
public class SetBonusHandler {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        Player player = event.player;
        if (player.level().isClientSide || player.tickCount % 20 != 0) return;
        if (!hasFullSet(player)) return;

        player.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 1, true, false, true));
        player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 60, 0, true, false, false));
        player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 260, 0, true, false, false));
        if (player.level().isNight()) {
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 0, true, false, true));
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 0, true, false, true));
        }
    }

    private static boolean hasFullSet(Player player) {
        int count = 0;
        for (ItemStack s : player.getArmorSlots()) {
            if (s.getItem() instanceof ArmorItem a && a.getMaterial() == ModArmorMaterials.MOONSTONE) count++;
        }
        return count == 4;
    }
}
