import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any year");
		int year = s.nextInt();
		if( year%4 == 0 ) {
			if(year%400 == 0)
				System.out.println("is leap year");
			else if(year%100 == 0)
				System.out.println("not a  leap year");
			else
				System.out.println("is leap year");
		}
	}
}
