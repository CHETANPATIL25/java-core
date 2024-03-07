package com.learning.core.day2;
import java.util.Scanner;

public class D02P04 {
	

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three number");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		if(n1 > n2 && n1 > n3) 
		{
			System.out.println("Is greater:"+n1);
		}
		else if(n2>n1 && n2>n3) 
		{
			System.out.println("Is greater:"+n2);
		}
		else  
		{
			System.out.println("Is greater:"+n3);
		}
	}

}
