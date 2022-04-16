
package com.xiaoshumiao.radom.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.xiaoshumiao.radom.itemgroup.RadomItemGroup;
import com.xiaoshumiao.radom.RadomModElements;

@RadomModElements.ModElement.Tag
public class BlueShovelItem extends RadomModElements.ModElement {
	@ObjectHolder("radom:blue_shovel")
	public static final Item block = null;

	public BlueShovelItem(RadomModElements instance) {
		super(instance, 96);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BlueIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(RadomItemGroup.tab)) {
		}.setRegistryName("blue_shovel"));
	}
}
