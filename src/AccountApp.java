import java.util.*;
import java.io.*;


class Account4 implements Serializable{
	String accno;
	String aname;
	double balance;
	Account4(){}
	Account4(String accno,String aname,double balance){
		this.accno = accno;
		this.aname = aname;
		this.balance = balance;
	}
}
public class AccountApp {



	public static void main(String[] args) throws Exception {
		
		HashMap<String,Account4> hm = new HashMap<>();
		Account4 acc = null;
		String accno;
		String aname;
		double balance;
		Scanner sc= new Scanner(System.in);
		try {
		FileInputStream fis = new FileInputStream("Account.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		int count = ois.readInt();
		for(int i = 0;i<count;i++) {
			acc= (Account4) ois.readObject();
			System.out.println(acc);
			hm.put(acc.accno,acc);
		}
		fis.close();
		ois.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		FileOutputStream fos = new FileOutputStream("Account.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		while(true){
			System.out.println("1.Create Account");
			System.out.println("2.Delete Account");
			System.out.println("3.View Account");
			System.out.println("4.ViewAll Accounts");
			System.out.println("5.Save Accounts");
			System.out.println("6.Exit");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			switch(ch)
			{
			case 1:
				System.out.println("Enter Account number, Account name, Balance");
				accno = sc.nextLine();
				aname = sc.nextLine();
				balance = sc.nextDouble();
				acc = new Account4(accno,aname,balance);
				hm.put(accno,acc);
				break;
			case 2:
				System.out.println("Eneter Account number to be deleted");
				accno = sc.nextLine();
				hm.remove(accno);
				break;
			case 3:
				System.out.println("Enter Accno");
				accno = sc.nextLine();
				acc = hm.get(accno);
				System.out.println(acc);
				break;
			case 4:
				for(Account4 a:hm.values())
					System.out.println(a);
				break;
			case 5:
			case 6:
				oos.writeInt(hm.size());
				for(Account4 a:hm.values())
					oos.writeObject(a);
				
			}
		}
		
	}

}
