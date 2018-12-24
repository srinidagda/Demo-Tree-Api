package demo;

import java.util.Stack;

public class PreOrderTraversal {
	Node root;
	PreOrderTraversal() {
		root = null;
	}
	
	void preOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> s = new Stack<>();
		s.push(root);
		while (!s.isEmpty()) {
			Node tmp = s.peek();
			System.out.print(tmp.key+ ", ");
			s.pop();
			if (tmp.right != null) {
				s.push(tmp.right);
			}
			if (tmp.left != null) {
				s.push(tmp.left);
			}
		}
	}
	
	void preOrderTraversal() {
		preOrderTraversal(root);
	}
	
	public static void main(String args[]) {
		PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
		preOrderTraversal.root = new Node(10);
		preOrderTraversal.root.left = new Node(5);
		preOrderTraversal.root.right = new Node(19);
		preOrderTraversal.root.left.left = new Node(2);
		preOrderTraversal.root.left.right = new Node(11);
		preOrderTraversal.root.left.left.right = new Node(8);
		preOrderTraversal.root.right.left = new Node(-2);
		preOrderTraversal.root.right.right = new Node(6);
		preOrderTraversal.preOrderTraversal();
	}
}
