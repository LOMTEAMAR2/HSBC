//WPTD PRINT THE PRIME NUMBER FROM USER GIVEN RANGE BY USING METHOD
package methodStart;

import java.util.Scanner;

public class PrintPrimeNumberByUsingMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting value");
		int start = sc.nextInt();
		
		System.out.println("Enter the Ending Value");
		int end = sc.nextInt();
		
		while(start<=end)
		{
			prime(start);
			
			start++;
		}
	}
	
//--------prime number method-------///
	private static void prime(int a) {
		
		int i = 2;
		
		while(a>i)
		{
			if(a%i==0)
			{
				break;
			}
			i++;
			
			if(a==i)
				System.out.println("Prime Number ----> " +a);
		}
	}

	
}
