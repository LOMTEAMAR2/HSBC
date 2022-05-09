package methodStart;

public class ReturnType {

	public static void main(String[] args) {
	
		int res = add(20,30);
		System.out.println("Sum = " + res);//50
		even(res);
		
		int res1=add(70,30);
		System.out.println("Sum = " +res1);
		
		int res2=add(21,36);
		System.out.println("Sum = " + res2);
	}

	public static int add (int a, int b)
	{
		int res = a+b ; //res=50
		
		return res;
	}
	
	public static void even(int a)  //50
	{
		if(a%2==0)   //50%2==0
		{
			System.out.println("Even");  //"Even"
		}
		else
		{
			System.out.println("Odd");
		}
	}
}
