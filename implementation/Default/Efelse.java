
public class Efelse {

	public static void main(String[] args) {
		
		int a=-26;
		
		if (a>0 && a%2==0)
		{
			System.out.println("Number is Positive Even");	
			}
		
		else if (a>0 && a%2!=0)
		{
			System.out.println("Number is Positive Odd");
		}
		
		else if(a<0 && a%2==0)
		{
			System.out.println("Number is Negative Even");
		}
		
		else if(a<0 && a%2!=0)
		{
			System.out.println("Number is Negative Odd ");
		}
		
		else
		{
			System.out.println("Number is Zero");
		}
		
		
	}

}
