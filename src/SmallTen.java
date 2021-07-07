import java.util.Scanner;

public class SmallTen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 2,small,n;
		System.out.println("enter a number:");
		n= s.nextInt();
		small = n;
		while(i<=10)
		{
			if(n<small)
				small = n;
			System.out.println("enter a number:");
			n= s.nextInt();
			i++;
		}
		System.out.println("small = "+ small);
	}

}
