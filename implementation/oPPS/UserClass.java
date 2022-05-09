package oPPS;

import java.util.Scanner;

public class UserClass {

	public static void main(String args[])
	{
		Bank b1 = new Bank();
		
		b1.setAcc(38348596233L);
		b1.setName("AMAR LOMTE");
		b1.setBal(5000);
		
		int pin = 1012;
		
		Scanner sc = new Scanner (System.in);
				
		System.out.println("Welcome to SBI");
		System.out.println("Enter the pin");
		
		int pinuser = sc.nextInt();
		
		if(pin==pinuser)
		{
			System.out.println("Welcome Mr. " + b1.getName());
			System.out.println("AccNum = " + b1.getAcc());
			System.out.println("Enter the Amount");
			int amt = sc.nextInt();
			
			if(amt<b1.getBal() && amt>0 && amt<=20000)
			{
				System.out.println("Collect Your Cash");
				System.out.println("Remaining Balance = " + (b1.getBal()-amt));
			}
			else
			{
				System.out.println("Enter Correct Amount/ Insufficient Balance");
			}
			
		}
		else
		{
			System.out.println("Entered Wrong Pins");
		}
	}
}
