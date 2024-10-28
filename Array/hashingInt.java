package Problem_Solving.Array;

public class hashingInt {

	public static void main(String[] args) {
		
		inttHashing();
		charHashing();
		
	}
	
	public static void inttHashing() {
		int[] arr = {12,54,12,2,3,4};
		int len = arr.length;
		
		int[] hasharr = new int[55];
		
		for(int i = 0 ; i<len ;i++ ) {
			
			hasharr[arr[i]]++;
		}
		
		
		System.out.println(hasharr[arr[0]]);
	}

	
	public static void charHashing() {
		
		String character = "awwwqfsdvvija";
		int[] hasharr = new int[26];   // if all characters user 256 as size
		
		for(int i = 0 ; i<character.length() ; i++) {
			
			hasharr[character.charAt(i) - 'a']++;  // ascii 'A' 
		}
		
		System.out.println(hasharr['v'-'a']);
	}
}
