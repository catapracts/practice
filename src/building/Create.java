package building;

import unit.Unit_General;

public abstract class Create extends Building
{
	
	private boolean status;
	
	
	public String toString()
	{
		return "이름 : " + this.getName()+"\n"+
				"생존여부 : " + this.isDestroyed()+"\n"+
				"최대체력 : " + this.getMAXHP()+"\n"+
				"현재체력 : " + this.getCurrentHP()+"\n";
	}
	
	public boolean isStatus() 
	{
		return status;
	}

	public void setStatus(boolean status) 
	{
		this.status = status;
	}

	public abstract Unit_General create(int menu,String name);//생산추상 
	
}
