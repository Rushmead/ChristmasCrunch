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
    public static final ItemChristmasCrunch mincePie = new ItemMincePie();
    public static final ItemChristmasCrunch candyCane = new ItemCandyCane();
    public static final ItemChristmasCrunch christmasPud = new ItemChristmasPudding();
    public static final ItemChristmasCrunch gingerbreadMan = new ItemGingerbreadMan();
    public static void init(){
        GameRegistry.registerItem(mincePie, Names.Items.mincepie);
        GameRegistry.registerItem(candyCane, Names.Items.candycane);
        GameRegistry.registerItem(christmasPud, Names.Items.christmaspud);
        GameRegistry.registerItem(gingerbreadMan, Names.Items.gingerbreadman);

    }
}
