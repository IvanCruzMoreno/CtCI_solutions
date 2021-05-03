package Chapter2;


import Commons.Node;

public class Q2_8_LoopDetection {

	/*
	 * lower	.    .    .
	 *  		1 -> 2 -> 3 -> 4 -> 5 
	 * faster   .         .         .   
	 * 
	 * 
	 * lower = lower.next;
	 * faster = faster.next.next;
	 * 
	 * if (lower == faster)
	 * 		lower go to head
	 *  
	 * */

	public static void main(String[] args) {
		
		Node n1 = new Node(1);
		Node n2 = new Node(2); 
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;
        
        Node result = getNodeLoop(n1);
        
        if(result != null) {
        	System.out.println(result.data);
        }else {
        	System.out.println("NULL");
        }
      
	}
	
	public static Node getNodeLoop(Node head) {
		
		
		Node lower = head;
		Node faster = head;
		
		while(faster != null && faster.next != null) {
			lower = lower.next;
			faster = faster.next.next;
			
			if(lower == faster) {
				lower = head;
				
				while(lower != faster) {
					lower = lower.next;
					faster = faster.next;
				}
				return lower;
			}
		}
		
		return null;
	}
}
