package sorts;

public class BubbleSortDemo {
	
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		long startTime = System.nanoTime();
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1])
				{
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		long endTime = System.nanoTime() - startTime;
		System.out.println("Time differnece is " + endTime);
	}
	
	void bubbleSortImproved(int[] A) {
		int i, pass,temp,swapped = 1;
		long startTime = System.nanoTime();
		for(pass = A.length - 1; pass >= 0 && pass >= swapped; pass--) {
			swapped = 0;
			for (i=0; i <= pass - 1; i++) {
				if (A[i] > A[i+1]) {
					temp = A[i];long endTime = System.nanoTime() - startTime;
					System.out.println("Time differnece is " + endTime);
					A[i] = A[i+1];
					A[i+1] = temp;
					swapped = 1;
				}
			}
		}
		long endTime = System.nanoTime() - startTime;
		System.out.println("Time differnece is of Improved version " + endTime);
	}
	
	/* Prints the array */
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i) {
			System.out.print(arr[i] + " ");
			System.out.println();
		}
	}
	
	// Driver method to test above
	public static void main(String args[])
	{
		BubbleSortDemo ob = new BubbleSortDemo();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
		ob.bubbleSortImproved(arr);
		System.out.println("Improved Sorted array");
		ob.printArray(arr);
	}
}
