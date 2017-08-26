

/*
 * Write a program to convert an int variable to String using an inbuilt function of String class.
 */
package com.acadglid.session;
import java.util.Scanner;    

public class Assignment1 {


	public static void main(String[] arg) {

		//Ask user to integer number 

		System.out.println("Enter any integer number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		//Convert to String using valueof 

		String convertNumber = String.valueOf(number);


		//Display result 

		System.out.println("The number "+number+" is now conveted to "+convertNumber.getClass().getSimpleName());



	}

	private static String typeOf(String convertNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
