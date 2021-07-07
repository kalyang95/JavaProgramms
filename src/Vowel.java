import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a letter");
		String a = s.nextLine();
		switch( a ) {
			
		case "a": System.out.println(a+" is an vowel");break;
		case "e": System.out.println(a+" is an vowel");break;
		case "i": System.out.println(a+" is an vowel");break;
		case "o": System.out.println(a+" is an vowel");break;
		case "u": System.out.println(a+" is an vowel");break;
		case "A": System.out.println(a+" is an vowel");break;
		case "E": System.out.println(a+" is an vowel");break;
		case "I": System.out.println(a+" is an vowel");break;
		case "O": System.out.println(a+" is an vowel");break;
		case "U": System.out.println(a+" is an vowel");break;
		default: System.out.println(a+" is not an vowel");System.exit(1);
		}
	}

}
