package scannerClass;
import java.util.Scanner;

public class MethodOfScannerClass {

	public static void main(String[] args) {
	
		Scanner st = new Scanner(System.in);
		
		System.out.println("Enter The Value");
		
		byte b1 = st.nextByte();
		short s1 = st.nextShort();
		int i = st.nextInt();
		long l1 = st.nextLong();
		float f1 = st.nextFloat();
		double d1 = st.nextDouble();
		boolean bl1 = st.nextBoolean();
		String str = st.next();
		String str1 = st.nextLine();
		char ch = st.next().charAt(0);
		
	}

}
