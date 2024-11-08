package Problem_Solving.Array;

import java.util.Scanner;

public class lenLongestSubArr {

	public static void main(String[] args) {

		int arr[] = { 47 ,54 ,66, 47, 54 ,66 };
		int sum = 66;

		lenOfLongestSubarr(arr, sum);
	}

	private static void longestSubArr(int arr[], int sum) {
		int len = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			int tempsum = arr[i];
			if (arr[i] == sum) {
				len = 1;
			}

			for (int j = i + 1; j < arr.length; j++) {

				tempsum += arr[j];
				if(tempsum>sum){break;}
				else if (tempsum == sum && (j - i + 1 > len)) {
					len = j - i + 1;
				}

			}
		}
		
		System.out.println(len);

	}

	
	public static void lenOfLongestSubarr(int[] arr, int sum) {
	       int len = 0;
	    int asum = arr[0];
	    int left = 0 ;
	    int right = 0;
	    
	    while(right<arr.length){
	        
	        while(left<right && asum>sum ){
	        	asum-=arr[left];
	        	left++;
	            
	        }
	        
	        if(asum==sum && (right-left + 1)>len){
	            len= right-left+1;
	        }
	        right++;
	        
	        if(right<arr.length){
	            asum+=arr[right];
	        }
	        
	        
	        
	    }
			
			
			
			System.out.println(len); ;

		}
	    
}
