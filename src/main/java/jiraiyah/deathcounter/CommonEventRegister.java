package jiraiyah.deathcounter;

import net.minecraftforge.common.MinecraftForge;

public class CommonEventRegister
{
    public static void register()
    {
        MinecraftForge.EVENT_BUS.register(new DeathEventHandler());
    }
}
