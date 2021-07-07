interface Fruit1{
	void cost();
}
class Apple1 implements Fruit1{
	public void cost() {
		System.out.println("The Fruit is Apple");
	}
}
class Mango1 implements Fruit1{
	public void cost() {
		System.out.println("The Fruit is Mango");
	}
}
public class FruitDemo2 {

	public static void main(String[] args) {
		Fruit1 a = new Apple1();
		Fruit1 m = new Mango1();
		a.cost();
		m.cost();
	}

}
