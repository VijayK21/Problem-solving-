package Problem_Solving.Math;

import java.util.ArrayList;
import java.util.Scanner;

public class divisorsOfNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get its divisor");
		int num = sc.nextInt();

		ArrayList<Integer> div = getDivisors(num);

		for (int i : div) {

			System.out.println(i + " ");
		}

	}

	public static ArrayList<Integer> getDivisors(int num) {
		ArrayList<Integer> divisors = new ArrayList<Integer>();

		for (int i = num; i > 0; i--) {

			if (num % i == 0) {

				divisors.add(i);

			}
		}

		return divisors;
	}

}
