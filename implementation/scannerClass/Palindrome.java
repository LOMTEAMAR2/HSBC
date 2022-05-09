//CHECK THE  NUMBER IS PALINDROME OR NOT
package scannerClass;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args ) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Value");  //131
		
		int a = sc.nextInt();  
		
		int rev=0;   
		
		int temp = a; 
		
		while(a>0)  //3>0
		{
			int dig=a%10;    //3%10 = 3
			
			rev=(rev*10)+dig;   //13*10 + 3 =
			
			a=a/10;      //13/10 = 3   
		}
		
		if(rev==temp)
		{
			System.out.println("its a Palindrome  " + temp);
		}
		else
		{
			System.out.println("its not a Palindrome  " + temp);
		}
	
	}
}
