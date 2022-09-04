package io.github.aknell.hellstone.common.block;

import io.github.aknell.hellstone.common.HellstoneMod;
import io.github.aknell.hellstone.common.item.HellstoneItems;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class HellstoneBlocks {

	public static Block HELLSTONE_ORE;
	public static Block MYTHRIL_ORE;

	public static Block register(String name, Block block, Item.Settings itemSettings) {
		HellstoneItems.register(name, new BlockItem(block, itemSettings));
		return Registry.register(Registry.BLOCK, new Identifier(HellstoneMod.MOD_ID, name), block);
	}

	public static void init() {
		HELLSTONE_ORE = register("hellstone_ore", new Block(QuiltBlockSettings.of(Material.STONE).requiresTool().strength(5f, 200f)), new QuiltItemSettings().group(ItemGroup.BUILDING_BLOCKS).fireproof());
		MYTHRIL_ORE = register("mythril_ore", new Block(QuiltBlockSettings.of(Material.STONE).requiresTool().strength(6f, 500f)), new QuiltItemSettings().group(ItemGroup.BUILDING_BLOCKS));
	}

}
