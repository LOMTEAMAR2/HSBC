package blockStart;

public class Earth {
	
	 int id = 66; 
	

	public static void main(String[] args) {
		
		System.out.println("Main method start");
		
		Earth e1 = new Earth();
		System.out.println(e1.id); //55
		System.out.println("Main method ends");
	}
	
	static
	{
		Earth e1 = new Earth();
		e1.id=55;
		System.out.println("Static Block 2 " + e1.id );
	}
	
	
}
