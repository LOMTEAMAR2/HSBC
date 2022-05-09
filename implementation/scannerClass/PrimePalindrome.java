// WATD CHECK THE NUMBER IS PRIME PALINDROME OR NOT
package scannerClass;
import java.util.Scanner;

public class PrimePalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value");
		int num = sc.nextInt();
		int temp=num;
		int rev=0;
		
		while(num>0)
		{
			int dig = num%10;
			
			rev = (rev*10) + dig;
			
			num = num/10;
		}
		if(temp==rev)
		{
			int i =2;
			
			while(rev>i)
			{
				if(rev%i==0)
				{
					break;
				}
				i++;
			}
			
			if(rev==i)
			{
				System.out.println("Prime Palindrome");
			}
			else
			{
				System.out.println("Not a Prime Palindrome");
			}
		}
		else 
		{
			System.out.println("Not a Prime Palindrome");
		}
	}

}
