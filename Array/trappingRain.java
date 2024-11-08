package Problem_Solving.Array;

public class trappingRain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {28, 13, 47, 33, 83, 72, 19, 86, 37, 4, 28, 22, 83, 32, 9, 63, 68, 92, 8, 0, 39, 78, 45, 33, 30, 71, 6, 37, 39, 35, 86, 48, 13, 16, 76, 34, 70, 64, 31, 92, 74, 0, 16, 78, 57, 92, 10, 96, 21, 65, 20, 25, 14, 34, 23, 21, 96, 86, 62, 82, 67, 41, 32, 73, 16, 9, 53, 78, 66, 6, 47, 69, 78, 1, 14, 42, 36, 17, 49, 79, 59, 84, 87, 61, 39, 81, 70, 56, 48, 5, 75, 19, 58};
		
		long sum = 0;
		long prev=0;
		long org = arr[0];
        
        for(int i = 1 ; i<arr.length-1 ; i++){
            
        	prev=arr[i];
            if(prev<org){
                
                long temp = org -prev;
                sum+=temp;
            }
            
            else if(prev>=org) {
            	org=prev;
            	
            }
        }
        
        System.out.println(sum);

	}
}
