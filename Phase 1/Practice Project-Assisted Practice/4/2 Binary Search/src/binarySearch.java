import java.util.*;
public class binarySearch {
	public static  void main(String[] args){
		int[] arr = {3,6,9,12,15};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be searched:");
		int key = sc.nextInt();
		int arrlength = arr.length;
		binary(arr,0,key,arrlength);
	}
	public static void binary(int[] arr, int start, int key, int length){
		int mid = (start+length)/2;
		while(start<=length){
			if(arr[mid]<key)
				start = mid + 1;
			else if(arr[mid]==key){
				System.out.println("Element is found at index: "+mid);
				break;
			}else {
				length=mid-1;
			}
			mid = (start+length)/2;
		}
		if(start>length){
			System.out.println("Element is not found");
		}
	}
}