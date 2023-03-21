package com.ell.wonderinventory.Events;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.event.entity.player.PlayerEvent.ItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerEventHandler {

    private static final Logger LOGGER = LogManager.getLogger();

    private static final String msg = "Hello. you pick up Item!!";

    @SubscribeEvent
    public static void onItemPickup(ItemPickupEvent event){

        Player player = event.getPlayer();
        player.sendMessage(new TextComponent(msg),player.getUUID());

    }

//    @SubscribeEvent
//    public  static void onInventory


}
