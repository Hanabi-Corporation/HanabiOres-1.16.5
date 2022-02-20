package net.soetch.soetchores.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.soetch.soetchores.util.Reference;
import net.soetch.soetchores.world.gen.ModOreGeneration;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        ModOreGeneration.generateOres(event);
    }
}
