package me.rushmead.christmascrunch;

import cpw.mods.fml.common.registry.GameRegistry;
import me.rushmead.christmascrunch.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * /**
 * File by Rushmead for Christmas Crunch
 */

public class Recipes{

    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.mincePie), "WWW", "SCS", "WWW", 'W', new ItemStack(Items.wheat), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(Items.cookie));
    }
}
