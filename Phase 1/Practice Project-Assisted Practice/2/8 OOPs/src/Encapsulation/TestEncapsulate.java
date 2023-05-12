package Encapsulation;

public class TestEncapsulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate obj = new Encapsulate(); 
        obj.setName("Killadi"); 
        obj.setAge(69); 
        obj.setRoll(007); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
	}
}