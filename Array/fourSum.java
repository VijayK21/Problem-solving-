package Problem_Solving.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {

	public static void main(String[] args) {
		int [] arr = {1000000000,1000000000,1000000000,1000000000};
		long target = -294967296;
		 List<List<Integer>> res =foursTwoptr(arr,target);
		 
		 for(List<Integer> i : res) {
			 System.out.println(i);
		 }

	}

	public static List<List<Integer>> fours(int[] arr, int target){
		
		        Arrays.sort(arr);
		        List<List<Integer>> l = new ArrayList<>();
		        for(int i = 0 ; i<arr.length-3 ; i++){
		            int first = i;
		            int second = i+1;
		      
		            int rem1 = target - (arr[first] + arr[second]);

		            int left = second+1;
		            int right = arr.length-1;

		            
		            
		        while(left<right){
		        	 List<Integer> l2 = new ArrayList<Integer>();
		            if(arr[left]+ arr[right]==rem1){
		            	l2.add(arr[first]);
			            l2.add(arr[second]);
		                l2.add(arr[left]);
		                l2.add(arr[right]);
		                l.add(l2);
		                break;
		            }

		            else if(arr[left]+ arr[right] < rem1) {
		                left++;
		            }

		            else {
		                right--;
		            }

		        }


		        }
		        	
		        return l ;
		    }
	
	public static List<List<Integer>> foursTwoptr(int[] arr, long target){
		
		Arrays.sort(arr);
		List <List<Integer>> l = new ArrayList<>();
		
		for(int i =0 ; i<arr.length-3 ; i++) {
//			if(arr[i]==arr[i+1]) {
//				continue;
//			}
			for(int j=i+1 ;j<arr.length-2;j++ ) {
				
//				if(arr[j]==arr[j+1]) {
//					continue;
//				}
				
				
				long rem = target - (arr[i]+arr[j]);
				int left = j+1;
				int right = arr.length-1;
				
				while(left<right){
					

					if(arr[left]+arr[right]==rem) {
						if(!l.contains(Arrays.asList(arr[i],arr[j],arr[left],arr[right]))){
						l.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));}
						
						if(arr[left+1]==arr[left]) {
							left++;
						}
						
						if(arr[right-1]==arr[right]) {
							right--;
						}
						
						left++;
						right--;
					}
					
					else if(arr[left]+arr[right]<rem) {
						left++;
					}
					
					else {right--;}
					
					
					
				}
			}
		}
		
		return l;
		
	}
}

