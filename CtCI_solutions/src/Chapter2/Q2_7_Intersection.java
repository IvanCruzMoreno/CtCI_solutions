package Chapter2;

import Commons.ListFunctions;
import Commons.Node;

public class Q2_7_Intersection {

	/*
	 *  1 -> 2 -> 3 -> 4 -> 5 -> 6  
	 *                     / 			Intersection Node = [5]
	 *  		  3 -> 2 -/ 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		Node list1 = new Node(new int[]{ 1, 2, 3, 4 });
        Node list2 = new Node(new int[]{ 3, 2 });
        Node tail  = new Node(new int[]{ 5, 6 });
        
        list1.appendToTail(tail);
        list2.appendToTail(tail);
        
        ListFunctions.printList(list1);
        ListFunctions.printList(list2);
    	System.out.println("---------- INTERSECTION NODE ----------");
        ListFunctions.printList(thereIsIntersection(list1, list2));
        System.out.println("---------------------------\n");
        
        
        Node list3 = new Node(new int[]{ 1, 2, 3, 4 });
        Node list4 = new Node(new int[]{ 3, 2, 5, 6, 7 });
        
        ListFunctions.printList(list3);
        ListFunctions.printList(list4);
        System.out.println("---------- INTERSECTION NODE ----------");
        ListFunctions.printList(thereIsIntersection(list3, list4));
        System.out.println("---------------------------");
        
	}
	public static Node thereIsIntersection(Node list1, Node list2) {
		
		if(list1 == null || list2 == null) {
			return null;
		}
		
		int sizeList1 = ListFunctions.getSize(list1);
		int sizeList2 = ListFunctions.getSize(list2);
		
		if(sizeList1 < sizeList2) {
			list2 = getKthNode(list2, sizeList2 - sizeList1);
		}else if(sizeList1 > sizeList2) {
			list1 = getKthNode(list1, sizeList1 - sizeList2);
		}
		
		while(list1 != list2) {
			list1 = list1.next;
			list2 = list2.next;
		}
		
		return list1;
	}
	
	public static Node getKthNode(Node n, int x) {
		for(int i = 0; i < x; i++) {
			n = n.next;
		}
		return n;
	}
}
