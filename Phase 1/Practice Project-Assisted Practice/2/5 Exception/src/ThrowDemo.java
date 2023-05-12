public class ThrowDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=7,b=0,rs;
        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                rs = a / b;
                System.out.print("\nThe result is : " + rs);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }
        System.out.print("\nEnd of program.");
	}
}