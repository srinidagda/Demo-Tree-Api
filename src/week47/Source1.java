package week47;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		int[] arr = new int[2];
		while (i <= arr.length-1) {
			String str = br.readLine();
			if (i <= arr.length-1) {
				arr[i] = Integer.parseInt(str);
				i++;
			} else {
				break;
			}
		}
	}
}
