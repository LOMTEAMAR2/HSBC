//WPTD ARMSTRONG NUMBER
//if the sum of its own digits raised to the power number of digits gives the number itself

package scannerClass;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the value");
		int num= sc.nextInt();  //9
		
		int temp = num;  //9
		
		int count = 0;
		
		while(num>0)  //9>0
		{
			count++;   // count digit  
			num=num/10; // remove the digit
		}
		num = temp;
		 
		int sum = 0;
		
		while(num>0)  //separate the digit
		{
			int pow = count;
			int res = 1;
			int dig = num%10;  //fetch the last digit
			
			while(pow>0)  //find the power
			{
				res=dig*res;
				pow--;
			}
			
			sum=sum+res;  // add the result of power
			
			num=num/10;
		}
		
		if(sum==temp)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
		
		
	}

}
