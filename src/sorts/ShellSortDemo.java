package sorts;

import java.util.Random;

public class ShellSortDemo {
	void shellSort(int[] arr) {
		int i, j, tmp,gap;
		long starttime = System.nanoTime();
		for (gap=arr.length/2;gap > 0; gap /= 2) {
			for (i=gap; i<arr.length; i+= 1) {
				tmp = arr[i];
				for(j = i; j >=gap&&arr[j-gap]>tmp;j-=gap) {
					arr[j] = arr[j-gap];
				}
				arr[j] = tmp;
			}
		}
		long endTime = System.nanoTime() - starttime;
		System.out.println(endTime);
	}
	
	void printArray(int[] arr) {
		for(int i:arr) {
			System.out.print("{" + i+"}");
		}
	}
	
	public static void main(String[] args) {
		ShellSortDemo shellSortDemo = new ShellSortDemo();
		int[] arr = new int[100];
		Random random = new Random();
		for (int i=0; i< arr.length - 1; i++) {
			int tmp = (random.nextInt(100)+1);
			arr[i] = tmp;
		}
		shellSortDemo.shellSort(arr);
		shellSortDemo.printArray(arr);
		int gap = 50;
		int j = 36;
		System.out.println("*****");
		System.out.println((j -= gap) +" , ");
	}
}
