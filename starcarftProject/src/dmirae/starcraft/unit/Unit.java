package dmirae.starcraft.unit;


public class Unit {
	private int x;
	private int y;
	private String name;
	private boolean alive=true;
	private int currentHP;
	private int MAXHP;
	private int attackPower;
	
	
public void move(int x,int y) {
	System.out.println("move()\n");
	this.x=x;
	this.y=y;
}
public void stop() {//이건 특정기능 없이 
	System.out.println("stop()\n");
}
public void die() {//이것도 특정기능없이 
	
	if(this.currentHP==0) {
		this.alive=false;
		System.out.println("die()");
	}else {
		System.out.println("아직죽지 않았당");
	}
}

public String toString(){
	return "이름 : " + this.getName()+"\n"+
			"생존여부 : " + this.isAlive()+"\n"+
			"최대체력 : " + this.getMAXHP()+"\n"+
			"현재체력 : " + this.getCurrentHP()+"\n"+
			"공격력 : " + this.getAttackPower()+"\n";
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

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public boolean isAlive() {
	return alive;
}

public void setAlive(boolean alive) {
	this.alive = alive;
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

public int getAttackPower() {
	return attackPower;
}

public void setAttackPower(int attackPower) {
	this.attackPower = attackPower;
}
private boolean destroyed;
public boolean isDestroyed() {
	return destroyed;
}
public void setDestroyed(boolean destroyed) {
	this.destroyed = destroyed;
}
}
