package kary;

import java.util.ArrayList;
import java.util.List;

public class Node {
	public Node parent;
	public List<Node> childern;
	public Object info;
	
	public static int maxNrOfChildern;
	
	public Node(Object info) {
		this.info = info;
		this.childern = new ArrayList<>(maxNrOfChildern);
	}
	
	public void addChild(Node childNode, int position) {
		if (position>= maxNrOfChildern -1) {
			System.out.println("You can not add the child at the position, Because Arraylist will be overflow");
		} else {
				childNode.parent = this;
				this.childern.add(position,childNode);
			}
		}
}
