//constructor calling statement
package constructor;

public class Demo {

	public Demo()
	{
		System.out.println("Constructor 1");
	}
	
	public Demo(int a)
	{
		System.out.println("Constructor 2");
	}
	
	public Demo(int id, String name)
	{
		this();
		System.out.println("Constructor 3");
	}
	
	public static void main(String args[])
	{
		System.out.println("method starts");
		
		Demo d1 = new Demo(100, "Labad");
		
		Demo d2 = new Demo (50);
		
		System.out.println("Method Ends");
	}
	
}
