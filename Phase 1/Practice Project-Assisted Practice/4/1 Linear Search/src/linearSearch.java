import java.util.*;
public class linearSearch {
	public static void main(String[] args){
		int[] arr = {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched:");
		int x = sc.nextInt();
		int c=0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == x) {
				c++;
				System.out.println("Element found at index "+i);
				break;
			}
		}
		if(c==0)
			System.out.println("Element not in the array");
	}
}