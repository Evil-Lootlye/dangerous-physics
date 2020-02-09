package spacetime.mainold;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Bed;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.DragonFireball;
import org.bukkit.entity.Egg;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Husk;
import org.bukkit.entity.Item;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.LargeFireball;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.LlamaSpit;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.SmallFireball;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.SplashPotion;
import org.bukkit.entity.Stray;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Witch;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockGrowEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.projectiles.ProjectileSource;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.util.BlockIterator;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;
import org.spigotmc.event.entity.EntityMountEvent;

import me.libraryaddict.disguise.DisguiseAPI;
import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.disguisetypes.MiscDisguise;
import me.libraryaddict.disguise.disguisetypes.watchers.FallingBlockWatcher;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import net.minecraft.server.v1_14_R1.EntitySilverfish;
import net.minecraft.server.v1_14_R1.EntityTypes;
import net.minecraft.server.v1_14_R1.PacketPlayOutSpawnEntity;
import net.minecraft.server.v1_14_R1.PacketPlayOutSpawnEntityLiving;
import net.minecraft.server.v1_14_R1.PacketPlayOutWorldParticles;

public class mainfile extends JavaPlugin implements Listener, CommandExecutor{
	
	public static VanillaMain instance 
	public ConsoleCommandSender console = getServer().getConsoleSender();
	Random randor = new Random();
	public World wor = null;
	FileConfiguration config = getConfig();
	BukkitScheduler scheduler = null;
	public ArrayList<String> worlds = new ArrayList<String>();
	
	//physics
	
	public durabilities dur = null;
	DecimalFormat df = new DecimalFormat("#.####");
	public HashMap<Block, Integer> tempers = new HashMap<Block, Integer>();
	public HashMap<Player, Integer> powers = new HashMap<Player, Integer>();
	public List<Entity> effectEnts = new ArrayList<Entity>();
	public HashMap<Entity, Long> armors = new HashMap<Entity, Long>();
	public boolean doRealisticDrops = false;
	public boolean dyTemp = true;
	public List<Block> fires = new ArrayList<Block>();
	public List<Block> firesT = new ArrayList<Block>();
	public List<Entity> fallingsands = new ArrayList<Entity>();
	public blockSounds bs = null;
	int typess = 0;
	short datass = 0;
	public List<Player> wand = new ArrayList<Player>();
	public boolean doRealisticSpreading = false;
	public List<gasManager> gsM = new ArrayList<gasManager>();
	public boolean doWaterPhysics = false;

