package week47;

public class LinkedListDemo {
	Node header;
	
	void push(int data) {
		Node node = new Node(data);
		node.next = header;
		header = node;
	}
	
	void insert(int data) {
		Node node = new Node(data);
		if (header == null) {
			header = node;
		} else {
			Node n = header;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	void show() {
		Node node = header;
		Node last = null;
		while (node.next != null) {
			System.out.print(node.data+ " ");
			node = node.next;
		}
		System.out.print(node.data+ " ");
	}
	void delete(int position) {
		if (header == null) {
			return;
		}
		Node temp = header;
		if (position == 0) {
			header = temp.next;
			return;
		}
		for(int i=0;temp!=null&&i<position-1;i++){
			temp = temp.next;
		}
		Node next = temp.next.next;
		temp.next = next;
	}
	
	public static void main(String args[]) {
		LinkedListDemo linkedListDemo = new LinkedListDemo();
		linkedListDemo.insert(5);
		linkedListDemo.insert(3);
		linkedListDemo.insert(18);
		linkedListDemo.insert(20);
		linkedListDemo.insert(25);
		linkedListDemo.push(1);
		linkedListDemo.show();
		linkedListDemo.delete(0);
		System.out.println("****");
		linkedListDemo.show();
	}
}
