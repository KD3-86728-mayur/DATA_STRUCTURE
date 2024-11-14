package assignment_2;

import java.util.Arrays;

public class Question1 {

	public static void insertionSort(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j;
			for( j=i-1;j>=0 && arr[j] < temp; j--) {
				arr[j+1] = arr[j]; 
			}
			arr[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,8,3,6,2,9};
		
		System.out.println("Before sort : "+Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After sort : "+Arrays.toString(arr));
	}

}
