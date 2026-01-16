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
		this.balance = this.balance + balance;
	}

	public void withdraw(int balance) {
		this.balance = this.balance - balance;
	}
}
