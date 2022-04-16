
package com.xiaoshumiao.radom.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.xiaoshumiao.radom.item.PebbleItem;
import com.xiaoshumiao.radom.RadomModElements;

@RadomModElements.ModElement.Tag
public class RadomItemGroup extends RadomModElements.ModElement {
	public RadomItemGroup(RadomModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabradom") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PebbleItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
