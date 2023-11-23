package building;

import unit.Unit_General;
import unit.Champion;
import unit.Halberdier;

public class Barracks extends Create
{
	//HP : 2100, 근방 : 3, 원방 : 10
	public Barracks(String name) 
	{
		this.setMAXHP(2100);
		this.setName(name);
		this.setDestroyed(true);
		this.setCurrentHP(this.getMAXHP());
	}
	
	public Unit_General create(int menu,String name) 
	{
		System.out.println("create()\n");
		if(menu==1) 
			return new Champion(name);
		else if(menu==2)
			return new Halberdier(name);
		else
			return null;
	}

}
