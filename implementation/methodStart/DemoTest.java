//WPTD ADDITION
package methodStart;

public class DemoTest {

	public static void main(String[] args) {
		
		System.out.println("Main Method Starts");
		
		add(10,20);
		
		System.out.println("Main MEthod Ends");
	}
	
	public static void add (int a, int b)
	{
		System.out.println("Sum ---> " + (a+b));
	}

}
