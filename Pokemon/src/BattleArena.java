
public class BattleArena
	{
		static Pokemon currentPokemon;
		
		public static void main (String[]args)
			{	
				WildPokemon.fillwildPokemon();
				System.out.println("Hello trainer!");
				System.out.println("You will adventure into the wild and fight a wild pokemon.");
				choosePokemon();
			}
				
		public static void choosePokemon()
			{
				int dieRoll1;
				
				dieRoll1 = (int)(Math.random()*6);
				
				currentPokemon = WildPokemon.wildPokemon.get(dieRoll1);
				
					if (dieRoll1== 1)
						System.out.println("A wild " + currentPokemon.getName() + " appeared!");
					
					else if (dieRoll1 == 2)
						System.out.println("A wild " + currentPokemon.getName() + " appeared!");
					
					else if (dieRoll1 == 3)
						System.out.println("A wild " + currentPokemon.getName() + " appeared!");
					
					else if (dieRoll1 == 4)
						System.out.println("A wild " + currentPokemon.getName() + " appeared!");
					
					else if (dieRoll1 == 5)
						System.out.println("A wild " + currentPokemon.getName() + " appeared!");

					else if (dieRoll1 == 6)
						System.out.println("A wild " + currentPokemon.getName() + " appeared!");
					
			}
		
	}
