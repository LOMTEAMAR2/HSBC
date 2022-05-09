package nonStaticMethod;

public class Earth {

	public static void main(String[] args) {
		
		Earth.run();  //calling static method
	
		Earth e1 = new Earth();  //object
		e1.add();				// calling non static method
		
		Moon.run();				// calling static method of different class
		
		Moon m1 = new Moon(); 	//object
		m1.add();				//calling non static method of different class 				
		
	}
	
	public void add()			// non  static method
	{
		System.out.println("Adding Earth");
		test();                 // calling non static method
		run();					//calling static method
		
		Moon m1 = new Moon(); 	//object
		m1.add();				//calling non static method of different class 	
	}
	
	public void test()			// non static method
	{
		System.out.println("testing Earth");
	}
	
	public static void run()
	{
		System.out.println("Running Earth");
	}

}
