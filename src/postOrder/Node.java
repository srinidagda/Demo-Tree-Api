package postOrder;

public class Node {
	int key;
	Node left, right;
	Node(int key) {
		this.key = key;
		left = right = null;
	}
	boolean isLeaf() {
		return left == null? right == null: false;
	}
}
