package spacetime.mainold;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;

public class durabilities {

	public static HashMap<String, Integer> duras = new HashMap<String, Integer>();
	public static HashMap<String, Integer> temp = new HashMap<String, Integer>();
	
	public static HashMap<String, Material> converts = new HashMap<String, Material>();
	
	public static HashMap<String, Material> fireconverts = new HashMap<String, Material>();
	public static HashMap<String, Integer> lengths = new HashMap<String, Integer>();
	public static List<String> softs = new ArrayList<String>();
	
	public durabilities() {
		addConverts();
		addLengths();
		addSofts();
		duras.put("Material.AIR" + "", 0);
		duras.put("Material.GLOWSTONE" + "", 0);
		duras.put("Material.TNT" + "", 0);
		duras.put("Material.FIRE" + "", 1);
		duras.put("Material.CROPS" + "", 1);
		duras.put("Material.WHEAT" + "", 1);
		duras.put("Material.POTATOES" + "", 1);
		duras.put("Material.LONG_GRASS" + "", 1);
		duras.put("Material.DOUBLE_PLANT" + "", 1);
		duras.put("Material.POTATO" + "", 1);
		duras.put("Material.CARROTS" + "", 1);
		duras.put("Material.BEETROOTS" + "", 1);
		duras.put("Material.THIN_GLASS" + "", 1);
		duras.put("Material.STAINED_GLASS_PANE" + "", 1);
		duras.put("Material.REDSTONE_TORCH_ON" + "", 1);
		duras.put("Material.REDSTONE_TORCH_OFF" + "", 1);
		duras.put("Material.STAINED_GLASS" + "", 2);
		duras.put("Material.GLASS" + "", 2);
		duras.put("Material.LEAVES" + "", 2);
		duras.put("Material.LEAVES_2" + "", 2);
		duras.put("Material.GRASS" + "", 3);
		duras.put("Material.DIRT" + "", 3);
		duras.put("Material.SAND" + "", 3);
		duras.put("Material.GRASS_PATH" + "", 4);
		duras.put("Material.STATIONARY_WATER" + "", 5);
		duras.put("Material.WATER" + "", 5);
		duras.put("Material.WOOD" + "", 6);
		duras.put("Material.LOG" + "", 8);
		duras.put("Material.LOG_2" + "", 8);
		duras.put("Material.STONE" + "", 8);
		duras.put("Material.COBBLESTONE" + "", 8);
		duras.put("Material.STATIONARY_LAVA" + "", 12);
		duras.put("Material.LAVA" + "", 12);
		duras.put("Material.OBSIDIAN" + "", 7200);
		duras.put("Material.REDSTONE_WIRE" + "", 99999999);
		duras.put("Material.REDSTONE" + "", 99999999);
		duras.put("Material.BEDROCK", 99999999);
		duras.put("Material.ACTIVATOR_RAIL", 25);
		duras.put("Material.ALLIUM", 1);
		duras.put("Material.ANDESITE", 8);
		duras.put("Material.ANVIL", 45);
		duras.put("Material.ATTACHED_MELON_STEM", 1);
		duras.put("Material.ATTACHED_PUMPKIN_STEM", 1);
		duras.put("Material.AZURE_BLUET", 1);
		duras.put("Material.BARRIER", 9999999);
		duras.put("Material.BEACON", 500);
		duras.put("Material.BONE_BLOCK", 18);
		duras.put("Material.BOOKSHELF", 8);
		duras.put("Material.BREWING_STAND", 9);
		duras.put("Material.BRICK", 12);
		duras.put("Material.BRICK_SLAB", 8);
		duras.put("Material.BRICK_STAIRS", 8);
		duras.put("Material.BRICKS", 12);
		duras.put("Material.CAKE", 4);
		duras.put("Material.CARVED_PUMPKIN", 5);
		duras.put("Material.CAULDRON", 20);
		duras.put("Material.CAVE_AIR", 0);
		duras.put("Material.CHEST", 10);
		duras.put("Material.CHIPPED_ANVIL", 40);
		duras.put("Material.CHISELED_QUARTZ_BLOCK", 15);
		duras.put("Material.CHISELED_RED_SANDSTONE", 8);
		duras.put("Material.CHISELED_SANDSTONE", 8);
		duras.put("Material.CHISELED_STONE_BRICKS", 10);
		duras.put("Material.CLAY", 4);
		duras.put("Material.COAL_BLOCK", 8);
		duras.put("Material.COAL_ORE", 8);
		duras.put("Material.COARSE_DIRT", 4);
		duras.put("Material.COBBLESTONE_SLAB", 6);
		duras.put("Material.COBBLESTONE_STAIRS", 6);
		duras.put("Material.COBBLESTONE_WALL", 7);
		duras.put("Material.COBWEB", 4);
		duras.put("Material.CRACKED_STONE_BRICKS", 8);
		duras.put("Material.CRAFTING_TABLE", 8);
		duras.put("Material.CUT_RED_SANDSTONE", 8);
		duras.put("Material.CUT_SANDSTONE", 8);
		duras.put("Material.DAMAGED_ANVIL", 30);
		duras.put("Material.DAYLIGHT_DETECTOR", 10);
		duras.put("Material.DETECTOR_RAIL", 25);
		duras.put("Material.DIAMOND_BLOCK", 850);
		duras.put("Material.DIAMOND_ORE", 25);
		duras.put("Material.DIORITE", 8);
		duras.put("Material.DISPENSER", 10);
		duras.put("Material.DRIED_KELP_BLOCK", 4);
		duras.put("Material.DROPPER", 25);
		duras.put("Material.EMERALD_BLOCK", 750);
		duras.put("Material.EMERALD_ORE", 15);
		duras.put("Material.ENCHANTING_TABLE", 45);
		duras.put("Material.END_GATEWAY", 9999999);
		duras.put("Material.END_PORTAL", 9999999);
		duras.put("Material.END_PORTAL_FRAME", 9999999);
		duras.put("Material.END_ROD", 10);
		duras.put("Material.END_STONE", 15);
		duras.put("Material.END_STONE_BRICKS", 20);
		duras.put("Material.ENDER_CHEST", 9999999);
		duras.put("Material.FARMLAND", 3);
		duras.put("Material.FROSTED_ICE", 2);
		duras.put("Material.FURNACE", 10);
		duras.put("Material.GOLD_BLOCK", 600);
		duras.put("Material.GOLD_ORE", 15);
		duras.put("Material.GRANITE", 8);
		duras.put("Material.GRASS_BLOCK", 3);
		duras.put("Material.HAY_BLOCK", 4);
		duras.put("Material.HEAVY_WEIGHTED_PRESSURE_PLATE", 12);
		duras.put("Material.HOPPER", 12);
		duras.put("Material.ICE", 1);
		duras.put("Material.IRON_BLOCK", 450);
		duras.put("Material.IRON_DOOR", 350);
		duras.put("Material.IRON_ORE", 12);
		duras.put("Material.IRON_TRAPDOOR", 350);
		duras.put("Material.JACK_O_LANTERN", 5);
		duras.put("Material.JUKEBOX", 15);
		duras.put("Material.LADDER", 6);
		duras.put("Material.LAPIS_BLOCK", 150);
		duras.put("Material.LAPIS_ORE", 7);
		duras.put("Material.LEVER", 35);
		duras.put("Material.MAGMA_BLOCK", 8);
		duras.put("Material.MELON", 7);
		duras.put("Material.MOSSY_COBBLESTONE", 6);
		duras.put("Material.MOSSY_COBBLESTONE_WALL", 5);
		duras.put("Material.MOSSY_STONE_BRICKS", 8);
		duras.put("Material.MYCELIUM", 3);
		duras.put("Material.NETHER_BRICK", 18);
		duras.put("Material.NETHER_BRICK_FENCE", 15);
		duras.put("Material.NETHER_BRICK_SLAB", 16);
		duras.put("Material.NETHER_BRICK_STAIRS", 16);
		duras.put("Material.NETHER_BRICKS", 18);
		duras.put("Material.NETHER_PORTAL", 200);
		duras.put("Material.NETHER_QUARTZ_ORE", 8);
		duras.put("Material.NETHER_WART_BLOCK", 4);
		duras.put("Material.NETHERRACK", 6);
		duras.put("Material.NOTE_BLOCK", 15);
		duras.put("Material.OBSERVER", 15);
		duras.put("Material.PACKED_ICE", 5);
		duras.put("Material.PODZOL", 5);
		duras.put("Material.POLISHED_ANDESITE", 9);
		duras.put("Material.POLISHED_DIORITE", 9);
		duras.put("Material.POLISHED_GRANITE", 9);
		duras.put("Material.POWERED_RAIL", 25);
		duras.put("Material.QUARTZ", 18);
		duras.put("Material.QUARTZ_BLOCK", 15);
		duras.put("Material.QUARTZ_PILLAR", 15);
		duras.put("Material.QUARTZ_SLAB", 13);
		duras.put("Material.QUARTZ_STAIRS", 13);
		duras.put("Material.RAIL", 25);
		duras.put("Material.REDSTONE", 9999999);
		duras.put("Material.REDSTONE_BLOCK", 50);
		duras.put("Material.REDSTONE_LAMP", 10);
		duras.put("Material.REDSTONE_ORE", 8);
		duras.put("Material.REDSTONE_TORCH", 2);
		duras.put("Material.REDSTONE_WALL_TORCH", 2);
		duras.put("Material.REDSTONE_WIRE", 9999999);
		duras.put("Material.SANDSTONE", 8);
		duras.put("Material.SANDSTONE_SLAB", 7);
		duras.put("Material.SANDSTONE_STAIRS", 7);
		duras.put("Material.SEA_LANTERN", 500);
		duras.put("Material.SIGN", 6);
		duras.put("Material.SLIME_BLOCK", 4);
		duras.put("Material.SMOOTH_QUARTZ", 15);
		duras.put("Material.SMOOTH_RED_SANDSTONE", 8);
		duras.put("Material.SMOOTH_SANDSTONE", 8);
		duras.put("Material.SMOOTH_STONE", 10);
		duras.put("Material.SNOW", 6);
		duras.put("Material.SNOW_BLOCK", 6);
		duras.put("Material.SOUL_SAND", 7);
		duras.put("Material.SPONGE", 4);
		duras.put("Material.STONE_BUTTON", 6);
		duras.put("Material.STRUCTURE_VOID", 9999999);
		duras.put("Material.TORCH", 2);
		duras.put("Material.TRAPPED_CHEST", 7);
		duras.put("Material.WET_SPONGE", 6);
		duras.put("Material.WALL_SIGN", 6);
		duras.put("Material.WALL_TORCH", 2);
		duras.put("AIR" + "", 0);
		duras.put("GLOWSTONE" + "", 0);
		duras.put("TNT" + "", 0);
		duras.put("FIRE" + "", 1);
		duras.put("CROPS" + "", 1);
		duras.put("LONG_GRASS" + "", 1);
		duras.put("DOUBLE_PLANT" + "", 1);
		duras.put("POTATO" + "", 1);
		duras.put("CARROT" + "", 1);
		duras.put("BEETROOT_BLOCK" + "", 1);
		duras.put("THIN_GLASS" + "", 1);
		duras.put("STAINED_GLASS_PANE" + "", 1);
		duras.put("REDSTONE_TORCH_ON" + "", 1);
		duras.put("REDSTONE_TORCH_OFF" + "", 1);
		duras.put("STAINED_GLASS" + "", 2);
		duras.put("GLASS" + "", 2);
		duras.put("LEAVES" + "", 2);
		duras.put("LEAVES_2" + "", 2);
		duras.put("GRASS" + "", 3);
		duras.put("DIRT" + "", 3);
		duras.put("SAND" + "", 3);
		duras.put("GRASS_PATH" + "", 4);
		duras.put("STATIONARY_WATER" + "", 5);
		duras.put("WATER" + "", 5);
		duras.put("WOOD" + "", 6);
		duras.put("LOG" + "", 8);
		duras.put("LOG_2" + "", 8);
		duras.put("STONE" + "", 8);
		duras.put("COBBLESTONE" + "", 8);
		duras.put("STATIONARY_LAVA" + "", 12);
		duras.put("LAVA" + "", 12);
		duras.put("OBSIDIAN" + "", 7200);
		duras.put("REDSTONE_WIRE" + "", 99999999);
		duras.put("REDSTONE" + "", 99999999);
		duras.put("BEDROCK", 99999999);
		duras.put("ACTIVATOR_RAIL", 25);
		duras.put("ALLIUM", 1);
		duras.put("ANDESITE", 8);
		duras.put("ANVIL", 45);
		duras.put("ATTACHED_MELON_STEM", 1);
		duras.put("ATTACHED_PUMPKIN_STEM", 1);
		duras.put("AZURE_BLUET", 1);
		duras.put("BARRIER", 9999999);
		duras.put("BEACON", 500);
		duras.put("BONE_BLOCK", 18);
		duras.put("BOOKSHELF", 8);
		duras.put("BREWING_STAND", 9);
		duras.put("BRICK", 12);
		duras.put("BRICK_SLAB", 8);
		duras.put("BRICK_STAIRS", 8);
		duras.put("BRICKS", 12);
		duras.put("CAKE", 4);
		duras.put("CARVED_PUMPKIN", 5);
		duras.put("CAULDRON", 20);
		duras.put("CAVE_AIR", 0);
		duras.put("CHEST", 10);
		duras.put("CHIPPED_ANVIL", 40);
		duras.put("CHISELED_QUARTZ_BLOCK", 15);
		duras.put("CHISELED_RED_SANDSTONE", 8);
		duras.put("CHISELED_SANDSTONE", 8);
		duras.put("CHISELED_STONE_BRICKS", 10);
		duras.put("CLAY", 4);
		duras.put("COAL_BLOCK", 8);
		duras.put("COAL_ORE", 8);
		duras.put("COARSE_DIRT", 4);
		duras.put("COBBLESTONE_SLAB", 6);
		duras.put("COBBLESTONE_STAIRS", 6);
		duras.put("COBBLESTONE_WALL", 7);
		duras.put("COBWEB", 4);
		duras.put("CRACKED_STONE_BRICKS", 8);
		duras.put("CRAFTING_TABLE", 8);
		duras.put("CUT_RED_SANDSTONE", 8);
		duras.put("CUT_SANDSTONE", 8);
		duras.put("DAMAGED_ANVIL", 30);
		duras.put("DAYLIGHT_DETECTOR", 10);
		duras.put("DETECTOR_RAIL", 25);
		duras.put("DIAMOND_BLOCK", 850);
		duras.put("DIAMOND_ORE", 25);
		duras.put("DIORITE", 8);
		duras.put("DISPENSER", 10);
		duras.put("DRIED_KELP_BLOCK", 4);
		duras.put("DROPPER", 25);
		duras.put("EMERALD_BLOCK", 750);
		duras.put("EMERALD_ORE", 15);
		duras.put("ENCHANTING_TABLE", 45);
		duras.put("END_GATEWAY", 9999999);
		duras.put("END_PORTAL", 9999999);
		duras.put("END_PORTAL_FRAME", 9999999);
		duras.put("END_ROD", 10);
		duras.put("END_STONE", 15);
		duras.put("END_STONE_BRICKS", 20);
		duras.put("ENDER_CHEST", 9999999);
		duras.put("FARMLAND", 3);
		duras.put("FROSTED_ICE", 2);
		duras.put("FURNACE", 10);
		duras.put("GOLD_BLOCK", 600);
		duras.put("GOLD_ORE", 15);
		duras.put("GRANITE", 8);
		duras.put("GRASS_BLOCK", 3);
		duras.put("HAY_BLOCK", 4);
		duras.put("HEAVY_WEIGHTED_PRESSURE_PLATE", 12);
		duras.put("HOPPER", 12);
		duras.put("ICE", 1);
		duras.put("IRON_BLOCK", 450);
		duras.put("IRON_DOOR", 350);
		duras.put("IRON_ORE", 12);
		duras.put("IRON_TRAPDOOR", 350);
		duras.put("JACK_O_LANTERN", 5);
		duras.put("JUKEBOX", 15);
		duras.put("LADDER", 6);
		duras.put("LAPIS_BLOCK", 150);
		duras.put("LAPIS_ORE", 7);
		duras.put("LEVER", 35);
		duras.put("MAGMA_BLOCK", 8);
		duras.put("MELON", 7);
		duras.put("MOSSY_COBBLESTONE", 6);
		duras.put("MOSSY_COBBLESTONE_WALL", 5);
		duras.put("MOSSY_STONE_BRICKS", 8);
		duras.put("MYCELIUM", 3);
		duras.put("NETHER_BRICK", 18);
		duras.put("NETHER_BRICK_FENCE", 15);
		duras.put("NETHER_BRICK_SLAB", 16);
		duras.put("NETHER_BRICK_STAIRS", 16);
		duras.put("NETHER_BRICKS", 18);
		duras.put("NETHER_PORTAL", 200);
		duras.put("NETHER_QUARTZ_ORE", 8);
		duras.put("NETHER_WART_BLOCK", 4);
		duras.put("NETHERRACK", 6);
		duras.put("NOTE_BLOCK", 15);
		duras.put("OBSERVER", 15);
		duras.put("PACKED_ICE", 5);
		duras.put("PODZOL", 5);
		duras.put("POLISHED_ANDESITE", 9);
		duras.put("POLISHED_DIORITE", 9);
		duras.put("POLISHED_GRANITE", 9);
		duras.put("POWERED_RAIL", 25);
		duras.put("QUARTZ", 18);
		duras.put("QUARTZ_BLOCK", 15);
		duras.put("QUARTZ_PILLAR", 15);
		duras.put("QUARTZ_SLAB", 13);
		duras.put("QUARTZ_STAIRS", 13);
		duras.put("RAIL", 25);
		duras.put("REDSTONE", 9999999);
		duras.put("REDSTONE_BLOCK", 50);
		duras.put("REDSTONE_LAMP", 10);
		duras.put("REDSTONE_ORE", 8);
		duras.put("REDSTONE_TORCH", 2);
		duras.put("REDSTONE_WALL_TORCH", 2);
		duras.put("REDSTONE_WIRE", 9999999);
		duras.put("SANDSTONE", 8);
		duras.put("SANDSTONE_SLAB", 7);
		duras.put("SANDSTONE_STAIRS", 7);
		duras.put("SEA_LANTERN", 500);
		duras.put("SIGN", 6);
		duras.put("SLIME_BLOCK", 4);
		duras.put("SMOOTH_QUARTZ", 15);
		duras.put("SMOOTH_RED_SANDSTONE", 8);
		duras.put("SMOOTH_SANDSTONE", 8);
		duras.put("SMOOTH_STONE", 10);
		duras.put("SNOW", 6);
		duras.put("SNOW_BLOCK", 6);
		duras.put("SOUL_SAND", 7);
		duras.put("SPONGE", 4);
		duras.put("STONE_BUTTON", 6);
		duras.put("STRUCTURE_VOID", 9999999);
		duras.put("TORCH", 2);
		duras.put("TRAPPED_CHEST", 7);
		duras.put("WET_SPONGE", 6);
		duras.put("WALL_SIGN", 6);
		duras.put("WALL_TORCH", 2);
		for(Material m : Material.values()) {
			if(!duras.containsKey(m + "")) {
				String mname = m + "";
				if(mainfile.instance.isStony(m)) {
					duras.put(m + "", 8);
				}
				else if(mname.contains("PLANK")) {
					duras.put(m + "", 6);
				}
				else if(mname.contains("LEAVE")) {
					duras.put(m + "", 2);
				}
				else if(mname.contains("LOG")) {
					duras.put(m + "", 8);
				}
				else if(mname.contains("ORE")) {
					duras.put(m + "", 9);
				}
				else if(mname.contains("STONE")) {
					duras.put(m + "", 8);
				}
				else if(mname.contains("BRICK")) {
					duras.put(m + "", 10);
				}
				else if(mname.contains("DIRT")) {
					duras.put(m + "", 3);
				}
				else if(mname.contains("CARPET")) {
					duras.put(m + "", 2);
				}
				else if(mname.contains("PRISMARINE")) {
					duras.put(m + "", 20);
				}
				else if(mname.contains("COMMAND")) {
					duras.put(m + "", 9999999);
				}
				else if(mname.contains("HEAD")||mname.contains("SKULL")) {
					duras.put(m + "", 6);
				}
				else if(mname.contains("BUTTON")) {
					duras.put(m + "", 2);
				}
				else if(mname.contains("DOOR")) {
					duras.put(m + "", 5);
				}
				else if(mname.contains("GATE")) {
					duras.put(m + "", 6);
				}
				else if(mname.contains("FENCE")) {
					duras.put(m + "", 6);
				}
				else if(mname.contains("LEAVES")) {
					duras.put(m + "", 2);
				}
				else if(mname.contains("LOG")) {
					duras.put(m + "", 8);
				}
				else if(mname.contains("PLANKS")) {
					duras.put(m + "", 6);
				}
				else if(mname.contains("PRESSURE")) {
					duras.put(m + "", 2);
				}
				else if(mname.contains("SAPLING")) {
					duras.put(m + "", 1);
				}
				else if(mname.contains("SLAB")) {
					duras.put(m + "", 5);
				}
				else if(mname.contains("STAIRS")) {
					duras.put(m + "", 5);
				}
				else if(mname.contains("TRAPDOOR")) {
					duras.put(m + "", 5);
				}
				else if(mname.contains("WOOD")) {
					duras.put(m + "", 6);
				}
				else if(mname.contains("BANNER")) {
					duras.put(m + "", 4);
				}
				else if(mname.contains("BED")) {
					duras.put(m + "", 6);
				}
				else if(mname.contains("POWDER")) {
					duras.put(m + "", 3);
				}
				else if(mname.contains("CONCRETE")) {
					duras.put(m + "", 8);
				}
				else if(mname.contains("GLAZED")) {
					duras.put(m + "", 8);
				}
				else if(mname.contains("SHULKER")) {
					duras.put(m + "", 39);
				}
				else if(mname.contains("PANE")) {
					duras.put(m + "", 1);
				}
				else if(mname.contains("GLASS")) {
					duras.put(m + "", 2);
				}
				else if(mname.contains("TERRACOTTA")) {
					duras.put(m + "", 8);
				}
				else if(mname.contains("WOOL")) {
					duras.put(m + "", 4);
				}
				else if(mname.contains("CORAL")) {
					duras.put(m + "", 6);
				}
				else {
				duras.put(m + "", 2);
				}
			}
		}
		tempes();
	}
	
