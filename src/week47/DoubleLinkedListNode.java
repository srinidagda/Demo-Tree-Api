package week47;

public class DoubleLinkedListNode {
	public int data;
	public DoubleLinkedListNode prev;
	public DoubleLinkedListNode next;
	public DoubleLinkedListNode(int data)  {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}
