public class MyClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = new int[6];
        try 
        {
            array[7] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Error.. Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The size of array is " + array.length);
        }
	}
}