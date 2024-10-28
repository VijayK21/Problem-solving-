package Problem_Solving.Math;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be reversed ");
		int userInput = sc.nextInt();
		
		String reversedNum = reverseNumber(userInput);
		
		System.out.println(reversedNum);
	}

	public static String reverseNumber(int userInput) {
		String a=String.valueOf(userInput);
		char[] b= a.toCharArray();
		String result = "";
		for(int i= b.length ; i>0 ;i--) {
			result+=b[i-1];
		}
		return result;
	}
	
	public static String reverseNumber2(int userInput) {
		String temp=""; 
		
		while((userInput%10)>0) {
			int temp1=userInput%10; 
			temp+=temp1;				
			userInput/=10;     			
			
		}
		
		return temp;
	}

}
