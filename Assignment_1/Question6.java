package assignment_1;

import java.util.HashSet;
import java.util.Set;

public class Question6 {
	
	public static int nonRepeating(int arr[]) {
		int count =0;
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<arr.length-1;i++) {
			count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] == arr[i]) {
					count++;
					if(set.isEmpty()) set.add(arr[i]);
					if(set.contains(arr[j])) break;
					else {
						set.add(arr[i]);
					}
				}
			}
			if(count==0 && set.contains(arr[i])) {
				return arr[i];
			}
		}
		
		return -1;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr =  { 1, 2, 3,3,21, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		System.out.println("Ans "+nonRepeating(arr));

	}

}
