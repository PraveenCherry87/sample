class Amazon 
{
	static void buy(int price)
	{
		System.out.println("the price is 199");

	}
	static void buy(String Product)
	{
		System.out.println("Puma");
	}
	static void buy(int price,String Product)
	{
		System.out.println("199,Puma");
	}
	static void buy(String Product,int price)
	{
		System.out.println("Puma,199");
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
	Amazon.buy(10);
	Amazon.buy("Puma");
	Amazon.buy(10,"Puma");
	Amazon.buy("puma",10);
	}
}

