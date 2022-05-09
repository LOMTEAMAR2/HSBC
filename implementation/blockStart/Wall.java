package blockStart;

public class Wall {
	
	{
		System.out.println("non static block wall");
	}
	
	static
	{
		System.out.println("Static Wall");
	}
	
	public static void main(String args[]) {
		System.out.println("main method starts");
		
		new Wall();
		new Moon();
		new Wall();
		
		System.out.println("main method ends");
	}
	

}
