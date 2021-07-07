package collections;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		int ch,index;
		Object e;
		while(true) {
			System.out.println("1.Add element at the last");
			System.out.println("2.Add element at the first");
			System.out.println("3.Add element at the given Index");
			System.out.println("4.Update element at the given Index");
			System.out.println("5.Remove the first element");
			System.out.println("6.Remove the last element");
			System.out.println("7.Remove the given element");
			System.out.println("8.Remove the element at the given index");
			System.out.println("9.Display the elements");
			System.out.println("10.exit");
			ch = sc.nextInt();
			switch(ch) {
			
			case 1: System.out.println("Enter the element to Add at last");
					e=sc.next();
					ll.addLast(e);
					break;
			case 2: System.out.println("Enter the element to Add First");
			        e = sc.next();
			        ll.addFirst(e);
			        break;
			case 3: System.out.println("Enter element and the index in order");
			        e=sc.next();
			        index = sc.nextInt();
			        ll.add(index, e);
			        break;
			case 4: System.out.println("Enter element and the index in order to update");
			        e=sc.next();
			        index = sc.nextInt();
			        ll.set(index, e);
			        break;
			case 5: System.out.println("Removing the First element");
					ll.removeFirst();
					break;
			case 6: System.out.println("Removing the Last element");
			 		ll.removeLast();
			 		break;
			case 7: System.out.println("Enter the element to Remvoe");
			 		e = sc.next();
			 		ll.remove(e);
			 		break;
			case 8: System.out.println("Enter the index to remove the element");
			 		index =sc.nextInt();
			 		ll.remove(index);
			 		break;
			case 9: System.out.println("Elements");
			 		System.out.println("--------");
			 		for(Object s : ll)
			 			System.out.println(s);
			 		break;
			case 10: System.exit(1);
			default: System.out.println("Invalid Option");
			}
		}
	}

}
