//WPTD EVEN NUMBER FORM USER GIVEN RANGE
package methodStart;

public class EvenOddUsingMethods {

	public static void main(String[] args) {
	
	System.out.println("Main Method Starts");
	
	even(10);
	even(11);
	even(9);
		
	System.out.println("Main Method Ends");
	
	}
	
	public static void add(int a, int b)
	{
		System.out.println("Sum--> " + (a+b));
	}
	
	public static void even(int a)
	{
		if(a%2==0)
			System.out.println("Even Number " + a );
		else
			System.out.println("Odd Number  " + a);
		
	}

}
