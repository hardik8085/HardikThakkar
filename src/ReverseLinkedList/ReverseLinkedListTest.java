package ReverseLinkedList;

import static org.junit.Assert.*;

import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListTest {

	ReverseLinkedList reverserLinkedList = new ReverseLinkedList();

	@Test
	public void nullLinkedList() {
		Assert.assertNull(reverserLinkedList.reverseList(null));
	}

	@Test
	public void oneElementLinkedList() {
		Node node = new Node(null, 1);
		Node reversedNode = reverserLinkedList.reverseList(node);
		assertEquals(reversedNode.value, node.value);
	}

	@Test
	public void moreElementLinkedList() {
		Node node3 = new Node(null, 3);
		Node node2 = new Node(node3, 2);
		Node node1 = new Node(node2, 1);
		Node reversedNode = reverserLinkedList.reverseList(node1);

		assertEquals(reversedNode.value, node3.value);
		reversedNode = reversedNode.next;
		assertEquals(reversedNode.value, node2.value);
		reversedNode = reversedNode.next;
		assertEquals(reversedNode.value, node1.value);

	}
}