	/*duras.put(Material.AIR + "", 0);
	duras.put(Material.GLOWSTONE + "", 0);
	duras.put(Material.TNT + "", 0);
	duras.put(Material.FIRE + "", 1);
	duras.put(Material.CROPS + "", 1);
	duras.put(Material.LONG_GRASS + "", 1);
	duras.put(Material.DOUBLE_PLANT + "", 1);
	duras.put(Material.POTATO + "", 1);
	duras.put(Material.CARROT + "", 1);
	duras.put(Material.BEETROOT_BLOCK + "", 1);
	duras.put(Material.THIN_GLASS + "", 1);
	duras.put(Material.STAINED_GLASS_PANE + "", 1);
	duras.put(Material.REDSTONE_TORCH_ON + "", 1);
	duras.put(Material.REDSTONE_TORCH_OFF + "", 1);
	duras.put(Material.STAINED_GLASS + "", 2);
	duras.put(Material.GLASS + "", 2);
	duras.put(Material.LEAVES + "", 2);
	duras.put(Material.LEAVES_2 + "", 2);
	duras.put(Material.GRASS + "", 3);
	duras.put(Material.DIRT + "", 3);
	duras.put(Material.SAND + "", 3);
	duras.put(Material.GRASS_PATH + "", 4);
	duras.put(Material.STATIONARY_WATER + "", 5);
	duras.put(Material.WATER + "", 5);
	duras.put(Material.WOOD + "", 6);
	duras.put(Material.LOG + "", 8);
	duras.put(Material.LOG_2 + "", 8);
	duras.put(Material.STONE + "", 8);
	duras.put(Material.COBBLESTONE + "", 8);
	duras.put(Material.STATIONARY_LAVA + "", 12);
	duras.put(Material.LAVA + "", 12);
	duras.put(Material.OBSIDIAN + "", 7200);
	duras.put(Material.REDSTONE_WIRE + "", 99999999);
	duras.put(Material.REDSTONE + "", 99999999);
	duras.put(Material.BEDROCK + "", 99999999);*/
	
