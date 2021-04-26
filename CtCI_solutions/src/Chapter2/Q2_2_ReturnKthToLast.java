package Chapter2;

import Commons.ListFunctions;
import Commons.Node;

public class Q2_2_ReturnKthToLast {

	/*
	 * 
	 * 0    1    2    3    4    5    6
	 * 4 -> 2 -> 5 -> 5 -> 5 -> 7 -> 7 -> null
	 * 
	 * */
	public static void main(String[] args) {
		
		Node list1 = new Node(new int [] {4, 2, 5, 5, 5, 7, 7});
		ListFunctions.printList(list1);
		list1 = returnKth(list1, 3);
		ListFunctions.printList(list1);
		
		System.out.println("---------------------------");
		
		Node list2 = new Node(new int [] {4, 2, 5, 5, 5, 7, 7, 7, 7, 8, 8, 1});
		ListFunctions.printList(list2);
		list2 = returnKth(list2, 8);
		ListFunctions.printList(list2);
		
		System.out.println("---------------------------");
		
		Node list3 = new Node(new int [] {4, 2});
		ListFunctions.printList(list3);
		list3 = returnKth(list3, 6);
		ListFunctions.printList(list3);
		
	}
	
	public static Node returnKth(Node head, int k) {
		
		Node current = head;

		for(int i = 0; i < k - 1 ; i++) {
			
			if(current == null) {
				return null;
			}
			current = current.next;
		}
		return current;
	}
	
	
}
