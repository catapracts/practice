package dmirae.starcraft.building;

import dmirae.starcraft.unit.Unit;

public class SCV extends Mechine{
	public SCV(String name) {
		this.setMAXHP(20);
		this.setName("SCV");
		this.setCurrentHP(this.getMAXHP());
		this.setAttackPower(2);
	}
	public SCV(String name,int x,int y) {
		this.setX(x);
		this.setY(y);
		this.setCurrentHP(this.getMAXHP());
		this.setAttackPower(2);
	}
	public void attack(Unit u) {
		if(this.getCurrentHP()>0) {
			System.out.println("attack() unit\n");
			this.setCurrentHP(this.getCurrentHP()-1);
			u.setCurrentHP(u.getCurrentHP()-this.getAttackPower());
			
		}
	}
	public void attack(Building b) {
		System.out.println("attack building()\n");
		b.setCurrentHP(b.getCurrentHP()-this.getAttackPower());
	}
	
	
}
