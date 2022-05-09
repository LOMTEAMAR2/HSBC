package constructor;

public class ParamDemo {

	int id;
	String name;
	
	public ParamDemo(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public static void main(String args[])
	{
		ParamDemo d1 = new ParamDemo(100, "Zebra");
		
		ParamDemo d2 = new ParamDemo(200, "Cobra");
		
		System.out.println(d1.id);
		System.out.println(d1.name);
		
		System.out.println(d2.id);
		System.out.println(d2.name);
	}
}
