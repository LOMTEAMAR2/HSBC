//WPTD FIND A FACTORIAL OF USER GIVER VALUE
package scannerClass;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		int num = sc.nextInt();  //3
		
		int fact=1;
		
		while(num>0)  //1>0
		{
			fact=fact*num;  // 3*2 =6
			
			num--;  //1
		}
		System.out.println("Result is--> " + fact);
	}

}
