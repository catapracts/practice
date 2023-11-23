package dmirae.starcraft.building;

import dmirae.starcraft.unit.Unit;

public abstract class Create extends Building {
	private boolean status;
	
	
	public String toString(){
		return "�̸� : " + this.getName()+"\n"+
				"�������� : " + this.isDestroyed()+"\n"+
				"�ִ�ü�� : " + this.getMAXHP()+"\n"+
				"����ü�� : " + this.getCurrentHP()+"\n"+
				"���ִ��� : " + this.isStatus()+"\n" ;
	}
	
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public abstract Unit create(int menu,String name);//�����߻� 
	
	public void liftOff() {
		System.out.println("liftOff\n");
		this.setStatus(true);
	}
	public void land() {
		System.out.println("land\n");
		this.setStatus(false);
	}
}
