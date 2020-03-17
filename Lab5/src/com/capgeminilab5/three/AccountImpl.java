package com.capgeminilab5.three;

public class AccountImpl extends Account{
	public void withdraw(double withdrawamt) {
		this.balance=balance-withdrawamt;
	}
}
