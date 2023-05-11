//demo
public class methodExecution {

public int multiply(int a,int b) {
	int z=a*b;
	return z;
}

public static void main(String[] args) {

	methodExecution b=new methodExecution();
	int ans= b.multiply(10,3);
	System.out.println("Multipilcation = "+ans);
	}
}