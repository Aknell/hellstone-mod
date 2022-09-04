package io.github.aknell.hellstone.common.item.custom;

import io.github.aknell.hellstone.common.item.HellstoneItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class HellstoneHoeItem extends HoeItem {

	public HellstoneHoeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
		super(toolMaterial, attackDamage, attackSpeed, settings);
	}

	@Override
	public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		stack.damage(2, attacker, (e) -> {
			e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		});
		if(stack.getItem() == HellstoneItems.HELLSTONE_HOE) target.setOnFireFor(30);
		return true;
	}
}
