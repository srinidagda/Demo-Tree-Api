package week47;

public class Employee {
	private int employeeID;
	private String employeeName;
	private int getEmployeeID(int ID ){
		return this.employeeID = ID;
	}
	public String getEmployeeName(String fName, String lName,int ID){
		this.employeeName = fName+" "+lName;
		this.employeeID = getEmployeeID(ID);
		return employeeName + " has employee ID: " +employeeID;
	}
}
