//WAPD CHECK THE USER ENTER NUMBER IS PRIME NUMBER OR NOT BY USING METHOD
package methodStart;

import java.util.Scanner;

public class CheckPrimeByMethod {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int value = sc.nextInt();
		prime(value);
		}
		
	public static void prime(int a)
	{
		int i=2;
		while(a>i)
		{
			if(a%i==0)
			{
				break;
			}
			i++;
		}
	
		if(a==i)
			System.out.println("Prime Number");
		else
			System.out.println(" Not a Prime Number");
	}
}
		
		

