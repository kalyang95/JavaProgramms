package com.atm;

public class Customer extends Thread{
	ATM atm;
	String name;
	int amount;
	public Customer(ATM atm) {
		this.atm = atm;
	}
	public void run() {
		atm.checkBalance("Pavan");
		atm.withdraw("Kalyan", 3000);
	}
}
