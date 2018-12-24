package week49;

public class LinkedListTest {
	private static Node head;
	private static void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	private static void append(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	public static void main(String[] args) {
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		append(7);
		show();
	}
	private static void show() {
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.print(node.data+" ");
	}
}

class Node{
	public int data;
	public Node next;
	Node(int data) {
		this.data = data;
		next = null;
	}
}