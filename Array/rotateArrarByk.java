package Problem_Solving.Array;

public class rotateArrarByk {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int temp = 0;
		int k = 0;

		while (k < 2) {
			for (int i = 0; i < arr.length; i++) {

				temp = arr[arr.length - 1];
				arr[arr.length - 1] = arr[i];
				arr[i] = temp;

			}
			k++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
