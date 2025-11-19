package test.two;

public class Customer {
	public String name;
	public String phone;
	public int point;
	
	public Customer() {}
	public Customer(String name, String phone, int point) {
		this.name = name;
		this.phone = phone;
		this.point = 0;
	}
	
	public void updatePoint(int amount) {
		point = point + amount;
		System.out.println(point);
	}
	public void setPoint(int point) {
		this.point = point;
		System.out.println(point);
	}
}
