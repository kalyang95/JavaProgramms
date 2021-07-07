package com.Account;

public class Account{

	int acctId;
	String acctType;
	int acctBalance;
	public Account(int acctId, String acctType,int acctBalance){
		this.acctBalance = acctBalance;
		this.acctId = acctId;
		this.acctType = acctType;
	}
	public void deposit(int amount) {
		acctBalance += amount;
		System.out.println(amount+" deposited");
	}
	public void withdraw(int amount) {
		acctBalance -= amount;
		System.out.println(amount+" withdrawn");
	}
	public int getBalance() {
		return acctBalance;
	}
	public void display() {
		System.out.println("Account Id: "+acctId);
		System.out.println("Account Type: "+acctType);
		System.out.println("Account Balance: "+acctBalance);
	}
}
