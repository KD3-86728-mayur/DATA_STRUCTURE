package assignment_1;

import java.util.Scanner;

public class Question7 {
	public static void rank(int arr[], int key) {
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=key) {
				count++;
			}
		}
		
		System.out.println(" Ouput: Rank of "+key+" is: "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.print("Enter the key: ");
		int key = sc.nextInt();
		rank(arr,key);
	}

}
