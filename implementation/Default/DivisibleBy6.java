//WAPTD COUNT OF NUMBER DEVISIBLE BY 6 FROM 20 TO 60.
public class DivisibleBy6 {

	public static void main(String[] args) {
		int i = 20, count=0;
		
		do {
			
			if (i%6==0)
			{
				count++; //count = count+1
			}
			i++;
		}
		
		while(i<=60);
		
		System.out.println("Result is --> " + count);
	}
	

}
