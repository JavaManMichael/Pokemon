
public class Pokemon
	{
		int attack;
		int defense;
		int hitpoints;
		int SpecialAttack;
		int SpecialDefense;
		int pokeballNumber;
		String name;
		
		public Pokemon(int atk, int def, int hp, int pballNum,int sa, int sd, String n)
			{
				attack = atk;
				defense = def;
				hitpoints = hp;
				SpecialAttack = sa;
				SpecialDefense = sd;
				pokeballNumber = pballNum;
				name = n;
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

		public int getSpecialAttack()
			{
				return SpecialAttack;
			}

		public void setSpecialAttack(int specialAttack)
			{
				SpecialAttack = specialAttack;
			}

		public int getSpecialDefense()
			{
				return SpecialDefense;
			}

		public void setSpecialDefense(int specialDefense)
			{
				SpecialDefense = specialDefense;
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

		
	} 