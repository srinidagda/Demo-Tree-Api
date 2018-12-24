package week46;

public class SelectionSortDemo {
	void process(int[] arr) {
		int min;
		int n = arr.length;
		for(int i=0; i<n-1;i++) {
			min = i;
			for (int j = i+1;j<n;j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	void printArray(int[] arr) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String args[]) {
		SelectionSortDemo selectionSortDemo = new SelectionSortDemo();
		int[] arr = {15,17,11,9,8,3,6,5,2,56,6,67,7,33,78,90,100,34545,34,67};
		selectionSortDemo.process(arr);
		selectionSortDemo.printArray(arr);
	}
}
