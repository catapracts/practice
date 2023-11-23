package dmirae.starcraft.test;

import dmirae.starcraft.building.Factory;
import dmirae.starcraft.unit.Dropship;
import dmirae.starcraft.unit.Tank;

public class FactoryCreateTest {
	public static void main(String[] args) {
		Factory f=new Factory("factory");
		Tank t1=(Tank)f.create(1, "tank");
		Dropship d1=(Dropship) f.create(2, "dropship");
		System.out.println(t1.toString());
		System.out.println(d1.toString());
	}
}
