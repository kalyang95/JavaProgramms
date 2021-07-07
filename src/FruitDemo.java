abstract class Fruit{
	
	abstract void cost();
	
}
class Apple extends Fruit{
	void cost() {
		System.out.println("Fruit is Apple");
	}
}
class Mango extends Fruit{
	void cost() {
		System.out.println("Fruit is Mango");
	}
}
public class FruitDemo {

	public static void main(String[] args) {
		Fruit a = new Apple();
		a.cost();
		Fruit m = new Mango();
		m.cost();
	}

}
