
class Account{
	int accountNo;
	String accountType;
	int accountBalance;
	void setAccountDetails(int accountNo,String accountType,int accountBalance) {
		this.accountBalance = accountBalance;
		this.accountNo = accountNo;
		this.accountType = accountType;
	}
	void withdraw(int amount) {
		accountBalance -= amount;
		System.out.println(amount+" withdrawn");
	}
	void deposit(int amount){
		accountBalance += amount;
		System.out.println(amount+" deposited");
	}
	void dispAccountDetails() {
		System.out.println("Account Number = "+accountNo);
		System.out.println("Account Name = "+accountType);
		System.out.println("Balance Amount = "+accountBalance);
	}
}
public class Main1 {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccountDetails(1234, "Chq",10000);
		a1.dispAccountDetails();
		a1.withdraw(500);
		a1.dispAccountDetails();
		a1.deposit(500);
		a1.dispAccountDetails();
	}

}
