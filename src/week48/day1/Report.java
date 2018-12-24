package week48.day1;

public class Report extends Student implements year {
	private int ptage;
	private String pass = null;
	public Report(String name, int ANo, int STD, int ptage, String pass) {
		super(name, ANo, STD);
		this.ptage = ptage;
		this.pass = pass;
	}
	public int getPtage() {
		return ptage;
	}
	public String getPass() {
		return pass;
	}
	@Override
	public int getYear(int year) {
		return 12-year;
	}
	
	public void setPtage(int ptage) {
		this.ptage = ptage;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void quality(int Ano, int ptage) {
		if (getPtage()>ptage) {
			System.out.println("Above average student");
		} else {
			System.out.println("Below average student");
		}
	}
}
