package Problem_Solving.Array;

public class rotateArrarBy1 {

	public static void main(String[] args) {
		 	int[] arr = {1,2,3,4,5};
	       int temp= 0;
	       
	       for(int i = 0 ; i <arr.length ; i++){
	           
	           temp = arr[arr.length-1] ;
	           arr[arr.length-1] = arr[i];
	           arr[i] = temp ;
	           
	           
	       }
	       
	       for(int i= 0 ; i<arr.length ; i++){
	           System.out.print(arr[i]);
	       }

	}

}
