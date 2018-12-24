package week49;

import java.util.Scanner;

public class PivotDemo {
	public static int[] getSubarrayGreaterThan(int pivot, int[] arr) {
		System.out.println(pivot);
		quickSort(arr,0,arr.length-1,pivot);
		return arr;
	}
	public static void quickSort(int[] arr, int left, int right, int pivot) {
		if(left < right) {
			int j = process(arr,left,right,pivot);
			quickSort(arr,left,j,pivot);
			quickSort(arr,j+1,right,pivot);
		}
	}
	public static int process(int[] arr,int left, int right,int val) {
		int i=left,j=right;
		int pivot = 0;
		pivot = arr[j];
		if(pivot > val) {
			System.out.println(pivot);
		}
		while (i < j) {
			while (i <= arr.length -1 && arr[i] <= pivot) {
				i++;
			}
			while (j >=0 && arr[j] > pivot) {
				j--;
			}
			if(i <j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[left];
		arr[left] = arr[j];
		arr[j]= temp;
		return j;
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] arr = new int[size];
		int[] subArray = new int[size];
		for (int i=0;i<size;i++) {
			arr[i] = scanner.nextInt();
		}
		int val = scanner.nextInt();
		getSubarrayGreaterThan(arr[val],arr);
		for (int i=0; i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
	}
}
