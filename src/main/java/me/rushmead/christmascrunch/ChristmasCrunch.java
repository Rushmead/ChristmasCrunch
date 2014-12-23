package me.rushmead.christmascrunch;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import me.rushmead.christmascrunch.items.ItemMincePie;
import me.rushmead.christmascrunch.proxy.IProxy;
import net.minecraft.item.ItemFood;

/**
 * /**
 * File by Rushmead for Christmas Crunch
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION, name= Reference.MOD_NAME)
public class ChristmasCrunch
{
@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    public static ItemFood mincePie = new ItemMincePie();
    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event){
        GameRegistry.registerItem(mincePie, "mincePie");

    }
}
