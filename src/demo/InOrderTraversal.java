package demo;

import java.util.Stack;

public class InOrderTraversal {
	Node root;
	InOrderTraversal() {
		root = null;
	}
	
	void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> s = new Stack<>();
		Node curr = root;
		while (curr != null || s.size() > 0) {
			while (curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.key+", ");
			curr = curr.right;
		}
	}
	
	void inOrderTraversal() {
		inOrderTraversal(root);
	}
	
	public static void main(String args[]) {
		InOrderTraversal inOrderTraversal = new InOrderTraversal();
		inOrderTraversal.root = new Node(10);
		inOrderTraversal.root.left = new Node(11);
		inOrderTraversal.root.left.left = new Node(2);
		inOrderTraversal.root.left.right = new Node(-1);
		inOrderTraversal.root.right = new Node(16);
		inOrderTraversal.root.right.left = new Node(10);
		inOrderTraversal.root.right.left.left = new Node(9);
		inOrderTraversal.root.right.left.right = new Node(11);
		inOrderTraversal.inOrderTraversal();
		
	}
}
