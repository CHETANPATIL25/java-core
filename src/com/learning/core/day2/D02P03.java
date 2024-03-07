package com.learning.core.day2;
import java.util.Scanner;

public class D02P03 
{
	public static void main(String[] args) 
	{
	
	int result;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter 1st number");
	int num1 = scanner.nextInt();

	System.out.println("Enter 2nd number");
	int num2 = scanner.nextInt();

	
	System.out.println("Enter the operator");
	char op = scanner.next().charAt(0);
	
	switch(op)
	{
		
	case '+' :
	{
		result = num1 + num2;
		System.out.println("result:"+result);
		break;
	}

	case '-' :
	{ 
		result = num1 - num2;
		System.out.println("result:"+result);
	}
	
	case '*' :
	{
		result = num1 * num2;
		System.out.println("result:"+result);
	}
	
	case '/' :
	{
			result = num1 / num2;
			System.out.println("result:"+result);
	}

	}
	}
}
	
	
