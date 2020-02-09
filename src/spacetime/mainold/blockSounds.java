package spacetime.mainold;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;

public class blockSounds {

	public static HashMap<String, Sound> bbreak = new HashMap<String, Sound>();
	public static HashMap<String, Sound> bplace = new HashMap<String, Sound>();
	
	public blockSounds() {
		addbreaks();
		addplaces();
	}
	
	public void addbreaks() {
		for(Material m : Material.values()) {
			String name = m + "";
			if(mainfile.instance.isStony(m) || name.toLowerCase().contains("stone")||name.toLowerCase().contains("obsidian")||name.toLowerCase().contains("brick")||name.toLowerCase().contains("ore")) {
				bbreak.put(name, Sound.BLOCK_STONE_BREAK);
			}
			else if(name.toLowerCase().contains("dirt")||name.toLowerCase().contains("grass")||name.toLowerCase().contains("path")||name.toLowerCase().contains("leave")) {
				bbreak.put(name, Sound.BLOCK_GRASS_BREAK);
			}
			else if(name.toLowerCase().contains("anvil")) {
				bbreak.put(name, Sound.BLOCK_ANVIL_BREAK);
			}
			else if(name.toLowerCase().contains("sand")||name.toLowerCase().contains("powder")) {
				bbreak.put(name, Sound.BLOCK_SAND_BREAK);
			}
			else if(name.toLowerCase().contains("wool")||name.toLowerCase().contains("carpet")||name.toLowerCase().contains("bed")) {
				bbreak.put(name, Sound.BLOCK_WOOL_BREAK);
			}
			else if(name.toLowerCase().contains("glass")||name.toLowerCase().contains("ice")) {
				bbreak.put(name, Sound.BLOCK_GLASS_BREAK);
			}
			else if(name.toLowerCase().contains("gravel")) {
				bbreak.put(name, Sound.BLOCK_GRAVEL_BREAK);
			}
			else if(name.toLowerCase().contains("ladder")) {
				bbreak.put(name, Sound.BLOCK_LADDER_BREAK);
			}
			else if(name.toLowerCase().contains("iron")||name.toLowerCase().contains("gold")||name.toLowerCase().contains("diamond")) {
				bbreak.put(name, Sound.BLOCK_METAL_BREAK);
			}
			else if(name.toLowerCase().contains("slime")) {
				bbreak.put(name, Sound.BLOCK_SLIME_BLOCK_BREAK);
			}
			else if(name.toLowerCase().contains("snow")) {
				bbreak.put(name, Sound.BLOCK_SNOW_BREAK);
			}
			else if(name.toLowerCase().contains("wood")||name.toLowerCase().contains("log")||name.toLowerCase().contains("plank")||name.toLowerCase().contains("door")) {
				bbreak.put(name, Sound.BLOCK_WOOD_BREAK);
			}
			else {
				bbreak.put(name, Sound.BLOCK_STONE_BREAK);
			}
		}
	}
	
	public void addplaces() {
		for(Material m : Material.values()) {
			String name = m + "";
			if(mainfile.instance.isStony(m) || name.toLowerCase().contains("stone")||name.toLowerCase().contains("obsidian")||name.toLowerCase().contains("brick")||name.toLowerCase().contains("ore")) {
				bplace.put(name, Sound.BLOCK_STONE_PLACE);
			}
			else if(name.toLowerCase().contains("dirt")||name.toLowerCase().contains("grass")||name.toLowerCase().contains("path")||name.toLowerCase().contains("leave")) {
				bplace.put(name, Sound.BLOCK_GRASS_PLACE);
			}
			else if(name.toLowerCase().contains("anvil")) {
				bplace.put(name, Sound.BLOCK_ANVIL_PLACE);
			}
			else if(name.toLowerCase().contains("sand")||name.toLowerCase().contains("powder")) {
				bplace.put(name, Sound.BLOCK_SAND_PLACE);
			}
			else if(name.toLowerCase().contains("wool")||name.toLowerCase().contains("carpet")||name.toLowerCase().contains("bed")) {
				bbreak.put(name, Sound.BLOCK_WOOL_PLACE);
			}
			else if(name.toLowerCase().contains("glass")||name.toLowerCase().contains("ice")) {
				bplace.put(name, Sound.BLOCK_GLASS_PLACE);
			}
			else if(name.toLowerCase().contains("gravel")) {
				bplace.put(name, Sound.BLOCK_GRAVEL_PLACE);
			}
			else if(name.toLowerCase().contains("ladder")) {
				bplace.put(name, Sound.BLOCK_LADDER_PLACE);
			}
			else if(name.toLowerCase().contains("iron")||name.toLowerCase().contains("gold")||name.toLowerCase().contains("diamond")) {
				bplace.put(name, Sound.BLOCK_METAL_PLACE);
			}
			else if(name.toLowerCase().contains("slime")) {
				bbreak.put(name, Sound.BLOCK_SLIME_BLOCK_PLACE);
			}
			else if(name.toLowerCase().contains("snow")) {
				bplace.put(name, Sound.BLOCK_SNOW_PLACE);
			}
			else if(name.toLowerCase().contains("wood")||name.toLowerCase().contains("log")||name.toLowerCase().contains("plank")||name.toLowerCase().contains("door")) {
				bplace.put(name, Sound.BLOCK_WOOD_PLACE);
			}
			else {
				bplace.put(name, Sound.BLOCK_STONE_PLACE);
			}
		}
	}

	public Sound getPlaceSound(String m) {
		return bplace.get(m);
	}
	
	public Sound getBreakSound(String m) {
		return bbreak.get(m);
	}
	
}
