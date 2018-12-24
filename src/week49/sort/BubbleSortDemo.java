package week49.sort;

public class BubbleSortDemo {
	static void sort(int[] arr) {
		for(int i=0; i< arr.length;i++) {
			for (int j= 0; j< arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		int[] arr = {7,8,2,3,4,5,6};
		sort(arr);
		printArray(arr);
	}
}
