package week49;

public class SelectionSortDemo {
	static void sort(int[] arr) {
		int i,j,temp=0,gap;
		int n = arr.length;
		for(gap=n/2;gap >0;gap /= 2) {
			for (i=gap;i<n;i+=1) {
				temp = arr[i];
				for(j=i;j>=gap&&arr[j-gap] >temp;j-=gap) {
					arr[j] = arr[j-gap];
				}
				arr[j] = temp;
			}
		}
	}
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		int[] arr = {67,4,56,78,98,10};
		sort(arr);
		printArray(arr);
	}
}
