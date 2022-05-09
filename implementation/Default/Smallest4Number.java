
public class Smallest4Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 25, b = 60, c = 80 , d=90;
		
		int i = a<b?(a<c?(a<d ? a: d):(c<d?c:d)) : b<c?(b<d?b:d):(c>d?c:d);
		System.out.println("Smallest Number is:" + i);
	}

}
