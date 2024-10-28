package Problem_Solving.Math;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check palindrome");
		int userInput = sc.nextInt();
		
		String ans = is_palindrome(userInput);
		System.out.println(ans);
	}


    public static String is_palindrome(int n)
    {   
	    	String num = ""+n;
	    	String[] split_num = num.split("");    
	    	
	    	String reversed ="";
	    	
	    	for(int i = split_num.length ; i>0 ; i--) {
	    		
	    		reversed+=split_num[i-1];
	    	}
	    	
	    	if(reversed.equals(num)) {
	    		return "Yes";
	    	}
	    	else {
	    		return "No";
	    	}
        
        
        
}
}