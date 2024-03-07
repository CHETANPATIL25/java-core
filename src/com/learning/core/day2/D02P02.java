package com.learning.core.day2;
import java.util.Scanner;

public class D02P02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a Input Number n:");
		int n = scanner.nextInt();
		scanner.close();
		
		System.out.print("Output: ");
		int i = 2;
		while(i <= n) {
			if(i % 2 == 0)
			{
				System.out.println(i + " ");
			}
			i++;
		}
	}
}
