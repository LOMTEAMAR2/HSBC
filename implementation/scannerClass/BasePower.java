package scannerClass;

import java.util.Scanner;

public class BasePower {

	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Base Value");
		
		int num=sc.nextInt(); //5
		
		System.out.println("Enter the Power");
				
		int pow=sc.nextInt();   //2
		
		int res=1;
		
		while(pow>0)    // 2>0
		{
			res=res*num;   //res=1*5 = 5
			pow--;         //1
		}
		System.out.println("Result is --->" + res); //25
	}
}
