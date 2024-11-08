package Problem_Solving.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class intersectionOfArr {

	public static void main(String[] args) {
		int a[] = {12,4,52,41,22};
		int b[] = {5,4,22,22,52};
	
		 int res = intersec(a,b);
		 System.out.println(res);
	}
	
	public static int intersec(int [] a , int[] b) {


		int count = 0;
		
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i <a.length ; i++) {
			if(m.get(a[i])== null) {
			m.put(a[i],0);
		}
			else {
				m.put(a[i], m.get(a[i])+1);
			}
			
		}
		
		for(int i = 0 ; i <b.length ; i++) {
			if(m.get(b[i])== null) {
			m.put(b[i],0);
		}
			else {
				m.put(b[i], m.get(b[i])+1);
			}
			
		}
		
		for(Map.Entry<Integer, Integer> n : m.entrySet()) {
			if(n.getValue()>0) {
				//System.out.println(n.getKey() + " " );
				count++;
			}
		}
		return count;
	
	}

	
        
   

}
