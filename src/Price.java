import java.util.Scanner;

public class Price {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Item Number:");
		int itn = s.nextInt();
		System.out.println("Enter item Name:");
		String name = s.next();
		System.out.println("Enter rate:");
		double rate = s.nextDouble();
		System.out.println("Enter quantity");
		double quantity = s.nextDouble();
		double price = rate * quantity;
		System.out.println("Item Number = "+itn);
		System.out.println("Item Name = "+name);
		System.out.println("price = "+price);
	}

}
