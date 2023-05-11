import java.util.*;
public class typeCasting {

	public static void main(String[] args) {
		// implicit conversion
		System.out.println("Implicit Type Casting of 'A'");
		char a='A';
		System.out.println("Value of a: "+a);
		int b=a;
		System.out.println("Value of b: "+b);
		float c=a;
		System.out.println("Value of c: "+c);
		long d=a;
		System.out.println("Value of d: "+d);
		double e=a;
		System.out.println("Value of e: "+e);
				
		//explicit conversion
		System.out.println("\n");
		System.out.println("Explicit Type Casting of double");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		double x=sc.nextDouble();
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
	}
}
