package week48;

public class Bus extends Student {
	public static Integer routeNum;
	public static String bloodGroup;
	public static String name;
	public static Integer aNo;
	public static Integer std;
	
	public Bus(String name, Integer aNo, Integer std, Integer routeNum, String bloodGroup) {
		super(name, aNo, std);
		this.routeNum = routeNum;
		this.bloodGroup = bloodGroup;
	}
	
	public static Bus constructFrom(String[] strNums) {
		return new Bus(strNums[0],Integer.parseInt(strNums[1]),Integer.parseInt(strNums[2]),
			Integer.parseInt(strNums[5]),strNums[6]);
	}
	
}
