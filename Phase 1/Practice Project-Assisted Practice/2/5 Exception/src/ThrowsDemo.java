public class ThrowsDemo {
	void Division() throws ArithmeticException
	{
		int a=8,b=0,rs;
		rs = a / b;
		System.out.print("\nThe result is : " + rs);
	}
	public static void main(String[] args)
	{
		ThrowsDemo T = new ThrowsDemo();
		try
		{
			T.Division();
		}
		catch(ArithmeticException Ex)
		{
			System.out.print("\nError : " + Ex.getMessage());
		}
		System.out.print("\nEnd of program.");
	}
}