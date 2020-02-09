package spacetime.mainold;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class damageReducer {

	public static void ReducedDamage(LivingEntity en, double damage, Player p) {
		if(en instanceof Player) {
        org.bukkit.inventory.EntityEquipment inv = en.getEquipment();
        ItemStack boots = inv.getBoots();
        ItemStack helmet = inv.getHelmet();
        ItemStack chest = inv.getChestplate();
        ItemStack pants = inv.getLeggings();
        ItemStack shield = inv.getItemInOffHand();
        ItemStack shieldTwo = inv.getItemInMainHand();
        double red = 0.0;

        if (shield.getAmount() < 1 || shield.getType() != Material.SHIELD) {
            red = red + 0.00;
        } else if (shield.getType() == Material.SHIELD) {
            red = red + 0.05;
        } else {
            red += 0.0;
        }
        if (shieldTwo.getAmount() < 1 || shieldTwo.getType() != Material.SHIELD) {
            red = red + 0.00;
        } else if (shieldTwo.getType() == Material.SHIELD) {
            red = red + 0.05;
        } else {
            red += 0.0;
        }

        if (inv.getHelmet() != null) {
            if (helmet.getType() == Material.LEATHER_HELMET) {
                red = red + 0.04;
            } else if (helmet.getType() == Material.GOLDEN_HELMET) {
                red = red + 0.08;
            } else if (helmet.getType() == Material.CHAINMAIL_HELMET) {
                red = red + 0.08;
            } else if (helmet.getType() == Material.IRON_HELMET) {
                red = red + 0.08;
            } else if (helmet.getType() == Material.DIAMOND_HELMET) {
                red = red + 0.12;
            } else {
                red += 0.0;
            }
        }
        //
        if (inv.getBoots() != null) {

            if (boots.getType() == Material.LEATHER_BOOTS) {
                red = red + 0.04;
            } else if (boots.getType() == Material.GOLDEN_BOOTS) {
                red = red + 0.04;
            } else if (boots.getType() == Material.CHAINMAIL_BOOTS) {
                red = red + 0.04;
            } else if (boots.getType() == Material.IRON_BOOTS) {
                red = red + 0.08;
            } else if (boots.getType() == Material.DIAMOND_BOOTS) {
                red = red + 0.12;
            } else {
                red += 0.0;
            }
        }
        //
        if (inv.getLeggings() != null) {
            if (pants.getType() == Material.LEATHER_LEGGINGS) {
                red = red + 0.08;
            } else if (pants.getType() == Material.GOLDEN_LEGGINGS) {
                red = red + 0.12;
            } else if (pants.getType() == Material.CHAINMAIL_LEGGINGS) {
                red = red + 0.16;
            } else if (pants.getType() == Material.IRON_LEGGINGS) {
                red = red + 0.20;
            } else if (pants.getType() == Material.DIAMOND_LEGGINGS) {
                red = red + 0.24;
            } else {
                red += 0.0;
            }
        }
        //
        if (inv.getChestplate() != null) {
            if (chest.getType() == Material.LEATHER_CHESTPLATE) {
                red = red + 0.12;
            } else if (chest.getType() == Material.GOLDEN_CHESTPLATE) {
                red = red + 0.20;
            } else if (chest.getType() == Material.CHAINMAIL_CHESTPLATE) {
                red = red + 0.20;
            } else if (chest.getType() == Material.IRON_CHESTPLATE) {
                red = red + 0.24;
            } else if (chest.getType() == Material.DIAMOND_CHESTPLATE) {
                red = red + 0.32;
            } else {
                red += 0.0;
            }
        }

        damage = damage - (damage * red);
        if(p == null) {
        en.damage(damage);
        }
        else {
        	en.damage(damage, p);
        }
		}
		else {
			 if(p == null) {
			        en.damage(damage);
			        }
			        else {
			        	en.damage(damage, p);
			        }
		}
    }
 
	public static void ReducedDamage(LivingEntity en, double damage) {
        org.bukkit.inventory.EntityEquipment inv = en.getEquipment();
        ItemStack boots = inv.getBoots();
        ItemStack helmet = inv.getHelmet();
        ItemStack chest = inv.getChestplate();
        ItemStack pants = inv.getLeggings();
        ItemStack shield = inv.getItemInOffHand();
        ItemStack shieldTwo = inv.getItemInMainHand();
        double red = 0.0;

        if (shield.getAmount() < 1 || shield.getType() != Material.SHIELD) {
            red = red + 0.00;
        } else if (shield.getType() == Material.SHIELD) {
            red = red + 0.05;
        } else {
            red += 0.0;
        }
        if (shieldTwo.getAmount() < 1 || shieldTwo.getType() != Material.SHIELD) {
            red = red + 0.00;
        } else if (shieldTwo.getType() == Material.SHIELD) {
            red = red + 0.05;
        } else {
            red += 0.0;
        }

        if (inv.getHelmet() != null) {
            if (helmet.getType() == Material.LEATHER_HELMET) {
                red = red + 0.04;
            } else if (helmet.getType().toString().toLowerCase().contains("gold")) {
                red = red + 0.08;
            } else if (helmet.getType() == Material.CHAINMAIL_HELMET) {
                red = red + 0.08;
            } else if (helmet.getType() == Material.IRON_HELMET) {
                red = red + 0.08;
            } else if (helmet.getType() == Material.DIAMOND_HELMET) {
                red = red + 0.12;
            } else {
                red += 0.0;
            }
        }
        //
        if (inv.getBoots() != null) {

            if (boots.getType() == Material.LEATHER_BOOTS) {
                red = red + 0.04;
            } else if (boots.getType().toString().toLowerCase().contains("gold")) {
                red = red + 0.04;
            } else if (boots.getType() == Material.CHAINMAIL_BOOTS) {
                red = red + 0.04;
            } else if (boots.getType() == Material.IRON_BOOTS) {
                red = red + 0.08;
            } else if (boots.getType() == Material.DIAMOND_BOOTS) {
                red = red + 0.12;
            } else {
                red += 0.0;
            }
        }
        //
        if (inv.getLeggings() != null) {
            if (pants.getType() == Material.LEATHER_LEGGINGS) {
                red = red + 0.08;
            } else if (pants.getType().toString().toLowerCase().contains("gold")) {
                red = red + 0.12;
            } else if (pants.getType() == Material.CHAINMAIL_LEGGINGS) {
                red = red + 0.16;
            } else if (pants.getType() == Material.IRON_LEGGINGS) {
                red = red + 0.20;
            } else if (pants.getType() == Material.DIAMOND_LEGGINGS) {
                red = red + 0.24;
            } else {
                red += 0.0;
            }
        }
        //
        if (inv.getChestplate() != null) {
            if (chest.getType() == Material.LEATHER_CHESTPLATE) {
                red = red + 0.12;
            } else if (chest.getType().toString().toLowerCase().contains("gold")) {
                red = red + 0.20;
            } else if (chest.getType() == Material.CHAINMAIL_CHESTPLATE) {
                red = red + 0.20;
            } else if (chest.getType() == Material.IRON_CHESTPLATE) {
                red = red + 0.24;
            } else if (chest.getType() == Material.DIAMOND_CHESTPLATE) {
                red = red + 0.32;
            } else {
                red += 0.0;
            }
        }

        damage = damage - (damage * red);
        en.damage(damage);
    }
 

	public static double ReducedDamageReturn(LivingEntity en, double damage, Player p) {
		if(en instanceof Player) {
        org.bukkit.inventory.EntityEquipment inv = en.getEquipment();
        ItemStack boots = inv.getBoots();
        ItemStack helmet = inv.getHelmet();
        ItemStack chest = inv.getChestplate();
        ItemStack pants = inv.getLeggings();
        ItemStack shield = inv.getItemInOffHand();
        ItemStack shieldTwo = inv.getItemInMainHand();
        double red = 0.0;

        if (shield.getAmount() < 1 || shield.getType() != Material.SHIELD) {
            red = red + 0.00;
        } else if (shield.getType() == Material.SHIELD) {
            red = red + 0.05;
        } else {
            red += 0.0;
        }
        if (shieldTwo.getAmount() < 1 || shieldTwo.getType() != Material.SHIELD) {
            red = red + 0.00;
        } else if (shieldTwo.getType() == Material.SHIELD) {
            red = red + 0.05;
        } else {
            red += 0.0;
        }

        if (inv.getHelmet() != null) {
            if (helmet.getType() == Material.LEATHER_HELMET) {
                red = red + 0.04;
            } else if (helmet.getType() == Material.GOLDEN_HELMET) {
                red = red + 0.08;
            } else if (helmet.getType() == Material.CHAINMAIL_HELMET) {
                red = red + 0.08;
            } else if (helmet.getType() == Material.IRON_HELMET) {
                red = red + 0.08;
            } else if (helmet.getType() == Material.DIAMOND_HELMET) {
                red = red + 0.12;
            } else {
                red += 0.0;
            }
        }
        //
        if (inv.getBoots() != null) {

            if (boots.getType() == Material.LEATHER_BOOTS) {
                red = red + 0.04;
            } else if (boots.getType() == Material.GOLDEN_BOOTS) {
                red = red + 0.04;
            } else if (boots.getType() == Material.CHAINMAIL_BOOTS) {
                red = red + 0.04;
            } else if (boots.getType() == Material.IRON_BOOTS) {
                red = red + 0.08;
            } else if (boots.getType() == Material.DIAMOND_BOOTS) {
                red = red + 0.12;
            } else {
                red += 0.0;
            }
        }
        //
        if (inv.getLeggings() != null) {
            if (pants.getType() == Material.LEATHER_LEGGINGS) {
                red = red + 0.08;
            } else if (pants.getType() == Material.GOLDEN_LEGGINGS) {
                red = red + 0.12;
            } else if (pants.getType() == Material.CHAINMAIL_LEGGINGS) {
                red = red + 0.16;
            } else if (pants.getType() == Material.IRON_LEGGINGS) {
                red = red + 0.20;
            } else if (pants.getType() == Material.DIAMOND_LEGGINGS) {
                red = red + 0.24;
            } else {
                red += 0.0;
            }
        }
        //
        if (inv.getChestplate() != null) {
            if (chest.getType() == Material.LEATHER_CHESTPLATE) {
                red = red + 0.12;
            } else if (chest.getType() == Material.GOLDEN_CHESTPLATE) {
                red = red + 0.20;
            } else if (chest.getType() == Material.CHAINMAIL_CHESTPLATE) {
                red = red + 0.20;
            } else if (chest.getType() == Material.IRON_CHESTPLATE) {
                red = red + 0.24;
            } else if (chest.getType() == Material.DIAMOND_CHESTPLATE) {
                red = red + 0.32;
            } else {
                red += 0.0;
            }
        }

        damage = damage - (damage * red);
        return damage;
		}
		return damage;
    }
 
	
}
