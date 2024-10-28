package Problem_Solving.Array;

import java.util.ArrayList;

public class unionOfArray {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3};
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		System.out.println(findUnion(a,b));  //sysout
		
		}

	
	public static int findUnion(int a[], int b[]) {
        // Your code here
        ArrayList<Integer> c = new ArrayList<Integer>();
        
        for(int i = 0 ; i <a.length ; i++){
            if(!(c.contains(a[i]))){
                c.add(a[i]);
            }
        }
        
        for(int j = 0 ; j <b.length ; j++){
            if(!c.contains(b[j])){
                c.add(b[j]);
            }
        }
        return c.size();
    }

}
