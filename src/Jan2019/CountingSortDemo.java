package Jan2019;

public class CountingSortDemo {
  static void sort(char[] arr) {
    int n = arr.length;
    //Declare output array
    char[] outputArr = new char[n];
    //Declare count to store count of individual characters and initialize count array as zero
    int[] countArr = new int[256];
    for(int i=0;i<256; ++i) {
      countArr[i]=0;
    }
    //Store individual characters count
    for(int i=0;i<n;++i) {
      ++countArr[arr[i]];
    }
    //Change count[i] so that count[i] contains actual position of character
    // in the output array
    for(int i=1;i<=255;i++){
      countArr[i] += countArr[i-1];
    }
    //Build the output array
    //To make it stable we are iterating in reverse order
    for (int i=n-1;i>=0;i--) {
      outputArr[countArr[arr[i]] - 1] = arr[i];
      --countArr[arr[i]];
    }
    for (int i=0;i<n;++i) {
      arr[i] = outputArr[i];
    }

  }
  private static void printArray(char[] arr) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String args[]) {
    char arr[] = {'a','r','e','g','k'};
    sort(arr);
    printArray(arr);
  }
}
