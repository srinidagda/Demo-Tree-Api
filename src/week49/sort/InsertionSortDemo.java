package week49.sort;

public class InsertionSortDemo {
	static void sort(int[] arr) {
		int i,j,v;
		for (i=1;i<=arr.length-1;i++) {
			v = arr[i];
			j = i;
			while (j>=1 && arr[j-1] > v) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = v;
		}
	}
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		int[] arr = {34,5,67,8,9};
		sort(arr);
		printArray(arr);
	}
}
