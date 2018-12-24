package sorts;

public class QuickSortDemo {
	int process(int[] arr, int l, int h) {
		int i = l;
		int j = h;
		int pivot = arr[i];
		while (i < j) {
			do {
				i++;
			} while (i <= arr.length -1 && arr[i] <= pivot);
			
			do {
				j--;
			} while (j >= 0 && arr[j] > pivot);
			
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[l];
		arr[l] = arr[j];
		arr[j] = temp;
		return j;
	}
	void quickSort(int[] arr, int l, int h) {
		if (l < h) {
			int j = process(arr,l,h);
			quickSort(arr,l,j);
			quickSort(arr,j+1,h);
		}
	}
	void printArray(int[] arr) {
		for (int i: arr) {
			System.out.print(i+ " ");
		}
	}
	public static void main(String args[]) {
		QuickSortDemo quickSortDemo = new QuickSortDemo();
		int[] arr = {15,17,11,9,8,3,6,5,2,56,6,67,7,33,78,90,100,34545,34,67};
		quickSortDemo.quickSort(arr,0,arr.length);
		quickSortDemo.printArray(arr);
	}
}
