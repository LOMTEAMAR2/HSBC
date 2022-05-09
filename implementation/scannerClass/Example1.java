package scannerClass;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner st = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int num = st.nextInt();
		
		for ( int i = 0; i<=num; i++ )
		{
			if(i%2==0)
			{
			 System.out.println(i);	
			}
		}
		
	}

}
