import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter length:");
		int a= s.nextInt();
		System.out.println("enter breadth:");
		int b= s.nextInt();
		int c = a*b;
		System.out.println("area of the rectangle = "+c);
	}

}
