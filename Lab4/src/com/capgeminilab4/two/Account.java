package com.capgeminilab4.two;

import com.capgeminilab4.one.Person;

public class Account extends Person{
	private long accNum;
	private static long accInc = 1000;
	private double balance;
	private Person accHolder;
	
	Account(){
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
	public boolean withdraw(double withdrawamt) {
		this.balance=balance-withdrawamt;
		return true;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	public double getBal() {
		return this.balance;	
	}
}
