package week51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PossiblePathsDemo {
	static int numberOfPaths(int m, int n) {
		int count[][] = new int[m][n];
		for (int i=0;i<m;i++) {
			count[i][0] = 1;
		}
		for (int j=0;j<n;j++) {
			count[0][j] = 1;
		}
		for (int i=1;i<m;i++) {
			for (int j=1;j<n;j++) {
				count[i][j] = count[i-1][j] + count[i][j-1];
			}
		}
		return count[m-1][n-1];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int number = numberOfPaths(m,n);
		System.out.print(number);
	}
}
