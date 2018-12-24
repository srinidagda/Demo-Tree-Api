package week47;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String str = br.readLine();
		String str1[] = str.split(" ");
		int[] arr = new int[t];
		for(int i=0;i<t;i++) {
			if (Integer.parseInt(str1[i])%2 !=0) {
				arr[i] = Integer.parseInt(str1[i]) + 1;
			} else {
				arr[i] = Integer.parseInt(str1[i]);
			}
		}
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
}
