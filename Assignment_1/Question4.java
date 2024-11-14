package assignment_1;

import java.util.Scanner;

public class Question4 {
	
	public static int binarySearch(int arr[], int key) {
		
		int l=0, h=arr.length-1;
		
		while(l<=h) {
			int mid = (l+h)/2;
			
			if(arr[mid] == key) {
				return mid;
			}else if(arr[mid] > key) {
				l = mid + 1;
			}else {
				h = mid -1;
			}
		}
		
		return -1;
		
	}
	
	public static boolean checkDesc(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] < arr[i+1]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
			int arr[] = {90,87,54,32,25,10};
			
			
			if(checkDesc(arr)) {
				int key = sc.nextInt();
				System.out.println("Element prasent at index "+ binarySearch(arr,key));
			}else {
				System.out.println("Array is not in descending order.");
			}
			
			
	}

}
