package com.learning.core.day3;
import java.util.Scanner;
public class D03P05 
{
	static void pair(int arr[], int data[], int start,int end, int index, int r)
	{

		if (index == r)
		{
			for (int j=0; j<r; j++)
				System.out.print(data[j]+" ");
				System.out.println("");
			return;
		}	


		for (int i=start; i<=end && end-i+1 >= r-index; i++)
		{
			data[index] = arr[i];
			pair(arr, data, i+1, end, index+1, r);
		}
	}
	static void printPair(int arr[], int n, int r)
    {
        
        int data[]=new int[r];
        pair(arr, data, 0, n-1, 0, r);
    }
 
    
    public static void main (String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	int o = sc.nextInt();
    	int arr[] = new int[o];
        for(int i=0;i<o;i++)
        {
            arr[i] = sc.nextInt();
           
        }
    	int r= sc.nextInt();
    	int n = arr.length;
        printPair(arr, n, r);
       
       
    }

}