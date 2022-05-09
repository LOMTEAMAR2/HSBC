//WPTD COUNT THE PRIME NUMBER FROM USER GIVEN RANGE AND CHECK THE COUNT IS PRIME OR NOT
package methodStart;
import java.util.Scanner;

public class CountPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value");
		int start = sc.nextInt();
		
		System.out.println("Enter the Ending value");
		int end = sc.nextInt();
		
		int count=0;
		
		while(start<=end)
		{
			boolean res =prime(start);
			
			if(res==true)
			{
				System.out.println("Prime--> " + start);
				count++;
			}
			start++;
		}
		System.out.println("Count of prime number---> " + count);
		
		boolean result = prime(count);
		
		if(result==true)
		{
			System.out.println("Count is prime number");
		}
		else
		{
			System.out.println("Count is not a prime number");
		}
		
	}
	
	public static boolean prime(int num)
	{
		int i =2;
		while(num>i)
		{
			if(num%i==0)
			{
				break;
			}
			i++;
		}
		if(num==i)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
