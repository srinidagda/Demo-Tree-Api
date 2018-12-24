package week49.sort;

public class MergeSortDemo {
	static void sort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	static void merge(int[] arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		int[] L = new int[n1];
		int[] R = new int[n2];
		for (int i=0; i<n1;i++) {
			L[i] = arr[l+i];
		}
		for (int j=0;j<n2;j++) {
			R[j] = arr[m+1+j];
		}
		int i=0,j=0,k;
		k= l;
		while (i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		if(i <n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		if(j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {15,8,19,567,34,0,1};
		sort(arr,0,arr.length-1);
		printArray(arr);
	}
}
