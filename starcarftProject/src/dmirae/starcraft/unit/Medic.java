package dmirae.starcraft.unit;

public class Medic extends Human {
	
	
	
	public Medic(String name) {
		this.setAttackPower(0);
		this.setMAXHP(40);
		this.setName(name);
		this.setAlive(true);
		this.setCurrentHP(this.getMAXHP());
		this.setHealPower(100);
	}
	public Medic(String name,int x,int y) {
		this.setX(x);
		this.setY(y);
		this.setAttackPower(0);
		this.setMAXHP(40);
		this.setName(name);
		this.setAlive(true);
		this.setCurrentHP(this.getMAXHP());
		this.setHealPower(100);
	}
	
	public void heal() {
		System.out.println("heal");
		this.setCurrentHP(this.getCurrentHP()+10);
		this.setHealPower(this.getHealPower()-1);
		if(this.getCurrentHP()>this.getMAXHP()) {
			this.setCurrentHP(this.getMAXHP());
		}
	}
	public void charge() {
		System.out.println("charge()\n");
		this.setHealPower(100);
	}
}
