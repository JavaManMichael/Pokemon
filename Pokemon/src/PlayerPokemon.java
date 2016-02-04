import java.util.ArrayList;

public class PlayerPokemon
	{
		static ArrayList <Pokemon> pokemon = new ArrayList<Pokemon>();
		
		public static void fillplayerPokemon()
			{
				pokemon.add(new Pokemon (30,41,38,1,"Zigzagoon","Super Fang", 10));
				pokemon.add(new Pokemon (80,100,40,2,"Geodude","Rock Throw",5));
				pokemon.add(new Pokemon (50,45,40,3,"Natu","Flail",10));
				pokemon.add(new Pokemon (52,43,39,4,"Charmander","Bite",25));
				pokemon.add(new Pokemon (45,40,40,5,"Pidgey","Tackle",15));
				pokemon.add(new Pokemon (45,35,40,6,"Treecko","Pound",20));
			}


	}
