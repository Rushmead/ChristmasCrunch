package me.rushmead.christmascrunch.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.rushmead.christmascrunch.CreativeTabChristmasCrunch;
import me.rushmead.christmascrunch.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

/**
 * /**
 * File by Rushmead for Christmas Crunch
 */

public class ItemChristmasCrunch extends ItemFood
{
    public ItemChristmasCrunch(int amountOfHunger) {
        super(amountOfHunger, false);
        this.setCreativeTab(CreativeTabChristmasCrunch.CC_TAB);
    }

    @Override
    public String getUnlocalizedName() {

        return String.format("item.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
