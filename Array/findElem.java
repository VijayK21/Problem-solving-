package Problem_Solving.Array;

public class findElem {

	public static void main(String[] args) {
		
		int arr[] = {3,8,237,43,23};
		int key = 237;
		int index=0;
		int count = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]==key) {
				index=i;
				count++;
				break;
			}
		}
		
		if(count==0) {
			System.out.println(-1); 
		}
		else {
			System.out.println(index);
		}
		
		
		}

	}


