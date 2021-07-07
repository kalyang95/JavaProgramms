import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter item number , name , rate and quantity");
		int Itn = s.nextInt();
		String Itna = s.next();
		double rate = s.nextDouble();
		double quantity = s.nextDouble();
		double price = rate * quantity;
		double dis = 0;
		if(price<1000)
			dis = price*1;
		else if(price >= 1000 && price < 2000)
			dis = price * 0.10;
		else if( price >= 2000 && price < 3000 )
			dis = price * 0.15;
		else if ( price >= 3000 && price < 5000)
			dis = price * 0.20;
		else
			dis = price * 0.25;
		double netprice = price - dis;
		System.out.println("item number = "+Itn);
		System.out.println("item name = "+Itna);
		System.out.println("price = "+price);
		System.out.println("discount = "+dis);
		System.out.println("Net Price = "+netprice);
	}

}
