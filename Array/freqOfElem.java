package Problem_Solving.Array;

import java.util.HashMap;
import java.util.Map;

public class freqOfElem {

	public static void main(String[] args) {
		int[] arr = {2,5,5,2,12,252,2};
		// Input: n = 5, arr[] = [2, 3, 2, 3, 5], p = 5
		//Output: [0, 2, 2, 0, 1]
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int i : arr) {
			if(m.get(i)!=null) {
			m.put(i, m.getOrDefault(i, 0)+1);
		}
			else {
				m.put(i, m.getOrDefault(i,1));
			}
		
		}
		
		m.remove(252);
		
		System.out.println(m.get(252));
		for (Map.Entry<Integer,Integer> i : m.entrySet()) {
			System.out.println(i.getKey() + " -> " + i.getValue());
		}
	}

}
