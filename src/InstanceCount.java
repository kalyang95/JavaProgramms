

class Count{
	static int i;
	Count(){
		i++;
	}
}
public class InstanceCount {

	public static void main(String[] args) {
		Count a = new Count();
		Count b = new Count();
		System.out.println("no of instance for the class Count is "+Count.i);
		
	}

}
