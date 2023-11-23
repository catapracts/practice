package dmirae.starcraft.test;

import dmirae.starcraft.building.Factory;
import dmirae.starcraft.unit.Tank;



public class TankTest {
	public static void main(String[] args) {
		Factory factory=new Factory("factory");
		Tank tank1= (Tank)factory.create(1, "tank1");//return 형이 Unit 이지만 DownCasting으로 Tank로 형변환 시켜준다  
		Tank tank2= (Tank)factory.create(1, "tank2");
		
		System.out.println(factory.toString());
		System.out.println("-----------------------");
		System.out.println(tank1.toString());
		System.out.println("-----------------------");
		System.out.println(tank2.toString());
		System.out.println("-----------------------");
		

		tank1.attack(factory);
		
		tank2.setSigeMode(true);//시그모드 설정 
		tank2.attack(factory);
		System.out.println("탱크2공격"+tank2.getAttackPower());
		System.out.println("남은채력1"+factory.getCurrentHP());
		System.out.println("------ 공격 당한후------");
		System.out.println(factory.toString());
		System.out.println("-----------------------");
		System.out.println(tank1.toString());
		System.out.println("-----------------------");
		System.out.println(tank2.toString());
		System.out.println("-----------------------");
	}
}
