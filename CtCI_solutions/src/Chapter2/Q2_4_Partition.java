package Chapter2;

import Commons.ListFunctions;
import Commons.Node;

public class Q2_4_Partition {

	
	/*
	 * Input 
	 * 
	 * 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 -> null [partition = 5]
	 * 
	 * smaller = 3 -> 2 -> 1 -> 
	 * greater = 5 -> 8 -> 5 -> 10 ->
	 * 
	 * smallerTail.next = greater
	 * 
	 * Output
	 * 
	 * 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8 -> null
	 * 
	 * */
	
	public static void main(String[] args) {
		
		Node list1 = new Node(new int [] {3, 5, 8, 5, 10, 2, 1});
		Node list2 = new Node(new int [] {1, 2, 33, 4, 5, 6, 6, 6, 1, 8});
		Node list3 = new Node(new int [] {999, 2, 13, 33, 93, 10, 666, 333});
		
		ListFunctions.printList(list1);
		list1 = partitionLinkedList(list1, 5); 				
		ListFunctions.printList(list1);
		
		System.out.println("---------------------------");
		
		ListFunctions.printList(list2);
		list2 = partitionLinkedList(list2, 7); 				
		ListFunctions.printList(list2);
		
		System.out.println("---------------------------");
		
		ListFunctions.printList(list3);
		list3 = partitionLinkedList(list3, 3); 				
		ListFunctions.printList(list3);
		
		System.out.println("---------------------------");
		
	}
	public static Node partitionLinkedList(Node n, int partition) {
		
		if(n == null || n.next == null) {
			return n;
		}
		Node smaller = null;
		Node smallerHead = null;
		Node greater = null;
		Node greaterHead = null;
		
		while(n != null) {
			
			if(n.data < partition) {
				
				if(smaller == null) {
					smaller = new Node(n.data);
					smallerHead = smaller;
				}else {
					smaller.next = new Node(n.data);
					smaller = smaller.next;
				}
				
			}else {
				
				if(greater == null) {
					greater = new Node(n.data);
					greaterHead = greater;
				}else {
					greater.next = new Node(n.data);
					greater = greater.next;
				}
			}
			
			n = n.next;
		}
		if(smaller == null) {
			return greaterHead;
		}
		smaller.next = greaterHead;
		return smallerHead;
	}
	
}