	public void tempes() {
		temp.put("Material.AIR" + "",8);
		temp.put("Material.GLOWSTONE" + "", 8);
		temp.put("Material.TNT" + "", 8);
		temp.put("Material.FIRE" + "", 0);
		temp.put("Material.CROPS" + "", 10);
		temp.put("Material.GRASS" + "", 10);
		temp.put("Material.TALL_GRASS" + "", 10);
		temp.put("Material.POTATOES" + "", 10);
		temp.put("Material.CARROTS" + "", 10);
		temp.put("Material.BEETROOTS" + "", 10);
		temp.put("Material.THIN_GLASS" + "", 15);
		temp.put("Material.STAINED_GLASS_PANE" + "", 15);
		temp.put("Material.REDSTONE_TORCH_ON" + "", 15);
		temp.put("Material.REDSTONE_TORCH_OFF" + "", 15);
		temp.put("Material.STAINED_GLASS" + "", 35);
		temp.put("Material.GLASS" + "", 35);
		temp.put("Material.LEAVES" + "", 20);
		temp.put("Material.LEAVES_2" + "", 20);
		temp.put("Material.GRASS" + "", 45);
		temp.put("Material.DIRT" + "", 45);
		temp.put("Material.SAND" + "", 45);
		temp.put("Material.GRASS_PATH" + "", 45);
		temp.put("Material.STATIONARY_WATER" + "", 445);
		temp.put("Material.WATER" + "", 445);
		temp.put("Material.WOOD" + "", 55);
		temp.put("Material.LOG" + "", 85);
		temp.put("Material.LOG_2" + "", 85);
		temp.put("Material.STONE" + "", 125);
		temp.put("Material.COBBLESTONE" + "", 115);
		temp.put("Material.STATIONARY_LAVA" + "", 35);
		temp.put("Material.LAVA" + "", 35);
		temp.put("Material.OBSIDIAN" + "", 72000);
		temp.put("Material.BEDROCK" + "", 99999999);
		temp.put("AIR" + "",8);
		temp.put("GLOWSTONE" + "", 8);
		temp.put("TNT" + "", 8);
		temp.put("FIRE" + "", 0);
		temp.put("CROPS" + "", 10);
		temp.put("GRASS" + "", 10);
		temp.put("TALL_GRASS" + "", 10);
		temp.put("POTATOES" + "", 10);
		temp.put("CARROTS" + "", 10);
		temp.put("BEETROOTS" + "", 10);
		temp.put("THIN_GLASS" + "", 15);
		temp.put("STAINED_GLASS_PANE" + "", 15);
		temp.put("REDSTONE_TORCH_ON" + "", 15);
		temp.put("REDSTONE_TORCH_OFF" + "", 15);
		temp.put("STAINED_GLASS" + "", 35);
		temp.put("GLASS" + "", 35);
		temp.put("LEAVES" + "", 20);
		temp.put("LEAVES_2" + "", 20);
		temp.put("GRASS" + "", 45);
		temp.put("DIRT" + "", 45);
		temp.put("SAND" + "", 45);
		temp.put("GRASS_PATH" + "", 45);
		temp.put("STATIONARY_WATER" + "", 445);
		temp.put("WATER" + "", 445);
		temp.put("WOOD" + "", 55);
		temp.put("LOG" + "", 85);
		temp.put("LOG_2" + "", 85);
		temp.put("STONE" + "", 125);
		temp.put("COBBLESTONE" + "", 115);
		temp.put("STATIONARY_LAVA" + "", 35);
		temp.put("LAVA" + "", 35);
		temp.put("OBSIDIAN" + "", 72000);
		temp.put("BEDROCK" + "", 99999999);
		for(Material m : Material.values()) {
			if(!temp.containsKey(m + "")) {
				String mname = m + "";
				if(mainfile.instance.isStony(m)) {
					duras.put(m + "", 125);
				}
				else if(mname.contains("PLANK")) {
					duras.put(m + "", 55);
				}
				else if(mname.contains("LEAVE")) {
					duras.put(m + "", 20);
				}
				else if(mname.contains("LOG")) {
					duras.put(m + "", 85);
				}
				else if(mname.contains("ORE")) {
					duras.put(m + "", 135);
				}
				else if(mname.contains("STONE")) {
					duras.put(m + "", 125);
				}
				else if(mname.contains("BRICK")) {
					duras.put(m + "", 135);
				}
				else if(mname.contains("DIRT")) {
					duras.put(m + "", 45);
				}
				if(mname.contains("CARPET")) {
					temp.put(m + "", 15);
				}
				else if(mname.contains("PRISMARINE")) {
					temp.put(m + "", 195);
				}
				else if(mname.contains("COMMAND")) {
					temp.put(m + "", 9999999);
				}
				else if(mname.contains("HEAD")||mname.contains("SKULL")) {
					temp.put(m + "", 15);
				}
				else if(mname.contains("BUTTON")) {
					temp.put(m + "", 2);
				}
				else if(mname.contains("DOOR")) {
					temp.put(m + "", 55);
				}
				else if(mname.contains("GATE")) {
					temp.put(m + "", 6);
				}
				else if(mname.contains("FENCE")) {
					temp.put(m + "", 6);
				}
				else if(mname.contains("LEAVES")) {
					temp.put(m + "", 4);
				}
				else if(mname.contains("LOG")) {
					temp.put(m + "", 85);
				}
				else if(mname.contains("PLANKS")) {
					temp.put(m + "", 55);
				}
				else if(mname.contains("PRESSURE")) {
					temp.put(m + "", 2);
				}
				else if(mname.contains("SAPLING")) {
					temp.put(m + "", 1);
				}
				else if(mname.contains("SLAB")) {
					temp.put(m + "", 5);
				}
				else if(mname.contains("STAIRS")) {
					temp.put(m + "", 5);
				}
				else if(mname.contains("TRAPDOOR")) {
					temp.put(m + "", 5);
				}
				else if(mname.contains("WOOD")) {
					temp.put(m + "", 55);
				}
				else if(mname.contains("BANNER")) {
					temp.put(m + "", 4);
				}
				else if(mname.contains("BED")) {
					temp.put(m + "", 6);
				}
				else if(mname.contains("POWDER")) {
					temp.put(m + "", 45);
				}
				else if(mname.contains("CONCRETE")) {
					temp.put(m + "", 125);
				}
				else if(mname.contains("GLAZED")) {
					temp.put(m + "", 125);
				}
				else if(mname.contains("SHULKER")) {
					temp.put(m + "", 45);
				}
				else if(mname.contains("PANE")) {
					temp.put(m + "", 35);
				}
				else if(mname.contains("GLASS")) {
					temp.put(m + "", 35);
				}
				else if(mname.contains("TERRACOTTA")) {
					temp.put(m + "", 125);
				}
				else if(mname.contains("WOOL")) {
					temp.put(m + "", 40);
				}
				else if(mname.contains("CORAL")) {
					temp.put(m + "", 60);
				}
				else {
				temp.put(m + "", 45);
				}
			}
		}
	}

