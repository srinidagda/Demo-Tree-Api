package week51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixCharLongestPathDP {
	static int rows,columns;
	MatrixCharLongestPathDP(int rows,int columns) {
		this.rows = rows;
		this.columns = columns;
	}
	static int x[] = {1,0,1,-1,1,0,-1,-1};
	static int y[] = {0,1,1,1,-1,-1,0,-1};
	//static int x[] = {0,1,1,-1,1,0,-1,-1};
	//static int y[] = {1,0,1,1,-1,-1,0,-1};
	static int[][] dp;
	static boolean isValid(int i, int j) {
		if((i<0||j<0|| i>=rows||j>=columns)) {
			return false;
		}
		return true;
	}
	static boolean isAdjacent(char curr, char prev) {
		return ((curr-prev) == 1);
	}
	static int findLength(char[][] matrix,int i, int j, char prev) {
		if(!isValid(i,j) || !isAdjacent(matrix[i][j], prev)) {
			return 0;
		}
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		int max_length = 0;
		for (int k=0;k<8;k++) {
			int len = findLength(matrix,i+x[k],j+y[k],matrix[i][j]);
			max_length = Math.max(max_length, 1+len);
		}
		return dp[i][j] = max_length;
	}
	static int findLength(char[][] matrix, char ch) {
		int max_length = 0;
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				dp[i][j] = -1;
			}
		}
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				if(matrix[i][j] == ch) {
					for (int k=0;k<8;k++) {
						int len = findLength(matrix,i+x[k],j+y[k],ch);
						max_length = Math.max(max_length, 1+len);
					}
				}
			}
		}
		return max_length;
	}
 	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		int columns = Integer.parseInt(br.readLine());
		char[][] matrix = new char[rows][columns];
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				matrix[i][j] = br.readLine().charAt(0);
			}
		}
		MatrixCharLongestPathDP matrixCharLongestPathDP = new MatrixCharLongestPathDP(rows,columns);
		char ch = br.readLine().charAt(0);
		//char ch2 = br.readLine().charAt(0);
		//char ch3 = br.readLine().charAt(0);
		dp = new int[rows][columns];
		System.out.println(findLength(matrix, ch));
		//System.out.println(findLength(matrix, ch2));
		//System.out.println(findLength(matrix, ch3));
	  for (int i=0;i<rows;i++) {
	  	for (int j=0;j<columns;j++) {
	  		System.out.print(dp[i][j]+" ");
		  }
		  System.out.print("\n");
	  }
		br.close();
	}
}
