
package com.xiaoshumiao.radom.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

import com.xiaoshumiao.radom.itemgroup.RadomItemGroup;
import com.xiaoshumiao.radom.item.DeepBlueItem;
import com.xiaoshumiao.radom.RadomModElements;

@RadomModElements.ModElement.Tag
public class DeepBlueOreBlock extends RadomModElements.ModElement {
	@ObjectHolder("radom:deep_blue_ore")
	public static final Block block = null;

	public DeepBlueOreBlock(RadomModElements instance) {
		super(instance, 133);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(RadomItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(18f, 20.96481356314738f).setLightLevel(s -> 0)
					.harvestLevel(12).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("deep_blue_ore");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(DeepBlueItem.block));
		}
	}
}
