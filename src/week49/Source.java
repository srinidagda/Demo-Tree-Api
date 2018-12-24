package week49;

import java.util.Arrays;

public class Source {
	static int process(int[] arr, int l, int h) {
		int i = l;
		int j = h;
		int pivot = arr[i];
		while (i < j) {
			do {
				i++;
			} while (i <= arr.length -1 && arr[i] >= pivot);
			
			do {
				j--;
			} while (j >= 0 && arr[j] < pivot);
			
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[l];
		arr[l] = arr[j];
		arr[j] = temp;
		return j;
	}
	static void quickSort(int[] arr, int l, int h) {
		if (l < h) {
			int j = process(arr,l,h);
			quickSort(arr,l,j);
			quickSort(arr,j+1,h);
		}
	}
	public static int[] sort(int arr[]) {
		return arr;
	}
	public static void main(String args[]) {
		int[] randomNumbers = {2,4,6,8,10,12,14,16,18,20};
		int[] sortedNumbers;
		Source.quickSort(randomNumbers,0,randomNumbers.length);
		sortedNumbers = sort(randomNumbers);
		System.out.println(Arrays.toString(sortedNumbers));
	}
}