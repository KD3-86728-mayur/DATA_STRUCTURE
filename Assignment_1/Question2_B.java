package assignment_1;

import java.util.Scanner;

public class Question2_B {
	public static int binarySearch(int arr[],int key) {
		int count=0;
		
		int s = 0, e = arr.length-1;
		
		while(s<e) {
			count++;
			int mid = (s + e)/2;
			
			if(arr[mid] == key) {
				return count;
			}
			else if(arr[mid] > key) {
				e = mid - 1;
			}else {
				s = mid + 1;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int arr[] = {1,3,7,9,10,12,17,29,90};
		System.out.print("Enter the key : ");
		int key = sc.nextInt();
		
		int ans = binarySearch(arr, key);
		if(ans == -1) {
			System.out.println("Element is not prasent");
		}else {
			System.out.println("count is " +ans);
		}
	}

}
