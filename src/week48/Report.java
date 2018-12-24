package week48;

public class Report extends Student {
	public static Integer percentage;
	public static String passResult;
	public static String name;
	public static Integer aNo;
	public static Integer std;
	
	public Report(String name, Integer aNo,Integer std,Integer percentage, String passResult) {
		super(name,aNo,std);
		this.percentage = percentage;
		this.passResult = passResult;
	}
	public static Report constructFrom(String[] strNums) {
		return new Report(strNums[0],Integer.parseInt(strNums[1]),Integer.parseInt(strNums[2]),
			Integer.parseInt(strNums[3]),strNums[4]);
	}
}
