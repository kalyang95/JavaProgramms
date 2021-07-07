
public class EvenOddSum {

	public static void main(String[] args) {
		int i=1,sumEven = 0, sumOdd = 0;
		while(i <= 100)
		{
			if(i % 2 == 0)
				sumEven += i;
			else
				sumOdd += i;
			i++;
		}
		System.out.println("Even sum = "+sumEven);
		System.out.println("Odd sum = "+sumOdd);
	}

}
