package cote.exam1020;

public class EmployeeExample {
	public static void main(String[] args) {
		Employee[] emps = new Employee[2];
		emps[0] = new FullTimeEmployee("asdf", "1234", 36000000);
		emps[1] = new PartTimeEmployee("qwer", "4321", 20000, 100);
		
		for(int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].getName() + "-" + emps[i].calculatePay());
		}
	}
}
