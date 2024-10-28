package Problem_Solving.Math;

import java.util.Scanner;

public class squareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get its square root ");
		int userInput = sc.nextInt();
		
		getSqrt(userInput);
	}

	private static void getSqrt(int userInput) {
		
		int nearby=0;
		for(int i=1 ; i<=userInput ; i++) {
			
			if(i*i == userInput) {
				 System.out.println("squared root is " + i);
				 break;
			}
			
			else {
				
				int rem= userInput - (i*i);
				
				if(rem>0) {
					nearby=i;

				}
				else {
					break;
					
				}
			}
		}
		if(nearby!=(0))
			System.out.println("possible nearby squared value is " + (nearby));
	}

}
