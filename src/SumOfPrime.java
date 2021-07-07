
public class SumOfPrime {

	public static void main(String[] args) {
		int sum = 0,f;
		for(int i = 2; i<=100; i++) {
		f= 0;
			for(int j = 1; j<=i ; j++) {
				if(i%j == 0)
					f++;
			}
			if(f==2)
				sum += i;
		}
		System.out.println(" sum of prime numbers = "+sum);
	}

}
