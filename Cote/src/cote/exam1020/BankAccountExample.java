package cote.exam1020;

public class BankAccountExample {
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount ("a", "1231");
		System.out.println(account.getBalance());
		
		int currentBalance = account.deposit(10000);
		System.out.println(currentBalance);
		System.out.println(account.getBalance());
		
		int finalAmount = account.Withdrawal(5000);
		System.out.println(finalAmount);

		
		finalAmount = account.Withdrawal(7000);
		System.out.println(finalAmount);
		System.out.println(account.getBalance());
		
		System.out.println(BankAccount.getCount());
		
		BankAccount account2 = new BankAccount("b", "1234235");
		System.out.println(BankAccount.getCount());
	}
}
