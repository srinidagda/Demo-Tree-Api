package week49;

import java.util.Arrays;
import java.util.Scanner;

public class PiovtDemo1 {
	static int[] getSubArrayGreaterThanPivotIndex(int[] arr, int pivotIndex) {
		if(pivotIndex >= arr.length && pivotIndex < 0){
			return null;
		}
		int left=-1,right;
		right = arr[arr.length-1];
		arr[arr.length -1] = arr[pivotIndex];
		arr[pivotIndex] = right;
		pivotIndex = arr.length - 1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<arr[pivotIndex]) {
				left++;
				right = arr[i];
				arr[i] = arr[left];
				arr[left] = right;
			}
		}
		System.out.print(Arrays.toString(arr));
		right = arr[arr.length -1];
		arr[arr.length-1] = arr[left+1];
		arr[left+1] = right;
		return Arrays.copyOfRange(arr, left + 1, arr.length);
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = scanner.nextInt();
		}
		int pivotIndex = scanner.nextInt();
		int[] newArr = getSubArrayGreaterThanPivotIndex(arr, pivotIndex);
		if(newArr != null) {
			for(int i=0; i<newArr.length;i++) {
				System.out.print(newArr[i]+" ");
			}
		}
	}
}

//10 20 47 86 15 35 37 76 56 25
