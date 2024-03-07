package com.learning.core.day2;
import java.util.Scanner;

public class D02P01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month number");
		int monthnumber = scanner.nextInt();
		scanner.close();
		
		if(monthnumber == 1) {
			System.out.println("January");
		}
		else if(monthnumber == 2) {
			System.out.println("Feburary");
		}
		else if(monthnumber == 3) {
			System.out.println("March");
		}
		else if(monthnumber == 4) {
			System.out.println("April");
		}
		else if(monthnumber == 5) {
			System.out.println("May");
		}
		else if(monthnumber == 6) {
			System.out.println("June");
		}
		else if(monthnumber == 7) {
			System.out.println("July");
		}
		else if(monthnumber == 8) {
			System.out.println("August");
		}
		else if(monthnumber == 9) {
			System.out.println("September");
		}
		else if(monthnumber == 10) {
			System.out.println("October");
		}
		else if(monthnumber == 11) {
			System.out.println("November");
		}
		else if(monthnumber == 12) {
			System.out.println("December");
		}
		else {
			System.out.println("Invalid Input");
		}
		
	}

}
