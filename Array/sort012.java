package Problem_Solving.Array;

import java.util.ArrayList;

public class sort012 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(0);
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(0);
	
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		for(int i = 0 ; i<arr.size() ; i++) {
			
			if(arr.get(i)==0) {
				arr1.add(arr.get(i));
			}}
			
for(int i = 0 ; i<arr.size() ; i++) {
			
			if(arr.get(i)==1) {
				arr1.add(arr.get(i));
			}}
			
			 
for(int i = 0 ; i<arr.size() ; i++) {
	
	if(arr.get(i)==2) {
		arr1.add(arr.get(i));
	}}

for(int i : arr1) {
	System.out.print(i + " ");
}
		

	}

}
