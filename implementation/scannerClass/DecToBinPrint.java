//WPTD PRINT ALL THE BINARY VALUE FROM USER GIVEN RANGE
package scannerClass;
import java.util.Scanner;

public class DecToBinPrint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Value");
		int start = sc.nextInt();
		
		System.out.println("Enter the Ending value");
		int end = sc.nextInt();
		
		while(start<=end)
		{
			String res = "";
			
			int num=start;
			
			while(num>0)
			{
				int dig = num%2;
				
				res = dig + res;
				
				num = num/2;
			}
			
			System.out.println(start+"---->  Result ------> " + res);
			
			start++;
		}
	}

}
