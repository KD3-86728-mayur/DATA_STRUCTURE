package assignment_3;

class LinkedList {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
		}

	}

	private Node head = null;

	public void add(int data) {
		Node temp = new Node(data);

		if (head == null) {
			head = temp;
		} else {
			Node temp2 = head;
			while (temp2.next != null) {
				temp2 = temp2.next;
			}
			temp2.next = temp;
		}	
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add(20);
		ll.add(30);

		ll.display();
	}

}
