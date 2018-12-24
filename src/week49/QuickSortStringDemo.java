package week49;

public class QuickSortStringDemo {
	public static void quickSort(String array[], int left, int right) {
		if (left < right) {
			int position = partition(array, left, right);
			quickSort(array, left, position - 1);
			quickSort(array, position + 1, right);
		}
	}
	//Write your code here
	static int partition(String[] arr, int l, int h) {
		int i =0, j =0; String pivot;
		i = l; j =h;
		pivot = arr[i];
		while (i < j) {
			while (i < (arr.length-1) && arr[i].length() <= pivot.length()) {
				i++;
			}
			while (j > 0 && arr[j].length() > pivot.length()) {
				j--;
			}
			if (i < j) {
				String temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		String temp = arr[l];
		arr[l] = arr[j];
		arr[j] = temp;
		return j;
	}
	void printArray(String[] arr) {
		for (String temp: arr) {
			System.out.println(temp);
		}
	}
	public static void main(String args[]) {
		QuickSortStringDemo quickSortStringDemo = new QuickSortStringDemo();
		String [] arr = {"Christene","Tomas","Zoro","Ki","Irmgard","Quiana","Neo","Kenyatta","K","ab"};
		quickSortStringDemo.quickSort(arr, 0, arr.length-1);
		quickSortStringDemo.printArray(arr);
	}
}
