package pixelmon.enums;

import pixelmon.config.IDListTrainer;
import pixelmon.config.PixelmonEntityList.ClassType;

public enum EnumPokemon {
	Abra("Abra", ClassType.Pixelmon),
	Arcanine("Arcanine", ClassType.Pixelmon),
	Arbok("Arbok", ClassType.Pixelmon),
	Beedrill("Beedrill", ClassType.Pixelmon),
	Blastoise("Blastoise", ClassType.Pixelmon),
	Bulbasaur("Bulbasaur", ClassType.Pixelmon),
	Butterfree("Butterfree", ClassType.Pixelmon),
	Camerupt("Camerupt", ClassType.Pixelmon),
	Caterpie("Caterpie", ClassType.Pixelmon),
	Charizard("Charizard", ClassType.Pixelmon),
	Charmander("Charmander", ClassType.Pixelmon),
	Charmeleon("Charmeleon", ClassType.Pixelmon),
	Cubone("Cubone", ClassType.Pixelmon),
	Diglett("Diglett", ClassType.Pixelmon),
	Dragonair("Dragonair", ClassType.WaterPixelmon),
	Dratini("Dratini", ClassType.WaterPixelmon),
	Drowzee("Drowzee", ClassType.Pixelmon),
	Dugtrio("Dugtrio", ClassType.Pixelmon),
	Eevee("Eevee", ClassType.Pixelmon),
	Ekans("Ekans", ClassType.Pixelmon),
	Electrode("Electrode", ClassType.Pixelmon),
	Flareon("Flareon", ClassType.Pixelmon),
	Flygon("Flygon", ClassType.Pixelmon),
	Gastly("Gastly", ClassType.Pixelmon),
	Geodude("Geodude", ClassType.Pixelmon),
	Gloom("Gloom", ClassType.Pixelmon),
	Golbat("Golbat", ClassType.Pixelmon),
	Goldeen("Goldeen", ClassType.WaterPixelmon),
	Growlithe("Growlithe", ClassType.Pixelmon),
	Gyarados("Gyarados", ClassType.WaterPixelmon),
	Haunter("Haunter", ClassType.Pixelmon),
	Horsea("Horsea", ClassType.WaterPixelmon),
	Ivysaur("Ivysaur", ClassType.Pixelmon),
	Jigglypuff("Jigglypuff", ClassType.Pixelmon),
	Jolteon("Jolteon", ClassType.Pixelmon),
	Kakuna("Kakuna", ClassType.Pixelmon),
	Koffing("Koffing", ClassType.Pixelmon),
	Krabby("Krabby", ClassType.Pixelmon),
	Krokorok("Krokorok", ClassType.Pixelmon),
	Lapras("Lapras", ClassType.WaterPixelmon),
	Lunatone("Lunatone", ClassType.Pixelmon),
	Magikarp("Magikarp", ClassType.WaterPixelmon),
	Magnemite("Magnemite", ClassType.Pixelmon),
	Magneton("Magneton", ClassType.Pixelmon),
	Mankey("Mankey", ClassType.Pixelmon),
	Mareep("Mareep", ClassType.Pixelmon),
	Metapod("Metapod", ClassType.Pixelmon),
	Mew("Mew", ClassType.Pixelmon),
	Miltank("Miltank", ClassType.Pixelmon),
	NidoranMale("NidoranMale", ClassType.Pixelmon),
	Ninetales("Ninetales", ClassType.Pixelmon),
	Numel("Numel", ClassType.Pixelmon),
	Oddish("Oddish", ClassType.Pixelmon),
	Omanyte("Omanyte", ClassType.WaterPixelmon),
	Omastar("Omastar", ClassType.WaterPixelmon),
	Paras("Paras", ClassType.Pixelmon),
	Pidgey("Pidgey", ClassType.Pixelmon),
	Pikachu("Pikachu", ClassType.Pixelmon),
	Pidgeotto("Pidgeotto", ClassType.Pixelmon),
	Pidgeot("Pidgeot", ClassType.Pixelmon),
	Ponyta("Ponyta", ClassType.Pixelmon),
	Primeape("Primeape", ClassType.Pixelmon),
	Psyduck("Psyduck", ClassType.Pixelmon),
	Rattata("Rattata", ClassType.Pixelmon),
	Sandile("Sandile", ClassType.Pixelmon),
	Scyther("Scyther", ClassType.Pixelmon),
	Seaking("Seaking", ClassType.WaterPixelmon),
	Shellder("Shellder", ClassType.Pixelmon),
	Snorlax("Snorlax", ClassType.Pixelmon),
	Solrock("Solrock", ClassType.Pixelmon),
	Squirtle("Squirtle", ClassType.Pixelmon),
	Staryu("Staryu", ClassType.WaterPixelmon),
	Starmie("Starmie", ClassType.WaterPixelmon),
	Tentacool("Tentacool", ClassType.WaterPixelmon),
	Trapinch("Trapinch", ClassType.Pixelmon),
	Venusaur("Venusaur", ClassType.Pixelmon),
	Vaporeon("Vaporeon", ClassType.Pixelmon),
	Vibrava("Vibrava", ClassType.Pixelmon),
	Voltorb("Voltorb", ClassType.Pixelmon),
	Vulpix("Vulpix", ClassType.Pixelmon),
	Wartortle("Wartortle", ClassType.Pixelmon),
	Weedle("Weedle", ClassType.Pixelmon),
	Weezing("Weezing", ClassType.Pixelmon),
	Wigglytuff("Wigglytuff", ClassType.Pixelmon),
	Zubat("Zubat", ClassType.Pixelmon);

	private EnumPokemon(String name, ClassType type){
		this.name = name; this.type = type;
	}
	public String name;
	public ClassType type;
	public static boolean hasPokemon(String evolveTo) {
		for (EnumPokemon e: values()){
			if (e.name.equalsIgnoreCase(evolveTo)) return true;
		}
		return false;
	}
}
