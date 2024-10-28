package Problem_Solving.Math;

import java.util.Scanner;

public class lastDigitInNumber {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = obj.nextInt();
		
		int lastDigit = findLastDigit(num);
		System.out.println("The Last Digit is " + lastDigit);

	}

		public static int findLastDigit(int num) {
			int remainder;
			remainder = (num % 10)!= 0 ?  (num % 10) : 0 ;  
			return remainder;
		}

}

