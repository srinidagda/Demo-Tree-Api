package week49.sort;

public class SelectionSortDemo {
	static void sort(int[] arr) {
		int min;
		for (int i=0; i<arr.length-1;i++) {
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	static void printArray(int[] arr) {
		for(int j=0; j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
	}
	public static void main(String args[]) {
		int[] arr = {7,6,4,5,3,2,0,1};
		sort(arr);
		printArray(arr);
	}
}
