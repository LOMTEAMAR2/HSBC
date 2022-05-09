
public class LargestNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 45, b = 89, c = 1111;
		
		int res = a > b ? ( a > c ? a : c) : (b > c ? b : c);
		
		System.out.println("Largest Number is " + res);
	}

}
