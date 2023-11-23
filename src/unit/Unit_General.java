package unit;

public class Unit_General 
{

	private String name;
	private boolean alive=true;
	private int currentHP;
	private int MAXHP;
	private int ap;
	
	/*
	public static int Attack() //유닛 공격
	{
		//공격하면 상대방에게 데미지 준다.
		
		
	}
	
	public static void underAttack() //유닛 공격
	{
		//공격 받으면 상대방에게 데미지 받는다.
	}
	
	public static void generate() //유닛 생성
	{
		//유닛 생성
	}
	
	public static int HP() //유닛 HP
	{
		//유닛 체력
		
	}
	
	public static void Dead() //유닛 사망
	{
		//HP 다 달면 사망
	}
	
	*/
	
	public void die() 
	{
		
		if(this.currentHP==0) 
		{
			this.alive=false;
			System.out.println("die()");
		}
		
		else 
		{
			System.out.println("안 죽음");
		}
	}

	public String toString(){
		return "이름: " + this.getName()+"\n"+
				"생존 여부 : " + this.isAlive()+"\n"+
				"최대 체력: " + this.getMAXHP()+"\n"+
				"현재 체력 : " + this.getCurrentHP()+"\n"+
				"공격력 : " + this.getAttackPower()+"\n";
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public boolean isAlive() 
	{
		return alive;
	}

	public void setAlive(boolean alive) 
	{
		this.alive = alive;
	}

	public int getCurrentHP() 
	{
		return currentHP;
	}

	public void setCurrentHP(int currentHP) 
	{
		this.currentHP = currentHP;
	}

	public int getMAXHP() 
	{
		return MAXHP;
	}

	public void setMAXHP(int mAXHP) 
	{
		MAXHP = mAXHP;
	}

	public int getAttackPower() 
	{
		return ap;
	}

	public void setAttackPower(int attackPower) {
		this.ap = attackPower;
	}
	
	private boolean destroyed;
	
	public boolean isDestroyed() 
	{
		return destroyed;
	}
	
	public void setDestroyed(boolean destroyed) 
	{
		this.destroyed = destroyed;
	}
		

}
