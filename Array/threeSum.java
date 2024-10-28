package Problem_Solving.Array;

import java.util.Arrays;

public class threeSum {

	public static void main(String[] args) {
		
		int [] arr = {998,550 ,557, 562, 628, 468, 542, 130, 241};  // 23+2+12 = 37
		int sum = 793;
		int len = arr.length;
		
	System.out.println(twoPointer(arr,sum,len));	
		
	}
	
	public static int checkSum(int arr[],int sum , int len) {
		
		for(int i=0 ; i<len-2 ; i++) {
			for(int j = i+1 ; j<len-1 ; j++) {
				for(int k = j+1 ; k<len ; k++) {
					if(arr[i]+arr[j]+arr[k] == sum) {
						return 1;
					}
				}
			}
		}
		
		return 0;
	}




public static boolean twoPointer(int arr[], int sum, int n) {
    int len = n;
    Arrays.sort(arr);
    for(int i=0 ; i<len-2 ; i++) {
		int one = sum-arr[i];
		int left = i+1;
		int right = len-1;
		while(left<right){
		    
		    if(arr[left]+arr[right]==one){
		        return true;
		    }
		    
		    else if(arr[left]+arr[right]<one){
		        left++;
		    }
		    
		    else{
		        right--;
		    }
		}
		
	}
	
	return false;
}
}

