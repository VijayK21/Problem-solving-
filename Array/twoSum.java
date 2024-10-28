package Problem_Solving.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

	public static void main(String[] args) {
		
		int [] arr = {2,5,1,7,9};
		int sum = 10;
		
		Map<Integer,Integer> m = new HashMap<>();
		ArrayList<Integer> arrList = new ArrayList<>();
		
		for(int i = 0 ; i<arr.length ; i++) {
			int rem = sum- arr[i];
			
			if(m.get(rem) != null) {
				arrList.add(rem);
				arrList.add(arr[i]);
				break;
			}
			
			else {
				m.put(arr[i], i);
			}
		
		}
		for(int i : arrList) {
			System.out.println(i);
		}
	}

}
