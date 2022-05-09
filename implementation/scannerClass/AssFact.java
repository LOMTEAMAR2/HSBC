package scannerClass;

import java.util.Scanner;

public class AssFact {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num= sc.nextInt();
		
		int sum=0, pow = 0;
		
		while(num>0)
		{
			int dig= num%10; // fetch the last digit
			
			sum = sum + dig; // add the last digit
			
			pow++;         // count the last digit
			
			num=num/10;      // remove the last digit
		}
		
		
		if(sum%2==0)
		{
			System.out.println("Sum is Even --->" + sum);
			int result = 1;
			
			while(pow>0)
			{
				result = result*sum;
				
				pow--;
			}
		System.out.println("Result is--> "+ result);
		}
		
		else
		{
			System.out.println("Sum is Odd --->" + sum);
			int fact = 1;
			
			while(sum>0)
			{
				fact=fact*sum;
				
				sum--;
			}
		System.out.println("Result is --> " + fact);
		}
	}

}
