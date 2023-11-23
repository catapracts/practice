package test;

import building.Barracks;
import unit.Champion;
import unit.Halberdier;

public class BarrackCreateTest {

	public static void main(String[] args) 
	{
		Barracks b = new Barracks("Barracks");
		Champion ch = (Champion)b.create(1, "Champion");
		Halberdier h = (Halberdier)b.create(2,"Halberdier");
		
		System.out.println(b.toString());
		System.out.println(ch.toString());
		System.out.println(h.toString());

	}

}
