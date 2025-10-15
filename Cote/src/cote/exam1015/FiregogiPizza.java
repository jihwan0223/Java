package cote.exam1015;

public class FiregogiPizza extends Pizza{
	public FiregogiPizza() {
		size = "M";
	}
	public FiregogiPizza(String size) {
		this.size = size;
		this.name = "불고기 피자";
		prices = new int[] {10000, 20000, 30000};
		this.toppings = "firegogi";
	}
	@Override
	public void Cook() {
		System.out.println(toppings +  "을 추가합니다");
		super.Cook();
	}
}