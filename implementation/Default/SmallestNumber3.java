
public class SmallestNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45, b=60, c=80;
		
		int res = a < b ? ( a < c ? a : c) : ( b < c ? b : c);
		
		System.out.println("Smallest Number is " + res);
		
	}

}
