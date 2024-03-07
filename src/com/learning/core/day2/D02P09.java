package com.learning.core.day2;
import java.util.Scanner;

public class D02P09 {
	public static void main(String[] args) {
		int i;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scanner.nextInt();
		for(i=1;i<=n;i++) {
			int cal=i*i*i;
			System.out.println("The answer is:"+cal);
			
		}
	}
}