package week47;

public class DoubleLinkedListDemo {
	public static int i = 0;
	DoubleLinkedListNode header;
	void process(int data) {
		DoubleLinkedListNode node = new DoubleLinkedListNode(data);
		if (header == null) {
			header = node;
		} else {
			DoubleLinkedListNode n = header;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			node.prev = n;
		}
	}
	
	void show() {
		DoubleLinkedListNode node = header;
		DoubleLinkedListNode last = null;
		while (node.next != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.print(node.data + " ");
		/*System.out.println(" Showing in reverse order ");
		if (node.next == null) {
			System.out.print(node.data + " ");
		}
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}*/
	}
	
	void delete(int poistion) {
		if (header == null) {
			return;
		}
		DoubleLinkedListNode temp = header;
		if (poistion == 0) {
			header = temp.next;
			return;
		}
		for (int i =0; temp!=null && i < poistion -1;i++) {
			temp = temp.next;
		}
		DoubleLinkedListNode next = temp.next.next;
		temp.next = next;
	}
	
	void method() {
		int number1 = 257;
		Integer number5 = 234;
		number1 = (int) number5;
		short number3 = 257;
		float number4 = 257;
	}
	
	public static void main(String args[]) {
		DoubleLinkedListDemo doubleLinkedListDemo = new DoubleLinkedListDemo();
		doubleLinkedListDemo.process(5);
		doubleLinkedListDemo.process(8);
		doubleLinkedListDemo.process(13);
		doubleLinkedListDemo.process(20);
		doubleLinkedListDemo.process(25);
		doubleLinkedListDemo.show();
		System.out.println(" ");
		doubleLinkedListDemo.delete(3);
		doubleLinkedListDemo.show();
		System.out.println("I values is:" + i);
	}
}
