//WPTD THE SUM OF NUMBER FROM USER GIVEN RANGE AND CHECK SUM IS EVEN OR ODD . IF IT IS EVEN PRINNT THE TABLE IF ODD PRIN THE RESULT...

package scannerClass;

import java.util.Scanner;

public class Prg3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Starting value----->");
		
		int start = sc.nextInt();  //25
		
		System.out.println("Enter the Ending value------->");
		
		int end = sc.nextInt();  //50
		
		if(start>end) //25 > 50
		{
			int temp=start;
			start=end;
			end=temp;
		}
		
		int sum=0;
		
		while(start<=end)
		{
			//System.out.println(start);
			
			sum=sum+start;
			
			start++;
		}
		
		System.out.println("Sum -->" + sum);
		
		if(sum%2==0)
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(sum + " X " + i + " = " + (sum*i));
			}
		}
		
		else
		{
			System.out.println("result is odd---> " + sum);
		}

	}

}
