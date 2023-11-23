package building;

public class Building 
{
	private String name;
	private boolean destroyed;
	private int currentHP;
	private int MAXHP;
	
	public void destroy() 
	{
		System.out.println("destroy\n");
		if(this.currentHP<=0) 
		{
			this.destroyed=false;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public boolean isDestroyed() 
	{
		return destroyed;
	}
	
	public void setDestroyed(boolean destroyed) 
	{
		this.destroyed = destroyed;
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

}
