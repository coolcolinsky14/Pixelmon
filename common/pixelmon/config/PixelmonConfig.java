package pixelmon.config;

import java.io.File;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

import cpw.mods.fml.common.registry.EntityRegistry;

import pixelmon.entities.EntityTrainer;
import pixelmon.entities.pixelmon.EntityPixelmon;
import pixelmon.entities.pixelmon.EntityWaterPixelmon;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.EntityList;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EnumCreatureType;
import net.minecraftforge.common.Configuration;

public class PixelmonConfig {
	
	public static boolean isInMetric = true;
	
	public static Configuration config;
	
	public static boolean allowNonPixelmonMobs;
	
	public static int maxPokemonPerChunk=3;
	
	public static int chanceOfNoPokemon;
	
	public static int idPixelmon=200;
	public static int idPokeball=201;
	public static void loadConfig(Configuration configuration)
	{
		config = configuration;
		config.load();
		PixelmonBlocks.load(config);
		PixelmonItems.load(config);
		//IDListPixelmon.load(config);
		IDListTrainer.load(config);
		allowNonPixelmonMobs = config.getOrCreateBooleanProperty("Allow vanilla mobs", "general", false).getBoolean(false);
		maxPokemonPerChunk = config.getOrCreateIntProperty("Max number of pokemon per chunk", "general", 3).getInt(3);
		chanceOfNoPokemon = config.getOrCreateIntProperty("Percent chance of no pokemon in chunk", "general", 60).getInt(60);
		idPixelmon = config.getOrCreateIntProperty("Pixelmon ID", "IDs", 200).getInt(200);
		idPokeball = config.getOrCreateIntProperty("Pokeball ID", "IDs", 201).getInt(201);
		config.save();
		
		PixelmonItems.addNames();
		PixelmonBlocks.addNames();
		PixelmonBlocks.registerBlocks();
		PixelmonEntityList.registerEntities();
		PixelmonEntityList.addSpawns();		
	}
	
	public static void removeSpawns()
	{
		if(!allowNonPixelmonMobs)
		{
			ArrayList list = new ArrayList();
			Iterator it = EntityList.IDtoClassMapping.keySet().iterator();
			while(it.hasNext())
			{
				Integer i = (Integer)it.next(); 
				Class c1 = (Class)EntityList.IDtoClassMapping.get(i);
				if(EntityPixelmon.class.isAssignableFrom(c1) || EntityTrainer.class.isAssignableFrom(c1))
				{
					continue;
				}
				if(EntityLiving.class.isAssignableFrom(c1) && !Modifier.isAbstract(c1.getModifiers()))
				{ 
					Class<? extends EntityLiving> c3 = c1;
					int maxNonNullBiomes = 0;
					for(BiomeGenBase biome : BiomeGenBase.biomeList)
					{
						if(biome != null)
						{
							maxNonNullBiomes++;
						}
					}
					int nextBiome = 0;
					BiomeGenBase[] biomes = new BiomeGenBase[maxNonNullBiomes];
					for(BiomeGenBase biome : BiomeGenBase.biomeList)
					{
						if(biome != null)
						{
							biomes[nextBiome++] = biome;
						}
					}
					for(EnumCreatureType type : EnumCreatureType.values())
					{
						EntityRegistry.removeSpawn(c3, type, biomes);
					}
				}
			}
		}
	}
}