	public void addConverts() {
		converts.put("Material.STONE_BRICK" + "", Material.STONE);
		converts.put("Material.CRACKED_STONE_BRICK" + "", Material.STONE_BRICKS);
		converts.put("Material.STONE" + "", Material.COBBLESTONE);
		converts.put("Material.COBBLESTONE" + "", Material.GRAVEL);
		converts.put("Material.GRAVEL" + "", Material.AIR);
		converts.put("Material.GRASS_BLOCK" + "", Material.DIRT);
		converts.put("Material.GRASS_PATH" + "", Material.DIRT);
		converts.put("Material.DIRT" + "", Material.SOUL_SAND);
		converts.put("Material.DIRT" + "", Material.DIRT);
		converts.put("Material.END_STONE" + "", Material.SANDSTONE);
		converts.put("Material.SANDSTONE" + "", Material.SAND);
		converts.put("STONE_BRICK" + "", Material.STONE);
		converts.put("CRACKED_STONE_BRICK" + "", Material.STONE_BRICKS);
		converts.put("STONE" + "", Material.COBBLESTONE);
		converts.put("COBBLESTONE" + "", Material.GRAVEL);
		converts.put("GRAVEL" + "", Material.AIR);
		converts.put("GRASS_BLOCK" + "", Material.DIRT);
		converts.put("GRASS_PATH" + "", Material.DIRT);
		converts.put("DIRT" + "", Material.SOUL_SAND);
		converts.put("DIRT" + "", Material.DIRT);
		converts.put("END_STONE" + "", Material.SANDSTONE);
		converts.put("SANDSTONE" + "", Material.SAND);
	}

