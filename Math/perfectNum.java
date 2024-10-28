package Problem_Solving.Math;

import java.util.Scanner;

public class perfectNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check if its perfect ");
		int userInput = sc.nextInt();
		
		chkPerfNum(userInput);

	}

	private static void chkPerfNum(int userInput) {
			
		int sum=0;
			for(int i=1 ; i<=userInput/2 ; i++) {
				if(userInput%i==0) {
					sum+=i;
				}
				
			}
			System.out.println((sum==userInput)?"1":"0");
		
	}

}
