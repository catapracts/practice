package test;

import building.Cavalry_Center;
import unit.Paladin;
import unit.Winged_Husar;

public class CavalryCenterCreateTest {

	public static void main(String[] args) 
	{
		Cavalry_Center C = new Cavalry_Center("Cavalry_Center");
		Paladin p = (Paladin)C.create(1, "Paladin");
		Winged_Husar wh = (Winged_Husar)C.create(2,"Elite_Skirmisher");
		
		System.out.println(C.toString());
		System.out.println(p.toString());
		System.out.println(wh.toString());

	}

}
