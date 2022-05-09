package methodStart;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Clipkart");
		System.out.println("Enter 1 for cash on Delivery");
		System.out.println("Enter 2 for Credit Card");
		System.out.println("Enter 3 for Upi");
		System.out.println("Enter 4 for NetBanking");
		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		
		if(opt==1)
		{
			ClipKart.payment();
		}
		
		else if(opt==2)
		{
			System.out.println("Enter valid Card Number");
			long card = sc.nextLong();
			
			System.out.println("Enter CVV");
			int cvv = sc.nextInt();
			
			System.out.println("Enter Expiry Date");
			String exp = sc.next();
			
			ClipKart.payment(card, cvv, exp);
		}
		
		else if(opt==3)
		{
			System.out.println("Enter UPI ID");
			String upi = sc.next();
			
			ClipKart.payment(upi);
		}
		
		else if(opt==4)
		{
			System.out.println("Enter Username");
			String user = sc.next();
			
			System.out.println("Enter Password");
			String pass = sc.next();
			
			ClipKart.payment(user,pass);
		}
		
		else
		{
			System.out.println("Enter Valid Input");
		}
		
	}

}

