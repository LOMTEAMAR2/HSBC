//WPTD PRINT ALL THE EVEN NUM FROM USER GIVEN RANGE BY USING METHOD
package methodStart;

import java.util.Scanner;

public class PrintEvenByMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the START value");
		int a = sc.nextInt(); //10

		System.out.println("Enter the End value");
		int z = sc.nextInt();  //20

		while(a<=z)   //12<=20
		{
			even(a);  //even(12)

			a++; // 13
		}
	}

	public static void even(int b)  //int b =12
	{
		if(b%2==0)      //12%2==0 ---> true
			System.out.println("Even Number " + b);
	}

}
