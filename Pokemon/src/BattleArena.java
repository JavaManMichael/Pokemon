import sun.audio.*;
import java.io.*;

public class BattleArena
	{
		static boolean isStillAwake = true;
		static Pokemon currentPokemon;
		
		public static void main (String[]args)
			{	
				WildPokemon.fillwildPokemon();
				
				System.out.println("Hello trainer!");
				
				System.out.println("You will adventure into the wild and fight a wild pokemon.");
				
				choosePokemon();
				battle();
				while(isStillAwake)
					{
				    battle();
					}
				
				
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
		
		private static void battle()
		{
			System.out.println(currentPokemon.getName() + " has " + currentPokemon.getHitpoints() + " health points and " + currentPokemon.getDefense() + " defense." );
			System.out.println("It is your turn.");
			System.out.println( );
			
			
			if(currentPokemon.getDefense() < PlayerPokemon.player.getMoveNum())
				{	
				System.out.println(PlayerPokemon.player.getName() + " used " + currentPokemon.getMove() + "!" );
				System.out.println(currentPokemon.getHitpoints() - PlayerPokemon.player.getMoveNum() + " HitPoints are left for " + currentPokemon.getName());
				System.out.println( );
				}
			
			else
				{
				WildPokemon.wildPokemon.get( currentPokemon.getPokeballNumber()-1 ).setHitpoints(currentPokemon.getHitpoints()-1);
				WildPokemon.wildPokemon.get( currentPokemon.getPokeballNumber()-1 ).setDefense(currentPokemon.getDefense()-1);
				}
			
			System.out.println(currentPokemon.getName() + " now has " + currentPokemon.getHitpoints() + " HP and " + currentPokemon.getDefense() + " defense.");
		
			System.out.println("It is now " + currentPokemon.getName() + "'s turn. ");
			
			System.out.println("You have " + PlayerPokemon.player.getHitpoints() + " HP and " + PlayerPokemon.player.getDefense() + " defense.");
			
			System.out.println( );
			
			if(PlayerPokemon.player.getDefense() < currentPokemon.getMoveNum())
				{	
				System.out.println(currentPokemon.getName() + " used " + currentPokemon.getMove() + "!" );
				System.out.println(PlayerPokemon.player.getHitpoints() - currentPokemon.getMoveNum() + " HitPoints are left for you");
				}
		
			else
				{
				PlayerPokemon.player.setHitpoints(PlayerPokemon.player.getHitpoints()-1);
				PlayerPokemon.player.setDefense((PlayerPokemon.player.getDefense()-1));
				}
			
			System.out.println("You now have " + PlayerPokemon.player.getHitpoints() + " HP and " + PlayerPokemon.player.getDefense() + " defense.");
			
			if(isStillAwake = PlayerPokemon.player.getHitpoints() <= 0 )
				{
					System.out.println(currentPokemon.getName() +" won the game!");
					isStillAwake = false;
				}
			else if(currentPokemon.getHitpoints() <= 0 )
				{
					System.out.println("You won the game!");
					isStillAwake = false;
				}
			else
				{
					isStillAwake = true;
				}
			
			
			
		}
	}
