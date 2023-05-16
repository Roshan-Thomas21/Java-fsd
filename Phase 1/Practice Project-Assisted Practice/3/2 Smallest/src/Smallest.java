import java.util.Arrays;
class Smallest {
	public static int kthSmallest(Integer[] arr, int K)
	{
		Arrays.sort(arr);
		return arr[K - 1];
	}
	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 4, 19, 26 };
		int K = 4;
		System.out.print(K+"th smallest element is "
						+ kthSmallest(arr, K));
	}
}