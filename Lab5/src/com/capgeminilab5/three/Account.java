package com.capgeminilab5.three;

public abstract class Account extends Person{
	private long accNum;
	private static long accInc = 1000;
	protected double balance;
	private Person accHolder;
	
	public Account(){
		accInc++;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum() {
		this.accNum = accInc;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double depositamt) {
		this.balance=balance+depositamt;
	}
	public abstract void withdraw(double withdrawamt);
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	public double getBal() {
		return this.balance;
	}
	
}
