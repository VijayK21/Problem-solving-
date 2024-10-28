package Problem_Solving.Array;

import java.util.Arrays;

public class repeatingNum {

	public static void main(String[] args) {
		
		int[] arr= {1,24,22,22,12,1};
		Arrays.sort(arr);
		int num= arr[0];
		
		for(int i = 1 ; i<arr.length ; i++) {
			if(arr[i]==num) {
				System.out.println(num + " is Duplicated ");
			}
			
			else {
				num=arr[i];
			}
		}
	}

}
