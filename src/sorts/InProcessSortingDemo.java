package sorts;

public class InProcessSortingDemo {
	public void inProcessSorting(int[] A) {
		int i,j,v;
		for (i = 1; i <= A.length-1; i++) {
			v = A[i];
			j = i;
			while(j>=1 && A[j-1] > v ) {
				A[j] = A[j-1];
				j--;
			}
			A[j] = v;
		}
	}
	void printArray(int[] arr) {
		for(int i: arr) {
			System.out.println(i);
		}
	}
	public static void main(String args[]) {
		InProcessSortingDemo inProcessSortingDemo = new InProcessSortingDemo();
		int[] arr = {64,25,12,22,11};
		inProcessSortingDemo.inProcessSorting(arr);
		inProcessSortingDemo.printArray(arr);
		
	}
}
