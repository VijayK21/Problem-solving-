package Problem_Solving.Array;

public class subsetOfArray {

	public static void main(String[] args) {

		int arr[] = { 2, 6, 1, 5, 8, 3 };
		int arr1[] = {3, 1, 6, 8 ,5};

		boolean contains = false;
		int counter = 0;
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {

				if (arr[j] == arr1[i]) {
					contains = true;
					break;
				}
				else {
					contains = false;
				}

			}
			
			if(!contains) {
				counter  = 1;
				System.out.println("No");
				break;}

		}
		
			if(counter==0)
			System.out.println("Yes");
		
			

	}
}