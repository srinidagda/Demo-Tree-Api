package week48.day1;

public class Student extends absdetail {
	private String name = null;
	private int ANo;
	private int STD;
	
	public Student(String name, int ANo, int STD) {
		this.name = name;
		this.ANo = ANo;
		this.STD = STD;
	}
	
	@Override
	public String getFather() {
		return father;
	}
	
	@Override
	public void setFather(String father) {
		this.father = father;
	}
	
	public String getName() {
		return name;
	}
	
	public int getANo() {
		return ANo;
	}
	
	public int getSTD() {
		return STD;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setANo(int ANo) {
		this.ANo = ANo;
	}
	
	public void setSTD(int STD) {
		this.STD = STD;
	}
	
	public void quality(int ANo) {
		if (ANo >= 10) {
			System.out.println("New Student");
		} else {
			System.out.println("Old Student");
		}
	}
}
