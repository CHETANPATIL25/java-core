package com.learning.core.day2;

import java.util.Scanner;
public class D02P05 
{
	public static void main(String[] args) 
	{
		int i;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scanner.nextInt();
		if(num%5==0) 
		{
			System.out.println("Number is divisible by 5");
		}
		else 
		{
			System.out.println("Number is not divisible by 5");				
		}
	}
}