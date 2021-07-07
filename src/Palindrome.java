import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Word to check Palindrome");
		String p = s.next();
		String n = p;
		s.close();
		int i,j=n.length()-1;
		for(i = 0; i<n.length(); i++) {
				if(n.charAt(i)==n.charAt(j)){
					j--;
					continue;
				}
				else
					break;
		}
		if(i==n.length())
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}

}
