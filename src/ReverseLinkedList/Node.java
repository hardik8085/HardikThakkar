package ReverseLinkedList;

public class Node {
	Node next;
	int value;
	
	Node(){
		this.next = null;
		this.value = -1;
	}
	Node(Node next, int value){
		this.next = next;
		this.value = value;
	}
}
