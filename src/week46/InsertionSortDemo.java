package week46;

public class InsertionSortDemo {
	void process(int[] arr) {
		int i,j,v;
		int n = arr.length;
		for(i=1;i<=n-1;i++) {
			v = arr[i];
			j = i;
			while (j>=1 && arr[j-1] > v){
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = v;
		}
	}
	void printArray(int[] arr) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String args[]) {
		InsertionSortDemo insertionSortDemo = new InsertionSortDemo();
		int[] arr = {15,17,11,9,8,3,6,5,2,56,6,67,7,33,78,90,100,34545,34,67};
		insertionSortDemo.process(arr);
		insertionSortDemo.printArray(arr);
	}
}
