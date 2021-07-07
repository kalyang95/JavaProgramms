import java.util.Scanner;

public class MajorMinor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age:");
		int a = s.nextInt();
		if(a>= 18)
		{
			System.out.println("Major");
		}
		else if(a < 0 )
		{
			System.out.println("Invalid Age");
		}
		else
			System.out.println("Minor");
	}

}
