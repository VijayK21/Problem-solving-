package Problem_Solving.Math;

import java.util.Scanner;

public class countDigitsInNumber {
	
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter input number");
		int input = obj.nextInt();
		
		int no_of_digits = countDigits2(input);
		
		System.out.println("no of digits in " + input +" is " + no_of_digits);

	}
	
	public static int countDigits(int userInput) {
		String a = String.valueOf(userInput);   // "" + value
		
		String[] arr = a.split("");    // a.toCharArray
		
		
		return arr.length;
	}
	
	public static int countDigits2(int userInput) {
		int size = 0;
		while(userInput>0) {
			userInput= userInput / 10 ;
			size++;
		}
		
		
		return size;
	}

}
