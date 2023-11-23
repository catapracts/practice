package dmirae.starcraft.test;

import dmirae.starcraft.unit.Marine;
import dmirae.starcraft.unit.Medic;
import dmirae.starcraft.unit.Tank;

public class MedicTest {
	public static void main(String[] args) {
		Marine m = new Marine("marine");
		Medic mc = new Medic("medic");
		Tank t = new Tank("tank");
		System.out.println(m.toString());
		System.out.println(mc.toString());
		System.out.println(t.toString());
		System.out.println("------공격 테스트------\n");
		t.attack(m);
		System.out.println(m.toString());
		System.out.println(mc.toString());
		System.out.println(t.toString());
		System.out.println("------치료 테스트------\n");
		m.heal();
		System.out.println(m.toString());
		System.out.println(mc.toString());
		t.setSigeMode(true);
		System.out.println(t.toString());
	}
}
