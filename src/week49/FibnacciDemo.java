package week49;

public class FibnacciDemo {
	static int fib(int n) {
		if (n<=1) {
			return n;
		}
		int[] f = new int[n+2];
		f[0] = 0;
		f[1] = 1;
		for (int i=2; i<=n;i++) {
			f[i] = fib(i-1) + fib(i-2);
		}
		return f[n];
	}
	public static void main(String args[]) {
		int n = 15;
		System.out.println(fib(n));
	}
}
