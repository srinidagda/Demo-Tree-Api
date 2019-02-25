package Jan2019;

public class CountingSortDemo1 {
  private static void sort(int[] arr, int k) {
    int n = arr.length;
    int[] output = new int[n];
    int[] count = new int[k];
    for (int i=0;i<k;i++) {
      count[i] = 0;
    }
    for(int i=0;i<n;i++) {
      count[arr[i]] = count[arr[i]] + 1;
    }
    for(int i=1;i<k;i++) {
      count[i] = count[i] + count[i-1];
    }
    for(int i=n-1;i>=0;i--) {
      output[count[arr[i]] - 1] = arr[i];
      count[arr[i]] = count[arr[i]] - 1;
    }
    for (int i=0;i<n;i++) {
      arr[i] = output[i];
    }

  }
  private static void printArr(int[] arr) {
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String args[]) {
    int[] arr = {5,78,9,0,1,3,6, -1};
    int k = 100;
    sort(arr,k);
    printArr(arr);
  }
}