	@Override
	public void onEnable() {
		instance = this;
		createConfigFol();
		bs = new blockSounds();
		dur = new durabilities();
		this.getServer().getPluginManager().registerEvents(this, this);
		scheduler = getServer().getScheduler();
		loadConfig();
		scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
			@Override
			public void run() {
				saveConfigs();
			}
		}, 0L, 15000L);
		/////////
		ArrayList<String> tworlds = (ArrayList<String>) config.getList("Enabled Worlds - If Left Blank Will Just Use default world ");
		for(String w : tworlds) {
			if(w.equals("placeholder1")||w.equals("placeholder2")) {
				
			}
			else {
				worlds.add(w);
			}
		}
		if(!this.getServer().getOnlinePlayers().isEmpty()) {
			for(Player start : this.getServer().getOnlinePlayers()) {
				wor = start.getWorld();
				break;
			}
		}
		if(worlds.size()==0) {
			boolean hasWorldR = false;
			for(World w : Bukkit.getWorlds()) {
				if(w.getName().equals("world")) {
					hasWorldR = true;
				}
			}
			if(hasWorldR == true) {
				worlds.add("world");
			}
			else {
			worlds.add(Bukkit.getWorlds().get(0).getName());
			}
		}
		gasManager smoke = new gasManager("smoke", Particle.SMOKE_LARGE, 1, 0.6);
		gasManager steam = new gasManager("steam", Particle.CLOUD, 1, .7);
		gasManager water = new gasManager("water", Particle.BLOCK_CRACK, 0, 1);
		gsM.add(smoke);
		gsM.add(steam);
		gsM.add(water);
		World w = Bukkit.getWorld(worlds.get(0));
		scheduler = getServer().getScheduler();
		scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
			@Override
			public void run() {
				removeTemp();
			}
		}, 0L, /* 600 */((long) 3300));
		scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
			@Override
			public void run() {
				for(gasManager gm : gsM) {
				gm.doParticleEffects();
				}
				doGasEffects();
			}
		}, 0L, /* 600 */10L);
		scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
			@Override
			public void run() {
				betterEffectLooper();
				doDynamicTemperature();
				for(gasManager gm : gsM) {
					gm.doGravity();
				}
			}
		}, 0L, /* 600 */((long) 3));
		scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
			@Override
			public void run() {
				runFireTemp();
				for(gasManager gm : gsM) {
				gm.checkLives();
				}
			}
		}, 0L, /* 600 */((long) 700));
		scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
			@Override
			public void run() {
				dofallingsands();
			}
		}, 0L, 1L);
		scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
			@Override
			public void run() {
				saveConfigs();
			}
		}, 0L, 10000L);
	}

	@Override
	public void onDisable() {
		instance = null;
		saveConfigs();
	}
	
	public void createConfigFol() {
		config.addDefault("Enable Block Physics ", true);
		config.addDefault("Enable Temperature ", true);
		config.addDefault("Enable Fire Smoke ", true);
		config.addDefault("Enable Steam ", true);
		config.addDefault("Enable Enhanced Fires ", true);
		config.addDefault("Enable Enhanced Explosions ", true);
		config.addDefault("Enable Ash ", true);
		config.addDefault("Enable Netherrack ", false);
		List<String> listitem2 = new ArrayList<String>();
		boolean hasWorldR = false;
		for(World w : Bukkit.getWorlds()) {
			if(w.getName().equals("world")) {
				hasWorldR = true;
			}
		}
		if(hasWorldR == true) {
			listitem2.add("world");
		}
		else {
			listitem2.add(Bukkit.getWorlds().get(0).getName());
		}
		listitem2.add("placeholder1");
		listitem2.add("placeholder2");
		config.addDefault("Enabled Worlds - If Left Blank Will Just Use default world ", listitem2);
		config.options().copyDefaults(true);
		saveConfig();
	}
	
	public void loadConfig() {
		
	}
	
	public void saveConfigs() {
		saveConfig();
	}
	
	public int coinFlip() {
    	if(randor.nextBoolean() == true) {
    		return 1;
    	}
    	else {
    		return -1;
    	}
    }
	
	public double[] randomSpherePoint(double x0, double y0, double z0, double radius) {
		double u = Math.random();
		double v = Math.random();
		double theta = 2 * Math.PI * u;
		double phi = Math.acos(2 * v - 1);
		double x = x0 + (radius * Math.sin(phi) * Math.cos(theta));
		double y = y0 + (radius * Math.sin(phi) * Math.sin(theta));
		double z = z0 + (radius * Math.cos(phi));
		double[] points = { x, y, z };
		return points;
	}

	public void runColor(double r, double g, double b, Location l) {
		List<PacketPlayOutWorldParticles> packets = new ArrayList<PacketPlayOutWorldParticles>();
		for (int zz = 0; zz < 3; zz++) {
			for (int i = 0; i < 420; i++) {
				double x = l.getX() + (randor.nextInt(3) - 1);
				double y = l.getY() + (randor.nextInt(3) - 1);
				double z = l.getZ() + (randor.nextInt(3) - 1);
				double[] points = randomSpherePoint(x, y, z, 2);
				x = points[0];
				y = points[1];
				z = points[2];
				l.getWorld().spawnParticle(Particle.REDSTONE, x, y, z, 0, r, g, b, 1);
			}
		}
	}
	
	public void spawnColorParticle(Location l, int ammount, double r, double g, double b) {
		for(int count = 0; count < ammount; count++) {
		l.getWorld().spawnParticle(Particle.REDSTONE, l.getX(), l.getY(), l.getZ(), 0, r, g, b, 1);
		}
	}
	
	public void spawnInstantFirework(Location l, int power, Color c) {
		Location loc = l;
        Firework fw = (Firework) loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        FireworkMeta fwm = fw.getFireworkMeta();
        fwm.setPower(power);
        fwm.addEffect(FireworkEffect.builder().withColor(c).flicker(true).build());
        fw.setFireworkMeta(fwm);
        Bukkit.getScheduler().runTaskLater(this, () -> fw.detonate(), (long) 2);
	}
	
	public void healPlayer(Player p, double ammount) {
		double currenthealth = p.getHealth();
		if(currenthealth + ammount >= p.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()) {
			p.setHealth(p.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue());
		}
		else {
			p.setHealth(currenthealth + ammount);
		}
	}
	
	public void healPlayerF(Player p, double ammount) {
		double currentfood = p.getFoodLevel();
		if(currentfood + ammount >= 20) {
			p.setFoodLevel(20);
		}
		else {
			p.setFoodLevel((int) (currentfood + ammount));
		}
	}
	
	public void runColor4(double r, double g, double b, Location l) {
		List<PacketPlayOutWorldParticles> packets = new ArrayList<PacketPlayOutWorldParticles>();
		for (int zz = 0; zz < 3; zz++) {
			for (int i = 0; i < 30; i++) {
				double x = l.getX() + ((randor.nextInt(2)*getNegOrPos())/5.0);
				double y = l.getY() + ((randor.nextInt(2)*getNegOrPos())/5.0);
				double z = l.getZ() + ((randor.nextInt(2)*getNegOrPos())/5.0);
				double[] points = randomSpherePoint(x, y, z, .3);
				x = points[0];
				y = points[1];
				z = points[2];
				l.getWorld().spawnParticle(Particle.REDSTONE, x, y, z, 0, r, g, b, 1);
			}
		}
	}
	
	public void runColor2(double r, double g, double b, Location l) {
		List<PacketPlayOutWorldParticles> packets = new ArrayList<PacketPlayOutWorldParticles>();
		for (int zz = 0; zz < 3; zz++) {
			for (int i = 0; i < 300; i++) {
				double x = l.getX() + ((randor.nextInt(2)*getNegOrPos())/10.0);
				double y = l.getY() + ((randor.nextInt(2)*getNegOrPos())/10.0);
				double z = l.getZ() + ((randor.nextInt(2)*getNegOrPos())/10.0);
				double[] points = randomSpherePoint(x, y, z, 2);
				x = points[0];
				y = points[1];
				z = points[2];
				l.getWorld().spawnParticle(Particle.REDSTONE, x, y, z, 0, r, g, b, 1);
			}
		}
	}
	
	public void runColor3(double r, double g, double b, Location l) {
		List<PacketPlayOutWorldParticles> packets = new ArrayList<PacketPlayOutWorldParticles>();
		for (int zz = 0; zz < 3; zz++) {
			for (int i = 0; i < 30; i++) {
				double x = l.getX() + (randor.nextInt(12)*getNegOrPos());
				double y = l.getY() + (randor.nextInt(12)*getNegOrPos());
				double z = l.getZ() + (randor.nextInt(12)*getNegOrPos());
				double[] points = randomSpherePoint(x, y, z, 2);
				x = points[0];
				y = points[1];
				z = points[2];
				l.getWorld().spawnParticle(Particle.REDSTONE, x, y, z, 0, r, g, b, 1);
			}
		}
	}
	
	public double getNegOrPos() {
		if(randor.nextInt(2)==1) {
			return 1;
		}
		else {
			return -1;
		}
	}

	@EventHandler
	public void onSmokeFall(PotionSplashEvent event) {
		if (event.getPotion().getItem().hasItemMeta()) {
			ItemMeta i = event.getPotion().getItem().getItemMeta();
			if (i.hasLore()) {
				if (i.getLore().size() > 2) {
					String color = i.getLore().get(2);
					if (color.equals("red")) {
						runColor(1, 0.001, 0.001, event.getEntity().getLocation());
					}
					if (color.equals("lime")) {
						runColor(.3, 1, .3, event.getEntity().getLocation());
					}
					if (color.equals("black")) {
						runColor(0.001, 0.001, 0.001, event.getEntity().getLocation());
					}
					if (color.equals("green")) {
						runColor(0.388, 0.819, 0.243, event.getEntity().getLocation());
					}
					if (color.equals("brown")) {
						runColor(0.364, 0.223, 0.121, event.getEntity().getLocation());
					}
					if (color.equals("blue")) {
						runColor(0.001, 0.001, .627, event.getEntity().getLocation());
					}
					if (color.equals("purple")) {
						runColor(0.666, 0.001, .666, event.getEntity().getLocation());
					}
					if (color.equals("aqua")) {
						runColor(0.001, .666, .666, event.getEntity().getLocation());
					}
					if (color.equals("smoke")) {
						runColor(.666, .666, .666, event.getEntity().getLocation());
					}
					if (color.equals("gray")) {
						runColor(.333, .333, .333, event.getEntity().getLocation());
					}
					if (color.equals("pink")) {
						runColor(0.925, 0.364, 0.717, event.getEntity().getLocation());
					}
					if (color.equals("yellow")) {
						runColor(0.925, 0.992, 0.070, event.getEntity().getLocation());
					}
					if (color.equals("lblue")) {
						runColor(0.321, 0.858, 1, event.getEntity().getLocation());
					}
					if (color.equals("magenta")) {
						runColor(1, 0.333, 1, event.getEntity().getLocation());
					}
					if (color.equals("orange")) {
						runColor(0.992, 0.415, 0.007, event.getEntity().getLocation());
					}
					if (color.equals("white")) {
						runColor(1, 1, 1, event.getEntity().getLocation());
					}
				}
			}
		}
	}

    //Physics Engine
    
	public void checkArmor() {
		if(!armors.isEmpty()) {
			HashMap<Entity, Long> armors2 = new HashMap<Entity, Long>(armors);
			for(Entity ee : armors2.keySet()) {
				if(ee!=null) {
					if(ee.getFireTicks()>0) {
					if(ee.isOnGround()&&isAir(ee.getLocation().getBlock().getType())) {
						ee.teleport(ee.getLocation().subtract(0, .3, 0));
						ee.setGravity(false);
					}
					else if(isAir(ee.getLocation().getBlock().getType())) {
						
					}
					else {
						ee.setGravity(true);
						ee.setVelocity(new Vector(0,-.3,0));
					}
				}
				}
			}
		}
	}
	
	public void placeFallingSand(Entity ee, int check) {
		if(!worlds.contains(ee.getWorld().getName())) {
			return;
		}
		Location dothing = ee.getLocation();
		boolean cando = false;
		Material m = ee.getLocation().getBlock().getType();
		if(isAir(m) || m==Material.LAVA || m==Material.WATER || ee.getLocation().getBlock().isPassable()) {
			cando=true;
		}
		if(cando == false) {
			Location ltemp = ee.getLocation().clone().add(0, 1, 0);
			for(int i = 0; i < 16; i++) {
				Material newm = ltemp.clone().add(0, i, 0).getBlock().getType();
				if(isAir(newm)) {
					dothing = ltemp.clone().add(0, i, 0);
					break;
				}
			}
		}
		if(check==0) {
			dothing.getBlock().setType(Material.getMaterial(ee.getMetadata("fallsand1").get(0).asString()));
			ee.getWorld().playSound(dothing, bs.getBreakSound(dothing.getBlock().getType()+""), 1, 1);
			fallingsands.remove(ee);
			ee.remove();
		}
		else if(check==1) {
			dothing.getBlock().setType(Material.getMaterial(ee.getPassengers().get(0).getMetadata("fallsand1").get(0).asString()));
			ee.getWorld().playSound(dothing, bs.getBreakSound(dothing.getBlock().getType()+""), 1, 1);
			fallingsands.remove(ee.getPassengers().get(0));
			ee.getPassengers().get(0).remove();
			fallingsands.remove(ee);
			ee.remove();
		}
	}
	
	public void dofallingsands() {
		if(!fallingsands.isEmpty()) {
			List<Entity> fallingsands2 = new ArrayList<Entity>(fallingsands);
			for(Entity ee : fallingsands2) {
				if(ee!=null) {
					if(ee.isOnGround()==true||(ee.getLocation().getBlock().getType()==Material.LAVA||ee.getLocation().getBlock().getType()==Material.WATER)) {
						if(ee instanceof ArmorStand) {
							placeFallingSand(ee, 0);
						}
						else {
							Vector v = null;
							if(ee.getPassengers().size()>0) {
							if(ee.getPassengers().get(0).getMetadata("fallsand1").size()>0) {
								if(dur.softs.contains("" + Material.getMaterial(ee.getPassengers().get(0).getMetadata("fallsand1").get(0).asString()))) {
									v = checkSides(ee.getLocation().getBlock().getLocation());
								}
							}
							if(v==null) {
							if(ee.getPassengers()!=null) {
								if(ee.getPassengers().size()>0) {
									placeFallingSand(ee, 1);
								}
								else {
									ee.getPassengers().clear();
									fallingsands.remove(ee);
									ee.remove();
								}
							}
							else {
								ee.getPassengers().clear();
								fallingsands.remove(ee);
								ee.remove();
							}
							}
							else {
								ee.setVelocity(v);
							}
							}
							else {
								ee.getPassengers().clear();
								fallingsands.remove(ee);
								ee.remove();
							}
						}
					}
				}
				else {
					fallingsands.remove(ee);
					ee.remove();
				}
			}
		}
	}
	
	public Vector checkSides(Location l) {
		Vector v = null;
		List<BlockFace> sidetypes = new ArrayList<BlockFace>();
		BlockFace[] sides = {BlockFace.WEST,BlockFace.SOUTH,BlockFace.NORTH,BlockFace.EAST};
		for(int sidesR = 0; sidesR < sides.length; sidesR++) {
			Block b1 = l.clone().getBlock().getRelative(sides[sidesR]);
			Block b2 = l.clone().subtract(0,1,0).getBlock().getRelative(sides[sidesR]);
			if(isAir(b1.getType()) && isAir(b2.getType())) {
				sidetypes.add(sides[sidesR]);
			}
		}
		if(sidetypes.size()>0) {
		BlockFace choosen = sidetypes.get(randor.nextInt(sidetypes.size()));
		if(choosen == BlockFace.WEST) {
			v = new Vector(-.3, 0, 0);
		}
		else if(choosen == BlockFace.NORTH) {
			v = new Vector(0, 0, -.3);
		}
		else if(choosen == BlockFace.SOUTH) {
			v = new Vector(0, 0, .3);
		}
		else if(choosen == BlockFace.EAST) {
			v = new Vector(.3, 0, 0);
		}
		return v;
		}
		else {
			return null;
		}
	}
	
	public void deleteArmor() {
		if(!armors.isEmpty()) {
			HashMap<Entity, Long> armors2 = new HashMap<Entity, Long>(armors);
			for(Entity ee : armors2.keySet()) {
				if(armors2.get(ee)<System.currentTimeMillis()) {
					armors.remove(ee);
					ee.remove();
				}
			}
		}
	}
	
	@EventHandler
	public void setWorld(PlayerJoinEvent event) {
		if(wor==null) {
		wor = event.getPlayer().getWorld();
		}
		else {
			return;
		}
	}
	
	@SuppressWarnings("unused")
	public void betterEffectLooper() {
		if(!effectEnts.isEmpty()) {
		List<Entity> tempEntss = new ArrayList<Entity>(effectEnts);
		for(Entity e : tempEntss) {
			LivingEntity e2 = (LivingEntity) e;
			if(true == false) {//!worlds.contains(e2.getWorld().getName())) {
				effectEnts.remove(e);
			}
			else {
			if(e2 != null) {
				if(!e2.isDead()) {
					if(e2 instanceof Player) {
						Location feet = e2.getLocation().subtract(0, 1, 0);
						Location leg = e2.getLocation();
						Location head = e2.getLocation().add(0, 1, 0);
						int temp1 = 0; int temp2 = 0; int temp3 = 0;
						boolean hasTemp = false;
						if(feet.getBlock().hasMetadata("T")) {
							hasTemp = true;
							if(!feet.getBlock().getMetadata("T").isEmpty()) {
								temp1 = feet.getBlock().getMetadata("T").get(0).asInt();
							}
						}
						if(leg.getBlock().hasMetadata("T")) {
							hasTemp = true;
							if(!leg.getBlock().getMetadata("T").isEmpty()) {
								temp2 = leg.getBlock().getMetadata("T").get(0).asInt();
							}
						}
						if(head.getBlock().hasMetadata("T")) {
							hasTemp = true;
							if(!head.getBlock().getMetadata("T").isEmpty()) {
								temp3 = head.getBlock().getMetadata("T").get(0).asInt();
							}
						}
						if(hasTemp == false) {
							effectEnts.remove(e);
						}
						else {
							runTemperature(((Player) e2), Math.max(Math.max(temp1, temp2), temp3));
						}
					}
					else {
						effectEnts.remove(e);	
					}
					}
				else {
					effectEnts.remove(e);	
				}
			}
			else {
				effectEnts.remove(e);	
			}
			}
			}
		}
		}
	
	public void runFireTemp() {
		if(config.getBoolean("Enable Temperature ")) {
		if(!fires.isEmpty()) {
			List<Block> fires2 = new ArrayList<Block>(fires);
			for(Block b : fires2) {
				//removal
				if(b.getType()!=Material.FIRE) {
					fires.remove(b);
					if(b.hasMetadata("T")) {
						if(b.getMetadata("T").size()>0) {
							tempers.put(b, b.getMetadata("T").get(0).asInt());
						}
						else {
							tempers.put(b, 2000);
						}
					}
					else {
						tempers.put(b, 2000);
					}
					BlockFace[] sides = {BlockFace.DOWN,BlockFace.WEST,BlockFace.UP,BlockFace.SOUTH,BlockFace.NORTH,BlockFace.EAST};
					for(int sidesR = 0; sidesR < sides.length; sidesR++) {
						Block b2 = b.getRelative(sides[sidesR]);
						if(b2.getType()!=Material.FIRE) {
							if(fires.contains(b2)) {
								fires.remove(b2);
							}
							if(firesT.contains(b2)) {
								firesT.remove(b2);
							}
						if(b2.hasMetadata("T")) {
							if(b2.getMetadata("T").size()>0) {
								tempers.put(b2, b2.getMetadata("T").get(0).asInt());
							}
							else {
								tempers.put(b2, 2000);
							}
						}
						else {
							tempers.put(b2, 2000);
						}
						}
					}
				}
				//
				else {
				BlockFace[] sides = {BlockFace.DOWN,BlockFace.WEST,BlockFace.UP,BlockFace.SOUTH,BlockFace.NORTH,BlockFace.EAST,BlockFace.SELF};
				for(int sidesR = 0; sidesR < sides.length; sidesR++) {
					Block b2 = b.getRelative(sides[sidesR]);
					if(sides[sidesR]!=BlockFace.SELF) {
						if(!firesT.contains(b2)) {
							firesT.add(b2);
						}
					}
					if(b2.hasMetadata("T")) {
						if(b2.getMetadata("T").size()>0) {
							if(b2.getMetadata("T").get(0).asInt()>=2200) {
								
							}
							else {
							b2.setMetadata("T", new FixedMetadataValue(this, b2.getMetadata("T").get(0).asInt()+300));
							}
						}
						else {
							b2.setMetadata("T", new FixedMetadataValue(this, 300));
						}
					}
					else {
						b2.setMetadata("T", new FixedMetadataValue(this, 300));
					}
				}
			}
			}
		}
		}
	}
	
	public void runTemperature(Player p, int temp) {
		if(!worlds.contains(p.getWorld().getName())) {
			return;
		}
		if(temp<125) {
			if(randor.nextInt(20)==0) {
				p.damage(1);
			}
		}
		else if(temp<256) {
			if(randor.nextInt(16)==0) {
				p.damage(1);
			}
		}
		else if(temp<526) {
			if(randor.nextInt(15)==0) {
				p.damage(1);
				if(p.getFireTicks()<=0) {
					p.setFireTicks(40);
				}
			}
		}
		else if(temp<1027) {
			if(randor.nextInt(10)==0) {
				p.damage(1);
				if(p.getFireTicks()<=0) {
					p.setFireTicks(80);
				}
			}
		}
		else if(temp<2546) {
			if(randor.nextInt(7)==0) {
				p.damage(2);
				if(p.getFireTicks()<=0) {
					p.setFireTicks(160);
				}
			}
		}
		else if(temp<5678) {
			if(randor.nextInt(4)==0) {
				p.damage(1);
				if(p.getFireTicks()<=0) {
					p.setFireTicks(360);
				}
			}
		}
		else {
			if(randor.nextInt(2)==0) {
				p.damage(4);
				if(p.getFireTicks()<=0) {
					p.setFireTicks(1200);
				}
			}
		}
	}

	public void runTemperatureE(LivingEntity p, int temp) {
		if(!worlds.contains(p.getWorld().getName())) {
			return;
		}
		if(temp<125) {
			if(randor.nextInt(20)==0) {
				p.damage(1);
			}
		}
		else if(temp<256) {
			if(randor.nextInt(16)==0) {
				p.damage(1);
			}
		}
		else if(temp<526) {
			if(randor.nextInt(15)==0) {
				p.damage(1);
				if(p.getFireTicks()<=0) {
					p.setFireTicks(40);
				}
			}
		}
		else if(temp<1027) {
			if(randor.nextInt(10)==0) {
				p.damage(1);
				if(p.getFireTicks()<=0) {
					p.setFireTicks(80);
				}
			}
		}
		else if(temp<2546) {
			if(randor.nextInt(7)==0) {
				p.damage(2);
				if(p.getFireTicks()<=0) {
					p.setFireTicks(160);
				}
			}
		}
		else if(temp<5678) {
			if(randor.nextInt(4)==0) {
				p.damage(1);
				if(p.getFireTicks()<=0) {
					p.setFireTicks(360);
				}
			}
		}
		else {
			if(randor.nextInt(2)==0) {
				p.damage(4);
				if(p.getFireTicks()<=0) {
					p.setFireTicks(1200);
				}
			}
		}
	}
	
	public void removeTemp() {
		if(!tempers.isEmpty()) {
			HashMap<Block, Integer> temps = new HashMap<Block, Integer>(tempers);
			for(Block b : temps.keySet()) {
				int newTemp = temps.get(b)/4;
				if(newTemp<=1) {
					b.removeMetadata("T", this);
					tempers.remove(b);
					fires.remove(b);
					firesT.remove(b);
				}
				else {
					tempers.put(b, newTemp);
					b.setMetadata("T", new FixedMetadataValue(this, newTemp));
				}
			}
		}
	}
	
	@EventHandler
	public void onBlockIgnite(BlockIgniteEvent e) {
		if(!worlds.contains(e.getBlock().getLocation().getWorld().getName())) {
			return;
		}
		if(config.getBoolean("Enable Enhanced Fires ")) {
		if(!e.isCancelled()) {
			if(config.getBoolean("Enable Netherrack ")==false) {
				if(e.getBlock().getLocation().subtract(0, 1, 0).getBlock().getType()==Material.NETHERRACK) {
					return;
				}
				else if(e.getBlock().getType()==Material.NETHERRACK) {
					return;
				}
			}
			if(!fires.contains(e.getBlock())) {
				if(tempers.containsKey(e.getBlock())) {
					tempers.remove(e.getBlock());
				}
				if(firesT.contains(e.getBlock())) {
					firesT.remove(e.getBlock());
				}
				fires.add(e.getBlock());
			}
		}
		}
	}
	
	public void doGasEffects() {
		for(gasManager gm : gsM) {
			List<Location> gsLocations = new ArrayList<Location>(gm.getLocations());
			if(!gsLocations.isEmpty()) {
				for(Location l : gsLocations) {
					for(Entity e : l.getWorld().getNearbyEntities(l, 1, 1, 1)) {
						if(e instanceof LivingEntity) {
						if(gm.name.equals("smoke")) {
								((LivingEntity) e).addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 200));
								((LivingEntity) e).addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 0));
						}
						else if(gm.name.equals("steam")) {
							if(randor.nextInt(20)==0) {
							((LivingEntity) e).damage(1);
							}
						}
						}
					}
				}
			}
		}
	}
	
	@EventHandler
	public void onBurn(BlockBurnEvent e) {
		if(!worlds.contains(e.getBlock().getLocation().getWorld().getName())) {
			return;
		}
		else {
		if(config.getBoolean("Enable Ash ")) {
			Material m = e.getBlock().getType();
		if(m.name().toLowerCase().contains("wood")||m.name().toLowerCase().contains("log")||m.name().toLowerCase().contains("plank")) {
			e.setCancelled(true);
			e.getBlock().setType(Material.LIGHT_GRAY_CONCRETE_POWDER);
		}
		else if(m.name().toLowerCase().contains("leave")) {
			if(randor.nextInt(7)==0) {
				e.setCancelled(true);
				e.getBlock().setType(Material.LIGHT_GRAY_CONCRETE_POWDER);
			}
		}
		}
		if(config.getBoolean("Enable Fire Smoke ")) {
		gsM.get(0).addGasLocation(e.getBlock().getLocation().add(0, 1, 0), 1);
		}
		}
	}
	
	public void tempBlockChanges(Block b, int temp) {
		if(!worlds.contains(b.getLocation().getWorld().getName())) {
			return;
		}
		if(b.getWorld().getBlockAt(b.getLocation()).getType()==Material.FIRE&&temp>600) {
			if(randor.nextBoolean()) {
			b.getWorld().spawnParticle(Particle.FLAME, b.getLocation().add(0.5, 0.5, 0.5), 1, .5, .5, .5, 0.03);
			}
		}
		if(temp>1000&&temp<1600) {
			if(randor.nextInt(20)==0) {
			tempAbove1000(b);
			}
		}
		else if(temp>1600&&temp<2000) {
			if(randor.nextInt(20)==0) {
			tempAbove1600(b);
			}
		}
		else if(temp>2000) {
			if(randor.nextInt(20)==0) {
			tempAbove2000(b);
			}
		}
	}
	
	public void tempAbove1000(Block b) {
		Location loc = b.getLocation();
		int radius = 2;
		int cx = loc.getBlockX();
		int cy = loc.getBlockY();
		int cz = loc.getBlockZ();
		for(int x = cx - radius; x <= cx + radius; x++){
		for (int z = cz - radius; z <= cz + radius; z++){
		for(int y = (cy - radius); y < (cy + radius); y++){
		double dist = (cx - x) * (cx - x) + (cz - z) * (cz - z) + ((cy - y) * (cy - y));

			if(dist < radius * radius){
				Location l = new Location(loc.getWorld(), x, y, z);
				Material m = l.getBlock().getType();
				if(m==Material.GRASS_BLOCK||m.name().toLowerCase().contains("dirt")) {
				if(randor.nextInt(10)==0) {
					int decided = randor.nextInt(3);
					if(decided==0) {
					l.getBlock().setType(Material.SAND);
					}
					else if(decided==1) {
						l.getBlock().setType(Material.DIRT);
					}
					else if(decided==2) {
						l.getBlock().setType(Material.COARSE_DIRT);
					}
				}
				}
				else if(m == Material.WATER) {
					if(randor.nextInt(10)==0) {
					l.getBlock().setType(Material.AIR);
					gsM.get(1).addGasLocation(l.add(0, 1, 0), 1);
					}
				}
			}
		}
		}
		}
	}
	
	public void tempAbove1600(Block b) {
		Location loc = b.getLocation();
		int radius = 3;
		int cx = loc.getBlockX();
		int cy = loc.getBlockY();
		int cz = loc.getBlockZ();
		for(int x = cx - radius; x <= cx + radius; x++){
		for (int z = cz - radius; z <= cz + radius; z++){
		for(int y = (cy - radius); y < (cy + radius); y++){
		double dist = (cx - x) * (cx - x) + (cz - z) * (cz - z) + ((cy - y) * (cy - y));

			if(dist < radius * radius){
				Location l = new Location(loc.getWorld(), x, y, z);
				Material m = l.getBlock().getType();
				if(m==Material.GRASS_BLOCK||m.name().toLowerCase().contains("dirt")) {
				if(randor.nextInt(10)==0) {
					int decided = randor.nextInt(3);
					if(decided==0) {
					l.getBlock().setType(Material.SAND);
					}
					else if(decided==1) {
						l.getBlock().setType(Material.DIRT);
					}
					else if(decided==2) {
						l.getBlock().setType(Material.COARSE_DIRT);
					}
				}
				}
				else if(isStony(m)&&(!(m.name().toLowerCase().contains("redstone")))) {
					if(randor.nextInt(10)==0) {
						if(l.getBlock().getType()==Material.COBBLESTONE) {
							if(randor.nextBoolean()==true) {
								l.getBlock().setType(Material.STONE);
							}
						}
						else {
							l.getBlock().setType(Material.MAGMA_BLOCK);
						}
					}
				}
				else if(m.name().toLowerCase().contains("leave")||m.name().toLowerCase().contains("wood")||m.name().toLowerCase().contains("log")||m.name().toLowerCase().contains("plank")) {
					if(doRealisticSpreading == true) {
					if(randor.nextInt(20)==0) {
						l.getBlock().setType(Material.FIRE);
					}
					}
				}
				else if(m == Material.WATER) {
					if(randor.nextInt(10)==0) {
					l.getBlock().setType(Material.AIR);
					gsM.get(1).addGasLocation(l.add(0, 1, 0), 1);
					}
				}
			}
		}
		}
		}
	}

	public void tempAbove2000(Block b) {
		Location loc = b.getLocation();
		int radius = 3;
		int cx = loc.getBlockX();
		int cy = loc.getBlockY();
		int cz = loc.getBlockZ();
		for(int x = cx - radius; x <= cx + radius; x++){
		for (int z = cz - radius; z <= cz + radius; z++){
		for(int y = (cy - radius); y < (cy + radius); y++){
		double dist = (cx - x) * (cx - x) + (cz - z) * (cz - z) + ((cy - y) * (cy - y));

			if(dist < radius * radius){
				Location l = new Location(loc.getWorld(), x, y, z);
				Material m = l.getBlock().getType();
				if((isStony(m)||m == Material.MAGMA_BLOCK)&&(!(m.name().toLowerCase().contains("red")))) {
					if(randor.nextInt(10)==0) {
						if(randor.nextInt(5)==0) {
							l.getBlock().setType(Material.LAVA);
						}
						else {
							l.getBlock().setType(Material.MAGMA_BLOCK);
						}
					}
				}
				else if(m == Material.WATER) {
					if(randor.nextInt(6)==0) {
					l.getBlock().setType(Material.AIR);
					gsM.get(1).addGasLocation(l.add(0, 1, 0), 1);
					}
				}
			}
		}
		}
		}
	}
	
	@EventHandler
	public void onWaterChange(BlockFormEvent e) {
		if(!worlds.contains(e.getBlock().getLocation().getWorld().getName())) {
			return;
		}
		if(e.isCancelled()) {
			
		}
		else {
			if(config.getBoolean("Enable Steam ")) {
			if(e.getBlock().getType()==Material.LAVA||e.getBlock().getType()==Material.WATER) {
					gsM.get(1).addGasLocation(e.getBlock().getLocation().add(0, 2, 0), 1);
			}
			}
		}
	}
	
	public void doDynamicTemperature() {
		if(dyTemp==true) {
			if(!tempers.isEmpty()) {
				HashMap<Block, Integer> temps = new HashMap<Block, Integer>(tempers);
				for(Block b : temps.keySet()) {
					for(Entity e : b.getWorld().getNearbyEntities(b.getLocation(), 2, 2, 2)) {
						if(e instanceof LivingEntity && (!(e instanceof Player))) {
							runTemperatureE((LivingEntity) e, temps.get(b));
						}
					}
					if(b.getWorld().getBlockAt(b.getLocation()).getType()==Material.FIRE&&temps.get(b)>300) {
						if(randor.nextBoolean()) {
							doRandomFireParticle(b.getLocation().add(0.5, 0.5, 0.5));
						}
					}
					if(temps.get(b)>1000) {
						if(randor.nextInt(10)==0) {
							Location oldL = b.getLocation().add((randor.nextInt(100)/100.0), (randor.nextInt(100)/100.0), (randor.nextInt(100)/100.0));
							oldL.getWorld().spawnParticle(Particle.SMOKE_NORMAL, oldL, 1, 0, 0, 0, 0.01);
						}
						tempBlockChanges(b, temps.get(b));
					}
				}
			}
			if(!fires.isEmpty()) {
				List<Block> temps = new ArrayList<Block>(fires);
				for(Block b : temps) {
					int temp = 0;
					if(b.hasMetadata("T")) {
						if(b.getMetadata("T").size()>0) {
							temp = b.getMetadata("T").get(0).asInt();
						}
					}
					if(temp>0) {
					for(Entity e : b.getWorld().getNearbyEntities(b.getLocation(), 2, 2, 2)) {
						if(e instanceof LivingEntity && (!(e instanceof Player))) {
							runTemperatureE((LivingEntity) e, temp);
						}
					}
					if(b.getWorld().getBlockAt(b.getLocation()).getType()==Material.FIRE&&temp>300) {
						if(randor.nextBoolean()) {
							doRandomFireParticle(b.getLocation().add(0.5, 0.5, 0.5));
						}
					}
					if(temp>1000) {
						if(randor.nextInt(10)==0) {
							Location oldL = b.getLocation().add((randor.nextInt(100)/100.0), (randor.nextInt(100)/100.0), (randor.nextInt(100)/100.0));
							oldL.getWorld().spawnParticle(Particle.SMOKE_NORMAL, oldL, 1, 0, 0, 0, 0.01);
						}
						tempBlockChanges(b, temp);
					}
					}
				}
			}
			if(!firesT.isEmpty()) {
				List<Block> temps = new ArrayList<Block>(firesT);
				for(Block b : temps) {
					int temp = 0;
					if(b.hasMetadata("T")) {
						if(b.getMetadata("T").size()>0) {
							temp = b.getMetadata("T").get(0).asInt();
						}
					}
					if(temp>0) {
					for(Entity e : b.getWorld().getNearbyEntities(b.getLocation(), 2, 2, 2)) {
						if(e instanceof LivingEntity && (!(e instanceof Player))) {
							runTemperatureE((LivingEntity) e, temp);
						}
					}
					if(b.getWorld().getBlockAt(b.getLocation()).getType()==Material.FIRE&&temp>300) {
						if(randor.nextBoolean()) {
							doRandomFireParticle(b.getLocation().add(0.5, 0.5, 0.5));
						}
					}
					if(temp>1000) {
						if(randor.nextInt(10)==0) {
							Location oldL = b.getLocation().add((randor.nextInt(100)/100.0), (randor.nextInt(100)/100.0), (randor.nextInt(100)/100.0));
							oldL.getWorld().spawnParticle(Particle.SMOKE_NORMAL, oldL, 1, 0, 0, 0, 0.01);
						}
						tempBlockChanges(b, temp);
					}
					}
				}
			}
		}
	}
	
	public void doBlockStuff(List<Block> bl, int key, int eRange, Location begin) {
		for(Block bls : bl) {
			if(randor.nextInt(8)==0) {
				if(randor.nextBoolean()==true&&randor.nextInt(40)!=0) {
				bls.getWorld().playSound(bls.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1, 1);
				}
				else {
					bls.getWorld().playSound(bls.getLocation(), bs.getBreakSound(bls.getLocation().getBlock().getType()+""), 1, 1);
				}
			}
			if(randor.nextInt(20)==0) {
				if(key>eRange-eRange/5) {
					//if(config.getBoolean("Enable Block Physics ")) {
					if(randor.nextInt(2)==0 && (!(isAir(bls.getType())))) {
						Entity fb = null;
						fb = spawnRealFSand(bls.getLocation(), bls.getType());
						if(fb!=null) {
						fb.setVelocity(begin.toVector().subtract(fb.getLocation().toVector()).normalize().multiply(1.2));
						}
						bls.setType(Material.AIR);
						if(bls.hasMetadata("D")) {
							bls.removeMetadata("D", this);
						}
					}
					//}
					bls.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, bls.getLocation(), 1);
				}
				else if(key>eRange-eRange/2) {
					bls.getWorld().spawnParticle(Particle.EXPLOSION_LARGE, bls.getLocation(), 1);
				}
				else {
					bls.getWorld().spawnParticle(Particle.EXPLOSION_HUGE, bls.getLocation(), 1);
				}
			}
			if(randor.nextInt(20)==0) {
				
			}
			if(bls.getType()==Material.TNT) {
				bls.setType(Material.AIR);
				HashMap<Integer, List<Block>> empty = new HashMap<Integer, List<Block>>();
				iterate(empty, bls.getLocation(), (int) (.25*16)*2, (int) ((.25*16)*(.25*16)*(.25*16))*2, 350);
			}
			if(bls.hasMetadata("D")) {
				bls.removeMetadata("D", this);
			}
			if(randor.nextInt(5)!=0 || bls.hasMetadata("blood")) {
				bls.setType(Material.AIR);
				if(bls.hasMetadata("blood")) {
					bls.removeMetadata("blood", this);
				}
			}
			else {
					bls.breakNaturally();
			}
		}
	}
	
	@EventHandler
	public void onBlockBreak2(BlockBreakEvent event) {
		if(!worlds.contains(event.getBlock().getWorld().getName())) {
			return;
		}
		if(event.getBlock().hasMetadata("D")) {
			event.getBlock().removeMetadata("D", this);
		}
	}
	@EventHandler
	public void onBlockPlace2(BlockPlaceEvent event) {
		if(!worlds.contains(event.getBlock().getWorld().getName())) {
			return;
		}
		if(event.getBlock().hasMetadata("D")) {
			event.getBlock().removeMetadata("D", this);
		}
	}
	@EventHandler
	public void onPMove(PlayerMoveEvent event) {
		if(!worlds.contains(event.getPlayer().getWorld().getName())) {
			return;
		}
		if(config.getBoolean("Enable Temperature ")) {
		if(!tempers.isEmpty()) {
			if(!effectEnts.contains(event.getPlayer())) {
		Player e2 = event.getPlayer();
		Location feet = e2.getLocation().subtract(0, 1, 0);
		Location leg = e2.getLocation();
		Location head = e2.getLocation().add(0, 1, 0);
		int temp1 = 0; int temp2 = 0; int temp3 = 0;
		if(feet.getBlock().hasMetadata("T")) {
			if(!feet.getBlock().getMetadata("T").isEmpty()) {
				temp1 = feet.getBlock().getMetadata("T").get(0).asInt();
			}
		}
		if(leg.getBlock().hasMetadata("T")) {
			if(!leg.getBlock().getMetadata("T").isEmpty()) {
				temp2 = leg.getBlock().getMetadata("T").get(0).asInt();
			}
		}
		if(head.getBlock().hasMetadata("T")) {
			if(!head.getBlock().getMetadata("T").isEmpty()) {
				temp3 = head.getBlock().getMetadata("T").get(0).asInt();
			}
		}
		if(Math.max(Math.max(temp1, temp2), temp3)>32) {
			effectEnts.add(e2);
		}
			}
		}
		}
	}
	
	public void iterate(HashMap<Integer, List<Block>> blocksF, Location locer, int eRange, int ammount, int temperature){
		if(eRange>20 || eRange<0) {
			return;
		}
		HashMap<Integer, List<Block>> blocks = blocksF;
		int times = 1000;
		if(ammount <= 1000) {
			times = ammount;
		}
		ammount = ammount - 1000;
		for(int i = 0; i < times; i++) {
			final BlockIterator bit = new BlockIterator(wor, locer.toVector(), new Vector(0.0D + Math.random() - Math.random(),0.0D + Math.random() - Math.random(),0.0D + Math.random() - Math.random()), 0, eRange);
			int blockNum = 1;
			double power = eRange*eRange*eRange/3;
			int temptemp = temperature;
			while (bit.hasNext()) {
				final Block next = bit.next();
				String name = (next.getType()+"").toLowerCase();
				if((name.contains("redstone")&&(!(name.contains("block")||name.contains("ore"))))||name.contains("bedrock")||name.contains("barrier")||name.contains("command")) {
					break;
				}
				HashMap<Double, Integer> newV = runBlockDecision(next, power, locer, temptemp);
				for(Double d : newV.keySet()) {
					power = d;
					temptemp = newV.get(d);
					break;
				}
				if(power>0) {
				if (next != null) {
					if(blocks.containsKey(blockNum)) {
						if(!blocks.get(blockNum).contains(next)) {
						blocks.get(blockNum).add(next);
						}
					}
					else {
						List<Block> blnew = new ArrayList<Block>();
						blnew.add(next);
						blocks.put(blockNum, blnew);
					}
				}
				blockNum++;
				}
				else {
					break;
				}
			}
		}
		if(ammount > 1000) {
			final int am = ammount;
			Bukkit.getScheduler().runTaskLater(this, () -> iterate(blocks, locer, eRange, am, temperature), 40);
		}
		else {
			throwExplosion(locer, eRange, blocks);
		}
	}
 
	public HashMap<Double, Integer> runBlockDecision(Block b, double power, Location begin, int temp) {
		HashMap<Double, Integer> values = new HashMap<Double, Integer>();
		Material m = b.getType();
		double pow2 = power;
		int temp2 = temp;
		if(b.hasMetadata("D")) {
			if(!b.getMetadata("D").isEmpty()) {
			pow2 = pow2 - b.getMetadata("D").get(0).asDouble();
			}
		}
		else {
			pow2 = pow2 - dur.duras.get(m + "");
		}
		if(config.getBoolean("Enable Temperature ")) {
		if(b.hasMetadata("T")) {
			if(!b.getMetadata("T").isEmpty()) {
				int calc = (int) (temp2 / (dur.temp.get(b.getType() + "")/4.0));
				int tempB = b.getMetadata("T").get(0).asInt();
					temp2 = temp2 - dur.temp.get(b.getType() + "");
				if(tempB>=temp2) {
					temp2 = calc;
				}
				else {
					b.setMetadata("T", new FixedMetadataValue(this, temp2));
					tempers.put(b, temp2);
					temp2 = calc;
				}
			}
		}
		else {
			int calc = (int) (temp2 / (dur.temp.get(b.getType() + "")/4.0));
			b.setMetadata("T", new FixedMetadataValue(this, temp2));
			tempers.put(b, temp2);
			temp2 = calc;
		}
		}
		for(Entity e : b.getWorld().getNearbyEntities(b.getLocation(), 1, 1, 1)) {
			if(!e.hasMetadata("bullet")) {
			if(e instanceof LivingEntity) {
				if(pow2>0) {
					if(e instanceof Player) {
						damageReducer.ReducedDamage(((LivingEntity) e), pow2/7.8);
					}
					else {
						((LivingEntity) e).damage(pow2/2);
					}
				}
			}
			if(pow2>0) {
				try {
					e.setVelocity(begin.toVector().subtract(e.getLocation().toVector()).normalize().multiply(-1-(pow2/100)));
				}
				catch(Exception ee) {
					
				}
			}
			}
		}
		if(pow2<=0) {
			if(b.hasMetadata("D")) {
				if(!b.getMetadata("D").isEmpty()) {
				b.setMetadata("D", new FixedMetadataValue(this, b.getMetadata("D").get(0).asDouble() - power));
				if(b.getMetadata("D").get(0).asDouble()<=dur.duras.get(m + "")/2.0) {
					if(dur.converts.containsKey(b.getType() + "")) {
					b.setType(dur.converts.get(b.getType() + ""));
					}
				}
				}
				values.put(pow2, temp2);
				return values;
			}
			else {
				b.setMetadata("D", new FixedMetadataValue(this, dur.duras.get(m + "")-power));
				if(!b.getMetadata("D").isEmpty()) {
				if(b.getMetadata("D").get(0).asDouble()<=dur.duras.get(m + "")/2.0) {
					if(dur.converts.containsKey(b.getType() + "")) {
					b.setType(dur.converts.get(b.getType() + ""));
					}
				}
				}
				values.put(pow2, temp2);
				return values;
			}
		}
		else {
			values.put(pow2, temp2);
			return values;
		}
	}
	
	@EventHandler
	public void onDamaged(EntityDamageEvent event) {
		if(!worlds.contains(event.getEntity().getWorld().getName())) {
			return;
		}
		if(config.getBoolean("Enable Enhanced Explosions ")) {
		if(event.getCause()==DamageCause.BLOCK_EXPLOSION || event.getCause()==DamageCause.ENTITY_EXPLOSION) {
			event.setCancelled(true);
		}
		}
	}
	
	public HashMap<Integer, List<Block>> getBlocks(Location locer, int eRange){
		Location loc = locer;
		HashMap<Integer, List<Block>> blocks = new HashMap<Integer, List<Block>>();
		//block range getter
		int radiuse = eRange;
		int fullRadi = radiuse*radiuse*radiuse;
		if(fullRadi>6000) {
		for(int i = 0; i < radiuse*radiuse*radiuse; i++) {
			//final BlockIterator bit = new BlockIterator(wor, loc.toVector(), new Vector(randor.nextInt(360)+1,randor.nextInt(360)+1,randor.nextInt(360)+1), 0, radius);
			final BlockIterator bit = new BlockIterator(wor, loc.toVector(), new Vector(0.0D + Math.random() - Math.random(),0.0D + Math.random() - Math.random(),0.0D + Math.random() - Math.random()), 0, radiuse);
			int blockNum = 1;
			while (bit.hasNext()) {
				final Block next = bit.next();
				if (next != null) {
					if(blocks.containsKey(blockNum)) {
						if(!blocks.get(blockNum).contains(next)) {
						blocks.get(blockNum).add(next);
						}
					}
					else {
						List<Block> blnew = new ArrayList<Block>();
						blnew.add(next);
						blocks.put(blockNum, blnew);
					}
				}
				blockNum++;
			}
		}
		}
		return blocks;
	}
	
	public int getNegRand() {
		if(randor.nextBoolean()) {
			return 1;
		}
		else { 
			return -1;
		}
	}
	
	public void throwExplosion(Location locer, int eRange, HashMap<Integer, List<Block>> blocks) {
		locer.getWorld().playSound(locer, Sound.ENTITY_GENERIC_EXPLODE, 1, 1);
		for(int key : blocks.keySet()) {
			int counterr = 0;
			if(eRange>20) {
				Bukkit.getScheduler().runTaskLater(this,
						() -> doBlockStuff(blocks.get(key), key, eRange, locer), 40+counterr);
				counterr+=41;
			}
			else {
				doBlockStuff(blocks.get(key), key, eRange, locer);
			}
		}
	}
	

    public boolean inSpawnRegion(Location l) {
    	int spawndistance = 100;
    	if(spawndistance < 2) {
    		return false;
    	}
    	Location spawn = l.getWorld().getSpawnLocation();
    	if(worlds.contains(l.getWorld().getName())) {
    	if((spawn.getX()+spawndistance>l.getX())&&(spawn.getX()-spawndistance<l.getX())) {
    		if((spawn.getZ()+spawndistance>l.getZ())&&(spawn.getZ()-spawndistance<l.getZ())) {
    	    		return true;
    	    }
    	}
    	return false;
    	}
    	return false;
    }
    
	
	@EventHandler
	public void onEntityExplode(EntityExplodeEvent event) {
		if(inSpawnRegion(event.getLocation())) {
			return;
		}
		if(!worlds.contains(event.getEntity().getWorld().getName())) {
			return;
		}
		if(config.getBoolean("Enable Enhanced Explosions ")) {
		if(!event.isCancelled()) {
			if(event.getYield()<0||event.getYield()>50) {
				
			}
			else {
		if(event.getEntityType()==EntityType.PRIMED_TNT||event.getEntityType()==EntityType.CREEPER||event.getEntityType()==EntityType.FIREBALL||event.getEntityType()==EntityType.WITHER_SKULL) {
			event.setCancelled(true);
			event.getEntity().getWorld().playSound(event.getEntity().getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1, 1);
			HashMap<Integer, List<Block>> empty = new HashMap<Integer, List<Block>>();
			if(event.getEntityType()==EntityType.FIREBALL||event.getEntityType()==EntityType.WITHER_SKULL) {
				iterate(empty, event.getLocation(), (int) (3), (int) (30), (int) (30));	
			    doFireExplosionEffect(event.getLocation());
			}
			else {
				if(event.getEntityType()==EntityType.PRIMED_TNT) {
					iterate(empty, event.getLocation(), (int) (.15*16)*2, (int) ((.15*16)*(.15*16)*(.15*16))*2, 250);
				}
				else if(event.getEntityType()==EntityType.CREEPER) {
					iterate(empty, event.getLocation(), (int) (.20*16)*2, (int) ((.20*16)*(.20*16)*(.20*16))*2, 250);
				}
				else {
					iterate(empty, event.getLocation(), (int) (event.getYield()*16), (int) ((event.getYield()*16)*(event.getYield()*16)*(event.getYield()*16)), (int) (16*((event.getYield()*16)*(event.getYield()*16)*(event.getYield()*16))));
				}
				}
			}
		}
		}
		}
	}
	
	public void doFireExplosionEffect(Location l) {
		Location loc = l.add(0, 0.5, 0);
		for(int count = 0; count < 10; count++) {
			Entity sand = null;
			if(randor.nextBoolean()) {
				sand = spawnRealFSand(loc, Material.FIRE);
			}
			else {
				sand = spawnRealFSand(loc, Material.MAGMA_BLOCK);
			}
			if(sand != null) {
				sand.setVelocity(new Vector((coinFlip()*(randor.nextInt(30)+30))/100.0,(randor.nextInt(3)+30)/100.0,(coinFlip()*(randor.nextInt(30)+30))/100.0));
			}
		}
	}
	
	@EventHandler
	public void onBlockExplode(BlockExplodeEvent event) {
		if(inSpawnRegion(event.getBlock().getLocation())) {
			return;
		}
		if(!worlds.contains(event.getBlock().getWorld().getName())) {
			return;
		}
		if(config.getBoolean("Enable Enhanced Explosions ")) {
		if(!event.isCancelled()) {
			if(event.getYield()<0||event.getYield()>50) {
				
			}
			else {
		event.setCancelled(true);
		event.getBlock().getWorld().playSound(event.getBlock().getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1, 1);
		HashMap<Integer, List<Block>> empty = new HashMap<Integer, List<Block>>();
		iterate(empty, event.getBlock().getLocation(), (int) (event.getYield()*2), (int) ((event.getYield()*2)*(event.getYield()*2)*(event.getYield()*2)), (int) (16*((event.getYield()*2)*(event.getYield()*2)*(event.getYield()*2))));
		//iterate(empty, event.getBlock().getLocation(), (int) (event.getYield()*16), (int) ((event.getYield()*16)*(event.getYield()*16)*(event.getYield()*16)), (int) (16*((event.getYield()*16)*(event.getYield()*16)*(event.getYield()*16))));
			}
		}
		}
	}

	public Entity spawnRealFSand(Location l, Material m) {
		if(m == Material.SAND || m == Material.GRAVEL || m.name().toLowerCase().contains("powder")) {
			return null;
		}
		Entity e1 = l.getWorld().spawnEntity(l, EntityType.ARMOR_STAND);
		((ArmorStand) e1).setVisible(false);
		MiscDisguise mob = new MiscDisguise(DisguiseType.FALLING_BLOCK);
		FallingBlockWatcher watcher = (FallingBlockWatcher) mob.getWatcher();
		watcher.setBlock(new ItemStack(m , 1));
		DisguiseAPI.disguiseEntity(e1, mob);
		e1.setMetadata("fallsand1", new FixedMetadataValue(this, m.name() + ""));
		e1.setSilent(true);
		((ArmorStand) e1).setCollidable(true);
		((ArmorStand) e1).setInvulnerable(true);
		fallingsands.add(e1);
		Silverfish e2 = (Silverfish) l.getWorld().spawnEntity(l, EntityType.SILVERFISH);
		e2.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999, 200, false, false));
		e2.addPassenger(e1);
		e2.setSilent(true);
		e2.setInvulnerable(true);
		e2.setCollidable(false);
		e2.setMetadata("fallsand", new FixedMetadataValue(this, 0));
		fallingsands.add(e2);
		return e2;
	}
	
	public void destroyEntity(Entity a) {
		for(Player pa : Bukkit.getServer().getOnlinePlayers()) {
			try {
			Object packet = getNmsClass("PacketPlayOutEntityDestroy").getConstructor(int[].class).newInstance(new int[] {a.getEntityId()});
	        sendPacket(pa, packet);
			}
			catch (Exception e) {
		        e.printStackTrace();
		    }
		}
		Bukkit.getScheduler().runTaskLater(this, () -> ((LivingEntity) a).damage(0), 5);
	}
	
	public void reviveEntity(Entity a) {
		for(Player pa : Bukkit.getServer().getOnlinePlayers()) {
			try {
			Object packet = getNmsClass("PacketPlayOutSpawnEntityLiving").getConstructor(int[].class).newInstance(new int[] {a.getEntityId()});
	        sendPacket(pa, packet);
			}
			catch (Exception e) {
		        e.printStackTrace();
		    }
		}
	}

	@EventHandler
	public void onArmorHitBlock(EntityDamageByEntityEvent e) {
		if(e.getEntity() instanceof ArmorStand && e.getDamager() instanceof Player) {
			if(!((ArmorStand) e.getEntity()).isVisible()) {
				if(e.getEntity().hasMetadata("fallsand1")) {
					e.getEntity().remove();
				}
			}
		}
	}
	
	void sendPacket(Player p, Object packet) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException, ClassNotFoundException {
	    Object nmsPlayer = p.getClass().getMethod("getHandle").invoke(p);
	    Object plrConnection = nmsPlayer.getClass().getField("playerConnection").get(nmsPlayer);
	    plrConnection.getClass().getMethod("sendPacket", getNmsClass("Packet")).invoke(plrConnection, packet);
	}

	Class<?> getNmsClass(String nmsClassName) throws ClassNotFoundException {
	    return Class.forName("net.minecraft.server." + Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3] + "." + nmsClassName);
	}
	
	@EventHandler
	public void onRedstone(BlockRedstoneEvent e) {
		if(!worlds.contains(e.getBlock().getWorld().getName())) {
			return;
		}
		if(config.getBoolean("Enable Enhanced Explosions ")) {
		Block b = e.getBlock().getRelative(BlockFace.DOWN);
		if(b.hasMetadata("D")) {
			if(b.getMetadata("D").size()>0) {
				int ammount = b.getMetadata("D").get(0).asInt() + 30;
				b.setMetadata("D", new FixedMetadataValue(this, ammount));
			}
			else {
				b.setMetadata("D", new FixedMetadataValue(this, 30));
			}
		}
		else {
			b.setMetadata("D", new FixedMetadataValue(this, 30));
		}
		}
	}
	
	//block gravity
	
	public boolean checkSimilar(Location l1, Location l2) {
		boolean isSim = false;
		if((((int) l1.getX())==((int) l2.getX()))&&(((int) l1.getY())==((int) l2.getY()))&&(((int) l1.getZ())==((int) l2.getZ()))) {
			isSim = true;
		}
		return isSim;
	}
	
	@EventHandler
	public void onBlockBreakedG(BlockBreakEvent event) {
		if(!worlds.contains(event.getBlock().getWorld().getName())) {
			return;
		}
		if(config.getBoolean("Enable Block Physics ")) {
		if(!(event.getPlayer().getGameMode()==GameMode.CREATIVE)) {
			if(!testGravity(event.getBlock().getLocation(), 0, 0)) {
				Location loc = event.getBlock().getLocation();
				int radius = 4;
				int cx = loc.getBlockX();
				int cy = loc.getBlockY();
				int cz = loc.getBlockZ();
				for(int x = cx - radius; x <= cx + radius; x++){
				for (int z = cz - radius; z <= cz + radius; z++){
				for(int y = (cy - radius); y < (cy + radius); y++){
				double dist = (cx - x) * (cx - x) + (cz - z) * (cz - z) + ((cy - y) * (cy - y));

					if(dist < radius * radius){
						Location l = new Location(loc.getWorld(), x, y, z);
						if((!(isAir(l.getBlock().getType())))&&(!checkSimilar(l, loc))) {
							if(!testGravity(l, 0, 1)) {
								spawnRealFSand(l.add(0.5, 0, 0.5), l.getBlock().getType());
								l.getBlock().getLocation().getBlock().setType(Material.AIR);
							}
						}
					}
				}
				}
				}
			}
			}
		}
	}
	
	@EventHandler
	public void onBlockPlacedG(BlockPlaceEvent event) {
		if(!worlds.contains(event.getBlock().getWorld().getName())) {
			return;
		}
		if(config.getBoolean("Enable Block Physics ")) {
		if(!event.isCancelled()) {
			if(!(event.getPlayer().getGameMode()==GameMode.CREATIVE)) {
			if(!testGravity(event.getBlock().getLocation(), 0, 1)) {
				spawnRealFSand(event.getBlock().getLocation().add(0.5, 0, 0.5), event.getBlock().getType());
				event.setCancelled(true);
				//event.getBlock().getLocation().getBlock().setType(Material.AIR);
			}
			}
		}
		}
	}
	
	public boolean checkDowns(Location l, int safeAm) {
		boolean isTrue = true;
		for(int i = 0; i < safeAm; i++) {
			if(isAir(l.getBlock().getType())) {
				isTrue = false;
				break;
			}
			l.subtract(0, 1, 0);
		}
		return isTrue;
	}
	
	public boolean testGravity(Location l, int itercount, int type) {
		boolean isSafe = false;
		int lengthSafety = dur.lengths.get("" + l.getBlock().getType());
		if(itercount >= 4 || lengthSafety==25) {
			return true;
		}
		Location checkUp = l.clone();
		boolean hasSupport = true;
		boolean hasSafety = false;
		boolean hasAir = false;
		for(int i = 0; i < lengthSafety+1; i++) {
			if(isAir(checkUp.add(0, 1, 0).getBlock().getType())) {
				hasAir = true;
				break;
			}
		}
		Location checkDown = l.clone();
		for(int i = 0; i < lengthSafety; i++) {
			if(isAir(checkDown.subtract(0, 1, 0).getBlock().getType())&&(!(testGravity(checkDown.clone().add(0, 1, 0), itercount+1, 0)))) {
				isSafe = false;
				hasSupport = false;
				break;
			}
		}
		if(hasSupport==true) {
			isSafe = true;
		}
		if(isSafe == true) {
			if(isAir(l.clone().subtract(0, 1, 0).getBlock().getType())) {
				isSafe = false;
			}
		}
		for(int i = 0; i < 4; i++) {
			Location checkSide = l.clone();
			int checkLength = 0;
			int checkDownLength = 0;
			for(int i2 = 0; i2 < lengthSafety; i2++) {
				if(i==0) {
					Location l2 = checkSide.subtract(0, 0, 1);
					if(isAir(l2.getBlock().getType())) {
						break;
					}
					if((!(isAir(l2.clone().subtract(0, 1, 0).getBlock().getType())))) {
						if(checkDowns(l2.subtract(0, 1, 0), checkLength)) {
							isSafe = true;
							hasSafety = true;
							break;
						}
					}
					else {
						checkLength++;
					}
				}
				if(i==1) {
					Location l2 = checkSide.add(0, 0, 1);
					if(isAir(l2.getBlock().getType())) {
						break;
					}
					if(isAir(l2.clone().subtract(0, 1, 0).getBlock().getType())==false) {
						if(checkDowns(l2.subtract(0, 1, 0), checkLength)) {
							isSafe = true;
							hasSafety = true;
							break;
						}
					}
					else {
						checkLength++;
					}
				}
				if(i==2) {
					Location l2 = checkSide.subtract(1, 0, 0);
					if(isAir(l2.getBlock().getType())) {
						break;
					}
					if(isAir(l2.clone().subtract(0, 1, 0).getBlock().getType())==false) {
						if(checkDowns(l2.subtract(0, 1, 0), checkLength)) {
							isSafe = true;
							hasSafety = true;
							break;
						}
					}
					else {
						checkLength++;
					}
				}
				if(i==3) {
					Location l2 = checkSide.add(1, 0, 0);
					if(isAir(l2.getBlock().getType())) {
						break;
					}
					if(isAir(l2.clone().subtract(0, 1, 0).getBlock().getType())==false) {
						if(checkDowns(l2.subtract(0, 1, 0), checkLength)) {
							isSafe = true;
							hasSafety = true;
							break;
						}
					}
					else {
						checkLength++;
					}
				}
			}
		}
		if(itercount==0&&(hasAir == true && hasSafety == false && hasSupport == false && isSafe == false)) {
			makeFallUp(l, 4, type);
			return true;
		}
		else {
			return isSafe;
		}
	}
	
	public void makeFallUp(Location l, int fallsize, int type) {
		if(type == 1) {
			spawnRealFSand(l.getBlock().getLocation().clone().add(0.5, 0, 0.5), l.getBlock().getType());
			l.getBlock().getLocation().getBlock().setType(Material.AIR);
		}
		Location l1 = l.clone();
		for(int lcount = 0; lcount < fallsize; lcount++) {
			Location l1temp = l1.add(0, 1, 0);
			if(isAir(l1temp.getBlock().getType())==false) {
					spawnRealFSand(l1temp.getBlock().getLocation().add(0.5, 0, 0.5), l1temp.getBlock().getType());
				l1temp.getBlock().getLocation().getBlock().setType(Material.AIR);
			}
			else {
				break;
			}
		}
		Location l2 = l.clone();
		for(int lcount = 0; lcount < fallsize; lcount++) {
			Location l2temp = l2.subtract(0, 1, 0);
			if(isAir(l2temp.getBlock().getType())==false) {
				spawnRealFSand(l2temp.getBlock().getLocation().add(0.5, 0, 0.5), l2temp.getBlock().getType());
				l2temp.getBlock().getLocation().getBlock().setType(Material.AIR);
			}
			else {
				break;
			}
		}
	}
	
    //

	public boolean isAir(Material m) {
		if(m == Material.AIR || m == Material.CAVE_AIR || m == Material.VOID_AIR) {
			return true;
		}
		return false;
	}
	
	public boolean isStony(Material m) {
		if(m == Material.STONE || m == Material.MOSSY_COBBLESTONE || m == Material.ANDESITE || m == Material.DIORITE || m == Material.COBBLESTONE || m == Material.GRANITE || m == Material.GRAVEL) {
			return true;
		}
		return false;
	}
	
    public void doRandomFireParticle(Location l) {
    	if(randor.nextInt(4)!=0) {
    		l.getWorld().spawnParticle(Particle.FLAME, l, 1, .5, .5, .5, 0.02);
    	}
    	else if(randor.nextInt(3)!=0) {
    		l.getWorld().spawnParticle(Particle.LAVA, l, 1, .5, .5, .5, 0.02);
    	}
    	else if(randor.nextInt(10)==0) {
    		l.getWorld().spawnParticle(Particle.CAMPFIRE_SIGNAL_SMOKE, l, 1, .5, .5, .5, 0.05);
    	}
    	else {
    		l.getWorld().spawnParticle(Particle.CAMPFIRE_COSY_SMOKE, l, 1, .5, .5, .5, 0.002);
    	}
    }
	
}
