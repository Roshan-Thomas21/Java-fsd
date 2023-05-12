package Abstraction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle("Red", 7); 
        Shape s2 = new Rectangle("Yellow", 2, 5);
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
	}
}