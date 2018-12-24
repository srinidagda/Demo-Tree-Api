package week46;

public class BinarySearchDemo {
	int process(int[] arr, int data) {
		int low=0,high=arr.length -1;
		while (low <= high) {
			int mid = low + (high - low)/2;
			if(arr[mid] == data) {
				return mid;
			} else if (arr[mid] < data) {
				low  = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
		int[] arr = {15,17,11,9,8,3,6,5,2,56,6,67,7,33,78,90,100,34545,34,67};
		int data = binarySearchDemo.process(arr, 15);
		System.out.print(data+ " ");
	}
}
