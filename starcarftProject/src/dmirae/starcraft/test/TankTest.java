package dmirae.starcraft.test;

import dmirae.starcraft.building.Factory;
import dmirae.starcraft.unit.Tank;



public class TankTest {
	public static void main(String[] args) {
		Factory factory=new Factory("factory");
		Tank tank1= (Tank)factory.create(1, "tank1");//return ���� Unit ������ DownCasting���� Tank�� ����ȯ �����ش�  
		Tank tank2= (Tank)factory.create(1, "tank2");
		
		System.out.println(factory.toString());
		System.out.println("-----------------------");
		System.out.println(tank1.toString());
		System.out.println("-----------------------");
		System.out.println(tank2.toString());
		System.out.println("-----------------------");
		

		tank1.attack(factory);
		
		tank2.setSigeMode(true);//�ñ׸�� ���� 
		tank2.attack(factory);
		System.out.println("��ũ2����"+tank2.getAttackPower());
		System.out.println("����ä��1"+factory.getCurrentHP());
		System.out.println("------ ���� ������------");
		System.out.println(factory.toString());
		System.out.println("-----------------------");
		System.out.println(tank1.toString());
		System.out.println("-----------------------");
		System.out.println(tank2.toString());
		System.out.println("-----------------------");
	}
}
