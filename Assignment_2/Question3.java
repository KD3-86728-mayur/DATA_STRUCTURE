package assignment_2;

import java.util.Scanner;


class Queue{
	private int front;
	private int rear;
	private int SIZE;
	int arr[];
	
	public Queue(int size) {
		front=rear=-1;
		SIZE = size;
		arr = new int[size];
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			rear++;
			arr[rear] = data;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			
		}else {
			int ans = arr[front+1];
			front++;
			return ans;
		}
		return -1;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			return arr[front+1];
		}
		return -1;
	}
	
	public boolean isFull() {
		return rear == arr.length-1;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	
	
}



public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Queue q = new Queue(5);
		while (true) {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.exit(1);
				break;
			case 1:
				if(q.isFull()) {
					System.out.println("Queue is full.");
					
				}else {
					System.out.println("Enter number : ");
					int num = sc.nextInt();
					q.push(num);
				}
				break;
			case 2:
				if(q.isEmpty()) {
					System.out.println("Queue is empty");
				}else {
					System.out.println("Pop element is :"+q.pop());
				}
				break;
			case 3:
				if(q.isEmpty()) {
					System.out.println("Queue is empty");
				}else {
					System.out.println("Pop element is :"+q.peek());
				}
				break;
			
			default:
				break;
			}
		}
	}

}
