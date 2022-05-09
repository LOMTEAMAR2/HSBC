package keyword;

public class Earth {

	int eid = 200;   // non static GV
	
	public static void main(String args[])
	{
		int eid = 99;
		
		Earth e2 = new Earth();
		System.out.println(e2);
		
		Earth e3 = new Earth();
		System.out.println(e3);
		
		e3.run();
	}
	
	public void run() {
		int eid = 66;
		
		System.out.println(this);
		System.out.println(this.eid);
		System.out.println(eid);
	}

}
