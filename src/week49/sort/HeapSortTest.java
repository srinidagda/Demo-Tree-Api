package week49.sort;

public class HeapSortTest {
	static void sort(int[] arr) {
		int n = arr.length;
		for (int i=(n/2)-1;i>=0;i--) {
			heapfy(arr,n,i);
		}
		for (int i=n-1;i>=0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapfy(arr,i,0);
		}
	}
	static void heapfy(int[] arr, int n, int i) {
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left<n && arr[left]>arr[largest]) {
			largest = left;
		}
		if(right<n && arr[right]>arr[largest]) {
			largest = right;
		}
		if(largest!=i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] =temp;
			heapfy(arr,n,largest);
		}
	}
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {56,5,6,7,85,10,1,0};
		sort(arr);
		printArray(arr);
	}
}
