package cote.exam1015;

import java.util.Scanner;

public class OrderExample {

	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		menus[0] = new Menu("asdf", 1000);
		menus[1] = new Menu("qwer", 3000);
		menus[3] = new Menu("zxcv", 5000);
		
		Scanner sc = new Scanner(System.in);
		int menuIndex = sc.nextInt();
		int quantity = sc.nextInt();
		sc.close();
		// 가격 출력
		
		if(menuIndex >= 0 && menuIndex < menus.length && quantity > 0) {
			OrderItem o = new OrderItem(menus[menuIndex], quantity);
			System.out.println(o.getPrice());
		}
	}
}
