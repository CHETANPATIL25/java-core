package com.learning.core.day2;
import java.util.Scanner;

public class D02P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println( + sum);

        scanner.close();
    }
}

