package week46;

public class MergeSortDemo {
	void merge(int[] arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(int i=0;i<n1;i++){
			L[i] = arr[l+i];
		}
		for (int j=0;j<n2;j++){
			R[j] = arr[m+1+j];
		}
		int i=0,j=0,k=l;
		while (i < n1 && j < n2) {
			if(L[i]<=R[j]) {
				arr[k] =L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] =L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	void sort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1, r);
			merge(arr,l,m,r);
		}
	}
	void printArray(int[] arr) {
		for(int i: arr) {
			System.out.print(i+ " ");
		}
	}
	public static void main(String[] args) {
		MergeSortDemo mergeSortDemo = new MergeSortDemo();
		int[] arr = {15,17,11,9,8,3,6,5,2,56,6,67,7,33,78,90,100,34545,34,67};
		mergeSortDemo.sort(arr,0,arr.length-1);
		mergeSortDemo.printArray(arr);
	}
}
