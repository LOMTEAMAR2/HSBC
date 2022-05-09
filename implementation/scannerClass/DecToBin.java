//WAPTD TO CONVET THE DECIMAL TO BINARY
package scannerClass;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the value");
		
		int num = sc.nextInt();  //10
		
		String res = "";
		
		while(num>0)    //0>0
		{
			int dig = num%2;  //1%2 = 1;
			
			res=dig+res;  //res=1+"010" = "1010"
			
			num=num/2; //num = 1/2=0
		}
		
		System.out.println("Binary Equivalent " + res);
	}

}
