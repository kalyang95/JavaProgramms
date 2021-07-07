import java.util.Scanner;

class Rectangle1{
	int length;
	int breadth;
	Rectangle1(int length,int breadth){
		this.breadth = breadth;
		this.length = length;
	}
	int area() {
		return length*breadth;
	}
}
public class RectangleConst {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		int l = s.nextInt();
		int b = s.nextInt();
		Rectangle1 r = new Rectangle1(l,b);
		System.out.println("Area of the rectangle is "+r.area());
	}

}
