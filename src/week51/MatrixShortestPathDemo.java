package week51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MatrixShortestPathDemo {
	static void printPaths(int[][] matrix, List<Integer> route, int i, int j) {
		route.add(matrix[i][j]);
		int M = matrix.length;
		int N = matrix[0].length;
		if(i==M-1 && j==N-1) {
			System.out.print(route);
		} else {
			if(j+1<N) {
				printPaths(matrix,route,i,j+1);
			}
			if(i+1<M) {
				printPaths(matrix,route,i+1,j);
			}
			if(i+1<M && j+1<N) {
				printPaths(matrix,route,i+1,j+1);
			}
		}
		route.remove(route.size()-1);
	}
	static void printPaths(int[][] matrix) {
		List<Integer> route = new ArrayList<>();
		printPaths(matrix,route,0,0);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int[][] matrix = new int[m][n];
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				matrix[i][j] = Integer.parseInt(br.readLine());
			}
		}
		printPaths(matrix);
		br.close();
	}
}
