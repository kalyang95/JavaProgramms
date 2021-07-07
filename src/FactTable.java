
public class FactTable {

	public static void main(String[] args) {
		int f= 1,sum=0;
		System.out.println("----------------------------");
		System.out.println(" Number          Factorial");
		System.out.println("----------------------------");
		for(int i = 1;i<= 5;i++)
		{
			System.out.print("   "+i);
			f=f*i;
			sum+= f;
			System.out.println("                 "+f);
			System.out.println();
		}
		System.out.println("----------------------------");
		System.out.print("   Sum");
		System.out.println("       =       "+sum);
		
		System.out.println("----------------------------");
	}

}
