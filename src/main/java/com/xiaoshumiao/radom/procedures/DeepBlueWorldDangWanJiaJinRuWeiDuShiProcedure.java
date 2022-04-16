package com.xiaoshumiao.radom.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.xiaoshumiao.radom.RadomMod;

public class DeepBlueWorldDangWanJiaJinRuWeiDuShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RadomMod.LOGGER.warn("Failed to load dependency entity for procedure DeepBlueWorldDangWanJiaJinRuWeiDuShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 6000, (int) 3));
	}
}
