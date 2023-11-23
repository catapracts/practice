package unit;

import building.Building;

public class Winged_Husar extends Unit_General
{
	//Hp = 80, AP = 9, 방어:1/2
	
	public Winged_Husar() 
	{
		super();
	}
	
	public Winged_Husar(String name) 
	{
		this.setMAXHP(80);
		this.setName(name);
		this.setAlive(true);
		this.setCurrentHP(this.getMAXHP());
		this.setAttackPower(9);	
	}
	

	public void attack(Unit_General u) 
	{
		if(this.getCurrentHP()>0) 
		{
			System.out.println("attack unit()\n");
			u.setCurrentHP(u.getCurrentHP()-this.getAttackPower());
			this.setCurrentHP(this.getCurrentHP()+1); //근방 +1
		}
		
	}
	
	public void attack(Arbalester a) 
	{
		if(this.getCurrentHP()>0) 
		{
			System.out.println("attack unit()\n");
			a.setCurrentHP(a.getCurrentHP()-this.getAttackPower());
			this.setCurrentHP(this.getCurrentHP()+2); //원방 + 2
		}
	}
	
	public void attack(Elite_Skirmisher es) 
	{
		if(this.getCurrentHP()>0) 
		{
			System.out.println("attack unit()\n");
			es.setCurrentHP(es.getCurrentHP()-this.getAttackPower());
			this.setCurrentHP(this.getCurrentHP()+2); //원방 + 2
		}
	}
	
	public void attack(Building b) 
	{
		b.setCurrentHP(b.getCurrentHP()-this.getAttackPower());
		System.out.println("attack building()\n");
		
	}
	
}
