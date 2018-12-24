package kary;

import java.util.ArrayList;

public class Tree {
	public Node root;
	public Tree(int kArity) {
		Node.maxNrOfChildern = kArity;
	}
	
	public void addRoot(Object info) {
		root = new Node(info);
		root.parent = null;
		root.childern = new ArrayList<Node>(Node.maxNrOfChildern);
	}
	public void addNewNodeVasithChildOfNodeU(Node u, Object info, int i) {
		Node child = new Node(info);
		u.addChild(child, i);
	}
	public int numberOfNodesInTree(Node rootNode) {
		int count = 0;
		count ++;
		if (rootNode.childern.size() != 0) {
			for (Node ch: rootNode.childern) {
				count = count + numberOfNodesInTree(ch);
			}
		}
		return count;
	}
	public int numberOfNodesInTree() {
		return numberOfNodesInTree(this.root);
	}
	public void changeRoot(Node newRoot, int i) {
		Node oldRoot = this.root;
		newRoot.parent = null;
		newRoot.addChild(oldRoot, i);
		oldRoot.parent = newRoot;
		this.root = newRoot;
	}
	
	public static void main(String args[]) {
		Tree tree = new Tree(3);
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		
		tree.addRoot("root");
		tree.root.addChild(a, 0);
		a.addChild(b,0);
		tree.root.addChild(c, 1);
		System.out.print(tree.numberOfNodesInTree(tree.root));
	}
}
