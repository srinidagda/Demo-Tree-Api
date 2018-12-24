package week49;

import java.util.Scanner;

//Time complexity is O(n)
//It can be reduced to O(logn)
// ({{1,1},{1,0}})power of n = {{f(n+1),f(n)},{f(n),f(n-1)}}

public class FibnacciDemo1 {
	static Integer fib(int n) {
		int f[][] = {{1,1},{1,0}};
		if(n == 0) {
			return 0;
		}
		power(f, n-1);
		return f[0][0];
	}
	static void power(int f[][], int n) {
		int m[][] = {{1,1},{1,0}};
		for (int i=2;i<=n;i++) {
			multiply(f,m);
		}
	}
	static void multiply(int f[][], int m[][]) {
		int x = f[0][0]*m[0][0]+f[0][1]*m[1][0];
		int y = f[0][0]*m[0][1]+f[0][1]*m[1][1];
		int z = f[1][0]*m[0][0]+f[1][1]*m[1][0];
		int w = f[1][0]*m[0][1]+f[1][1]*m[1][1];
		f[0][0] = x;
		f[0][1] = y;
		f[1][0] = z;
		f[1][1] = w;
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer result  = fib(n);
		System.out.println(result);
	}
}

