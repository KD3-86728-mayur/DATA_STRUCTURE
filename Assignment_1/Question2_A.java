package assignment_1;

import java.util.Scanner;

public class Question2_A {
	public static int search(int arr[],int key) {
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			count++;
			if(arr[i] == key)
				return count;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int arr[] = {1,5,2,9,5,3};
		System.out.print("Enter the key : ");
		int key = sc.nextInt();
		
		int ans = search(arr, key);
		if(ans == -1) {
			System.out.println("Element is not prasent");
		}else {
			System.out.println("count is " +ans);
		}
	}

}
