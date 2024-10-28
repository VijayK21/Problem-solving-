package Problem_Solving.Array;

public class thirdLargestEle {

	public static void main(String[] args) {
		int[] arr = {1,75,3,5,2};
		
		int len = arr.length;
		
		int first = arr[0];
		int second = arr[0];
		int third = arr[0];
		
		for(int i=0 ; i<len ; i++) {
			if(arr[i]> first) {
				third = second;
				second = first;
				first = arr[i];
				}
			
				else if(arr[i]>= third && arr[i]<first) {
					third = second;
					second = arr[i] ;
				}
				
				else if (arr[i]< second && arr[i]>third){
					third = arr[i];
					}
			 	
		
			}
			
		System.out.println(third);
		
	
	}

	}
