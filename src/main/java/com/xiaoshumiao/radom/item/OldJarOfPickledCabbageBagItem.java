
package com.xiaoshumiao.radom.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import java.util.Collections;

import com.xiaoshumiao.radom.procedures.OldJarOfPickledCabbageBagDangShiWuBeiChiShiProcedure;
import com.xiaoshumiao.radom.itemgroup.RadomItemGroup;
import com.xiaoshumiao.radom.RadomModElements;

@RadomModElements.ModElement.Tag
public class OldJarOfPickledCabbageBagItem extends RadomModElements.ModElement {
	@ObjectHolder("radom:old_jar_of_pickled_cabbage_bag")
	public static final Item block = null;

	public OldJarOfPickledCabbageBagItem(RadomModElements instance) {
		super(instance, 179);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(RadomItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.2f).setAlwaysEdible()

							.build()));
			setRegistryName("old_jar_of_pickled_cabbage_bag");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			OldJarOfPickledCabbageBagDangShiWuBeiChiShiProcedure.executeProcedure(Collections.EMPTY_MAP);
			return retval;
		}
	}
}
