package cote.exam1020;

public class Employee {
	
	protected String name;
	protected String employeeId;
	
	protected Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public int calculatePay() {
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	
}
