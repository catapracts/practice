package dmirae.starcraft.building;

public class Building {
	private int x;
	private int y;
	private String name;
	private boolean destroyed;
	private int currentHP;
	private int MAXHP;
	
	public void destroy() {
		System.out.println("destroy\n");
		if(this.currentHP<=0) {
			this.destroyed=false;
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isDestroyed() {
		return destroyed;
	}
	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}
	public int getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	public int getMAXHP() {
		return MAXHP;
	}
	public void setMAXHP(int mAXHP) {
		MAXHP = mAXHP;
	}
}
