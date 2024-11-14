package assignment_3;


class Stack
{
	private int top;
	private int SIZE;
	int arr[];
	
	public Stack(int size) {
		arr = new int[size];
		SIZE = size;
		top = -1;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is full.");
		}else {
			top++;
			arr[top] = data;
		}
	}
	
	public int pop() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Stack is empty.");
		}else {
			temp = arr[top];
			top--;
			
		}
		
		return temp;
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isFull() {
		return top == SIZE-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}	
}


public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,28,11,44,77};
		Stack s1 = new Stack(5);
		
		
		for(int i=0;i<arr.length;i++) {
			s1.push(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = s1.pop();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
