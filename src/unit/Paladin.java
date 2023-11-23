package unit;

import building.Building;

public class Paladin extends Unit_General
{
	//Hp = 160, AP = 14, 방어:2/3
	
	public Paladin() 
	{
		super();
	}
	
	public Paladin(String name) 
	{
		this.setMAXHP(160);
		this.setName(name);
		this.setAlive(true);
		this.setCurrentHP(this.getMAXHP());
		this.setAttackPower(14);	
	}
	
	public void attack(Unit_General u) 
	{
		if(this.getCurrentHP()>0) 
		{
			System.out.println("attack unit()\n");
			u.setCurrentHP(u.getCurrentHP()-this.getAttackPower());
			this.setCurrentHP(this.getCurrentHP()+2); //근방 +2
		}
	}
	
	public void attack(Arbalester a) 
	{
		if(this.getCurrentHP()>0) 
		{
			System.out.println("attack unit()\n");
			a.setCurrentHP(a.getCurrentHP()-this.getAttackPower());
			this.setCurrentHP(this.getCurrentHP()+3); //원방 + 3
		}
	}
	
	public void attack(Elite_Skirmisher es) 
	{
		if(this.getCurrentHP()>0) 
		{
			System.out.println("attack unit()\n");
			es.setCurrentHP(es.getCurrentHP()-this.getAttackPower());
			this.setCurrentHP(this.getCurrentHP()+3); //원방 + 3
		}
	}
	
	public void attack(Building b) 
	{
		b.setCurrentHP(b.getCurrentHP()-this.getAttackPower());
		System.out.println("attack building()\n");
	}
	
}
