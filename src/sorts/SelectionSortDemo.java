package sorts;

public class SelectionSortDemo {
	
	void selectionSort(int[] A) {
		for (int i = 0; i < A.length-1; i++) {
			int min = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < A[min]) {
					min = j;
				}
			}
			int tmp = A[min];
			A[min] = A[i];
			A[i] = tmp;
		}
	}
	
	/* Prints the array */
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String args[]) {
		SelectionSortDemo selectionSortDemo = new SelectionSortDemo();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		selectionSortDemo.selectionSort(arr);
		selectionSortDemo.printArray(arr);
	}
}
