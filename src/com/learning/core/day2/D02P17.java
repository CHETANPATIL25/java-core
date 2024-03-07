package com.learning.core.day2;
import java.util.Scanner;

public class D02P17 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int i , j, num, count = 0;
		num = scanner.nextInt();
				
		for( i = 1 ; i <= num ; i++)
		{
			count = 0;
			for( j = i ; j >= 1 ; j-- )
			{
				if (i % j == 0)
				{
					count = count + 1;
				}
			}		
			if(count == 2) 
			{
				System.out.println( i );
			}
	
		}
	}	
}
