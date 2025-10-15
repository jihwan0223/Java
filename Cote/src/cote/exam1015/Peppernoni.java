package cote.exam1015;

public class Peppernoni extends Pizza{

	
	public Peppernoni(){
		size = "M";
	}
	public Peppernoni(String size) {
		this.name = "페퍼로니 피자";
		this.size = size;
		this.prices = new int[] {12000, 17000, 27000};
		this.toppings = "pepperoni";
	}
	@Override
	public void Cook() {
		System.out.println(toppings +  "을 추가합니다");
		super.Cook();
	}
}
