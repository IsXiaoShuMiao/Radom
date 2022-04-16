
package com.xiaoshumiao.radom.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import com.xiaoshumiao.radom.itemgroup.RadomItemGroup;
import com.xiaoshumiao.radom.RadomModElements;

@RadomModElements.ModElement.Tag
public class RedHoeItem extends RadomModElements.ModElement {
	@ObjectHolder("radom:red_hoe")
	public static final Item block = null;

	public RedHoeItem(RadomModElements instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1741;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 56;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RedIngotItem.block));
			}
		}, 0, -3f, new Item.Properties().group(RadomItemGroup.tab)) {
		}.setRegistryName("red_hoe"));
	}
}
