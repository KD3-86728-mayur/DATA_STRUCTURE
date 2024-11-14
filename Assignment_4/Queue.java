package assignment_4;

public class Queue {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
		}
	}
	
	private Node head = null;
	private Node tail = null;

	public Queue() {
		head = tail = null;
	}
	public void push(int data) {
		Node temp = new Node(data);

		if (head == null) {
			head = tail = temp;
		} else {
			tail.next = temp;
			tail = temp;
		}	
	}
	
	public int pop(){
		int num = -1;
		if (head == null) {
			return -1;
		} else {
			num = head.data;
			head = head.next;
		}
		return num;
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
