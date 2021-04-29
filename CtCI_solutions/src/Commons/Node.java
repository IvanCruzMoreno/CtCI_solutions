package Commons;

public class Node {

	public Node next = null;
	public int data;
	
	public Node (int d) {
		data = d;
	}
	
	public void appendToTail(int d) {
		Node end = new Node (d);
		Node n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	public Node(int[] array) {
        data = array[0];
        Node current = this;
        for (int i = 1; i < array.length; i++) {
        	current.next = new Node(array[i]);
        	current = current.next;
        }
    }
}
