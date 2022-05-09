
public class Largest4Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 45, b=60, c=70, d=80;
	//                                  true						false	
		int result = a>b ? ( a>c?(a>d?a:d):(c>d? c :d)) : (b>c?(b>d?b:d):(c>d?c:d));
	//								t			f					t		f
		System.out.println("Largest number is :" + result );
	}

}
