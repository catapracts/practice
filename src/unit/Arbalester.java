package unit;

import building.Building;

public class Arbalester extends Unit_General
{
	//Hp = 40, AP = 6, 방어:0/0, 사거리 : 5
	
	public Arbalester() 
	{
		super();
	}
	
	public Arbalester(String name) 
	{
		this.setMAXHP(40);
		this.setName(name);
		this.setAlive(true);
		this.setCurrentHP(this.getMAXHP());
		this.setAttackPower(6);	
	}
	

	public void attack(Unit_General u) 
	{
		if(this.getCurrentHP()>0) 
		{
			System.out.println("attack unit()\n");
			u.setCurrentHP(u.getCurrentHP()-this.getAttackPower());
			this.setCurrentHP(this.getCurrentHP());
		}
		
	}
	
	public void attack(Building b) 
	{
		b.setCurrentHP(b.getCurrentHP()-this.getAttackPower());
		System.out.println("attack building()\n");
		
	}

}
