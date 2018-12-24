package week46;

public class BubbleSortDemo {
	
	void process(int[] arr) {
		int n = arr.length;
		for(int i=0;i<=n-1;i++){
			for(int j=0; j< n-i-1;j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	void printArray(int[] arr) {
		for(int i: arr) {
			System.out.print(i+ " ");
		}
	}
	public static void main(String args[]) {
		BubbleSortDemo bubbleSortDemo = new BubbleSortDemo();
		int[] arr = {15,17,11,9,8,3,6,5,2,56,6,67,7,33,78,90,100,34545,34,67};
		bubbleSortDemo.process(arr);
		bubbleSortDemo.printArray(arr);
	}
}
