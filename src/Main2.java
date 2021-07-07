import java.util.Scanner;

class Account1{
	int accountNo;
	String accountType;
	int accountBalance;
	Account1(int accountNo,String accountType, int accountBalance){
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
public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter account Number, account Type and account Balance");
		int an = s.nextInt();
		String ana = s.next();
		int ab = s.nextInt();
		Account1 a1 = new Account1(an,ana,ab);
		a1.dispAccountDetails();
		a1.withdraw(500);
		a1.dispAccountDetails();
		a1.deposit(500);
		a1.dispAccountDetails();
	}

}
