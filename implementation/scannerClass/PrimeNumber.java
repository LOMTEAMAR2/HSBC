package scannerClass;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int num = sc.nextInt();  //5
		
		int i=2;
		
		while(num>i)  // 5>5
		{
		
		if(num%i==0) //5%==0 TRUE
		{
			break;
		}
		
		i++;  // 5
		}
		
		if(num==i)
		{
			System.out.println("Prime Number");
		}
		
		else
		{
			System.out.println(" Not a Prime Number");
		}
		
		
	}

}
