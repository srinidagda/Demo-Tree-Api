package week51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PossiblePathInKTurns {
  static int rows;
  static int columns;
  PossiblePathInKTurns(int rows, int columns) {
    this.rows = rows;
    this.columns = columns;
  }
  //if cells are invalid
  static boolean isValid(int i, int j) {
    return (i<rows&&j<columns);
  }
  static int possiblePaths(int i, int j, int k,boolean flag) {

    //if moves are exhausted and cells are invalid
    if(k == -1 && !isValid(i,j)) {
      return 0;
    }
    //if destination is reached with exactly k turns
    if(i==rows-1 || j==columns-1) {
      return 1;
    }
    if(k==0) {
      return 1;
    }
    if(flag) {
      return possiblePaths(i+1,j,k,flag) + possiblePaths(i,j+1,k-1,!flag);
    }
    return possiblePaths(i,j+1,k,flag) + possiblePaths(i+1,j,k-1,!flag);
  }
  static int possiblePaths(int i,int j, int k) {
    return possiblePaths(i+1,j,k,true) + possiblePaths(i,j+1,k,false);
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int rows = Integer.parseInt(br.readLine());
    int columns = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());
    PossiblePathInKTurns possiblePathInKTurns = new PossiblePathInKTurns(rows,columns);
    System.out.print(possiblePaths(0,0,k));
    br.close();
  }
}
