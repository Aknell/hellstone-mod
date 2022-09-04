package io.github.aknell.hellstone.common.api.item;

import io.github.aknell.hellstone.common.item.HellstoneItems;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum HellstoneToolMaterials implements ToolMaterial {
	HELLSTONE(5, 2400, 12.0F, 5.0F, 20, () -> { return Ingredient.ofItems(new ItemConvertible[]{HellstoneItems.HELLSTONE_INGOT}); }),
	MYTHRIL(6, 2560, 13.0F, 6.0F, 22, () -> { return Ingredient.ofItems(new ItemConvertible[]{HellstoneItems.MYTHRIL_INGOT}); });

	private final int miningLevel;
	private final int itemDurability;
	private final float miningSpeed;
	private final float attackDamage;
	private final int enchantability;
	private final Lazy<Ingredient> repairIngredient;

	private HellstoneToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier supplier) {
		this.miningLevel = miningLevel;
		this.itemDurability = itemDurability;
		this.miningSpeed = miningSpeed;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairIngredient = new Lazy(supplier);
	}

	public int getDurability() {
		return this.itemDurability;
	}

	public float getMiningSpeedMultiplier() {
		return this.miningSpeed;
	}

	public float getAttackDamage() {
		return this.attackDamage;
	}

	public int getMiningLevel() {
		return this.miningLevel;
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	public Ingredient getRepairIngredient() {
		return (Ingredient)this.repairIngredient.get();
	}
}
