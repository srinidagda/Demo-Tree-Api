package postOrder;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {
	Node root;
	ArrayList<Integer> list = new ArrayList<>();
	
	ArrayList<Integer> postOrderTraversal(Node node) {
		Stack<Node> s = new Stack<>();
		if (node == null) {
			return list;
		}
		s.push(node);
		Node prev = null;
		while (!s.isEmpty()) {
			Node curr = s.peek();
			if (prev == null || prev.left == curr || prev.right == curr) {
				if (curr.left != null) {
					s.push(curr.left);
				} else if (curr.right != null) {
					s.push(curr.right);
				} else {
					s.pop();
					list.add(curr.key);
				}
			} else if (curr.left == prev) {
				if (curr.right != null) {
					s.push(curr.right);
				} else {
					s.pop();
					list.add(curr.key);
				}
			} else if (curr.right == prev) {
				s.pop();
				list.add(curr.key);
			}
			prev = curr;
		}
		return list;
	}
	
	public void postOrderTraversal1(Node root) {
		Stack<Node> s = new Stack<>();
		s.push(root);
		
		while (!s.isEmpty()) {
			Node curr = s.peek();
			if (curr.isLeaf()) {
				Node node = s.pop();
				System.out.print(node.key+", ");
			} else {
				if (curr.right != null) {
					s.push(curr.right);
					curr.right = null;
				}
				if (curr.left != null) {
					s.push(curr.left);
					curr.left = null;
				}
			}
		}
		
	}
	
	public  static void main(String args[]) {
		PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
		postOrderTraversal.root = new Node(1);
		postOrderTraversal.root.left = new Node(2);
		postOrderTraversal.root.right = new Node(3);
		postOrderTraversal.root.left.left = new Node(4);
		postOrderTraversal.root.left.right = new Node(5);
		postOrderTraversal.root.right.left = new Node(6);
		postOrderTraversal.root.right.right = new Node(7);
		ArrayList<Integer> list = postOrderTraversal.postOrderTraversal(postOrderTraversal.root);
		System.out.println(list);
		postOrderTraversal.postOrderTraversal1(postOrderTraversal.root);
		System.out.println(Integer.MIN_VALUE);
	}
}
