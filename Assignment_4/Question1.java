package assignment_4;


class LinkedList2{
	
	class Node{
		private int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
		private Node tail;
		private int size;
		
		public LinkedList2() {
			tail = null;
			size = 0;
		}
		
		
		public void addFirst(int data) {
			Node n = new Node(data);
			
			if(isEmpty()) {
				tail = n;
				tail.next = tail;
			}else{
				Node temp = tail.next;
				n.next = temp;
				tail.next = n;
			}
			size++;
		}
		
		public void addPosition(int data, int pos) {
			Node n = new Node(data);
			if(pos < 1 && pos > size+1) {
				return;
			}
			else if(pos == 1) {
				addFirst(data);
				return;
			}else if(pos == size+1) {
				addLast(data);
			}
			else {
				Node temp = tail.next; 
				
				for(int i=1;i<pos-1;i++) {
					temp = temp.next;
				}
				n.next = temp.next;
				temp.next = n;
			}
			size++;
		}
		
		public void addLast(int data) {
			Node n = new Node(data);
			if(isEmpty()) {
				 tail = n;
			}else {
				n.next = tail.next;
				tail.next = n;
				tail = n;
			}
			size++;
		}
		
		public void deleteFirst() {
			if(isEmpty()) {
				return;
			}else if(size == 1){
				tail = null;
			}else {
				tail.next = tail.next.next;
			}
			size--;
		}
		
		public void deleteLast() {
			if(isEmpty()) {
				return;
			}else if(size == 1){
				tail = null;
			}else {
				Node temp = tail.next;
				while(temp.next.next != tail.next) {
					temp = temp.next;
				}
				temp.next = tail.next;
				tail = temp;
			}
			size--;
		}
		
		public void deletePosition(int pos) {
			
			if(isEmpty()) {
				return;
			}else if(pos == 1) {
				deleteFirst();
				return;
			}else if(pos == size) {
				deleteLast();
				return;
			}else {
				Node temp = tail.next;
				for(int i=1;i<pos-1;i++) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
			}
			size--;
		}
		
		public void diaplay() {
			Node temp = tail.next;
			do {
				System.out.println(" "+temp.data);
				temp = temp.next;
			}while(temp!=tail.next);
		}
		
		public boolean isEmpty() {
			return tail == null;
		}
		
}



public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList2 ll = new LinkedList2();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addLast(300);
//		ll.deleteLast();
//		ll.deleteFirst();
		ll.addPosition(200, 2);
		ll.deletePosition(4);
		ll.diaplay();
	}

}
