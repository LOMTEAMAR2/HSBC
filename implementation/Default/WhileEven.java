//WAPTD FIND THE SUM OF EVEN FROM 90 TO 60.

public class WhileEven {

	public static void main(String[] args) {
	
		int i=60;
		
		int sum=0;
		
		while(i<=90) //63<=90 --> TRUE
		{
			if (i%2==0)  //EVEN NUMBER //63%2==0 false
			{
				sum=sum+i; //sum=60+62 //sum=122
			}
			i++; //64
		}
		System.out.println("sum of even no is -->" + sum);
	}

}
