public class Pokemon
	{
		int attack;
		int defense;
		int hitpoints;
		int pokeballNumber;
		String name;
		String move;
		int moveNum;
		
		public Pokemon(int atk, int def, int hp, int pballNum, String n, String m, int mn)
			{
				attack = atk;
				defense = def;
				hitpoints = hp;
				pokeballNumber = pballNum;
				name = n;
				move = m;
				moveNum = mn;
			}
		
		public int getAttack()
			{
				return attack;
			}

		public void setAttack(int attack)
			{
				this.attack = attack;
			}

		public int getDefense()
			{
				return defense;
			}

		public void setDefense(int defense)
			{
				this.defense = defense;
			}

		public int getHitpoints()
			{
				return hitpoints;
			}

		public void setHitpoints(int hitpoints)
			{
				this.hitpoints = hitpoints;
			}

		public int getPokeballNumber()
			{
				return pokeballNumber;
			}

		public void setPokeballNumber(int pokeballNumber)
			{
				this.pokeballNumber = pokeballNumber;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}
//This isn't working at home.
		
	} 