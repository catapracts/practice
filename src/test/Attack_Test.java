package test;

import building.Barracks;
import building.Archery_Range;
import building.Cavalry_Center;
import unit.Halberdier;
import unit.Champion;
import unit.Paladin;
import unit.Elite_Skirmisher;
import unit.Arbalester;
import unit.Winged_Husar;

public class Attack_Test {

	public static void main(String[] args) 
	{
		Barracks B = new Barracks("Barracks");
		Archery_Range A = new Archery_Range("Archery_Range");
		Cavalry_Center C = new Cavalry_Center("Cavalry_Center");
		
		Elite_Skirmisher sk = (Elite_Skirmisher)A.create(2, "Elite_Skirmisher");
		Winged_Husar wh = (Winged_Husar)C.create(2, "Winged_Husar");
		
		Champion ch = (Champion)B.create(1, "Champion");
		Arbalester al = (Arbalester)A.create(1, "Arbalester");
		
		Halberdier h = (Halberdier)B.create(2, "Halberdier");
		Paladin p = (Paladin)C.create(1, "Paladin");
		
		System.out.println("================================");
		System.out.println("");
		
		System.out.println(wh.toString());
		System.out.println(sk.toString());
		
		wh.attack(sk);
		sk.attack(wh);
		
		System.out.println("공격당한후..");
		System.out.println(wh.toString());
		System.out.println(sk.toString());
		
		System.out.println("================================");
		System.out.println("");
		
		System.out.println(ch.toString());
		System.out.println(al.toString());
		
		ch.attack(al);
		al.attack(ch);

		System.out.println(ch.toString());
		System.out.println(al.toString());
		
		System.out.println("================================");
		System.out.println("");
		
		System.out.println(p.toString());
		System.out.println(h.toString());
		
		h.attack(p);
		p.attack(h);
		
		System.out.println("공격당한후..");
		System.out.println(p.toString());
		System.out.println(h.toString());
		
		System.out.println("================================");
		System.out.println("");
		/*
		System.out.println(ch.toString());
		System.out.println(B.toString());
		
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		System.out.println(B.toString());
		ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B); ch.attack(B);
		
		System.out.println("공격당한후..");
		System.out.println(ch.toString());
		System.out.println(B.toString());
		*/
	}

}
