package week51;

public class RecusiveDemo {
  static void process(int left, int right) {
    if(left < right) {
      int middle = (left+right)/2;
      process(left,middle);
      process(middle+1, right);
      System.out.println("Left is: " + left+ " Middle is: " + middle+ " Right is: " + right);
    }
  }
  public static void main(String args[]) {
    int left = 0;
    int right = 5;
    System.out.println((left+right)/2);
    process(left, right);
  }
}
