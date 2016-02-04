import java.util.ArrayList;

public class WildPokemon
	{
		static ArrayList <Pokemon> wildPokemon = new ArrayList<Pokemon>();
		
		public static void fillwildPokemon()
			{
				wildPokemon.add(new Pokemon (45,45,55,1,"Wooper","TailWhap", 10));
				wildPokemon.add(new Pokemon (80,100,40,2,"Meditite","Kick",10));
				wildPokemon.add(new Pokemon (50,45,40,3,"Roselia","Flick Posion",15));
				wildPokemon.add(new Pokemon (52,43,39,4,"Marill","Jump On",5));
				wildPokemon.add(new Pokemon (45,40,40,5,"Spearow","Spearhead",20));
				wildPokemon.add(new Pokemon (1,1,1,6,"Magikarp","Pound",20));
			}
	}
