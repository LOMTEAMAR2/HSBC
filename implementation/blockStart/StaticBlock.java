package blockStart;

public class StaticBlock {
	
	static int id = 66; // 11,99,55
	static
	{
		id=11;
		System.out.println("Static Block 3");
	}

	public static void main(String[] args) {
		
		System.out.println("Main method start");
		System.out.println(id); //55
		System.out.println("Main method ends");
	}
	
	static
	{
		id=99;
		System.out.println("Static Block 1");
	}
	
	static
	{
		id=55;
		System.out.println("Static Block 2");
	}
}
