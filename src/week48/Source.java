package week48;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strNums1, strNums2;
		strNums1 = br.readLine().split("\\s");
		strNums2 = br.readLine().split("\\s");
		int aNo = Integer.parseInt(br.readLine());
		if (aNo == Integer.parseInt(strNums1[1])) {
			Report.constructFrom(strNums1);
			Bus.constructFrom(strNums1);
			System.out.print(Student.name+" " + Report.percentage + " " + Bus.routeNum);
		} else if(aNo == Integer.parseInt(strNums2[1])) {
			Report.constructFrom(strNums2);
			Bus.constructFrom(strNums2);
			System.out.print(Student.name+" " + Report.percentage + " " + Bus.routeNum);
		} else {
			System.out.print("No entry found");
		}
	}
}
