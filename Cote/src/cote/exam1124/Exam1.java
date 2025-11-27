package cote.exam1124;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exam1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a + b);
		scanner.close();
		} catch(InputMismatchException e) {
			System.out.println("숫자가 아님");
		}
	}
}