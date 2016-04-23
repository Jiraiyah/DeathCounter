package jiraiyah.deathcounter;

import jiraiyah.deathcounter.proxies.CommonProxy;
import jiraiyah.deathcounter.references.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, dependencies = Reference.DEPENDENCIES, name = Reference.MOD_NAME)
public class DeathCounter
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy PROXY;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        PROXY.preInit(event);
    }
}
