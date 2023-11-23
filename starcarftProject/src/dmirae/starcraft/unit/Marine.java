package dmirae.starcraft.unit;

import dmirae.starcraft.building.Building;

public class Marine extends Human implements StimPack {

public Marine() {
	super();
}
public Marine(String name) {
	this.setMAXHP(100);
	this.setName(name);
	this.setAlive(true);
	this.setCurrentHP(this.getMAXHP());
	this.setAttackPower(10);	
}
public Marine(String name,int x,int y) {
	this.setMAXHP(100);
	this.setX(x);
	this.setY(y);
	this.setAlive(true);
	this.setCurrentHP(this.getMAXHP());
	this.setAttackPower(10);
}

public void stimPack() {
	System.out.println("stimPack()");
	if(this.getCurrentHP()>=10) {
		this.setAttackPower(this.getAttackPower()+10);
	}else {
		System.out.println("����Ҽ������ϴ�");
	}
}
public void attack(Unit u) {
	if(this.getCurrentHP()>0) {
		System.out.println("attack unit()\n");
		u.setCurrentHP(u.getCurrentHP()-this.getAttackPower());
		this.setCurrentHP(this.getCurrentHP()-1);
	}
	
}
public void attack(Building b) {
	b.setCurrentHP(b.getCurrentHP()-this.getAttackPower());
	System.out.println("attack building()\n");
	
}
public void heal() {
	Medic m=new Medic("Medic");//medic ��ü ����
	System.out.println("medic�� marine�� heal\n");
	this.setCurrentHP(this.getCurrentHP()+10);//Marine�� currentHP�� 10�� ����
	if(this.getCurrentHP()>this.getMAXHP()) {
		this.setCurrentHP(this.getMAXHP());
	}
	m.setHealPower(m.getHealPower()-1);//Medic ��ü�� healPower�� 1������ 
	
}





}
