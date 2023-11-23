package dmirae.starcraft.unit;

import dmirae.starcraft.building.Building;
import dmirae.starcraft.building.Mechine;

public class Wraith extends Mechine implements Upgrade{
	private boolean clockingMode;
	public Wraith(String name) {
		this.setMAXHP(250);
		this.setName(name);
		this.setCurrentHP(this.getMAXHP());
		this.setAttackPower(20);//���Ƿ� ���� 
	}
	public Wraith(String name,int x,int y) {
		this.setMAXHP(250);
		this.setX(x);
		this.setY(y);
		this.setName(name);
		this.setCurrentHP(this.getMAXHP());
		this.setAttackPower(20);
	}
	public void attack(Unit u) {
		System.out.println("attack Unit()\n");
		if(this.getCurrentHP()>0) {
			this.setCurrentHP(this.getCurrentHP()-1);
			u.setCurrentHP(u.getCurrentHP()-this.getAttackPower());
		}
	}
	public void attack(Building b) {
		Tank t=new Tank("tank");
		System.out.println("attack Building()\n");
		b.setCurrentHP(b.getCurrentHP()-t.getAttackPower());//tank����� ��ŭ����
	}
	public void clockingMode(Unit u) {
		System.out.println("Clocking Mode");
		clockingMode=true;
		u.setAttackPower(0);//clocking �� �����ϴ� ������ ���ݷ��� 0 �̵ǹ��� 
	}
	
	public boolean isClockingMode() {
		return clockingMode;
	}

	public void setClockingMode(boolean clockingMode) {
		this.clockingMode = clockingMode;
	}
	public void repair() {
		this.setCurrentHP(100);
		if(this.getCurrentHP()>this.getMAXHP()) {
			this.setCurrentHP(this.getMAXHP());
		}
	}
	public void upgrade() {
		System.out.println("upgrade()\n");
		this.setAttackPower(this.getAttackPower()+100);
	}
	
}
