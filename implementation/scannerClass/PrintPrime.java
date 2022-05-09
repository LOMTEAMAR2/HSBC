// WPTD PRINT ALL THE PRIME NUMBER FROM USER GIVEN VALUE
package scannerClass;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the starting value");
		int start = sc.nextInt();
		
		System.out.println("enter the ending value");
		int end = sc.nextInt();
		
		while(start<=end)
		{
			int i=2;
			
			while(start>i)
			{
				if(start%i==0)
				{
					break;
				}
				i++;
			}
			if(start==i)
			{
				System.out.println("Prime Number  " + start);
			}
			
			start++;
		}
	}

}
