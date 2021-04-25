package Chapter2;

import java.util.HashSet;
import java.util.Set;

import Commons.Node;

public class Q2_1_RemoveDups {

	/*
	 *  input: 
	 *  
	 *  p -> previous 
	 *  c -> current
	 *  
	 * 	p    p    p              p
	 *  4 -> 2 -> 5 -> 5 -> 5 -> 7 -> 7 -> null
	 *  c	 c    c    c    c     
	 *  
	 * [4 2 5 7]
	 * 
	 *  output:
	 * 
	 *  4 -> 2 -> 5 -> 7 
	 * 
	 * */
	public static void main(String[] args) {
		Node list1 = new Node(new int [] {4, 2, 5, 5, 5, 7, 7});
		printList(list1);
		list1 = removeDuplicates(list1);
		printList(list1);
		
		System.out.println("---------------------------");
		
		Node list2 = new Node(new int [] {4, 2, 5, 5, 5, 7, 7, 7, 7, 8, 8, 1});
		printList(list2);
		list2 = removeDuplicates(list2);
		printList(list2);
		
		
	}
	public static Node removeDuplicates(Node current) {
		
		Set<Integer> stored = new HashSet<>();
		Node previous = null;
		Node head = current;
		
		while( current != null ) {
		
			if(stored.contains(current.data)) {
				previous.next = current.next;
			}else {
				stored.add(current.data);
				previous = current;
			}
			current = current.next;
		}
		 return head;
	}
	
	public static void printList(Node head) {
		
		if (head == null) {
            return;
        }
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
	}
}
