package dmirae.starcraft.unit;

public abstract class Human extends Unit{
	private int healPower;
	public int getHealPower() {
		return healPower;
	}
	public void setHealPower(int healPower) {
		this.healPower = healPower;
	}
	public abstract void heal() ; //�߻����� heal �޼��� ������� 
}
