import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a line to Reverse all words");
		String string = s.nextLine();
		s.close();
		String a[]= string.split(" ");
		for(int i = 0; i<a.length; i++) {
			for(int j = a[i].length()-1; j>=0; j--) {
				System.out.print(a[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
