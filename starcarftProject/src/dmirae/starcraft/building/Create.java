package dmirae.starcraft.building;

import dmirae.starcraft.unit.Unit;

public abstract class Create extends Building {
	private boolean status;
	
	
	public String toString(){
		return "이름 : " + this.getName()+"\n"+
				"생존여부 : " + this.isDestroyed()+"\n"+
				"최대체력 : " + this.getMAXHP()+"\n"+
				"현재체력 : " + this.getCurrentHP()+"\n"+
				"떠있는지 : " + this.isStatus()+"\n" ;
	}
	
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public abstract Unit create(int menu,String name);//생산추상 
	
	public void liftOff() {
		System.out.println("liftOff\n");
		this.setStatus(true);
	}
	public void land() {
		System.out.println("land\n");
		this.setStatus(false);
	}
}
