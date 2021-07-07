class Book{
	int bno;
	String bname;
	double price;
	Book(int bno,String bname,double price){
		this.bname = bname;
		this.bno = bno;
		this.price = price;
	}
	void display() {
		System.out.println("Book Number: "+bno);
		System.out.println("Book Name: "+bname);
		System.out.println("Book Price: "+price);
	}
}
class SpecialEditionBook extends Book{
	int discount;
	SpecialEditionBook(int bno,String bname,double price,int discount){
		super(bno,bname,price);
		this.discount = discount;
	}
	void display() {
		super.display();
		System.out.println("Discount: "+discount);
	}
}
public class BookTest {

	public static void main(String[] args) {
		SpecialEditionBook b = new SpecialEditionBook(111,"sherlock",25.00,5);
		b.display();
	}

}
