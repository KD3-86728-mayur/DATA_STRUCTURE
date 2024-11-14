package assignment_1;

import java.util.Scanner;

public class Question5 {
	
	public static int search(int arr[],int key,int occurence) {
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key)
			{
				count++;
			}
			if(count == occurence) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int arr[] = {1,5,2,9,5,3,5,9,2,5,0,1};
		System.out.print("Enter the key : ");
		int key = sc.nextInt();
		
		System.out.print("Enter the occurence to be find : ");
		int occur = sc.nextInt();
		
		
		int ans = search(arr,key,occur);
		if(ans == -1) {
			System.out.println("Element is not prasent");
		}else {
			System.out.println("Last index of "+key+" is "+ans);
		}
	}

}
