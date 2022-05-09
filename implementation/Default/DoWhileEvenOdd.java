
public class DoWhileEvenOdd {

	public static void main(String[] args) {
		
		int i = 15 , sum=0;
		long prod = 1;
		
		do {
			
			if (i%2==0)
			{
				prod = prod*i;
			}
			
			else
			{
				sum = sum +i;
			}
			i++;
		   }
	  while (i<=50);
		System.out.println("Product of even Number --> =" + prod);
		System.out.println("Sum of odd Number -->" + sum);
	}

}
