package Problem_Solving.Math;

import java.util.Scanner;

public class armStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be check whether its ARMstrong ");
		int userInput = sc.nextInt();
		
		chkARMstrong1(userInput);
		
		
	}

	public static void chkARMstrong(int userInput) {
			   // "153" -> s.toCharArr -> length -> for ( for(sum+= ) -> if(input==sum)? )
			
		String Input = "" + userInput;
		int[] inputArr = Input.chars().map(c -> c - '0').toArray();
		
		int sum = 0;
		int x=1;
		int len = inputArr.length;
		for(int i=0 ; i<len ; i++) {
			int temp = 1 ;
			
			for(int j=len ; j>0 ; j--) {
				
				 temp *= inputArr[len-x] ;
				 
			}
			sum+= temp;
			x++;
		}
		
		System.out.println(sum);
		
		if(sum!=userInput) {
			System.out.println("Not an armstrong number");
		}
		else {
			System.out.println("It's a armstrong number");
		}
			
			
	}
	
	public static void chkARMstrong1(int userInput) {
		
		int len = (""+userInput).length();
		int last_num=0;
		int sum= 0;
		
		int newnum = userInput;
		
		for(int i=len ; i>0 ; i--) {
			last_num=newnum%10;
			newnum/=10;
			
			int temp=1;
			for(int j=0 ; j<len ; j++) {
				
				temp*=last_num;
			}
			
			sum+=temp;
			last_num=newnum;
		}
		
		if(sum!=userInput) {
			System.out.println("Not an armstrong number");
		}
		else {
			System.out.println("It's a armstrong number");
		}
		
	}
	

}
