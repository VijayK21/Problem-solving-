package Problem_Solving.Array;



public class minAndMax {

	public static void main(String[] args) {

		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = i * i;
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= min) {
				min = i;

			}
			if (arr[i] >= max) {
				max = arr[i];
			}
		}

		System.out.println(min);
		System.out.println(max);

	}

}
