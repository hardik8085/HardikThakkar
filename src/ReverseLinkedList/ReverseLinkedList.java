package ReverseLinkedList;
import java.util.Scanner;

public class ReverseLinkedList {

	public Node createList(){
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("Enter -1 for null value");
			System.out.println("Enter value of root node");
			int value =-1;
			try{
				value = scanner.nextInt();

			}catch(NumberFormatException e){
				System.out.println("Please enter only number "+ e);
			}
			Node previous = null;
			Node root = null;
			while(value != -1){
				Node node = new Node(null,value);
				if(previous == null ){
					previous = node;
					root = node;
				}
				else{
					previous.next = node;
					previous = node;
				}
				value = scanner.nextInt();

			}
			return root;
		}

	
	
	
	public void printList(Node root){
		if(null == root){
			System.out.println("List if Empty!!");
			return;
		}
		while(root != null){
			System.out.print(root.value );
			root = root.next;
			if(root != null){
				System.out.print("-");
			}
		}
		System.out.println("");
		return;
	}
	
	
	
	
	public Node reverseList(Node head) {

		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}

		Node previous = head;
		Node current = head.next;
		previous.next = null;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;

		}


		return previous;
	}
	
	public static void main(String [] main){
		ReverseLinkedList reveseLinkedList = new ReverseLinkedList();
		Node root = reveseLinkedList.createList();
		System.out.println("Before Reverse");
		reveseLinkedList.printList(root);
		root = reveseLinkedList.reverseList(root);
		System.out.println("After Reverse");
		reveseLinkedList.printList(root);
	}
}
