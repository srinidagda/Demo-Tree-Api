package non_linear_data_structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InsertDataIntoTreeDemo {
  static Node root;

  private static void inOrderTraversal(Node root) {
    /**
     * In Order traversal - LDR
     */
    if(root == null) {
      return;
    }
    Stack<Node> stack = new Stack<>();
    Node curr = root;
    while (curr!= null || stack.size() > 0) {
      while (curr != null) {
        stack.push(curr);
        curr = curr.left;
      }
      curr = stack.pop();
      System.out.println(curr.data);
      curr = curr.right;
    }
  }

  private static void postOrderTraversal(Node root) {
    /**
     * Post - Order Traversal - LRD
     */
    if(root == null) {
      return;
    }
    Stack<Node> stack = new Stack<>();
    Node curr = root;
    stack.push(curr);
    while (!stack.empty()) {
      curr = stack.peek();
      if(curr.isLeaf()) {
        curr = stack.pop();
        System.out.println(curr.data);
      }
      if(curr.right != null) {
        stack.push(curr.right);
        curr.right = null;
      }
      if(curr.left != null) {
        stack.push(curr.left);
        curr.left = null;
      }
    }
  }

  private static void preOrderTraversal(Node root) {
    /**
     * Pre-Order Traversal - DLR
     */
    if(root == null) {
      return;
    }
    Stack<Node> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      Node temp = stack.peek();
      System.out.println(temp.data);
      stack.pop();
      if(temp.right != null) {
        stack.push(temp.right);
      }
      if(temp.left != null) {
        stack.push(temp.left);
      }
    }
  }

  private static void insert(Node temp, int data) {
    Queue<Node> q = new LinkedList<>();
    q.add(temp);
    while (!q.isEmpty()) {
      temp = q.peek();
      q.remove();
      if(temp.left == null) {
        temp.left = new Node(data);
        break;
      } else {
        q.add(temp.left);
      }
      if(temp.right == null) {
        temp.right = new Node(data);
        break;
      } else {
        q.add(temp.right);
      }
    }
  }

  public static void main(String args[]) {
    InsertDataIntoTreeDemo.root = new Node(10);
    InsertDataIntoTreeDemo.root.left = new Node(11);
    InsertDataIntoTreeDemo.root.right = new Node(9);
    InsertDataIntoTreeDemo.root.left.left = new Node(7);
    InsertDataIntoTreeDemo.root.right.left = new Node(15);
    InsertDataIntoTreeDemo.root.right.right = new Node(8);
    //InsertDataIntoTreeDemo.inOrderTraversal(root);
    //InsertDataIntoTreeDemo.postOrderTraversal(root);
    //InsertDataIntoTreeDemo.preOrderTraversal(root);
    InsertDataIntoTreeDemo.insert(root,12);
    InsertDataIntoTreeDemo.preOrderTraversal(root);
  }
}
