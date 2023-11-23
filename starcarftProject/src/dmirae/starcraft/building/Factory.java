package dmirae.starcraft.building;

import dmirae.starcraft.unit.Dropship;
import dmirae.starcraft.unit.Tank;
import dmirae.starcraft.unit.Unit;

public class Factory extends Create  {
	
	public Factory(String name){
		this.setMAXHP(500);
		this.setName(name);
		this.setDestroyed(true);
		this.setCurrentHP(this.getMAXHP());
	}
	public Factory(String name,int x,int y) {
		this.setX(x);
		this.setY(y);
		this.setMAXHP(500);
		this.setName(name);
		this.setDestroyed(true);
		this.setCurrentHP(this.getMAXHP());
	}
	
	public Unit create(int menu,String name) {
		if(menu==1)
			return new Tank(name);
		else
			return new Dropship(name);
	}
	
}
