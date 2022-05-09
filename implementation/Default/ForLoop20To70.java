
public class ForLoop20To70 {

	public static void main(String[] args) {
	
		int sum=0;
		long prod =1;
		for (int i=10; i<=20; i++)
		{
			if (i%2==0)
			{
			 sum=sum+i;	
			}
			else
			{
				prod=prod*i;
			}
			
		}
		
		System.out.println("Sum of Even -->" + sum);
		System.out.println("Prod of Odd -->" + prod);
	}

}
