import java.util.Scanner;

public class BigOfThree {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter three numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int big = (a>b && a>c ) ? a : (b>c) ? b : c;;
		System.out.println(big+" is big");
	}

}
