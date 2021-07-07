package com.Account.Test;

import java.util.Scanner;

import com.Account.Account;

public class AccountMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter account id, account type and account Balance");
		int aid = s.nextInt();
		String aName = s.next();
		int aBalance = s.nextInt();
		Account a = new Account(aid,aName,aBalance);
		int amount;
		while(true) {
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Display Balance");
			System.out.println("4.Exit");
			int ch = s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter amount to deposit");
				amount = s.nextInt();
				a.deposit(amount);
				break;
			case 2:
				System.out.println("Enter amount to Withdraw");
				amount = s.nextInt();
				a.withdraw(amount);
				break;
			case 3:
				System.out.println("Available Balance: "+a.getBalance());
				break;
			case 4:
				System.exit(1);
			default:
				System.out.println("Invalid Option");
			}
		}
	}

}
