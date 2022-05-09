package oPPS;

public class Bank {

	private long accno;
	private String name;
	private int bal;
	
	public void setAcc(long accno)
	{
		this.accno=accno;
		
	}
	
	public long getAcc()
	{
		return accno;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setBal(int bal)
	{
		this.bal=bal;	
	}
	
	public int getBal()
	{
		return bal;
	}

	
	
}

	
	
