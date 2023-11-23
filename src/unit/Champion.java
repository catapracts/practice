package unit;

import building.Building;

public class Champion extends Unit_General
{
	Unit_General c = new Unit_General();
	//Hp = 70, AP = 13, 방어:1/1, 건물 추뎀 : 4
	
	public Champion() 
	{
		super();
	}
	
	public Champion(String name) 
	{
		this.setMAXHP(70);
		this.setName(name);
		this.setAlive(true);
		this.setCurrentHP(this.getMAXHP());
		this.setAttackPower(13);	
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
			this.setCurrentHP(this.getCurrentHP()+1); //원방 + 1
		}
	}
	
	public void attack(Elite_Skirmisher es) 
	{
		if(this.getCurrentHP()>0) 
		{
			System.out.println("attack unit()\n");
			es.setCurrentHP(es.getCurrentHP()-this.getAttackPower());
			this.setCurrentHP(this.getCurrentHP()+1); //원방 + 1
		}
	}
	
	public void attack(Building b) 
	{
		b.setCurrentHP(b.getCurrentHP()-this.getAttackPower()-4); //건물 추뎀 +4
		System.out.println("attack building()\n");
		
	}

}
