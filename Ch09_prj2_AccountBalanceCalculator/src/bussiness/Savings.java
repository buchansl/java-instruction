package bussiness;

public class Savings extends Account {
	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	public Savings() {
		super();
	}
	public Savings(double balance, double monthlyInterestRate) {
		super();
		this.monthlyInterestRate = monthlyInterestRate;
		this.monthlyInterestPayment = monthlyInterestPayment;
	}
	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}
	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}
	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}
	public void setMonthlyInterestPayment(double monthlyInterestPayment) {
		this.monthlyInterestPayment = monthlyInterestPayment;
	}
public void applyPaymentToBalance() {
	monthlyInterestPayment = balance * monthlyInterestRate;
	balance += monthlyInterestPayment;
	
}
}
