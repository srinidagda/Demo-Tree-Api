package week46;

public class QuickSortStringDemo {
	
	int process(String[] arr, int l, int h) {
		int i =0, j =0; String pivot;
		i = l; j =h; pivot = arr[i];
		while (i < j) {
			do {
				i++;
			} while (i <= (arr.length - 1) && arr[i].compareToIgnoreCase(pivot) < 0);
			do {
				j--;
			} while (j >= 0 && arr[j].compareToIgnoreCase(pivot) > 0);
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
	
	void sort(String [] arr, int l, int h) {
		if (l < h) {
			int j = process(arr, l, h);
			sort(arr, l, j);
			sort(arr, j+1, h);
		}
	}
	
	void printArray(String[] arr) {
		for (String temp: arr) {
			System.out.println(temp);
		}
	}
	
	public static void main(String args[]) {
		QuickSortStringDemo quickSortStringDemo = new QuickSortStringDemo();
		String [] arr = {"Kumarhatti-Nahan", "Road", "Solan", "Gandhi", "Gram", "Himachal-Pradesh", "India", "GB", "ecg"};
		quickSortStringDemo.sort(arr, 0, arr.length);
		quickSortStringDemo.printArray(arr);
	}
}
