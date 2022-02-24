package net.hanabi.soetch.hanabiores.world;

import net.hanabi.soetch.hanabiores.util.Reference;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.hanabi.soetch.hanabiores.world.gen.ModOreGeneration;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        ModOreGeneration.generateOres(event);
    }
}
