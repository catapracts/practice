package unit;

import building.Building;

public class Elite_Skirmisher extends Unit_General
{
	//Hp = 35, AP = 3, 방어:0/0, 사거리 : 5, 궁사 추뎀 +4 창병 추뎀 +3
	
		public Elite_Skirmisher() 
		{
			super();
		}
		
		public Elite_Skirmisher(String name) 
		{
			this.setMAXHP(35);
			this.setName(name);
			this.setAlive(true);
			this.setCurrentHP(this.getMAXHP());
			this.setAttackPower(3);	
		}
		

		public void attack(Unit_General u) 
		{
			if(this.getCurrentHP()>0) 
			{
				System.out.println("attack unit()\n");
				u.setCurrentHP(u.getCurrentHP()-this.getAttackPower());
				this.setCurrentHP(this.getCurrentHP());
			}
			
		}
		
		public void attack(Building b) 
		{
			b.setCurrentHP(b.getCurrentHP()-this.getAttackPower());
			System.out.println("attack building()\n");
			
		}
		
		public void attack(Halberdier h) 
		{
			h.setCurrentHP(h.getCurrentHP()-this.getAttackPower()-3); // 창병 추뎀 +3
			System.out.println("attack Paladin()\n");
		}
		
		public void attack(Arbalester a) 
		{
			a.setCurrentHP(a.getCurrentHP()-this.getAttackPower()-4); //궁사 추뎀 +4
			System.out.println("attack Winged_Husar()\n");
		}
}
