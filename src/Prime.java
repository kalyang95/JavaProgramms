import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int f=0,n = s.nextInt();
		for(int i = 1 ; i<=n ; i++) {
			if(n%i == 0)
				f++;
		}
		if(f==2)
			System.out.println(n+" is prime number");
		else
			System.out.println(n+" is not a prime number");
	}

}
