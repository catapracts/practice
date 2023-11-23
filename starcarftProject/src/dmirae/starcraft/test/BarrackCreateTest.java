package dmirae.starcraft.test;

import dmirae.starcraft.building.Barrack;
import dmirae.starcraft.building.SCV;
import dmirae.starcraft.unit.Marine;
import dmirae.starcraft.unit.Medic;

public class BarrackCreateTest {
	public static void main(String[] args) {
		Barrack b=new Barrack("Barrack");
		Marine marine=(Marine)b.create(1, "Marine");
		Medic medic=(Medic)b.create(2,"Medic");
		SCV scv=(SCV)b.create(3, "SCV");
		
		System.out.println(b.toString());
		System.out.println(marine.toString());
		System.out.println(scv.toString());
		
		System.out.println("---- ÀÌ·úÅ×½ºÆ®----");
		System.out.println(b.toString());
		b.liftOff();
		System.out.println(b.toString());
		b.land();
		System.out.println(b.toString());
	}
}
