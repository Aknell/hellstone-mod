package io.github.aknell.hellstone.common.item;

import io.github.aknell.hellstone.common.HellstoneMod;
import io.github.aknell.hellstone.common.item.custom.HellstonePickaxeItem;
import io.github.aknell.hellstone.common.api.item.HellstoneToolMaterials;
import io.github.aknell.hellstone.common.item.custom.HellstoneSwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class HellstoneItems {

	public static Item RAW_HELLSTONE;
	public static Item HELLSTONE_INGOT;
	public static Item HELLSTONE_PICKAXE;
	public static Item HELLSTONE_SWORD;

	public static Item register(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(HellstoneMod.MOD_ID, name), item);
	}

	public static void init() {
		RAW_HELLSTONE = register("raw_hellstone", new Item(new QuiltItemSettings().group(ItemGroup.MATERIALS).fireproof()));
		HELLSTONE_INGOT = register("hellstone_ingot", new Item(new QuiltItemSettings().group(ItemGroup.MATERIALS).fireproof()));
		HELLSTONE_PICKAXE = register("hellstone_pickaxe", new HellstonePickaxeItem(HellstoneToolMaterials.HELLSTONE, 1, -2.8f, new QuiltItemSettings().group(ItemGroup.TOOLS).fireproof()));
		HELLSTONE_SWORD = register("hellstone_sword", new HellstoneSwordItem(HellstoneToolMaterials.HELLSTONE, 1, -2.8f, new QuiltItemSettings().group(ItemGroup.COMBAT).fireproof()));
	}

}