	public void addLengths() {
		lengths.put("Material.OBSIDIAN", 25);
		lengths.put("Material.IRON_BLOCK", 25);
		lengths.put("Material.DIAMOND_BLOCK", 25);
		lengths.put("Material.BONE_BLOCK", 25);
		lengths.put("Material.COAL_BLOCK", 25);
		lengths.put("Material.EMERALD_BLOCK", 25);
		lengths.put("Material.GOLD_BLOCK", 25);
		lengths.put("Material.LAPIS_BLOCK", 25);
		lengths.put("Material.QUARTZ_BLOCK", 25);
		lengths.put("Material.TORCH", 25);
		lengths.put("Material.BEDROCK", 25);
		lengths.put("Material.BARRIER", 25);
		lengths.put("Material.LEVER", 25);
		lengths.put("OBSIDIAN", 25);
		lengths.put("IRON_BLOCK", 25);
		lengths.put("DIAMOND_BLOCK", 25);
		lengths.put("BONE_BLOCK", 25);
		lengths.put("COAL_BLOCK", 25);
		lengths.put("EMERALD_BLOCK", 25);
		lengths.put("GOLD_BLOCK", 25);
		lengths.put("LAPIS_BLOCK", 25);
		lengths.put("QUARTZ_BLOCK", 25);
		lengths.put("TORCH", 25);
		lengths.put("LEVER", 25);
		lengths.put("BEDROCK", 25);
		lengths.put("BARRIER", 25);
		for(Material m : Material.values()) {
			if(!lengths.containsKey(m + "")) {
				String mname = m + "";
				if(mname.contains("REDSTONE")) {
					lengths.put(mname, 25);
				}
				else if(mname.contains("DOOR")) {
					lengths.put(mname, 25);
				}
				else if(mname.contains("PISTON")) {
					lengths.put(mname, 25);
				}
				else if(mname.contains("BUTTON")) {
					lengths.put(mname, 25);
				}
				else if(mname.contains("RAIL")) {
					lengths.put(mname, 25);
				}
				else if(mname.contains("WEB")) {
					lengths.put(mname, 25);
				}
				else {
				lengths.put(mname, 4);
				}
			}
		}
	}

	public void addSofts() {
		for(Material m : Material.values()) {
			if(!softs.contains(m + "")) {
				String mname = m + "";
				if(mname.contains("LEAVE")) {
					softs.add(mname);
				}
				else if(mname.contains("DIRT")) {
					softs.add(mname);
				}
				else if(mname.contains("SAND")) {
					softs.add(mname);
				}
				else if(mname.contains("GRAVEL")) {
					softs.add(mname);
				}
				else if(mname.contains("GRASS")) {
					softs.add(mname);
				}
				else if(mname.contains("DUST")) {
					softs.add(mname);
				}
				else if(mname.contains("WOOL")) {
					softs.add(mname);
				}
				else if(mname.contains("CARPET")) {
					softs.add(mname);
				}
				else if(mname.contains("SPONGE")) {
					softs.add(mname);
				}
				else if(mname.contains("SNOW")) {
					softs.add(mname);
				}
				else if(mname.contains("HAY")) {
					softs.add(mname);
				}
				else if(mname.contains("VINE")) {
					softs.add(mname);
				}
				else if(mname.contains("FLOWER")) {
					softs.add(mname);
				}
			}
		}
	}
	
}
