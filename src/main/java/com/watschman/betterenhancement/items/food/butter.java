package com.watschman.betterenhancement.items.food;

import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class butter extends ItemFood {
    private static int heal_amount = 10;
    private static float saturation = 12F;
    private static boolean isWolfFood = false;
    public butter(){
        super(heal_amount, saturation, isWolfFood);
        GameRegistry.addRecipe(new ShapelessOreRecipe(this,
                "cropWheat", new ItemStack(Items.MILK_BUCKET)
                ));
    }
}