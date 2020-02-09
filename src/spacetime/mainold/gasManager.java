package spacetime.mainold;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.util.Vector;

public class gasManager {
	
	public String name = "";
	public Particle effectType = null;
	public int gravity = 0;
	public double lifespan = 100;
	public HashMap<Location, Double> gasLocations = new HashMap<Location, Double>();
	Random randor = new Random();

	public gasManager(String type, Particle p, int downorup, double lifelength) {
		name = type;
		effectType = p;
		gravity = downorup;
		lifespan = lifelength;
	}
	
	public void addGasLocation(Location l, double concentration) {
		if(gasLocations.containsKey(l)) {
			double concentration2 = gasLocations.get(l) + concentration;
			gasLocations.put(l, concentration2);
		}
		else {
			gasLocations.put(l, concentration);
		}
	}

	public void checkLives() {
		HashMap<Location, Double> gasLocations2 = new HashMap<Location, Double>(gasLocations);
		for(Location l : gasLocations2.keySet()) {
			if(l.getY()<0||l.getY()>300) {
				gasLocations.remove(l);
			}
			else {
			double concentration = gasLocations.get(l);
			concentration = concentration - lifespan;
			if(concentration>0) {
			gasLocations.put(l, concentration);
			}
			else {
				gasLocations.remove(l);
			}
			}
		}
	}
	
	public void doGravity() {
		HashMap<Location, Double> gasLocations2 = new HashMap<Location, Double>(gasLocations);
		if(gravity == 1) {
			for(Location l : gasLocations2.keySet()) {
				if((mainfile.instance.isAir(l.clone().add(0, 1, 0).getBlock().getType())||l.clone().add(0, 1, 0).getBlock().getType()==Material.FIRE)&&(!gasLocations2.containsKey(l.clone().add(0, 1, 0)))) {
					double concentration = gasLocations2.get(l);
					Location newLocation = l.clone().add(0, 1, 0);
					gasLocations.remove(l);
					gasLocations.put(newLocation, concentration);
				}
				else {
					Location l2 = checkSides(l);
					if(l2!=null) {
						double concentration = gasLocations2.get(l);
						Location newLocation = l2;
						gasLocations.remove(l);
						gasLocations.put(newLocation, concentration);
					}
				}
			}
		}
		else {
			for(Location l : gasLocations2.keySet()) {
				if((mainfile.instance.isAir(l.clone().subtract(0, 1, 0).getBlock().getType())||l.clone().subtract(0, 1, 0).getBlock().getType()==Material.FIRE)&&(!gasLocations2.containsKey(l.clone().subtract(0, 1, 0)))) {
					double concentration = gasLocations2.get(l);
					Location newLocation = l.clone().subtract(0, 1, 0);
					gasLocations.remove(l);
					gasLocations.put(newLocation, concentration);
				}
				else {
					Location l2 = checkSides(l);
					if(l2!=null) {
						double concentration = gasLocations2.get(l);
						Location newLocation = l2;
						gasLocations.remove(l);
						gasLocations.put(newLocation, concentration);
					}
				}
			}
		}
	}
	
	public Location checkSides(Location l) {
		Location v = l;
		List<BlockFace> sidetypes = new ArrayList<BlockFace>();
		BlockFace[] sides = {BlockFace.WEST,BlockFace.SOUTH,BlockFace.NORTH,BlockFace.EAST};
		for(int sidesR = 0; sidesR < sides.length; sidesR++) {
			Block b1 = l.clone().getBlock().getRelative(sides[sidesR]);
			if(mainfile.instance.isAir(b1.getType())&&(!gasLocations.containsKey(b1.getLocation()))) {
				sidetypes.add(sides[sidesR]);
			}
		}
		if(sidetypes.size()>0) {
		BlockFace choosen = sidetypes.get(randor.nextInt(sidetypes.size()));
		if(choosen == BlockFace.WEST) {
			v = l.clone().subtract(1, 0, 0);
		}
		else if(choosen == BlockFace.NORTH) {
			v = l.clone().subtract(0, 0, 1);
		}
		else if(choosen == BlockFace.SOUTH) {
			v = l.clone().add(0, 0, 1);
		}
		else if(choosen == BlockFace.EAST) {
			v = l.clone().add(1, 0, 0);
		}
		return v;
		}
		else {
			return null;
		}
	}
	
	public Set<Location> getLocations(){
		return gasLocations.keySet();
	}

	public void doParticleEffects() {
		if(!gasLocations.isEmpty()) {
		HashMap<Location, Double> gasLocations2 = new HashMap<Location, Double>(gasLocations);
			for(Location l : gasLocations2.keySet()) {
				double concentration = gasLocations2.get(l);
				l.getWorld().spawnParticle(effectType, l.clone().add(0.5, 0.5, 0.5), (int) (2*((concentration)*(concentration))), .5, .5, .5, 0.01);
			}
		}
	}
	
}
