package assignment_4;


public class Stack {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
		}
	}

	
	public Stack() {
		head = tail = null;
	}

	private Node head = null;
	private Node tail = null;

	public void push(int data) {
		Node temp = new Node(data);

		if (head == null) {
			head = tail = temp;
		} else {
			temp.next = head;
			head = temp;
		}	
	}
	
	
	public int pop(){
		if (head == null) {
			return -1;
		} else {
			head = head.next;
		}
		return -1;
	}
	
	public int peek(){
		
		return head.data;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
