package Problem_Solving.Array;

import java.util.Arrays;

public class twoEqualArrays {

	public static void main(String[] args) {
		
		int arr1[] = {1, 2, 5};
		int arr2[] = {1, 5, 2} ;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int counter= 0;
		for(int i=0 ; i<arr1.length ; i++) {
			if(arr1[i]!=arr2[i]) {
				System.out.println("false");
				counter= 1;
				break;
			}
			
			
		}
		
		if(counter!=1)
			System.out.println("true");
		
		

	}

}
