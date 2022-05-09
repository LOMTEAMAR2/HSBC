package constructor;

public class Default {

	
	public Default()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String aargs[])
	{
		System.out.println("main method starts");
		
		new Default(); // calling constructor
			
		run(); // calling run method
		
		System.out.println("main method ends");
	}
	
	public static void run()
	{
		System.out.println("Running");
	}
}
