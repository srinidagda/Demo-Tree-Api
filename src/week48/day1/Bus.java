package week48.day1;

public class Bus extends Student {
	private int route;
	private String BG = null;
	public Bus(String name, int ANo, int STD, int route, String BG) {
		super(name, ANo, STD);
		this.BG = BG;
		this.route = route;
	}
	public String getBG() {
		return BG;
	}
	public int getRoute() {
		return route;
	}
	
	public void setRoute(int route) {
		this.route = route;
	}
	
	public void setBG(String BG) {
		this.BG = BG;
	}
	@Override
	public void quality(int Ano) {
		if(getRoute()>20) {
			System.out.println("Out of city student");
		} else {
			System.out.println("In-city student");
		}
	}
}
