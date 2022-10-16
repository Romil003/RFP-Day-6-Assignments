package com.bridgelabz.LogicalProblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int x = sc.nextInt();
        int a = 0 ;
        int b = 1 ;
        int nextTerm = 0;
        System.out.print (a + " , " + b + " , ");

        for (int i = 2; i < x; i++)
        {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print (nextTerm + " , ");
        }
    }
}
