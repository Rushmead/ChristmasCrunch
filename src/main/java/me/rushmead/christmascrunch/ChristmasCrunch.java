package me.rushmead.christmascrunch;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import me.rushmead.christmascrunch.items.ModItems;
import me.rushmead.christmascrunch.proxy.IProxy;

/**
 * /**
 * File by Rushmead for Christmas Crunch on 22/12/2014
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class ChristmasCrunch
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModItems.init();
        Recipes.init();
    }

}
