package io.github.aknell.hellstone.common.item.custom;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class HellstoneAxeItem extends AxeItem {

	public HellstoneAxeItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed, Settings settings) {
		super(toolMaterial, attackDamage, attackSpeed, settings);
	}

	@Override
	public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		stack.damage(2, attacker, (e) -> {
			e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		});
		target.setOnFireFor(30);
		return true;
	}
}
