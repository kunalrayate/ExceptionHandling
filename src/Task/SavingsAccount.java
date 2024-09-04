package Task;

public class SavingsAccount {
	int acno;
	String name;
	double balance;

	public SavingsAccount(int acno, String name, double balance) {
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}

	public synchronized double deposit(int amt) {
		this.balance += amt;
		return this.balance;
	}

	public synchronized double withrow(int amt) {
		this.balance -= amt;
		return this.balance;
	}

}
