package dmirae.starcraft.building;

import dmirae.starcraft.unit.Unit;

public abstract class Mechine extends Unit{

	public void repair() {
			this.setCurrentHP(this.getCurrentHP()+100);
			if(this.getCurrentHP()>this.getMAXHP()) {
				this.setCurrentHP(this.getMAXHP());
			}
		
	}
		
	
	
	
	
	
}
