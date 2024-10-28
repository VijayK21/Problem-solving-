package Problem_Solving.Array;

import java.util.Arrays;

public class findCountTriplet {

	public static void main(String[] args) {
		int [] arr = {1 ,5 ,3 ,2};
		int n = 4;
		
		int res = countTriplet2(arr,n);

	}
	
	public static int countTriplet(int arr[], int n) {
        // code here
      int  count=0;
        for(int i = 0 ; i <n-2 ; i++){
            for(int j = i+1 ; j<n-1; j++){
                for(int k = j+1 ; k<n ; k++){
                    
                    if(arr[i]+arr[j] == arr[k] || arr[k]+arr[i] == arr[j] || arr[j]+arr[k] == arr[i]) {
                    count++;}
                }
            }
        }
        
        return count;
    }
	
	static int countTriplet2(int arr[], int n) {
        // code here
      int  count=0;
      Arrays.sort(arr);
        for(int i = n-1 ; i >=2 ; i--){
            int req = arr[i];
            int left = 0;
            int right = n-2;
            
            while(left<right){
                
                if(arr[left]+arr[right]==req){
                    count++;
                    left++;
                    right--;
                }
                
                else if (arr[left]+arr[right] <req){
                    left++;
                }
                
                else{
                    right--;
                }
            }
        }
        
        return count;
    }

}
