package week48.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strNums1, strNums2;
		strNums1 = br.readLine().split("\\s");
		strNums2 = br.readLine().split("\\s");
		Report r1 = new Report(strNums1[0], Integer.parseInt(strNums1[1]), Integer.parseInt(strNums1[2]), Integer.parseInt(strNums1[3]),strNums1[4]);
		Report r2 = new Report(strNums2[0], Integer.parseInt(strNums2[1]), Integer.parseInt(strNums2[2]), Integer.parseInt(strNums2[3]),strNums2[4]);
		Bus b1 = new Bus(strNums1[0], Integer.parseInt(strNums1[1]), Integer.parseInt(strNums1[2]), Integer.parseInt(strNums1[5]),strNums1[6]);
		Bus b2 = new Bus(strNums2[0], Integer.parseInt(strNums2[1]), Integer.parseInt(strNums2[2]), Integer.parseInt(strNums2[5]),strNums2[6]);
		r1.setFather(strNums1[7]);
		r2.setFather(strNums2[7]);
		b1.setFather(strNums1[7]);
		b2.setFather(strNums2[7]);
		int n = Integer.parseInt(br.readLine());
		if(n==r1.getANo()) {
			System.out.println(r1.getName() +" "+ r1.getPtage() + " "+b1.getRoute()+ " "+b1.getFather());
			System.out.println("You will graduate in " + r1.getYear(r1.getSTD())+ " years");
			r1.quality(r1.getANo());
			r1.quality(r1.getANo(),55);
			b1.quality(r1.getANo());
		}
		else if(n==r2.getANo()){
			System.out.println(r2.getName() +" "+ r2.getPtage() + " "+b2.getRoute()+ " "+b2.getFather());
			System.out.println("You will graduate in " + r2.getYear(r2.getSTD())+ " years");
			r2.quality(r2.getANo());
			r2.quality(r2.getANo(),55);
			b2.quality(r2.getANo());
		}
		else
			System.out.println("No entry found");
	}
}
