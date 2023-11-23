package building;

import unit.Unit_General;
import unit.Arbalester;
import unit.Elite_Skirmisher;


public class Archery_Range extends Create
{
	
	//HP : 2100, 근방 : 3, 원방 : 10
	public Archery_Range(String name) 
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
			return new Arbalester(name);
		else if(menu==2)
			return new Elite_Skirmisher(name);
		else
			return null;
	}
}
