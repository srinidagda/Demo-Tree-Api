package week48;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedListDemo {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String str = br.readLine();
		String str1[] = str.split(" ");
		LinkedList linkedList = new LinkedList();
		for (int i=0;i<t;i++) {
			linkedList.insert(Integer.parseInt(str1[i]));
		}
		//linkedList.reverse();
		linkedList.moveLastElementToHead();
		linkedList.printList();
	}
}

class LinkedList {
	Node head;
	public void reverse() {
		Node curr,prev,next;
		curr = head;
		prev = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	public void moveLastElementToHead() {
		if (head == null || head.next == null) {
			return;
		}
		Node secLast = null;
		Node last = head;
		while (last.next != null) {
			secLast = last;
			last = last.next;
		}
		secLast.next = null;
		last.next = head;
		head = last;
	}
	public void insert(int data) {
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
	public void printList() {
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data+ " ");
			node = node.next;
		}
		System.out.print(node.data+ " ");
	}
	class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
}
