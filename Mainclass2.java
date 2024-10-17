class phonepay
{
	static void pay(int amount)
	{
		System.out.println("the amount is 2000");

	}
	static void pay(String receiver_name)
	{
		System.out.println("receiver name is praveen");
	}
	static void pay(int amount,String receiver_name)
	{
		System.out.println("the amount and receiver name is praveen");
	}
	static void pay(String receiver_name,int amount )
	{
		System.out.println("receiver name is praveen and amount is");
	}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
	phonepay.pay(10);
	phonepay.pay("hello");
	phonepay.pay(10,"hello");
	phonepay.pay("hello",10);
	}
}

