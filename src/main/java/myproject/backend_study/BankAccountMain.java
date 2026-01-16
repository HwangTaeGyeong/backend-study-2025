package myproject.backend_study;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();

		// 입급
		bankAccount.deposit(5000);
		System.out.println(bankAccount.getBalance());

		bankAccount.withdraw(10000);
		System.out.println(bankAccount.getBalance());
	}
}
