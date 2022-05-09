//WAPTD NEON NUMBER

// A neon number is a number where the sum of digits of square of the number is equal to the number
// Examples: Input : 9 Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.
package scannerClass;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();   // 9
		
		int var = num*num;   //var = 9*9 = 81
		
		int sum=0;
		
		while(var>0)   // 0>0
		{
			int dig=var%10;  //dig= 8%10 = 8
			
			sum=sum+dig;  // sum = 1+8 =9 
			 
			var = var/10; // 8/10= 0
		}
		if(sum==num)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not a Neon Number");
		}
	}

}
