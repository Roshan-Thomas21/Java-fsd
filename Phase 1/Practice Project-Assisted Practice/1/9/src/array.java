public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//single-dimensional array
		int a[]= {10,20,30,40,50};
		System.out.print("Elements of array a: ");
		for(int i=0;i<5;i++) {
		System.out.print(a[i]+" ");
		}

		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9} };
		      
		      System.out.println("\nLength of row 2: " + b[1].length);
		      }
		}