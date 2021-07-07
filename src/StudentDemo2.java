import java.util.Scanner;

class Student2{
	int rollNum;
	String studName;
	double mark1,mark2,mark3,totalMarks;
	Student2(int rollNum,String studName,double mark1,double mark2, double mark3){
		this.rollNum = rollNum;
		this.studName = studName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	void calculateTotal() {
		totalMarks = mark1 + mark2 + mark3;
	}
	void displayStudentDetails() {
		System.out.println("Roll Number = "+rollNum);
		System.out.println("Student Name = "+studName);
		System.out.println("Total Marks = "+totalMarks);
	}
}
public class StudentDemo2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter roll number, Name and 3 subjects marks");
		int rn = s.nextInt();
		String rna = s.next();
		double m1 = s.nextDouble();
		double m2 = s.nextDouble();
		double m3 = s.nextDouble();
		Student2 s1 = new Student2(rn,rna,m1,m2,m3);
		s1.calculateTotal();
		s1.displayStudentDetails();
	}

}
