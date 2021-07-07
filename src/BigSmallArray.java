import java.util.Scanner;

public class BigSmallArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of the array");
		int size = s.nextInt();
		int swap,n[]= new int[size];
		System.out.println("Enter "+size+" values");
		for(int i= 0; i<size ; i++)
			n[i]=s.nextInt();
		for(int i=0;i<n.length;i++) {
			for(int j = i+1; j < n.length; j ++) {
				if(n[i]<n[j]) {
					swap = n[j];
					n[j]=n[i];
					n[i]=swap;
				}
			}
		}
		System.out.println("Big = "+n[0]);
		System.out.println("Second Big = "+n[1]);
		System.out.println("Small = "+n[size-1]);
		System.out.println("second small = "+n[size-2]);
	}

}
