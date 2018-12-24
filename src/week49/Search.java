package week49;

public class Search {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int low = 0, high = arr.length - 1;
		int element = 3;
		if (BinarySearch(arr, low, high, element) == 0) {
			System.out.println("Element does not exist");
		} else {
			System.out.println("Element exists");
		}
	}
	
	public static int BinarySearch(int[] arr, int low, int high, int element) {
		while (low < high) {
			int middle = (low + high) / 2;
			if (arr[middle] > element) {
				high = middle;
			} else if (arr[middle] < element) {
				low = middle;
			} else if (arr[middle] == element) {
				return 1;
			}
		}
		return 0;
	}
}
