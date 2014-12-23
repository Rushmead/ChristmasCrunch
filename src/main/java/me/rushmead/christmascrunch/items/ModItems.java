package me.rushmead.christmascrunch.items;

import cpw.mods.fml.common.registry.GameRegistry;
import me.rushmead.christmascrunch.Names;
import me.rushmead.christmascrunch.Reference;

/**
 * /**
 * File by Rushmead for Christmas Crunch
 */
@GameRegistry.ObjectHolder(Reference.MODID)
public class ModItems {
    public static final ItemMincePie mincePie = new ItemMincePie();
    public static void init(){
        GameRegistry.registerItem(mincePie, Names.Items.mincepie);


    }
}
