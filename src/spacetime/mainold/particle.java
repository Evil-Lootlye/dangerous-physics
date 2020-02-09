package spacetime.mainold;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class particle
{
  
  private int energy = 0;
  private int eEnergy = 0;
  private int pType = 0;
  private Block particleO = null; 
  private double chargePotential = 50.0;
  
  public particle(Block p, int eng, int eEng, int type, double chargeP)
  {
    energy = eng;
    eEnergy = eEng;
    pType = type;
    particleO = p;
    if(chargeP!=-1){
    chargePotential = chargeP;
    }
  }
  
  public HashMap<Integer, Integer> runParticle(int e, int e2){
    HashMap<Integer, Integer> newEng = new HashMap<Integer, Integer>();
    int newEngy = 0;
    int newEE = 0;
    energy = energy - e;
    if(energy<=0){
    	particleO.setType(Material.AIR);
    	energy=0;
    }
    if(e2>eEnergy){
    	double change = ((double) e2)/((double)eEnergy)/chargePotential;
    	pType += (int) change;
    	eEnergy += ((double) e2)/((double)eEnergy);
    }
    newEng.put(newEngy, newEE);
    return newEng;
  }
  
  public String toString(){
	return "Particle E:" + energy + " - eE:" + eEnergy + " - type:" + pType + " - running:" + particleO;
  }
  
}





