package Problem_Solving.Math;

import java.util.Scanner;

public class GCD_HCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1 ");

		int number1 = sc.nextInt();

		System.out.println("Enter  number 2 ");

		int number2 = sc.nextInt();

		int result = calcGCD(number1, number2);

		System.out.println("GCD of the numbers is " + result);

	}

	public static int calcGCD(int number1, int number2) {

		int max = (number1 > number2) ? number1 : ((number1 < number2) ? number2 : number2);
		int GCD = 0;
		for (int i = max; i > 0; i--) {

			GCD = (number1 % i == 0 && number2 % i == 0) ? i : 0;
			if (GCD != 0) {
				break;
			}
		}
		return GCD;
	}

}
