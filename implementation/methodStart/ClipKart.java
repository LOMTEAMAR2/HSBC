package methodStart;

public class ClipKart {

	public static void payment()
	{
		System.out.println("Cash On Delivery");
		System.out.println("Order Placed");
	}
	
	public static void payment(long card, int cvv, String exp)
	{
		System.out.println("Payment by Credit Card");
		System.out.println("Order Placed");
	}
	
	public static void payment(String upi)
	{
		System.out.println("Payment by UPI");
		System.out.println("Order Placed");
	}
	
	public static void payment(String user, String pass)
	{
		System.out.println("Payment by Internet Banking");
		System.out.println("Order Placed");
	}
	
}
