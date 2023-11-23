package dmirae.starcraft.building;

import dmirae.starcraft.unit.Marine;
import dmirae.starcraft.unit.Medic;
import dmirae.starcraft.unit.Unit;

public class Barrack extends Create   {

	
	
	public Barrack(String name) {
		this.setMAXHP(300);
		this.setName(name);
		this.setDestroyed(true);
		this.setCurrentHP(this.getMAXHP());
	}
	public Barrack(String name,int x,int y) {
		this.setX(x);this.setY(y);
		this.setMAXHP(300);
		this.setName(name);
		this.setDestroyed(true);
		this.setCurrentHP(this.getMAXHP());
	}
	
	public Unit create(int menu,String name) {
		System.out.println("create()\n");
		if(menu==1) 
			return new Marine(name);
		else if(menu==2)
			return new Medic(name);
		else
			return new SCV(name);
	}
	
	
	


	
}
