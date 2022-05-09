
public class EvenOddWithAnotherLogic {

	public static void main(String[] args) {
		int num=25;
		
		if (num%2==0)
		{
			if(num>0) //Even Part
			{
				System.out.println("Positive Even"); //false
			}
			
			else if(num<0)
			{
				System.out.println("Negative Even");
			}
			
			else {
				System.out.println("Zerooooo");
			}
		}
		
		else {
			if(num>0)
			{
				System.out.println("Positive Odd");
			}
			else 
			{
				System.out.println("Negative Odd");
			}
		}
	}

}
