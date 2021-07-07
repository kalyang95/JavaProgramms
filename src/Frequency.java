import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of the array");
		int f=0,size = s.nextInt();
		int n[]= new int[size];
		System.out.println("Enter "+size+" values");
		for(int i= 0; i<size ; i++)
			n[i]=s.nextInt();
		System.out.println("enter element to find the frequency");
		int key = s.nextInt();
		for(int i = 0;i<n.length;i++) {
			if(n[i]==key)
				f++;
		}
		System.out.println("Frequency of "+key+" = "+f);
	}

}
