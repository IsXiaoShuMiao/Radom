
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
public class BlackHoeItem extends RadomModElements.ModElement {
	@ObjectHolder("radom:black_hoe")
	public static final Item block = null;

	public BlackHoeItem(RadomModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BlackIngotItem.block));
			}
		}, 0, -3f, new Item.Properties().group(RadomItemGroup.tab)) {
		}.setRegistryName("black_hoe"));
	}
}
