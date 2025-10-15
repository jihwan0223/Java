package cote.exam1015;

import java.util.Scanner;
public abstract class PizzaExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuIndex = sc.nextInt();
		String size = sc.next();
		sc.close();
		
		Pizza p;
		if(menuIndex == 1) {
			p = new ChessPizza(size);
		}
		else if(menuIndex == 2){
			p = new Peppernoni(size);
		}
		else {
			p = new FiregogiPizza(size);
		}
		p.Cook();
		p.serve();
	}
}
