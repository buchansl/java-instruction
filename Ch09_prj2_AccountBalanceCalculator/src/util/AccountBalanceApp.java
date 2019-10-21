package util;

import java.text.NumberFormat;

import bussiness.Account;
import bussiness.CheckingAccount;
import bussiness.Savings;

public class AccountBalanceApp {
	static NumberFormat cf = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		System.out.println("Welcome to the Account Balance Calculator");

		CheckingAccount ca = new CheckingAccount(1000, 1);
		Savings sa = new Savings(1000, 0);

		System.out.println("Starting: Balance:");
		displayBalance(ca, sa);
		System.out.println("Enter transactions for the Month:");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			String txn = Console.getString("Withdraw or Deposit?");
			String acct = Console.getString("Checking or Savings?");
			double amt = Console.getDouble("Amount?", 0, Double.POSITIVE_INFINITY);

			Account a = null;
			if (acct.equalsIgnoreCase("c")) {
				a = ca;
			} else if (acct.equalsIgnoreCase("s")) {

				a = sa;
			}

			else {
				System.out.println("Invalid account type");
				continue;
			}
			if (txn.equalsIgnoreCase("w")) {
				a.withdraw(amt);
			}
			if (txn.equalsIgnoreCase("d")) {
				a.deposit(amt);
			} else {
				System.out.println("Invalid txn.");
				continue;
			}
			choice = Console.getString("continue?");

		}

		System.out.println("Monthly Payments and Fees:");
		System.out.println("Checking Fee: " + cf.format(ca.getMonthlyFee()));
		System.out.println("Savings Interest Payment: " + cf.format(sa.getMonthlyInterestPayment()));

		System.out.println("Final Balance:");
		displayBalance(ca, sa);

		System.out.println("bye");
	}

	private static void displayBalance(CheckingAccount ca, Savings sa) {
		System.out.println("Checking:" + cf.format(ca.getbalance()));
		System.out.println("Savings:" + cf.format(ca.getbalance()));
	}
}
