package bussiness;

public class Account implements Depositable, Withrawable, Balancable {
	
	protected double balance;
	
	

	public Account() {
		super();
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double getbalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void setBalance(double bal) {
	balance = bal;

	}

	@Override
	public void withdraw(double amt) {
		balance -= amt;

	}

	@Override
	public void deposit(double amt) {
		balance += amt;
		

	}

}
