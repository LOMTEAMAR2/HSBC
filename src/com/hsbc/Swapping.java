// 20. Java program to swap of two number
package com.hsbc;

public class Swapping {

	public static void main(String[] args) {
	
		int a = 100, b=50;
		
		System.out.println("before swaping a=" +a + " b=" +b);
	
		//int temp = a;  //temp=50
			
		//a = b;         //a=100
		
		//b = temp;			//b=50
		
		
		//-------------------Without taking extra variable
		
		a=a+b;  //a=100+50 = 150
		
		b=a-b;  // b=150-50 = 100  b=100
		
		a=a-b;  // b= 150-100 = 100  a=100
		
		System.out.println("After swaping a=" + a + " b=" + b);

	}

}
