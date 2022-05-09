package blockStart;

public class NSEarth {

	static
	{
		System.out.println("static one");
	}
	
	public static void main(String args[])
	{
		System.out.println("Main Method Start");
		
		new NSEarth();
		
		new NSEarth();
		
		System.out.println("Main Method Ends");
		
	}
	
	{
		System.out.println("Non Static block one");
	}
	
	{
		System.out.println("Non Static block two ");
	}
}
