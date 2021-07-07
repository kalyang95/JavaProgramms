import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter a number :");
		int n = s.nextInt();
		int i,sum = 0;
		while(n>0)
		{
			i  = n%10;
			sum += i;
			n= n /10;
		}
		System.out.println("sum of digits = "+sum);
	}

}
