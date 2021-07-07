package com.atm;

public class ATM {
	
	synchronized public void checkBalance(String name) {
		System.out.println(name + " is checking ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("the balance");
	}
	synchronized public void withdraw(String name, int amount) {
		System.out.println(name+" is withdrawing "+amount);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" dollars");
	}
	
}
