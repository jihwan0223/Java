package cote.exam1015;

public class ChessPizza extends Pizza{
	//public String name = "치즈피자";
	//public int[] prices = {10000, 20000, 30000};
	//public String size;
	
	public ChessPizza(){
		size = "M";
	}
	public ChessPizza(String size) {
		this.size = size;
		this.name = "치즈피자";
		prices = new int[] {10000, 20000, 30000};
	}
	public void Cook() {
		System.out.println(name + size + "을 조리합니다");
		System.out.println(name + size + "이 완성되었습니다");
	}
	public void serve() {
		int price;
		switch(size){
		case "S": price = prices[0];
		case "L": price = prices[2];
		default: price = prices [1];
	/* int price = prices[1];
	if(size == "S") price = prices[0];
	else if( size == "L") price = prices[2];
	*/
	}
	System.out.println(name + size + "입니다 가격:" + price);
	}
}
