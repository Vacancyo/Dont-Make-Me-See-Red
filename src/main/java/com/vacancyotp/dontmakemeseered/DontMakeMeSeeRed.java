package com.vacancyotp.dontmakemeseered;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DontMakeMeSeeRed.MOD_ID)
public class DontMakeMeSeeRed
{
    public static final String MOD_ID = "dontmakemeseered";

    public DontMakeMeSeeRed(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
