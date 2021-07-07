package myException;

import java.util.Scanner;


class WithdrawException extends Exception{
	
	
	WithdrawException(String msg){
		super(msg);
	}
	WithdrawException(){}
}
class Account{
	void withdraw(int amount,int balance) throws WithdrawException{
		if(amount > balance)
			throw new WithdrawException("Withdraw Amount should be less than Balance");
		else {
			balance -= amount;
			System.out.println(amount+" withdrawn from the balance");
		}
	}
}
public class AccountTest {

	public static void main(String[] args)  {
		Account a = new Account();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount to withdraw and balance of the account");
		int b = s.nextInt();
		int c = s.nextInt();
		try {
		a.withdraw(b,c);
		}
		catch(WithdrawException e) {
			//System.out.println(e.getMessage());
			//System.out.println(e);
			e.printStackTrace();
		
		}
	}

}
