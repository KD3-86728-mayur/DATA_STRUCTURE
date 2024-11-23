package Assignment7;

public class Q2 {
	public static void main(String args[]) {
		// Calculate the mode of an array. The mode is the element occurred maximum time
		// in the array

		int arr[] = {5, 3,5,5, 6, 74, 3, 5, 7, 4, 43, 5, 64, 2, 44, 1 };
         int element=-1;
		int mode=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int cnt=0;
			for (int j = 0; j < arr.length; j++) {
                 if(arr[i]==arr[j])
                 {
                	 cnt++;
                 }
			}
			if(cnt>mode)
			{
				element=arr[i];
				mode=cnt;
			}
			
		}
   System.out.println(element+"  "+ mode);
	}
}
