package assignment_1;

import java.util.Scanner;

public class Quesrion1 {
	
	public static int search(int arr[],int key) {
		int index=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) index = i;
		}
		return index;
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
			System.out.println("Last index of "+key+" is "+search(arr, key));
		}
	}

}
