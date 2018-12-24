package week49;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArraySize {
	public static void main(String[] args) throws IOException {
		//write your code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String[] strArray = new String[t*2];
		for(int i=0;i<t*2;i++) {
			String str = br.readLine();
			if (str.length() == 3) {
				strArray[i] = str;
			}
		}
		for (int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		br.close();
	}
}
