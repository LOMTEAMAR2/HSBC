//WPTD CHECK THE USER ENTERED NUMBER IS PRIME PALINDROME OR NOT BY USING METHODS
package methodStart;

import java.util.Scanner;

public class CheckPrimePalindromeByUsingMethod {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		int num = sc.nextInt();
		palindrome(num);
		prime(num);
		
	}
	//------------------------------------------------------------------------
	
	public static void palindrome(int a)
	{
		int num = a;
		int temp=num;
		int rev = 0;
		while(num>0)
		{
			int dig=num%10;
			rev=(rev*10)+dig;
			num=num/10;
		}
		if(rev==temp)
		{
			System.out.println("Palindrome---> " + temp );
			//prime(rev);
		}
		else
		{
			System.out.println("Not a Palindrome---->" + temp);
		}
	}
	//-------------------------------------------------------------------------------
	public static void prime(int a)
	{
		int i = 2;
		while(a>i)
		{
			if(a%i==0)
			{
				break;
			}
			i++;
		}
		if(a == i)
		{
			System.out.println("Prime Number--->" + a);
		}
		else
		{
			System.out.println("Not a Prime Number--> " + a );
		}
	}
}
