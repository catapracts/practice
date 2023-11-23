package unit;

import building.Building;

public class Halberdier extends Unit_General
{	
	//Hp = 60, AP = 6, 기병 추뎀:32, 방어:0/0, 건물 추뎀 +1
	
	public Halberdier() 
	{
		super();
	}
	
	public Halberdier(String name) 
	{
		this.setMAXHP(60);
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
		b.setCurrentHP(b.getCurrentHP()-this.getAttackPower()-1); //건물 추뎀 +1
		System.out.println("attack building()\n");
	}
	
	public void attack(Paladin p) 
	{
		p.setCurrentHP(p.getCurrentHP()-this.getAttackPower()-32);
		System.out.println("attack Paladin()\n");
	}
	
	public void attack(Winged_Husar wh) 
	{
		wh.setCurrentHP(wh.getCurrentHP()-this.getAttackPower()-32);
		System.out.println("attack Winged_Husar()\n");
	}

}
