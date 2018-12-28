package week51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MatrixCharLonestPath {
	static int x[] = {0,1,1,-1,1,0,-1,-1};
	static int y[] = {1,0,1,1,-1,-1,0,-1};
	static int rows;
	static int columns;
	MatrixCharLonestPath(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}
	static int findLength(char[][] matrix, char c) {
		int max_length = 0;
		int rows = matrix.length;
		int columns = matrix[0].length;
		for(int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				if(matrix[i][j] == c) {
					for (int k=0;k<8;k++) {
						int length = findMaxLength(matrix,i+x[k],j+y[k],c);
						max_length = Math.max(max_length,1+length);
					}
				}
			}
		}
		return max_length;
	}
	static boolean isValid(int i, int j) {
		if((i<0 || i>=rows || j<0 || j>=columns)) {
			return false;
		}
		return true;
	}
	static boolean isAdjacent(char curr, char prev) {
		return ((curr-prev) == 1);
	}
	static int findMaxLength(char[][] matrix,int i, int j, char prev) {
		if(!isValid(i,j) || !isAdjacent(matrix[i][j],prev)) {
			return 0;
		}
		int max_length = 0;
		for (int k=0;k<8;k++) {
			int length = findMaxLength(matrix,i+x[k],j+y[k],matrix[i][j]);
			max_length = Math.max(max_length,1+length);
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
		MatrixCharLonestPath matrixCharLonestPath = new MatrixCharLonestPath(rows, columns);
		char ch = br.readLine().charAt(0);
		char ch2 = br.readLine().charAt(0);
		char ch3 = br.readLine().charAt(0);
		System.out.println(findLength(matrix, ch));
		System.out.println(findLength(matrix, ch2));
		System.out.println(findLength(matrix, ch3));
		br.close();
	}
}
