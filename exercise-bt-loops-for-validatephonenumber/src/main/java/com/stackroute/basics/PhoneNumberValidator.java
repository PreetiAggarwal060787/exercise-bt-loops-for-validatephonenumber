package com.stackroute.basics;

import java.util.Scanner;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
	Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
    	
        //call the functions in the required sequence
    	PhoneNumberValidator obj = new PhoneNumberValidator();
    	String input = obj.getInput();
    	int result = obj.validatePhoneNumber(input);
    	obj.displayResult(result);
    	obj.closeScanner();
    }

    public String getInput() {
    	String phoneNo = "";
        return sc.nextLine();
    }

    public void displayResult(int result) {
        //displays the result
    	
               if(result == 1)
            {
               System.out.println("Valid");
            }
            else if (result == 0)
            {
            	System.out.println("Invalid");
            }
               
            else if (result == -1)
            {
            	System.out.println("Empty String");
            }
               
            else
            {
            	System.out.println("Unknown error");
            }
           }

    public int validatePhoneNumber(String input) {
    	
    	if (input == null || input.isEmpty() ) {
    		
    		return -1;}
    	int count = 0 ;
    	for (int i = 0; i<input.length();i++) 
    	{
    	char ch=input.charAt(i);
    	if (Character.isDigit(ch))
    	{
    	count++;
    	}
    	
    	else if (ch!='-') {
    		return 0;
    	}
    	}
    	if (count==10) {
    		return 1;}
    	else 
    	{
    	return 0;}
    }
    public void closeScanner(){
        //close the Scanner object
    	
    	sc.close();
    }
}
