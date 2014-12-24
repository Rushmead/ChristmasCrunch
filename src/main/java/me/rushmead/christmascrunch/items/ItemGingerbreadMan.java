package me.rushmead.christmascrunch.items;

import me.rushmead.christmascrunch.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

/**
 * /**
 * File by Rushmead for Christmas Crunch
 */

public class ItemGingerbreadMan extends ItemChristmasCrunch{
    public static ArrayList<ItemStack> items = new ArrayList<ItemStack>();
    public ItemGingerbreadMan() {
        super(4);
        this.setUnlocalizedName(Names.Items.gingerbreadman);
        items.add(new ItemStack(Items.diamond));
        items.add(new ItemStack(Items.iron_ingot));
        items.add(new ItemStack(Blocks.stone));
        items.add(new ItemStack(Items.coal));
        items.add(new ItemStack(Items.apple));
        items.add(new ItemStack(Blocks.piston));
        items.add(new ItemStack(Blocks.netherrack));
    }
    public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player)
    {
        --itemStack.stackSize;
        player.getFoodStats().func_151686_a(this, itemStack);
        Random rand = new Random();
        int number = rand.nextInt((items.size() -1)) +1;
        ItemStack item = items.get(number).copy();
        item.stackSize = rand.nextInt((16-1) +1 )+1;
        player.inventory.addItemStackToInventory(item);
        return itemStack;
    }
}
