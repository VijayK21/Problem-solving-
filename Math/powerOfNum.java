package Problem_Solving.Math;

import java.util.Scanner;

public class powerOfNum {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number ");
	
	int number = sc.nextInt();
	
	System.out.println("Enter power ");
	
	int power = sc.nextInt();
	
	int result = calcPower(number,power);
	
	System.out.println("power of the number is " + result);
	
	}
	
	public static int calcPower(int num , int pow) {
		int temp = 1;
		for(int i=pow ; i>0 ; i--) {
			
			temp*=num;
		}
		
		return temp;
		
	}
}
