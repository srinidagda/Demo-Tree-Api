package week46;

import week47.MathematicalOperations;

public class ShellSortDemo {
	void process(int[] arr) {
		int i=0,j=0,gap,tmp;
		for (gap=arr.length/2;gap >0;gap/=2){
			for (i=gap;i<arr.length;i++){
				tmp = arr[i];
				for (j=i;j>=gap&&arr[j-gap]>tmp;j-=gap) {
					arr[j] = arr[j-gap];
				}
				arr[j] = tmp;
			}
		}
	}
	void printArray(int[] arr) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String args[]) {
		ShellSortDemo shellSortDemo = new ShellSortDemo();
		int[] arr = {15,17,11,9,8,3,6,5,2,56,6,67,7,33,78,90,100,34545,34,67};
		shellSortDemo.process(arr);
		shellSortDemo.printArray(arr);
	}
}
