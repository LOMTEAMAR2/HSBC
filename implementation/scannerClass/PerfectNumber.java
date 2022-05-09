//WAPTD PERFECT NUMBER

// THE SUM OF NUMBER WHICH IS DIVISIBLE IT'S FACTOR
package scannerClass;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();  //2
		
		int i = 1; 
		
		int sum=0;
		
		while(num>i)   
		{
			if(num%i==0) 
			{
				sum=sum+i;  
			}
			i++;
		}
		if(sum==num)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a perfect Number");
		}
	}

}
