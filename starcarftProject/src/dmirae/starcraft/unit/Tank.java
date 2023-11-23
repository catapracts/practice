package dmirae.starcraft.unit;

import dmirae.starcraft.building.Building;
import dmirae.starcraft.building.Mechine;

public class Tank extends Mechine implements ChangeMode {
	private boolean sigeMode;
	public boolean isSigeMode() {
		return sigeMode;
	}

	public void setSigeMode(boolean sigeMode) {
		this.sigeMode = sigeMode;
	}
	public Tank(String name) {
		this.setMAXHP(200);
		this.setName(name);
		this.setCurrentHP(this.getMAXHP());
		this.setAttackPower(10);
		this.sigeMode=false;
	}
	public Tank(String name,int x,int y) {
		this.setMAXHP(200);
		this.setX(x);
		this.setY(y);
		this.setName(name);
		this.setCurrentHP(this.getMAXHP());
		this.setAttackPower(10);
		this.sigeMode=false;
	}
	public void attack(Unit u) {
		System.out.println("attack() unit\n");
		
		if(this.getCurrentHP()>0) {
			this.setCurrentHP(this.getCurrentHP()-1);
			u.setCurrentHP(u.getCurrentHP()-this.getAttackPower());
		}
	}
	public void attack(Building b) {
	
		
		if(this.isSigeMode()==true) {
			this.setAttackPower(20);
			b.setCurrentHP(b.getCurrentHP()-(this.getAttackPower()));
			
		}else {
			this.setAttackPower(10);
			b.setCurrentHP(b.getCurrentHP()-this.getAttackPower());
			
		}
		
	}
	public void changeMode() {
		System.out.println("changeMode()\n");
		if(this.sigeMode==true) {
			this.sigeMode=false;
		}else {
			this.sigeMode=true;
		}
	}
	public void repair() {
		this.setCurrentHP(100);
		if(this.getCurrentHP()>this.getMAXHP()) {
			this.setCurrentHP(this.getMAXHP());
			//���� 100�� �߰������� ����µ� Ǯ�Ǻ��ٳ����� Ǯ�Ƿ� ������ش� 
		}
	}
	public String toString(){
		return "�̸� : " + this.getName()+"\n"+
				"�������� : " + this.isAlive()+"\n"+
				"�ִ�ü�� : " + this.getMAXHP()+"\n"+
				"����ü�� : " + this.getCurrentHP()+"\n"+
				"���ݷ� : " + this.getAttackPower()+"\n"+
				"�ñ׸�� : " + this.isSigeMode()+"\n"										;
	}
	

}
