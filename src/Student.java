import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter roll number:");
		int RN = s.nextInt();
		System.out.println("enter name:");
		String name = s.next();
		System.out.println("enter three subject marks:");
		double a = s.nextDouble();
		double b= s.nextDouble();
		double c = s.nextDouble();
		double total = a+b+c;
		double avg = total / 3;
		System.out.println("Roll Number = "+RN);
		System.out.println("Name = "+name);
		System.out.println("total marks = "+total);
		System.out.println("Average marks = "+avg);
	}

}
