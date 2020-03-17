package com.capgeminilab6.two;

public class CurrentAccount extends Account{
	private final int overdraft = -5000;
   @Override
	public boolean withdraw(double withDraw) {
		if (super.getBalance() > overdraft) {
			super.setBalance(super.getBalance() - withDraw);
			return true;
		} 
		return false;
   }
}
