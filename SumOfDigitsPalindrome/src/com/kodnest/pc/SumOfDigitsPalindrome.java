package com.kodnest.pc;

import java.util.Scanner;

public class SumOfDigitsPalindrome {
	public static int calculateSumOfDigits(int num) {
	    int sum = 0;
	    while(num != 0){
	      int rem;
	      rem = num%10;
	      sum = sum + rem;
	      num = num/10;
	    }
	    return sum;
	    }

	    public static boolean isPalindrome(int num) {
	       int temp = num;
	       int sum = 0;
	       while(num != 0){
	         int rem;
	         rem = num%10;
	         sum = (sum*10) + rem;
	         num = num/10;
	       }
	       if(temp == sum){
	         return true;
	       }
	       else{
	         return false;
	       }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        
	        int sumOfDigits = calculateSumOfDigits(num);
	        System.out.println("Sum of digits: " + sumOfDigits);

	        boolean palindrome = isPalindrome(sumOfDigits);
	        if(palindrome == true){
	            System.out.println("The sum is a palindrome.");
	        }
	        else{
	            System.out.println("The sum is not palindrome.");
	        }
	          
	        sc.close();
	    }
}