package week49;

import java.util.Scanner;

public class MergeTwoSortedArrays {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int sizeArray1 = scanner.nextInt();
		int sizeArray2 = scanner.nextInt();
		int sortedArray1[] = getArrayInput(sizeArray1, scanner);
		int sortedArray2[] = getArrayInput(sizeArray2,scanner);
		int descendingMerge[]=mergeBothInDescendingOrder(sortedArray1, sortedArray2);
		for(int i=0;i<descendingMerge.length;i++) {
			System.out.println(descendingMerge[i]);
		}
	}
	
	static int[] mergeBothInDescendingOrder(int arr1[], int arr2[]) {
		int[] arr3 = new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		int n1 = arr1.length;
		int n2 = arr2.length;
		while (i<n1 && j<n2) {
			if (arr1[i]<=arr2[j]) {
				arr3[k++] = arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			}
			while (i < n1) {
				arr3[k++] = arr1[i++];
			}
			while (j < n2) {
				arr3[k++] = arr2[j++];
			}
		}
		for(int a=0;a<arr3.length;a++) {
			for(int b=0;b<arr3.length-1;b++) {
				if(arr3[b]<=arr3[b+1]) {
					int temp = arr3[b+1];
					arr3[b+1] = arr3[b];
					arr3[b] = temp;
				}
			}
		}
		return arr3;
	}
	
	static int[] getArrayInput(int size, Scanner scanner) {
		int[] arr = new int[size];
		for(int i=0; i< size; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
}
