package com.capgeminilab4.two;

public class SavingAccount extends Account {
	private final double minBalance = 1000;

	public boolean withdraw(double amount) {
		if (super.getBalance() > minBalance && (super.getBalance() - amount) >= minBalance) {
			super.setBalance(super.getBalance() - amount);
			return true;
		} 
		return false;
	}
}
