
class Student1{
	int rollNum;
	String studName;
	double mark1,mark2,mark3,totalMarks;
	void setStudentDeatails(int rollNum,String studName,double mark1,double mark2,double mark3) {
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
		System.out.println(" Roll Number = "+rollNum);
		System.out.println(" Student Name = "+studName);
		System.out.println(" Total Marks = "+totalMarks);
	}
	
}
public class StudentDemo {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.setStudentDeatails(111,"Pavan",35,36,67);
		s1.calculateTotal();
		s1.displayStudentDetails();
		
	}

}
