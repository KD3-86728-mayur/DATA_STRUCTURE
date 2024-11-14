package assignment_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import assignment_5.Tree.Node;

class Tree {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		Node(int value) {
			data = value;
			left = right = null;
		}
	}

	private Node root = null;

	public void addNode(int v) {
		if (root == null) {
			root = new Node(v);
		} else {
			addNodeRecursion(v, root);
		}
	}

	public void addNodeRecursion(int v, Node trav) {
		if (v < trav.data) {
			if (trav.left == null) {
				trav.left = new Node(v);
				return;
			} else {
				addNodeRecursion(v, trav.left);
			}
		} else if (v > trav.data) {
			if (trav.right == null) {
				trav.right = new Node(v);
				return;
			} else {
				addNodeRecursion(v, trav.right);
			}
		}
	}

	private void inOrder(Node temp) {
		if (temp == null)
			return;

		inOrder(temp.left);
		System.out.print(" " + temp.data);
		inOrder(temp.right);
	}

	public void displayIn() {
		inOrder(root);
	}

	public boolean isEmpty() {
		return root == null;
	}

	private Node bSearch(int key, Node trav) {
		if (trav == null)
			return null;
		if (trav.data == key)
			return trav;
		else if (key < trav.data) {
			return bSearch(key, trav.left);
		} else {
			return bSearch(key, trav.right);
		}

	}

	public void search(int key) {
		Node n = bSearch(key, root);
		if (n != null) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}

public class BSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree t = new Tree();

		t.addNode(8);
		t.addNode(89);
		t.addNode(81);
		t.addNode(82);
		t.displayIn();

		t.search(15);
	}

}
