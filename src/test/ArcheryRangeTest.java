package test;

import building.Archery_Range;
import unit.Arbalester;
import unit.Elite_Skirmisher;

public class ArcheryRangeTest {

	public static void main(String[] args) 
	{
		Archery_Range A = new Archery_Range("Archery_Range");
		Arbalester ab = (Arbalester)A.create(1, "Arbalester");
		Elite_Skirmisher es = (Elite_Skirmisher)A.create(2,"Elite_Skirmisher");
		
		System.out.println(A.toString());
		System.out.println(ab.toString());
		System.out.println(es.toString());

	}

}
