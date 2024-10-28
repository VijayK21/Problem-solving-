package Problem_Solving.Math;

import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = obj.nextInt();
		oddEven ob = new oddEven();
		String odd_or_even = ob.Calc(num); // call by non static method
		// String odd_or_even = Calc(num); call by static method
		System.out.println(odd_or_even);
	}

	public String Calc(int number) { // non-static methods can be called only by creation of obj of that class (coz
										// it belongs to that particular instance alone)
										// whereas static methods can be called directly coz it belongs to class itself
		String a = " ";

		if (number == 0) {
			a = "Number is Invalid";
		}

		else if (number % 2 == 0) {
			a = "Number is Even";
		}

		else {
			a = "Number is Odd";
		}
		return a;

	}
}
