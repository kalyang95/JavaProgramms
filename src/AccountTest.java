import java.util.Scanner;

class Customer{
	int custId;
	String custName;
	String custAddress;
	Customer(int custId, String custName, String custAddress){
		this.custAddress = custAddress;
		this.custId = custId;
		this.custName = custName;
	}
	void display() {
		System.out.println(" Customer Id = "+custId);
		System.out.println(" Customer Name is "+custName);
		System.out.println(" Customer Address :"+custAddress);
	}
}
class Account2{
	int acctId;
	String acctType;
	Customer c;
	int acctBalance;
	Account2(int acctId,String acctType,Customer c, int acctBalance){
		this.acctBalance = acctBalance;
		this.acctId = acctId;
		this.acctType = acctType;
		this.c = c;
	}
	void display() {
		System.out.println(" Account Id :"+acctId);
		System.out.println(" Account Type: "+acctType);
		System.out.println("Account Balance: "+acctBalance);
	}
}
public class AccountTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("account id, account type,customer id, customer name, customer address and account balance");
		int aid = s.nextInt();
		String at = s.next();
		int cid = s.nextInt();
		String cn = s.next();
		String ca = s.next();
		int b = s.nextInt();
		Customer c = new Customer(cid,cn,ca);
		Account2 a = new Account2(aid,at,c,b);
		a.display();
		c.display();
	}

}
