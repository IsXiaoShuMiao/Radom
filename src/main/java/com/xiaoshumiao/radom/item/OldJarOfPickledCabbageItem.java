
package com.xiaoshumiao.radom.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.xiaoshumiao.radom.procedures.OldJarOfPickledCabbageDangShiWuBeiChiShiProcedure;
import com.xiaoshumiao.radom.itemgroup.RadomItemGroup;
import com.xiaoshumiao.radom.RadomModElements;

@RadomModElements.ModElement.Tag
public class OldJarOfPickledCabbageItem extends RadomModElements.ModElement {
	@ObjectHolder("radom:old_jar_of_pickled_cabbage")
	public static final Item block = null;

	public OldJarOfPickledCabbageItem(RadomModElements instance) {
		super(instance, 178);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(RadomItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(1).saturation(0.1f).setAlwaysEdible()

							.build()));
			setRegistryName("old_jar_of_pickled_cabbage");
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

			OldJarOfPickledCabbageDangShiWuBeiChiShiProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity))
					.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			return retval;
		}
	}
}
