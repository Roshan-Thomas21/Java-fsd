public class FinallyBlockDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=9,b=0,rs=0;
        try
        {
            rs = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\nThe result is : " + rs);
        }
	}
}