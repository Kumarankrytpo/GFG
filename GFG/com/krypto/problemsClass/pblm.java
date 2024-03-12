package com.krypto.problemsClass;

import java.util.Scanner;

public class pblm {
	Scanner scan = new Scanner(System.in);
    //Given a positive integer N, determine whether it is odd or even.
	//oddoreven
	//https://www.geeksforgeeks.org/problems/odd-or-even3618/1
	public void oddOrEven() {
		try {
		    System.out.println("Enter the integer : ");
		    int N = scan.nextInt();
		    if(N%2==0) {
		    	System.out.println("Even");
		    }else {
		    	System.out.println("Odd");
		    }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//Time Complexity: O(1)
	//Space Complexity: O(1)
	
	//Given a number N. Count the number of digits in N which evenly divide N.
    //Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
	//Count Digits
    public void countDigits() {
    	try {
    		System.out.println("Enter the Integer : ");
    		int N = scan.nextInt();
    		int count=0,M=N;
    		while(N!=0) {
    			int temp=N%10;
    			if(temp!=0 && M%temp==0) {
    				count++;
    			}
    			N=N/10;
    		}
    		System.out.println(count);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    //Time Complexity: O(log N)
    //Space Complexity: O(1)
    
    //You are given an integer N, reverse the digits of given number N, ensuring that the reversed number has no leading zeroes.
    //Return the resulting reversed number.
    //Reverse digits
    
    public void reverseDigits() {
    	try {
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
