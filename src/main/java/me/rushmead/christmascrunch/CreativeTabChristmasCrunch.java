package me.rushmead.christmascrunch;

import me.rushmead.christmascrunch.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * /**
 * File by Rushmead for Christmas Crunch
 */

public class CreativeTabChristmasCrunch
{
    public static final CreativeTabs CC_TAB = new CreativeTabs(Reference.MODID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.candyCane;
        }
    };
}
