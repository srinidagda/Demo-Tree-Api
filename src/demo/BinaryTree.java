package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
	Node root;
	BinaryTree() {
		root = null;
	}
	
	void printPreOrder(Node node) {
		if(node == null) {
			return;
		}
		/* First print data of node*/
		System.out.print(node.key+" ");
		
		/* then recursive left node */
		printPreOrder(node.left);
		
		/* then recursive right node*/
		printPreOrder(node.right);
	}
	
	void printPostOrder(Node node) {
		if (node == null) {
			return;
		}
		/* Traverse left node */
		printPostOrder(node.left);
		/* Then traverse right node */
		printPostOrder(node.right);
		/* then traverse root node */
		System.out.print(node.key+" ");
	}
	
	void printInOrder(Node node) {
		if (node == null) {
			return;
		}
		/* Traverse left Node */
		printInOrder(node.left);
		/* Traverse root node */
		System.out.print(node.key + " ");
		/* Traverse right node */
		printInOrder(node.right);
	}
	
	void printPreOrder() {
		printPreOrder(root);
	}
	
	void printPostOrder() {
		printPostOrder(root);
	}
	void printInOrder() {
		printInOrder(root);
	}
	
	void preOrderTraversal() {
		preOrderTraversal(root);
	}
	
	void inOrderTraversal(){
		inOrderTraversal(root);
	}
	
	public static void main(String args[]) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(1);
		binaryTree.root.left = new Node(2);
		binaryTree.root.right = new Node(3);
		binaryTree.root.left.left = new Node(4);
		binaryTree.root.left.right = new Node(5);
		binaryTree.root.right.left = new Node(6);
		//binaryTree.printPreOrder();
		//System.out.println("******* ---- ******");
		//binaryTree.printPostOrder();
		//System.out.println("******* ---- ******");
		//binaryTree.printInOrder();
		//System.out.println("******* ---- ******");
		//binaryTree.preOrderTraversal();
		System.out.println("******* ---- ******");
		binaryTree.inOrderTraversal();
	}
	
	public void preOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> s = new Stack<>();
		s.push(root);
		while (!s.isEmpty()) {
			Node tmp = s.peek();
			System.out.print(tmp.key+ " ");
			s.pop();
			if (tmp.right != null) {
				s.push(tmp.right);
			}
			if (tmp.left != null) {
				s.push(tmp.left);
			}
		}
	}
	
	public void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> s = new Stack<>();
		Node curr = root;
		while (curr != null || s.size() > 0) {
			while (curr != null) {
				//System.out.println("Current Key is " + curr.key);
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.key+" ");
			curr = curr.right;
		}
	}
}
