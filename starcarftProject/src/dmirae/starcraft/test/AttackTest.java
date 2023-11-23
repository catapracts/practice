package dmirae.starcraft.test;

import dmirae.starcraft.building.Barrack;
import dmirae.starcraft.building.Factory;
import dmirae.starcraft.unit.Marine;
import dmirae.starcraft.unit.Tank;

public class AttackTest {
	public static void main(String[] args) {
		Barrack barrack=new Barrack("Barrack");
		Factory factory=new Factory("Factory");
		
		Marine marine=(Marine)barrack.create(1, "Marine");
		Tank tank=(Tank)factory.create(1, "Tank");
		
		System.out.println(marine.toString());
		System.out.println(tank.toString());
		
		marine.attack(tank);
		System.out.println("공격당한후..");
		System.out.println(marine.toString());
		System.out.println(tank.toString());
	}
}
