package dmirae.starcraft.building;

public class Bunker extends Mechine {
	private int maxCnt;
	private int currentCnt=4;
	
	public Bunker(String name) {
		this.setMAXHP(200);
		this.setDestroyed(true);
		this.setName(name);
		this.setCurrentHP(this.getMAXHP());
	}
	public Bunker(String name,int x,int y) {
			this.setX(x);this.setY(y);
			this.setDestroyed(true);
			this.setName(name);
			this.setCurrentCnt(this.getMAXHP());
	}
	public void enter(int cnt) {
		System.out.println("enter()\n");
		this.maxCnt+=cnt;
		if(this.maxCnt>this.currentCnt) {
			this.currentCnt=this.maxCnt;//초과되면 최대인원수로 변경
		}
	}
	public void comeout() {
		System.out.println("comeout()\n");
		this.setCurrentCnt(0);//현재 탄인원 0으로 
	}
	public void upgrade() {
		System.out.println("upgrade()\n");
		this.maxCnt+=2;
		if(this.maxCnt>10) {
			this.maxCnt=10;//maxCnt를 10으로 고정 
		}
	}
	
	public int getMaxCnt() {
		return maxCnt;
	}
	public void setMaxCnt(int maxCnt) {
		this.maxCnt = maxCnt;
	}
	public int getCurrentCnt() {
		return currentCnt;
	}
	public void setCurrentCnt(int currentCnt) {
		this.currentCnt = currentCnt;
	}

	
}
