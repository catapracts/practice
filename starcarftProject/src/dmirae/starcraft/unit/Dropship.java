package dmirae.starcraft.unit;

import dmirae.starcraft.building.Mechine;

public class Dropship extends Mechine implements Upgrade{
	private int currentCnt=0;
	private int maxCnt=4;
	
	public Dropship(String name){
		this.setMAXHP(150);
		this.setName(name);
		this.setCurrentHP(this.getMAXHP());
		this.maxCnt=4;
	}
	public Dropship(String name,int x,int y) {
		this.setMAXHP(150);
		this.setX(x);this.setY(y);
		this.setName(name);
		this.maxCnt=4;
	}
	public void load(int cnt) {
		System.out.println("load");
		this.currentCnt+=cnt;
		if(this.currentCnt>this.getMaxCnt()) {		
			System.out.println("최대인원 초과");
		}
	}
	public void unload() {
		System.out.println("unload");
	}
	public void repair() {
		this.setCurrentCnt(this.getCurrentHP()+100);
		if(this.getCurrentHP()>this.getMAXHP()) {
			this.setCurrentCnt(this.getCurrentHP());
		}
	}
	public void upgrade() {
		this.maxCnt=2;
		if(this.maxCnt>10) {
			System.out.println("업그레이드 불가능 최대도달..");
		}
	}
	
	public int getCurrentCnt() {
		return currentCnt;
	}
	public void setCurrentCnt(int currentCnt) {
		this.currentCnt = currentCnt;
	}
	public int getMaxCnt() {
		return maxCnt;
	}
	public void setMaxCnt(int maxCnt) {
		this.maxCnt = maxCnt;
	}
}
