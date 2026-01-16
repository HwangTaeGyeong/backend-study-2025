package myproject.backend_study;

public class BankAccount {
	private final int BASIC_BALANCE = 10000;
	private int balance;

	public BankAccount() {
		this.balance = BASIC_BALANCE;
	}

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int balance) {
		if (balance < 0) {
			System.out.println("balance 를 음수로 사용할 수 없습니다.");
			return;
		}

		this.balance = this.balance + balance;
	}

	public void withdraw(int balance) {
		if (balance < 0) {
			System.out.println("balance 를 음수로 사용할 수 없습니다.");
			return;
		}

		if (this.balance < balance) {
			System.out.println("잔액이 출금액보다 적습니다.");
			return;
		}

		this.balance = this.balance - balance;
	}
}
