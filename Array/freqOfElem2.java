package Problem_Solving.Array;

import java.util.HashMap;
import java.util.Map;

public class freqOfElem2 {

	public static void main(String[] args) {
		int[] arr = {2,5,5,2,12,252,2};
		int n = arr.length;
		int p = 252;
		// Input: n = 5, arr[] = [2, 3, 2, 3, 5], p = 5
		//Output: [0, 2, 2, 0, 1]
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int i : arr) {
			if(m.get(i)!=null) {
			m.put(i, m.get(i)+1);
		}
			else {
				m.put(i, m.getOrDefault(i,1));
			}
		
		}
		
		for(int i = 1 ; i<=n ;i++) {
			if(m.get(i)!=null) {
				arr[i-1]=m.get(i);
			}
			
			else {
				arr[i-1]=0;
			}
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		
		for (Map.Entry<Integer,Integer> i : m.entrySet()) {
			System.out.println(i.getKey() + " -> " + i.getValue());
		}
	}

}
