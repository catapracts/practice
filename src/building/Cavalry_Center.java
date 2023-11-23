package building;

import unit.Unit_General;
import unit.Paladin;
import unit.Winged_Husar;

public class Cavalry_Center extends Create
{
	public Cavalry_Center(String name) 
	{
		
		//HP : 2100, 근방 : 3, 원방 : 10
		this.setMAXHP(2100);
		this.setName(name);
		this.setDestroyed(true);
		this.setCurrentHP(this.getMAXHP());
	}
	
	public Unit_General create(int menu,String name) 
	{
		System.out.println("create()\n");
		if(menu==1) 
			return new Paladin(name);
		else if(menu==2)
			return new Winged_Husar(name);
		else
			return null;
	}
}
