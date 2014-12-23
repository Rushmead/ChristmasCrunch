package me.rushmead.christmascrunch.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.rushmead.christmascrunch.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

/**
 * /**
 * File by Rushmead for Christmas Crunch
 */

public class ItemMincePie extends ItemFood {
    public static ArrayList<ItemStack> items = new ArrayList<ItemStack>();
    public ItemMincePie() {

        super(4, false);
        this.setUnlocalizedName("mincePie");
        System.out.print(this.getUnlocalizedName());
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
        int number = rand.nextInt((items.size() -1) + 1) +1;
        ItemStack item = items.get(number);
        item.stackSize = new Random().nextInt((16 - 1) +1)+1;
        player.inventory.addItemStackToInventory(item);
        return itemStack;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.MODID + ":mincePie");
    }
}
