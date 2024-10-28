package Problem_Solving.Math;

import java.util.Scanner;

public class primeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to Check whether its prime ");
		int userInput = sc.nextInt();

		isPrimeNum(userInput);


	}

	private static void isPrimeNum(int userInput) {
		int count=0;
		if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 5 || userInput == 7) {
			System.out.println("Its prime number");
		}

		else if (userInput == 0) {
			System.out.println("Not a prime");
		} else {

			for (int i = userInput - 1; i > 1; i--) {

				if (userInput % i == 0) {
					System.out.println("Its non-Prime");
					count++;
					break;
				}
				
				
			}
			if(count==0)
				System.out.println("Its a prime");
		}

		
	}

}
